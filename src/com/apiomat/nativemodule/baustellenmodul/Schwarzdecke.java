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


import com.apiomat.nativemodule.basics.*;
/**
* Generated class for your Schwarzdecke data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "BaustellenModul",
    hooksClassNameTransient = "com.apiomat.nativemodule.baustellenmodul.SchwarzdeckeHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.baustellenmodul.SchwarzdeckeHooksNonTransient", 
            isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,
    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={})
public class Schwarzdecke extends com.apiomat.nativemodule.baustellenmodul.Baustelle
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "BaustellenModul";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Schwarzdecke";

    /** class specific attributes */
    private String aufmassNummer = null;
    private java.util.Date aufmassSkizze = null;
    private String bestellnummer = null;
    private java.util.Date datumAbrechnung = null;
    @com.apiomat.nativemodule.StaticData( type = com.apiomat.nativemodule.StaticData.Type.File )
    private String fertigmeldungURL;
    private Double kalkulierteBaukosten = null;
    @com.apiomat.nativemodule.StaticData( type = com.apiomat.nativemodule.StaticData.Type.Image )
    private String meldeDatumFirmaURL;
    private String summeAbrechnung = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Schwarzdecke ()
    {}

    /**
     * Returns the name of the module where this class belongs to
     */
    @Override
    public String getModuleName( )
    {
        return MODULE_NAME;
    }

    /**
     * Returns the name of the model
     */
    @Override
    public String getModelName( )
    {
        return MODEL_NAME;
    }

    public String getAufmassNummer()
    {
         return this.aufmassNummer;
    }

    public void setAufmassNummer( String arg )
    {
        this.aufmassNummer = arg;
    }

    public java.util.Date getAufmassSkizze()
    {
         return this.aufmassSkizze;
    }

    public void setAufmassSkizze( java.util.Date arg )
    {
        this.aufmassSkizze = arg;
    }

    public String getBestellnummer()
    {
         return this.bestellnummer;
    }

    public void setBestellnummer( String arg )
    {
        this.bestellnummer = arg;
    }

    public java.util.Date getDatumAbrechnung()
    {
         return this.datumAbrechnung;
    }

    public void setDatumAbrechnung( java.util.Date arg )
    {
        this.datumAbrechnung = arg;
    }

    public String getFertigmeldungURL( )
    {
        return this.fertigmeldungURL;
    }

    public byte[] loadFertigmeldung( )
    {
        final String resUrl = getFertigmeldungURL();
        return getData( com.apiomat.nativemodule.IResourceMethods.ResourceType.FILE, resUrl);
    }

    public java.io.InputStream loadFertigmeldungAsStream( )
    {
        final String resUrl = getFertigmeldungURL();
        return getDataAsStream( com.apiomat.nativemodule.IResourceMethods.ResourceType.FILE, resUrl);
    }

    public String getFertigmeldungURL( String apiKey, String system )
    {
        final String additionalParameters = ".img?apiKey=" + apiKey + "&system=" + system;
        return getFertigmeldungURL( ) + additionalParameters;
    }

    /**
     * @deprecated Use {@link #loadFertigmeldung()}
     */
    @Deprecated
    public byte[] loadFertigmeldung( String apiKey, String system )
    {
        final String resUrl = getFertigmeldungURL( apiKey, system );
        return loadResource(resUrl);
    }

    public void setFertigmeldungURL( String url ) 
    {
        this.fertigmeldungURL = url;
    }

    /**
     * @deprecated Use {@link #postFertigmeldung( java.io.InputStream data , String fileName, String format )}
     */
    @Deprecated
    public String postFertigmeldung( byte[] data , String fileName, String format )
    {
        String url = saveResource( data, false, fileName, format );
        setFertigmeldungURL( url );
        return url;
    }

    public String postFertigmeldung( java.io.InputStream data , String fileName, String format )
    {
        String url = saveResource( data, false, fileName, format );
        setFertigmeldungURL( url );
        return url;
    }

    public Double getKalkulierteBaukosten()
    {
         return this.kalkulierteBaukosten;
    }

    public void setKalkulierteBaukosten( Double arg )
    {
        this.kalkulierteBaukosten = arg;
    }

    public String getMeldeDatumFirmaURL( )
    {
        return this.meldeDatumFirmaURL;
    }

    public byte[] loadMeldeDatumFirma( )
    {
        final String resUrl = getMeldeDatumFirmaURL();
        return getData( com.apiomat.nativemodule.IResourceMethods.ResourceType.IMAGE, resUrl);
    }

    public java.io.InputStream loadMeldeDatumFirmaAsStream( )
    {
        final String resUrl = getMeldeDatumFirmaURL();
        return getDataAsStream( com.apiomat.nativemodule.IResourceMethods.ResourceType.IMAGE, resUrl);
    }

    public String getMeldeDatumFirmaURL( String apiKey, String system, int width, int height, 
        String backgroundColorAsHex, Double alpha, String format )
    {
        final java.lang.StringBuilder additionalParameters = new java.lang.StringBuilder();
        additionalParameters.append( ".img?apiKey=" );
        additionalParameters.append( apiKey );
        additionalParameters.append( "&system=" );
        additionalParameters.append( system );
        additionalParameters.append( "&width=" );
        additionalParameters.append( width );
        additionalParameters.append( "&height=" );
        additionalParameters.append( height );
        
        if(backgroundColorAsHex != null) 
        {
            additionalParameters.append( "&bgcolor=" );
            additionalParameters.append( backgroundColorAsHex );
        }
        if(alpha != null)
        {
            additionalParameters.append( "&alpha=" );
            additionalParameters.append( alpha );
        }
        if(format != null)
        {
            additionalParameters.append( "&format=" );
            additionalParameters.append( format );
        }
        return getMeldeDatumFirmaURL( ) + additionalParameters;
    }

    public byte[] loadMeldeDatumFirma( String apiKey, String system, int width, int height, 
        String backgroundColorAsHex, Double alpha, String format )
    {
        final String resUrl = getMeldeDatumFirmaURL( apiKey, system, width, height, 
            backgroundColorAsHex, alpha, format );
        return loadResource(resUrl);
    }

    public void setMeldeDatumFirmaURL( String url ) 
    {
        this.meldeDatumFirmaURL = url;
    }

    /**
     * @deprecated Use {@link #postMeldeDatumFirma( java.io.InputStream data , String fileName, String format )}
     */
    @Deprecated
    public String postMeldeDatumFirma( byte[] data , String fileName, String format )
    {
        String url = saveResource( data, true, fileName, format );
        setMeldeDatumFirmaURL( url );
        return url;
    }

    public String postMeldeDatumFirma( java.io.InputStream data , String fileName, String format )
    {
        String url = saveResource( data, true, fileName, format );
        setMeldeDatumFirmaURL( url );
        return url;
    }

    public String getSummeAbrechnung()
    {
         return this.summeAbrechnung;
    }

    public void setSummeAbrechnung( String arg )
    {
        this.summeAbrechnung = arg;
    }

}
