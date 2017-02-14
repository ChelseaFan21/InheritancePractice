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
    private String scaleColor;
    private boolean coldBlooded;

    public String getScales() {
        return scaleColor;
    }

    public void setScales(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public boolean isColdBlooded() {
        return coldBlooded;
    }

    public void setColdBlooded(boolean coldBlooded) {
        this.coldBlooded = coldBlooded;
    }

   
    
    public void baskInSun(){
        if(!isColdBlooded()){
        System.out.println("You are not a reptile.");
        } else {
            System.out.println("You are sunning on a rock.");
        }
    }
}
