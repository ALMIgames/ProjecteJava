
package projecte;

import java.io.Serializable;

public class Proveidors implements Serializable {

    private String _01nomCom;
    private String _02dataAlta;
    private String _03nomFis; 
    private String _04cifNif; 
    private String _05pais; 
    private String _06poblacio;
    private String _07direccio;
    private int _08cp; 
    private int _09tfon; 
    private String _10email;
    private String _11website;
    private int _12cc;
    private String _13descompte;
    private String _14notes;
    private String _15entrega; /*Per indicar el temps d'entrega pactat per als diferents tipus d'articles i comandes*/
    private String _16ports; /*Per indicar els preus pactats per al tranport segons quantitat de consum*/
    private String _17expo; /*Per indicar els productes comercials prestats pel proveidor: si s'han de tornar, si tenen cost, condicions... etc*/

    public Proveidors(String _01nomCom, String _02dataAlta, String _03nomFis, String _04cifNif, String _05pais, String _06poblacio, String _07direccio, int _08cp, int _09tfon, String _10email, String _11website, int _12cc, String _13descompte, String _14notes, String _15entrega, String _16ports, String _17expo) {
        this._01nomCom = _01nomCom;
        this._02dataAlta = _02dataAlta;
        this._03nomFis = _03nomFis;
        this._04cifNif = _04cifNif;
        this._05pais = _05pais;
        this._06poblacio = _06poblacio;
        this._07direccio = _07direccio;
        this._08cp = _08cp;
        this._09tfon = _09tfon;
        this._10email = _10email;
        this._11website = _11website;
        this._12cc = _12cc;
        this._13descompte = _13descompte;
        this._14notes = _14notes;
        this._15entrega = _15entrega;
        this._16ports = _16ports;
        this._17expo = _17expo;
    }

    public String get01nomCom() {
        return _01nomCom;
    }

    public void set01nomCom(String _01nomCom) {
        this._01nomCom = _01nomCom;
    }

    public String get02dataAlta() {
        return _02dataAlta;
    }

    public void set02dataAlta(String _02dataAlta) {
        this._02dataAlta = _02dataAlta;
    }

    public String get03nomFis() {
        return _03nomFis;
    }

    public void set03nomFis(String _03nomFis) {
        this._03nomFis = _03nomFis;
    }

    public String get04cifNif() {
        return _04cifNif;
    }

    public void set04cifNif(String _04cifNif) {
        this._04cifNif = _04cifNif;
    }

    public String get05pais() {
        return _05pais;
    }

    public void set05pais(String _05pais) {
        this._05pais = _05pais;
    }

    public String get06poblacio() {
        return _06poblacio;
    }

    public void set06poblacio(String _06poblacio) {
        this._06poblacio = _06poblacio;
    }

    public String get07direccio() {
        return _07direccio;
    }

    public void set07direccio(String _07direccio) {
        this._07direccio = _07direccio;
    }

    public int get08cp() {
        return _08cp;
    }

    public void set08cp(int _08cp) {
        this._08cp = _08cp;
    }

    public int get09tfon() {
        return _09tfon;
    }

    public void set09tfon(int _09tfon) {
        this._09tfon = _09tfon;
    }

    public String get10email() {
        return _10email;
    }

    public void set10email(String _10email) {
        this._10email = _10email;
    }

    public String get11website() {
        return _11website;
    }

    public void set11website(String _11website) {
        this._11website = _11website;
    }

    public int get12cc() {
        return _12cc;
    }

    public void set12cc(int _12cc) {
        this._12cc = _12cc;
    }

    public String get13descompte() {
        return _13descompte;
    }

    public void set13descompte(String _13descompte) {
        this._13descompte = _13descompte;
    }

    public String get14notes() {
        return _14notes;
    }

    public void set14notes(String _14notes) {
        this._14notes = _14notes;
    }

    public String get15entrega() {
        return _15entrega;
    }

    public void set15entrega(String _15entrega) {
        this._15entrega = _15entrega;
    }

    public String get16ports() {
        return _16ports;
    }

    public void set16ports(String _16ports) {
        this._16ports = _16ports;
    }

    public String get17expo() {
        return _17expo;
    }

    public void set17expo(String _17expo) {
        this._17expo = _17expo;
    }

  
   
}
