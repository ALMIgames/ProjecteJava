/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.io.Serializable;

/**
 *
 * @author alumne
 */

public class Entitats implements Serializable {

    private int codi;
    private String nomCom;
    private String dataAlta;
    private String nomFis; 
    private String cifNif; 
    private String pais; 
    private String poblacio;
    private String direccio;
    private int cp; 
    private int tfon; 
    private String email;
    private String website;
    private int cc;
    private String notes;
    private int descompte;
    private boolean actiu;
    
    
    public Entitats(int codi, String nomCom, String dataAlta, String nomFis, String cifNif, String pais, String poblacio, String direccio, int cp, int tfon, String email, String website, int cc, int descompte, String notes, boolean actiu) {
        this.codi = codi;
        this.nomCom = nomCom;
        this.dataAlta = dataAlta;
        this.nomFis = nomFis;
        this.cifNif = cifNif;
        this.pais = pais;
        this.poblacio = poblacio;
        this.direccio = direccio;
        this.cp = cp;
        this.tfon = tfon;
        this.email = email;
        this.website = website;
        this.cc = cc;
        this.descompte = descompte;
        this.notes = notes;
        this.actiu = actiu;
        
    }

    public String getNomCom() {
        return nomCom;
    }

    public void setNomCom(String nomCom) {
        this.nomCom = nomCom;
    }

    public String getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
    }

    public String getNomFis() {
        return nomFis;
    }

    public void setNomFis(String nomFis) {
        this.nomFis = nomFis;
    }

    public String getCifNif() {
        return cifNif;
    }

    public void setCifNif(String cifNif) {
        this.cifNif = cifNif;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public String getDireccio() {
        return direccio;
    }

    public void setDireccio(String direccio) {
        this.direccio = direccio;
    }

    public int getCp() {
        return cp;
    }

    public void setCp(int cp) {
        this.cp = cp;
    }

    public int getTfon() {
        return tfon;
    }

    public void setTfon(int tfon) {
        this.tfon = tfon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
    
    public int getDescompte() {
        return descompte;
    }


    public void setDescompte(int descompte) {
        this.descompte = descompte;
    }
    
    public boolean isBorrat() {
        return actiu;
    }
    public void setesBorrat(boolean borrat) {
        this.actiu = borrat;
    }    
    
    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

}
