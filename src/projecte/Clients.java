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
public class Clients extends Entitats{

    private boolean esVip;
    private boolean tocaObra;

    public Clients(int codi, String nomCom, String dataAlta, String nomFis, String cifNif, String pais, String poblacio, String direccio, int cp, int tfon, String email, String website, int cc, int descompte, String notes, boolean actiu, boolean esVip, boolean tocaObra) {
        super(codi, nomCom, dataAlta, nomFis, cifNif, pais, poblacio, direccio, cp, tfon, email, website, cc, descompte, notes, actiu);
        this.esVip = esVip;
        this.tocaObra = tocaObra;
    }

    
    public boolean isEsVip() {
        return esVip;
    }

    public void setEsVip(boolean esVip) {
        this.esVip = esVip;
    }

    public boolean isTocaObra() {
        return tocaObra;
    }

    public void setTocaObra(boolean tocaObra) {
        this.tocaObra = tocaObra;
    }


}
