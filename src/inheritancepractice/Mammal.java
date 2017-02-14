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
public class Mammal extends Animal {
    private boolean produceMilk = false;
    private boolean hasHair = false;

    public boolean isProduceMilk() {
        return produceMilk;
    }

    public void setProduceMilk(boolean produceMilk) {
        this.produceMilk = produceMilk;
    }

    public boolean isHasHair() {
        return hasHair;
    }

    public void setHasHair(boolean hasHair) {
        this.hasHair = hasHair;
    }

    

    public void feedBaby() {
        if(!isProduceMilk()){
            System.out.println("Mammal is not nursing.");
        }else{
            System.out.println("Mammal is nursing.");
        }
    }

}
