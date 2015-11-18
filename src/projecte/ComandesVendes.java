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
public class ComandesVendes {
    private int codi;
    private String dataAlta;
    private String responsable;
    private String ref;
    private projecte.Clients client;
    private boolean esObra;
    private String dataEntregaAprox;
    private String direccioEntrega;
    private String observacionsEntrega;
    private enum estat{perconfirmar, confirmat, pagatcobrat, entregat};
    private String notes;
    private float importTotalPreDesc;
    private int descompte;
    private float importTotal;
    private float importTotalNet;

    public ComandesVendes(int codi, String dataAlta, String responsable, String ref, Clients client, boolean esObra, String dataEntregaAprox, String direccioEntrega, String observacionsEntrega, String notes, float importTotalPreDesc, int descompte, float importTotal, float importTotalNet) {
        this.codi = codi;
        this.dataAlta = dataAlta;
        this.responsable = responsable;
        this.ref = ref;
        this.client = client;
        this.esObra = esObra;
        this.dataEntregaAprox = dataEntregaAprox;
        this.direccioEntrega = direccioEntrega;
        this.observacionsEntrega = observacionsEntrega;
        this.notes = notes;
        this.importTotalPreDesc = importTotalPreDesc;
        this.descompte = descompte;
        this.importTotal = importTotal;
        this.importTotalNet = importTotalNet;
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

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }

    public boolean isEsObra() {
        return esObra;
    }

    public void setEsObra(boolean esObra) {
        this.esObra = esObra;
    }

    public String getDataEntregaAprox() {
        return dataEntregaAprox;
    }

    public void setDataEntregaAprox(String dataEntregaAprox) {
        this.dataEntregaAprox = dataEntregaAprox;
    }

    public String getDireccioEntrega() {
        return direccioEntrega;
    }

    public void setDireccioEntrega(String direccioEntrega) {
        this.direccioEntrega = direccioEntrega;
    }

    public String getObservacionsEntrega() {
        return observacionsEntrega;
    }

    public void setObservacionsEntrega(String observacionsEntrega) {
        this.observacionsEntrega = observacionsEntrega;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public float getImportTotalPreDesc() {
        return importTotalPreDesc;
    }

    public void setImportTotalPreDesc(float importTotalPreDesc) {
        this.importTotalPreDesc = importTotalPreDesc;
    }

    public int getDescompte() {
        return descompte;
    }

    public void setDescompte(int descompte) {
        this.descompte = descompte;
    }

    public float getImportTotal() {
        return importTotal;
    }

    public void setImportTotal(float importTotal) {
        this.importTotal = importTotal;
    }

    public float getImportTotalNet() {
        return importTotalNet;
    }

    public void setImportTotalNet(float importTotalNet) {
        this.importTotalNet = importTotalNet;
    }

    
}
