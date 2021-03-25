/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chain;

/**
 *
 * @author AYŞE
 */
public abstract class Servis {
private Servis sonraki;

    public Servis getSonraki() {
        return sonraki;
    }

    public void setSonraki(Servis sonraki) {
        this.sonraki = sonraki;
    }

    public abstract void uygula(Istek istek);
       
        
    
}
