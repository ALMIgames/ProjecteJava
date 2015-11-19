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

public class Clients implements Serializable {

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
    private String _15descompte;
    private boolean _16esVip;
    private boolean _17tocaObra;

    public Clients( String _2nomCom, String _3dataAlta, String _4nomFis, String _5cifNif, String _6pais, String _7poblacio, String _8direccio, int _9cp, int _10tfon, String _11email, String _12website, int _13cc, String _14notes, String _15descompte, boolean _16esVip, boolean _17tocaObra) {

        this._2nomCom = _2nomCom;
        this._3dataAlta = _3dataAlta;
        this._4nomFis = _4nomFis;
        this._5cifNif = _5cifNif;
        this._6pais = _6pais;
        this._7poblacio = _7poblacio;
        this._8direccio = _8direccio;
        this._9cp = _9cp;
        this._10tfon = _10tfon;
        this._11email = _11email;
        this._12website = _12website;
        this._13cc = _13cc;
        this._14notes = _14notes;
        this._15descompte = _15descompte;
        this._16esVip = _16esVip;
        this._17tocaObra = _17tocaObra;
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

    public String get15descompte() {
        return _15descompte;
    }

    public void set15descompte(String _15descompte) {
        this._15descompte = _15descompte;
    }

    public boolean is16esVip() {
        return _16esVip;
    }

    public void set16esVip(boolean _16esVip) {
        this._16esVip = _16esVip;
    }

    public boolean is17tocaObra() {
        return _17tocaObra;
    }

    public void set17tocaObra(boolean _17tocaObra) {
        this._17tocaObra = _17tocaObra;
    }
}
