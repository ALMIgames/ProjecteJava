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
public class DetallFacturesVendes {
    private int codi;
    private projecte.ComandesVendes comandaVenda;
    private projecte.FacturesVendes facturaVenda;
    private String ref;
    private float importTotalNet;  

    public DetallFacturesVendes(int codi, ComandesVendes comandaVenda, FacturesVendes facturaVenda, String ref, float importTotalNet) {
        this.codi = codi;
        this.comandaVenda = comandaVenda;
        this.facturaVenda = facturaVenda;
        this.ref = ref;
        this.importTotalNet = importTotalNet;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public ComandesVendes getComandaVenda() {
        return comandaVenda;
    }

    public void setComandaVenda(ComandesVendes comandaVenda) {
        this.comandaVenda = comandaVenda;
    }

    public FacturesVendes getFacturaVenda() {
        return facturaVenda;
    }

    public void setFacturaVenda(FacturesVendes facturaVenda) {
        this.facturaVenda = facturaVenda;
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
