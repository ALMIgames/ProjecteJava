
package projecte;

import java.io.Serializable;

public class Articles implements Serializable {

    private int codi;
    private String dataAlta;
    private Proveidors proveidor; /*objecte*/
    private String ref; 
    private String nom; 
    private String descripcio;
    private String acabat;
    private int alt; 
    private int ample; 
    private int fondo;
    private float preuProv;
    private float preuVenda;
    
    public Articles(int codi, String dataAlta, Proveidors proveidor, String ref, 
    String nom, String descripcio, String acabat, int alt, int ample, int fondo, 
    float preuProv, float preuVenda) {
        this.codi = codi;
        this.dataAlta = dataAlta;
        this.proveidor = proveidor;
        this.ref = ref;
        this.nom = nom;
        this.descripcio = descripcio;
        this.acabat = acabat;
        this.alt = alt;
        this.ample = ample;
        this.fondo = fondo;
        this.preuProv = preuProv;
        this.preuVenda = preuVenda;
    }
    
    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
    }

    public Proveidors getProveidor() {
        return proveidor;
    }

    public void setProveidor(Proveidors proveidor) {
        this.proveidor = proveidor;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescripcio() {
        return descripcio;
    }

    public void setDescripcio(String descripcio) {
        this.descripcio = descripcio;
    }

    public String getAcabat() {
        return acabat;
    }

    public void setAcabat(String acabat) {
        this.acabat = acabat;
    }

    public int getAlt() {
        return alt;
    }

    public void setAlt(int alt) {
        this.alt = alt;
    }

    public int getAmple() {
        return ample;
    }

    public void setAmple(int ample) {
        this.ample = ample;
    }

    public int getFondo() {
        return fondo;
    }

    public void setFondo(int fondo) {
        this.fondo = fondo;
    }

    public float getPreuProv() {
        return preuProv;
    }

    public void setPreuProv(float preuProv) {
        this.preuProv = preuProv;
    }

    public float getPreuVenda() {
        return preuVenda;
    }

    public void setPreuVenda(float preuVenda) {
        this.preuVenda = preuVenda;
    }

    
}
