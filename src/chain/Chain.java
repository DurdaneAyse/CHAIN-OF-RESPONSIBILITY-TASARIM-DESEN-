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
public class Chain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Yerel yerel=new Yerel();
Intranet intranet=new Intranet();
Internet internet=new Internet();

internet.setSonraki(intranet);
intranet.setSonraki(yerel);
internet.uygula(new Istek("150.0.0.1", Istek.Tip.GET));  
    //intranet.uygula(new Istek("250.0.0.1",Istek.Tip.GET));
    }

}
