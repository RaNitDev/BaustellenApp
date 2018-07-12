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
import com.apiomat.nativemodule.baustellenmodul.*;
/**
* Generated class for your Baustelle data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "BaustellenModul",
    hooksClassNameTransient = "com.apiomat.nativemodule.baustellenmodul.BaustelleHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.baustellenmodul.BaustelleHooksNonTransient", 
            isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,
    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={})
public class Baustelle extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.baustellenmodul.Baustelle> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.baustellenmodul.Baustelle>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "BaustellenModul";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Baustelle";

    /** class specific attributes */
    private String abnahmeErgebnis = null;
    private java.util.Date abnahmeVorEndeGewaehrAm = null;
    private String abnahmeVorEndeGewaehrDurch = null;
    private String aufbruch = null;
    private String bemerkungen = null;
    private String bezirk = null;
    @com.apiomat.nativemodule.StaticData( type = com.apiomat.nativemodule.StaticData.Type.File )
    private String bilderMeldungURL;
    private java.util.Date datumAufmass = null;
    private String firma = null;
    @com.apiomat.nativemodule.StaticData( type = com.apiomat.nativemodule.StaticData.Type.File )
    private String fotosAbnahmeURL;
    private Long gehStundenGebucht = null;
    private java.util.Date gewaehrleistungEndet = null;
    private String hausNummer = null;
    private java.util.Date meldedatumBetrieb = null;
    private String sapAuftrag = null;
    private String stadtteil = null;
    private com.apiomat.nativemodule.baustellenmodul.Strasse strasse = null;
    private String zustaendigSRO = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Baustelle ()
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

    public String getAbnahmeErgebnis()
    {
         return this.abnahmeErgebnis;
    }

    public void setAbnahmeErgebnis( String arg )
    {
        this.abnahmeErgebnis = arg;
    }

    public java.util.Date getAbnahmeVorEndeGewaehrAm()
    {
         return this.abnahmeVorEndeGewaehrAm;
    }

    public void setAbnahmeVorEndeGewaehrAm( java.util.Date arg )
    {
        this.abnahmeVorEndeGewaehrAm = arg;
    }

    public String getAbnahmeVorEndeGewaehrDurch()
    {
         return this.abnahmeVorEndeGewaehrDurch;
    }

    public void setAbnahmeVorEndeGewaehrDurch( String arg )
    {
        this.abnahmeVorEndeGewaehrDurch = arg;
    }

    public String getAufbruch()
    {
         return this.aufbruch;
    }

    public void setAufbruch( String arg )
    {
        this.aufbruch = arg;
    }

    public String getBemerkungen()
    {
         return this.bemerkungen;
    }

    public void setBemerkungen( String arg )
    {
        this.bemerkungen = arg;
    }

    public String getBezirk()
    {
         return this.bezirk;
    }

    public void setBezirk( String arg )
    {
        this.bezirk = arg;
    }

    public String getBilderMeldungURL( )
    {
        return this.bilderMeldungURL;
    }

    public byte[] loadBilderMeldung( )
    {
        final String resUrl = getBilderMeldungURL();
        return getData( com.apiomat.nativemodule.IResourceMethods.ResourceType.FILE, resUrl);
    }

    public java.io.InputStream loadBilderMeldungAsStream( )
    {
        final String resUrl = getBilderMeldungURL();
        return getDataAsStream( com.apiomat.nativemodule.IResourceMethods.ResourceType.FILE, resUrl);
    }

    public String getBilderMeldungURL( String apiKey, String system )
    {
        final String additionalParameters = ".img?apiKey=" + apiKey + "&system=" + system;
        return getBilderMeldungURL( ) + additionalParameters;
    }

    /**
     * @deprecated Use {@link #loadBilderMeldung()}
     */
    @Deprecated
    public byte[] loadBilderMeldung( String apiKey, String system )
    {
        final String resUrl = getBilderMeldungURL( apiKey, system );
        return loadResource(resUrl);
    }

    public void setBilderMeldungURL( String url ) 
    {
        this.bilderMeldungURL = url;
    }

    /**
     * @deprecated Use {@link #postBilderMeldung( java.io.InputStream data , String fileName, String format )}
     */
    @Deprecated
    public String postBilderMeldung( byte[] data , String fileName, String format )
    {
        String url = saveResource( data, false, fileName, format );
        setBilderMeldungURL( url );
        return url;
    }

    public String postBilderMeldung( java.io.InputStream data , String fileName, String format )
    {
        String url = saveResource( data, false, fileName, format );
        setBilderMeldungURL( url );
        return url;
    }

    public java.util.Date getDatumAufmass()
    {
         return this.datumAufmass;
    }

    public void setDatumAufmass( java.util.Date arg )
    {
        this.datumAufmass = arg;
    }

    public String getFirma()
    {
         return this.firma;
    }

    public void setFirma( String arg )
    {
        this.firma = arg;
    }

    public String getFotosAbnahmeURL( )
    {
        return this.fotosAbnahmeURL;
    }

    public byte[] loadFotosAbnahme( )
    {
        final String resUrl = getFotosAbnahmeURL();
        return getData( com.apiomat.nativemodule.IResourceMethods.ResourceType.FILE, resUrl);
    }

    public java.io.InputStream loadFotosAbnahmeAsStream( )
    {
        final String resUrl = getFotosAbnahmeURL();
        return getDataAsStream( com.apiomat.nativemodule.IResourceMethods.ResourceType.FILE, resUrl);
    }

    public String getFotosAbnahmeURL( String apiKey, String system )
    {
        final String additionalParameters = ".img?apiKey=" + apiKey + "&system=" + system;
        return getFotosAbnahmeURL( ) + additionalParameters;
    }

    /**
     * @deprecated Use {@link #loadFotosAbnahme()}
     */
    @Deprecated
    public byte[] loadFotosAbnahme( String apiKey, String system )
    {
        final String resUrl = getFotosAbnahmeURL( apiKey, system );
        return loadResource(resUrl);
    }

    public void setFotosAbnahmeURL( String url ) 
    {
        this.fotosAbnahmeURL = url;
    }

    /**
     * @deprecated Use {@link #postFotosAbnahme( java.io.InputStream data , String fileName, String format )}
     */
    @Deprecated
    public String postFotosAbnahme( byte[] data , String fileName, String format )
    {
        String url = saveResource( data, false, fileName, format );
        setFotosAbnahmeURL( url );
        return url;
    }

    public String postFotosAbnahme( java.io.InputStream data , String fileName, String format )
    {
        String url = saveResource( data, false, fileName, format );
        setFotosAbnahmeURL( url );
        return url;
    }

    public Long getGehStundenGebucht()
    {
         return this.gehStundenGebucht;
    }

    public void setGehStundenGebucht( Long arg )
    {
        this.gehStundenGebucht = arg;
    }

    public java.util.Date getGewaehrleistungEndet()
    {
         return this.gewaehrleistungEndet;
    }

    public void setGewaehrleistungEndet( java.util.Date arg )
    {
        this.gewaehrleistungEndet = arg;
    }

    public String getHausNummer()
    {
         return this.hausNummer;
    }

    public void setHausNummer( String arg )
    {
        this.hausNummer = arg;
    }

    public java.util.Date getMeldedatumBetrieb()
    {
         return this.meldedatumBetrieb;
    }

    public void setMeldedatumBetrieb( java.util.Date arg )
    {
        this.meldedatumBetrieb = arg;
    }

    public String getSapAuftrag()
    {
         return this.sapAuftrag;
    }

    public void setSapAuftrag( String arg )
    {
        this.sapAuftrag = arg;
    }

    public String getStadtteil()
    {
         return this.stadtteil;
    }

    public void setStadtteil( String arg )
    {
        this.stadtteil = arg;
    }

    public com.apiomat.nativemodule.baustellenmodul.Strasse getStrasse()
    { 
        if(this.strasse == null)
        {
            /* do this by reflection to be backward compatible */
            try
            {
                java.lang.reflect.Method m = com.apiomat.nativemodule.AbstractClientDataModel.class.getMethod( "loadReference", String.class,  Class.class );
                this.strasse =  ( com.apiomat.nativemodule.baustellenmodul.Strasse ) m.invoke( this, "strasse", com.apiomat.nativemodule.baustellenmodul.Strasse.class );
            }
            catch ( java.lang.NoSuchMethodException | java.lang.SecurityException | java.lang.IllegalAccessException | java.lang.IllegalArgumentException | java.lang.reflect.InvocationTargetException e )
            {
                 //silently ignored
            }
        }   
        return this.strasse;
    }

    public void postStrasse( final com.apiomat.nativemodule.baustellenmodul.Strasse refData )
    {
        addReference( "strasse", refData );
        this.strasse = refData;
    }

    public void removeStrasse( final com.apiomat.nativemodule.baustellenmodul.Strasse refData )
    {
        removeReference( "strasse", refData );
        this.strasse = null;
    }

    public String getZustaendigSRO()
    {
         return this.zustaendigSRO;
    }

    public void setZustaendigSRO( String arg )
    {
        this.zustaendigSRO = arg;
    }

}
