
package projecte;

import java.io.Serializable;

public class ComandesVendes implements Serializable {

    private String _01dataAlta;
    private Clients _02client; /*objecte->guardar id o nomCom**/
    private String _03ref; 
    private String _04responsable; 
    private String _05dataEntrega;
    private String _06obsEntrega; 
    private String _07notes; 
    private float _08importPreDesc;
    private int _09descompte;
    private float _10importBrut;
    private float _11importNet;

    public ComandesVendes(String _01dataAlta, Clients _02client, String _03ref,
    String _04responsable, String _05dataEntrega, String _06obsEntrega, String _07notes,
    float _08importPreDesc, int _09descompte, float _10importBrut, float _11importNet) {
        this._01dataAlta = _01dataAlta;
        this._02client = _02client;
        this._03ref = _03ref;
        this._04responsable = _04responsable;
        this._05dataEntrega = _05dataEntrega;
        this._06obsEntrega = _06obsEntrega;
        this._07notes = _07notes;
        this._08importPreDesc = _08importPreDesc;
        this._09descompte = _09descompte;
        this._10importBrut = _10importBrut;
        this._11importNet = _11importNet;
    }

    public String get01dataAlta() {
        return _01dataAlta;
    }

    public void set01dataAlta(String _01dataAlta) {
        this._01dataAlta = _01dataAlta;
    }

    public Clients get02client() {
        return _02client;
    }

    public void set02client(Clients _02client) {
        this._02client = _02client;
    }

    public String get03ref() {
        return _03ref;
    }

    public void set03ref(String _03ref) {
        this._03ref = _03ref;
    }

    public String get04responsable() {
        return _04responsable;
    }

    public void set04responsable(String _04responsable) {
        this._04responsable = _04responsable;
    }

    public String get05dataEntrega() {
        return _05dataEntrega;
    }

    public void set05dataEntrega(String _05dataEntrega) {
        this._05dataEntrega = _05dataEntrega;
    }

    public String get06obsEntrega() {
        return _06obsEntrega;
    }

    public void set06obsEntrega(String _06obsEntrega) {
        this._06obsEntrega = _06obsEntrega;
    }

    public String get07notes() {
        return _07notes;
    }

    public void set07notes(String _07notes) {
        this._07notes = _07notes;
    }

    public float get08importPreDesc() {
        return _08importPreDesc;
    }

    public void set08importPreDesc(float _08importPreDesc) {
        this._08importPreDesc = _08importPreDesc;
    }

    public int get09descompte() {
        return _09descompte;
    }

    public void set09descompte(int _09descompte) {
        this._09descompte = _09descompte;
    }

    public float get10importBrut() {
        return _10importBrut;
    }

    public void set10importBrut(float _10importBrut) {
        this._10importBrut = _10importBrut;
    }

    public float get11importNet() {
        return _11importNet;
    }

    public void set11importNet(float _11importNet) {
        this._11importNet = _11importNet;
    }

    
}
