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
public class Proveidors extends Entitats {

    
    private String tempsEntrega;
    private String portsGratuits;
    private String expoEnDiposit;

    public Proveidors(int codi, String nomCom, String dataAlta, String nomFis, String cifNif, String pais, String poblacio, String direccio, int cp, int tfon, String email, String website, int cc, int descompte, String notes, String tempsEntrega, String portsGratuits, String expoEnDiposit) {
        super(codi, nomCom, dataAlta, nomFis, cifNif, pais, poblacio, direccio, cp, tfon, email, website, cc, descompte, notes);
        this.tempsEntrega = tempsEntrega;
        this.portsGratuits = portsGratuits;
        this.expoEnDiposit = expoEnDiposit;
    }

    public String getTempsEntrega() {
        return tempsEntrega;
    }

    public void setTempsEntrega(String tempsEntrega) {
        this.tempsEntrega = tempsEntrega;
    }

    public String getPortsGratuits() {
        return portsGratuits;
    }

    public void setPortsGratuits(String portsGratuits) {
        this.portsGratuits = portsGratuits;
    }

    public String getExpoEnDiposit() {
        return expoEnDiposit;
    }

    public void setExpoEnDiposit(String expoEnDiposit) {
        this.expoEnDiposit = expoEnDiposit;
    }
    
}
