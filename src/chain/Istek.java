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
public class Istek {
    
    enum Tip {
        GET,POST,DELETE
    }
    private String ip;
    private Tip tip;
public Istek(String ip,Tip tip){
    setIp(ip);
    setTip(tip);
}
    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Tip getTip() {
        return tip;
    }

    public void setTip(Tip tip) {
        this.tip = tip;
    }
    
}
