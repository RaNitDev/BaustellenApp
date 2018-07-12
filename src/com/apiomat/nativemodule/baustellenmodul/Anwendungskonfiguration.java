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
* Generated class for your Anwendungskonfiguration data model
*
* DO NOT CHANGE ANY CODE EXCEPT CLASS ANNOTATIONS OR CLASS ATTRIBUTES HERE!
* EVERYTHING ELSE WILL GET OVERWRITTEN!
*
*/
@java.lang.SuppressWarnings( "unused" )
@com.apiomat.nativemodule.Model( moduleName = "BaustellenModul",
    hooksClassNameTransient = "com.apiomat.nativemodule.baustellenmodul.AnwendungskonfigurationHooksTransient", 
    hooksClassNameNonTransient = "com.apiomat.nativemodule.baustellenmodul.AnwendungskonfigurationHooksNonTransient", 
            isTransient = false,     requiredUserRoleCreate=com.apiomat.nativemodule.UserRole.User, requiredUserRoleRead=com.apiomat.nativemodule.UserRole.User,
    requiredUserRoleWrite=com.apiomat.nativemodule.UserRole.Owner, restrictResourceAccess=false,
    allowedRolesCreate={}, allowedRolesRead={},
    allowedRolesWrite={}, allowedRolesGrant={})
public class Anwendungskonfiguration extends com.apiomat.nativemodule.AbstractClientDataModel<com.apiomat.nativemodule.baustellenmodul.Anwendungskonfiguration> implements com.apiomat.nativemodule.IModel<com.apiomat.nativemodule.baustellenmodul.Anwendungskonfiguration>
{
    /**
     * Contains the name of the module that this model belongs to
     */
    public static final String MODULE_NAME = "BaustellenModul";
    /**
     * Contains the name of the model
     */
    public static final String MODEL_NAME = "Anwendungskonfiguration";

    /** class specific attributes */
    private java.util.List<String> bezirke = new java.util.ArrayList<>();
    private java.util.List<String> plattenFirmen = new java.util.ArrayList<>();
    private java.util.List<String> schwarzDeckenFirmen = new java.util.ArrayList<>();
    private java.util.List<String> stadtTeile = new java.util.ArrayList<>();
    private String textStartSeite = null;
    private java.util.List<String> verantwortlicheSRO = new java.util.ArrayList<>();
    /**
     * Protected constructor; to create a new instance, use the createObject() method
     */
    public Anwendungskonfiguration ()
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

    public java.util.List<String> getBezirke()
    {
         return this.bezirke;
    }

    public void setBezirke( java.util.List<String> arg )
    {
        this.bezirke = arg;
    }

    public java.util.List<String> getPlattenFirmen()
    {
         return this.plattenFirmen;
    }

    public void setPlattenFirmen( java.util.List<String> arg )
    {
        this.plattenFirmen = arg;
    }

    public java.util.List<String> getSchwarzDeckenFirmen()
    {
         return this.schwarzDeckenFirmen;
    }

    public void setSchwarzDeckenFirmen( java.util.List<String> arg )
    {
        this.schwarzDeckenFirmen = arg;
    }

    public java.util.List<String> getStadtTeile()
    {
         return this.stadtTeile;
    }

    public void setStadtTeile( java.util.List<String> arg )
    {
        this.stadtTeile = arg;
    }

    public String getTextStartSeite()
    {
         return this.textStartSeite;
    }

    public void setTextStartSeite( String arg )
    {
        this.textStartSeite = arg;
    }

    public java.util.List<String> getVerantwortlicheSRO()
    {
         return this.verantwortlicheSRO;
    }

    public void setVerantwortlicheSRO( java.util.List<String> arg )
    {
        this.verantwortlicheSRO = arg;
    }

}
