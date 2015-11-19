/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projecte;

import java.io.Serializable;

/**
 *
 * @author albert
 */
public class Clients extends Entitats implements Serializable{

    private boolean _1esVip;
    private boolean _2tocaObra;

    public Clients(int codi, String nomCom, String dataAlta, String nomFis, String cifNif, String pais, String poblacio, String direccio, int cp, int tfon, String email, String website, int cc, int descompte, String notes, boolean _1esVip, boolean _2tocaObra) {
        super(codi, nomCom, dataAlta, nomFis, cifNif, pais, poblacio, direccio, cp, tfon, email, website, cc, descompte, notes);        
        this._1esVip = _1esVip;
        this._2tocaObra = _2tocaObra;
    }



    
    public boolean is1esVip() {
        return _1esVip;
    }

    public void set1esVip(boolean _1esVip) {
        this._1esVip = _1esVip;
    }

    public boolean is2tocaObra() {
        return _2tocaObra;
    }

    public void set2tocaObra(boolean _2tocaObra) {
        this._2tocaObra = _2tocaObra;
    }


}
