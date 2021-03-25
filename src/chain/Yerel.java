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
public class Yerel extends Servis {

    @Override
    public void uygula(Istek istek) {
        
        if (IpCozumle.get(istek.getIp())<100){
            System.out.println("Yerel Ağdaki "+istek.getIp()+" adresine "+istek.getTip()+" isteği yapıldı.");    }
      else {
    if(getSonraki()!=null){
        getSonraki().uygula(istek);
    }
}  }
    
}
