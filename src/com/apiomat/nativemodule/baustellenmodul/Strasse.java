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
* Generated class for your Strasse data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "BaustellenModul",
    hooksClassNameTransient = "com.apiomat.nativemodule.baustellenmodul.StrasseHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.baustellenmodul.StrasseHooksNonTransient", 
            isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,
    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={})
public class Strasse extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.baustellenmodul.Strasse> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.baustellenmodul.Strasse>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "BaustellenModul";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Strasse";

    /** class specific attributes */
    private String bisE = null;
    private String bisNummer = null;
    private String hsNrKz = null;
    private String name = null;
    private String ortsTeil = null;
    private String plz = null;
    private String regionalStruktur = null;
    private String stadt = null;
    private String vonE = null;
    private String vonNummer = null;
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Strasse ()
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

    public String getBisE()
    {
         return this.bisE;
    }

    public void setBisE( String arg )
    {
        this.bisE = arg;
    }

    public String getBisNummer()
    {
         return this.bisNummer;
    }

    public void setBisNummer( String arg )
    {
        this.bisNummer = arg;
    }

    public String getHsNrKz()
    {
         return this.hsNrKz;
    }

    public void setHsNrKz( String arg )
    {
        this.hsNrKz = arg;
    }

    public String getName()
    {
         return this.name;
    }

    public void setName( String arg )
    {
        this.name = arg;
    }

    public String getOrtsTeil()
    {
         return this.ortsTeil;
    }

    public void setOrtsTeil( String arg )
    {
        this.ortsTeil = arg;
    }

    public String getPlz()
    {
         return this.plz;
    }

    public void setPlz( String arg )
    {
        this.plz = arg;
    }

    public String getRegionalStruktur()
    {
         return this.regionalStruktur;
    }

    public void setRegionalStruktur( String arg )
    {
        this.regionalStruktur = arg;
    }

    public String getStadt()
    {
         return this.stadt;
    }

    public void setStadt( String arg )
    {
        this.stadt = arg;
    }

    public String getVonE()
    {
         return this.vonE;
    }

    public void setVonE( String arg )
    {
        this.vonE = arg;
    }

    public String getVonNummer()
    {
         return this.vonNummer;
    }

    public void setVonNummer( String arg )
    {
        this.vonNummer = arg;
    }

}
