/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

/**
 *
 * @author albert
 */
public class DetallComandesCompres {
    private int codi;
    private projecte.ComandesCompres comandaCompra;
    private projecte.DetallComandesVendes detallComandaVenda;
    private int unitats;
    private projecte.Articles article;
    private String ref;
    private String nom;
    private String descripcio;
    private String acabat;
    private int alt;
    private int ample;
    private int fondo;
    private String notes;
    private enum tipusPreuProv{unitat, ML, M2};
    private float preuProv;
    private float importUnitatPreDesc;
    private int descompte;
    private float importUnitat;
    private float importTotal;

    public DetallComandesCompres(int codi, ComandesCompres comandaCompra, DetallComandesVendes detallComandaVenda, int unitats, Articles article, String ref, String nom, String descripcio, String acabat, int alt, int ample, int fondo, String notes, float preuProv, float importUnitatPreDesc, int descompte, float importUnitat, float importTotal) {
        this.codi = codi;
        this.comandaCompra = comandaCompra;
        this.detallComandaVenda = detallComandaVenda;
        this.unitats = unitats;
        this.article = article;
        this.ref = ref;
        this.nom = nom;
        this.descripcio = descripcio;
        this.acabat = acabat;
        this.alt = alt;
        this.ample = ample;
        this.fondo = fondo;
        this.notes = notes;
        this.preuProv = preuProv;
        this.importUnitatPreDesc = importUnitatPreDesc;
        this.descompte = descompte;
        this.importUnitat = importUnitat;
        this.importTotal = importTotal;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public ComandesCompres getComandaCompra() {
        return comandaCompra;
    }

    public void setComandaCompra(ComandesCompres comandaCompra) {
        this.comandaCompra = comandaCompra;
    }

    public DetallComandesVendes getDetallComandaVenda() {
        return detallComandaVenda;
    }

    public void setDetallComandaVenda(DetallComandesVendes detallComandaVenda) {
        this.detallComandaVenda = detallComandaVenda;
    }

    public int getUnitats() {
        return unitats;
    }

    public void setUnitats(int unitats) {
        this.unitats = unitats;
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

    public float getPreuProv() {
        return preuProv;
    }

    public void setPreuProv(float preuProv) {
        this.preuProv = preuProv;
    }

    public float getImportUnitatPreDesc() {
        return importUnitatPreDesc;
    }

    public void setImportUnitatPreDesc(float importUnitatPreDesc) {
        this.importUnitatPreDesc = importUnitatPreDesc;
    }

    public int getDescompte() {
        return descompte;
    }

    public void setDescompte(int descompte) {
        this.descompte = descompte;
    }

    public float getImportUnitat() {
        return importUnitat;
    }

    public void setImportUnitat(float importUnitat) {
        this.importUnitat = importUnitat;
    }

    public float getImportTotal() {
        return importTotal;
    }

    public void setImportTotal(float importTotal) {
        this.importTotal = importTotal;
    }

 
}
