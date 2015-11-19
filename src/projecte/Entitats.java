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

    private int _1codi;
    private String _2nomCom;
    private String _3dataAlta;
    private String _4nomFis; 
    private String _5cifNif; 
    private String _6pais; 
    private String _7poblacio;
    private String _8direccio;
    private int _9cp; 
    private int _10tfon; 
    private String _11email;
    private String _12website;
    private int _13cc;
    private String _14notes;
    private int _15descompte;
    
    
    public Entitats(int codi, String nomCom, String dataAlta, String nomFis, String cifNif, String pais, String poblacio, String direccio, int cp, int tfon, String email, String website, int cc, int descompte, String notes) {
        this._1codi = codi;
        this._2nomCom = nomCom;
        this._3dataAlta = dataAlta;
        this._4nomFis = nomFis;
        this._5cifNif = cifNif;
        this._6pais = pais;
        this._7poblacio = poblacio;
        this._8direccio = direccio;
        this._9cp = cp;
        this._10tfon = tfon;
        this._11email = email;
        this._12website = website;
        this._13cc = cc;
        this._15descompte = descompte;
        this._14notes = notes;
        
    }

    public String get2nomCom() {
        return _2nomCom;
    }

    public void set2nomCom(String _2nomCom) {
        this._2nomCom = _2nomCom;
    }

    public String get3dataAlta() {
        return _3dataAlta;
    }

    public void set3dataAlta(String _3dataAlta) {
        this._3dataAlta = _3dataAlta;
    }

    public String get4nomFis() {
        return _4nomFis;
    }

    public void set4nomFis(String _4nomFis) {
        this._4nomFis = _4nomFis;
    }

    public String get5cifNif() {
        return _5cifNif;
    }

    public void set5cifNif(String _5cifNif) {
        this._5cifNif = _5cifNif;
    }

    public String get6pais() {
        return _6pais;
    }

    public void set6pais(String _6pais) {
        this._6pais = _6pais;
    }

    public String get7poblacio() {
        return _7poblacio;
    }

    public void set7poblacio(String _7poblacio) {
        this._7poblacio = _7poblacio;
    }

    public String get8direccio() {
        return _8direccio;
    }

    public void set8direccio(String _8direccio) {
        this._8direccio = _8direccio;
    }

    public int get9cp() {
        return _9cp;
    }

    public void set9cp(int _9cp) {
        this._9cp = _9cp;
    }

    public int get10tfon() {
        return _10tfon;
    }

    public void set10tfon(int _10tfon) {
        this._10tfon = _10tfon;
    }

    public String get11email() {
        return _11email;
    }

    public void set11email(String _11email) {
        this._11email = _11email;
    }

    public String get12website() {
        return _12website;
    }

    public void set12website(String _12website) {
        this._12website = _12website;
    }

    public int get13cc() {
        return _13cc;
    }

    public void set13cc(int _13cc) {
        this._13cc = _13cc;
    }

    public String get14notes() {
        return _14notes;
    }

    public void set14notes(String _14notes) {
        this._14notes = _14notes;
    }
    
    public int get15descompte() {
        return _15descompte;
    }


    public void set15descompte(int _15descompte) {
        this._15descompte = _15descompte;
    }
    
    
    public int get1codi() {
        return _1codi;
    }

    public void set1codi(int _1codi) {
        this._1codi = _1codi;
    }

}
