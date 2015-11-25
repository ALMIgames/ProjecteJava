
package projecte;

import java.io.Serializable;

public class DetallComandesVendes implements Serializable {

    private ComandesVendes _01comandaVendes; /*objecte->guardar id o ref**/
    private int _02uts;
    private Articles _03article; /*objecte->guardar ref**/
    private String _04nom; 
    private String _05descripcio;
    private String _06acabat;
    private int _07alt; 
    private int _08ample; 
    private int _09fondo;
    private String _10notes; 
    private float _11importUt;
    private float _12importTotal;

    public DetallComandesVendes(ComandesVendes _01comandaVendes, int _02uts, Articles _03article,
    String _04nom, String _05descripcio, String _06acabat, int _07alt, int _08ample, int _09fondo,
    String _10notes, float _11importUt, float _12importTotal) {
        this._01comandaVendes = _01comandaVendes;
        this._02uts = _02uts;
        this._03article = _03article;
        this._04nom = _04nom;
        this._05descripcio = _05descripcio;
        this._06acabat = _06acabat;
        this._07alt = _07alt;
        this._08ample = _08ample;
        this._09fondo = _09fondo;
        this._10notes = _10notes;
        this._11importUt = _11importUt;
        this._12importTotal = _12importTotal;
    }

    public ComandesVendes get01comandaVendes() {
        return _01comandaVendes;
    }

    public void set01comandaVendes(ComandesVendes _01comandaVendes) {
        this._01comandaVendes = _01comandaVendes;
    }

    public int get02uts() {
        return _02uts;
    }

    public void set02uts(int _02uts) {
        this._02uts = _02uts;
    }

    public Articles get03article() {
        return _03article;
    }

    public void set03article(Articles _03article) {
        this._03article = _03article;
    }

    public String get04nom() {
        return _04nom;
    }

    public void set04nom(String _04nom) {
        this._04nom = _04nom;
    }

    public String get05descripcio() {
        return _05descripcio;
    }

    public void set05descripcio(String _05descripcio) {
        this._05descripcio = _05descripcio;
    }

    public String get06acabat() {
        return _06acabat;
    }

    public void set06acabat(String _06acabat) {
        this._06acabat = _06acabat;
    }

    public int get07alt() {
        return _07alt;
    }

    public void set07alt(int _07alt) {
        this._07alt = _07alt;
    }

    public int get08ample() {
        return _08ample;
    }

    public void set08ample(int _08ample) {
        this._08ample = _08ample;
    }

    public int get09fondo() {
        return _09fondo;
    }

    public void set09fondo(int _09fondo) {
        this._09fondo = _09fondo;
    }

    public String get10notes() {
        return _10notes;
    }

    public void set10notes(String _10notes) {
        this._10notes = _10notes;
    }

    public float get11importUt() {
        return _11importUt;
    }

    public void set11importUt(float _11importUt) {
        this._11importUt = _11importUt;
    }

    public float get12importTotal() {
        return _12importTotal;
    }

    public void set12importTotal(float _12importTotal) {
        this._12importTotal = _12importTotal;
    }

   
}
