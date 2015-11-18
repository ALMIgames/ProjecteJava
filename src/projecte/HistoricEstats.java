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
public class HistoricEstats {
    private String tipus;
    private int codi;
    private String data;
    private int estat;
    private String observacions;

    public HistoricEstats(String tipus, int codi, String data, int estat, String observacions) {
        this.tipus = tipus;
        this.codi = codi;
        this.data = data;
        this.estat = estat;
        this.observacions = observacions;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getEstat() {
        return estat;
    }

    public void setEstat(int estat) {
        this.estat = estat;
    }

    public String getObservacions() {
        return observacions;
    }

    public void setObservacions(String observacions) {
        this.observacions = observacions;
    }
    
    
}
