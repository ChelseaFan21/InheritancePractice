/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancepractice;

/**
 *
 * @author brandonstoiber
 */
public class Reptile {
    private String scales;
    private String coldBlooded;

    public String getScales() {
        return scales;
    }

    public void setScales(String scales) {
        this.scales = scales;
    }

    public String getColdBlooded() {
        return coldBlooded;
    }

    public void setColdBlooded(String coldBlooded) {
        this.coldBlooded = coldBlooded;
    }
    
    public void baskInSun(){
        System.out.println("Time to warm up the blood");
    }
}
