/*
 * Copyright (c) 2011 - 2018, Apinauten GmbH
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification,
 * are permitted provided that the following conditions are met:
 *
 *  * Redistributions of source code must retain the above copyright notice, this
 *    list of conditions and the following disclaimer.
 *  * Redistributions in binary form must reproduce the above copyright notice,
 *    this list of conditions and the following disclaimer in the documentation
 *    and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 * ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 * WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT,
 * INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
 * BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 * DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE
 * OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package com.apiomat.nativemodule.baustellenmodul;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * REST class for your module
 */
@io.swagger.annotations.Api( value = "/BaustellenModul", tags = "BaustellenModul" )
public class RestClass extends com.apiomat.nativemodule.AbstractRestResource
{
	/**
	 * Constructor, leave as is
	 *
	 * @param uriInfo
	 * @param servletRequest
	 * @param securityContext
	 * @param wsRequest
	 */
	public RestClass( final javax.ws.rs.core.UriInfo uriInfo,
		final javax.servlet.http.HttpServletRequest servletRequest,
		final javax.ws.rs.core.SecurityContext securityContext,
		final javax.ws.rs.core.Request wsRequest )
	{
		super( uriInfo, servletRequest, securityContext, wsRequest );
	}

	/**
	 * A simple ping-like GET endpoint.
	 * You can pass a <PARAM> to the following URL, which is contained in the response then.
	 * <p>
	 * curl <BASEURL>/yambas/rest/modules/BaustellenModul/{appName}/spec/ping/<PARAM>
	 * <p>
	 * The @ApiOperation and @ApiParam annotations are used to documnt the REST endpoint in the apidocs:
	 * <BASEURL>/apidocs/index.html
	 *
	 * @param param arbitrary value which is returned in response
	 * @return response
	 */
	@io.swagger.annotations.ApiOperation( value = "A simple ping-like GET endpoint" )
	@javax.ws.rs.GET
	@javax.ws.rs.Path( "/ping/{param}" )
	public javax.ws.rs.core.Response ping(
		@io.swagger.annotations.ApiParam( value = "param name" ) @javax.ws.rs.PathParam( "param" ) String param )
	{
		final com.apiomat.nativemodule.Request request = this.getAOMRequest( );
		// extract auth information from the request object if needed
		System.out.println( request );

		if ( param == null || "".equals( param.trim( ) ) )
		{
			param = "pong";
		}

		return javax.ws.rs.core.Response.ok( param ).type( javax.ws.rs.core.MediaType.TEXT_PLAIN ).build( );
	}

	@io.swagger.annotations.ApiOperation( value = "Import streets from OpenData" )
	@javax.ws.rs.GET
	@javax.ws.rs.Path( "/addresses/" )
	public javax.ws.rs.core.Response importAddresses( )
	{
		String message = "OK";
		final com.apiomat.nativemodule.Request request = this.getAOMRequest( );

		try
		{
			final HttpResponse<JsonNode> response = Unirest
				.get( "https://opendata.duesseldorf.de/api/action/datastore/search.json" )
				.queryString( "resource_id", "983daf78-7dbe-4f2d-8fa0-67c521f6a11f" )
				.header( "accept", "application/json" )
				.asJson( );

			final JSONObject body = response.getBody( ).getObject( );
			if ( Boolean.TRUE.equals( body.optBoolean( "success" ) ) )
			{
				// clear models
				BaustellenModul.AOM.deleteByNames( Strasse.MODULE_NAME, Strasse.MODEL_NAME, null, request );

				// iterate and create
				final JSONObject result = body.getJSONObject( "result" );
				final JSONArray records = result.getJSONArray( "records" );

				for ( int i = 0; i < records.length( ); i++ )
				{
					final JSONObject entry = records.getJSONObject( i );

					final Strasse strasse = ( Strasse ) BaustellenModul.AOM.createObject(
						request.getApplicationName( ),
						Strasse.MODULE_NAME,
						Strasse.MODEL_NAME,
						request
					);

					strasse.setForeignId( entry.optString( "Straßenschlüssel-Nr." ) );
					strasse.setName( entry.optString( "Straßenname" ) );
					strasse.setVonNummer( entry.optString( "ungerade Haus-Nr. von" ) );
					strasse.setBisNummer( entry.optString( "gerade Haus-Nr. bis" ) );

					strasse.setOrtsTeil( entry.optString( "Stadtteilname" ) );

					strasse.setPlz( entry.optString( "Postleitzahl" ) );
					strasse.setStadt( "Düsseldorf" );

					strasse.save( );
				}
			}
			else
			{
				message = "Get addresses: Success: false";
				BaustellenModul.AOM.logError( request.getApplicationName( ), message, false );
			}
		}
		catch ( final UnirestException e )
		{
			message = "Get addresses: UnirestException";
			BaustellenModul.AOM.logError( request.getApplicationName( ), message, false );
		}

		return javax.ws.rs.core.Response.ok( message ).type( javax.ws.rs.core.MediaType.TEXT_PLAIN ).build( );
	}
}
