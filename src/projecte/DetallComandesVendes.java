
package projecte;

import java.io.Serializable;

public class DetallComandesVendes implements Serializable {

    private int codi;
    private ComandesVendes comandaVendes; /*objecte*/
    private int uts;
    private Articles article; /*objecte*/
    private String ref; 
    private String nom; 
    private String descripcio;
    private String acabat;
    private int alt; 
    private int ample; 
    private int fondo;
    private String notes; 
    private float importUt;
    private float importTotal;

    public DetallComandesVendes(int codi, ComandesVendes comandaVendes, int uts, 
    Articles article, String ref, String nom, String descripcio, String acabat,
    int alt, int ample, int fondo, String notes, float importUt, float importTotal) {
        this.codi = codi;
        this.comandaVendes = comandaVendes;
        this.uts = uts;
        this.article = article;
        this.ref = ref;
        this.nom = nom;
        this.descripcio = descripcio;
        this.acabat = acabat;
        this.alt = alt;
        this.ample = ample;
        this.fondo = fondo;
        this.notes = notes;
        this.importUt = importUt;
        this.importTotal = importTotal;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public ComandesVendes getComandaVendes() {
        return comandaVendes;
    }

    public void setComandaVendes(ComandesVendes comandaVendes) {
        this.comandaVendes = comandaVendes;
    }

    public int getUts() {
        return uts;
    }

    public void setUts(int uts) {
        this.uts = uts;
    }

    public Articles getArticle() {
        return article;
    }

    public void setArticle(Articles article) {
        this.article = article;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public float getImportUt() {
        return importUt;
    }

    public void setImportUt(float importUt) {
        this.importUt = importUt;
    }

    public float getImportTotal() {
        return importTotal;
    }

    public void setImportTotal(float importTotal) {
        this.importTotal = importTotal;
    }
   
}
