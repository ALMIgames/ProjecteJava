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
public class FacturesVendes {
    private int codi;
    private String dataAlta;
    private String responsable;
    private String ref;
    private projecte.Clients client;
    private enum estat{perconfirmar, confirmat, pagatcobrat, entregat};
    private String notes;
    private float importTotal;

    public FacturesVendes(int codi, String dataAlta, String responsable, String ref, Clients client, String notes, float importTotal) {
        this.codi = codi;
        this.dataAlta = dataAlta;
        this.responsable = responsable;
        this.ref = ref;
        this.client = client;
        this.notes = notes;
        this.importTotal = importTotal;
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

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public float getImportTotal() {
        return importTotal;
    }

    public void setImportTotal(float importTotal) {
        this.importTotal = importTotal;
    }

    
}
