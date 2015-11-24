
package projecte;

import java.io.Serializable;

public class Articles implements Serializable {

    private String _01dataAlta;
    private Proveidors _02proveidor; /*objecte*/
    private String _03ref; 
    private String _04nom; 
    private String _05descripcio;
    private String _06acabat;
    private int _07alt; 
    private int _08ample; 
    private int _09fondo;
    private float _10preuProv;
    private float _11preuVenda;

    public Articles(String _01dataAlta, Proveidors _02proveidor, String _03ref, String _04nom, String _05descripcio, String _06acabat, int _07alt, int _08ample, int _09fondo, float _10preuProv, float _11preuVenda) {
        this._01dataAlta = _01dataAlta;
        this._02proveidor = _02proveidor;
        this._03ref = _03ref;
        this._04nom = _04nom;
        this._05descripcio = _05descripcio;
        this._06acabat = _06acabat;
        this._07alt = _07alt;
        this._08ample = _08ample;
        this._09fondo = _09fondo;
        this._10preuProv = _10preuProv;
        this._11preuVenda = _11preuVenda;
    }

    public String get01dataAlta() {
        return _01dataAlta;
    }

    public void set01dataAlta(String _01dataAlta) {
        this._01dataAlta = _01dataAlta;
    }

    public Proveidors get02proveidor() {
        return _02proveidor;
    }

    public void set02proveidor(Proveidors _02proveidor) {
        this._02proveidor = _02proveidor;
    }

    public String get03ref() {
        return _03ref;
    }

    public void set03ref(String _03ref) {
        this._03ref = _03ref;
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

    public float get10preuProv() {
        return _10preuProv;
    }

    public void set10preuProv(float _10preuProv) {
        this._10preuProv = _10preuProv;
    }

    public float get11preuVenda() {
        return _11preuVenda;
    }

    public void set11preuVenda(float _11preuVenda) {
        this._11preuVenda = _11preuVenda;
    }
    
    
}
