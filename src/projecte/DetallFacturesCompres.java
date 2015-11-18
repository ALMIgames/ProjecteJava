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
public class DetallFacturesCompres {
    private int codi;
    private projecte.ComandesCompres comandaCompra;
    private projecte.FacturesCompres facturaCompra;
    private String ref;
    private float importTotalNet;  

    public DetallFacturesCompres(int codi, ComandesCompres comandaCompra, FacturesCompres facturaCompra, String ref, float importTotalNet) {
        this.codi = codi;
        this.comandaCompra = comandaCompra;
        this.facturaCompra = facturaCompra;
        this.ref = ref;
        this.importTotalNet = importTotalNet;
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

    public FacturesCompres getFacturaCompra() {
        return facturaCompra;
    }

    public void setFacturaCompra(FacturesCompres facturaCompra) {
        this.facturaCompra = facturaCompra;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public float getImportTotalNet() {
        return importTotalNet;
    }

    public void setImportTotalNet(float importTotalNet) {
        this.importTotalNet = importTotalNet;
    }
    
    
}
