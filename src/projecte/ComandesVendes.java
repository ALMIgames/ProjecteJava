
package projecte;

import java.io.Serializable;

public class ComandesVendes implements Serializable {

    private int codi;
    private String dataAlta;
    private Clients client; /*objecte*/
    private String ref; 
    private String responsable; 
    private String dataEntrega;
    private String obsEntrega; 
    private String notes; 
    private float importPreDesc;
    private int descompte;
    private float importBrut;
    private float importNet;

    public ComandesVendes(int codi, String dataAlta, Clients client, String ref, 
    String responsable, String dataEntrega, String obsEntrega,
    String notes, float importPreDesc, int descompte, float importBrut, float importNet) {
        this.codi = codi;
        this.dataAlta = dataAlta;
        this.client = client;
        this.ref = ref;
        this.responsable = responsable;
        this.dataEntrega = dataEntrega;
        this.obsEntrega = obsEntrega;
        this.notes = notes;
        this.importPreDesc = importPreDesc;
        this.descompte = descompte;
        this.importBrut = importBrut;
        this.importNet = importNet;
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

    public Clients getClient() {
        return client;
    }

    public void setClient(Clients client) {
        this.client = client;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getObsEntrega() {
        return obsEntrega;
    }

    public void setObsEntrega(String obsEntrega) {
        this.obsEntrega = obsEntrega;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public float getImportPreDesc() {
        return importPreDesc;
    }

    public void setImportPreDesc(float importPreDesc) {
        this.importPreDesc = importPreDesc;
    }

    public int getDescompte() {
        return descompte;
    }

    public void setDescompte(int descompte) {
        this.descompte = descompte;
    }

    public float getImportBrut() {
        return importBrut;
    }

    public void setImportBrut(float importBrut) {
        this.importBrut = importBrut;
    }

    public float getImportNet() {
        return importNet;
    }

    public void setImportNet(float importNet) {
        this.importNet = importNet;
    }
    
}
