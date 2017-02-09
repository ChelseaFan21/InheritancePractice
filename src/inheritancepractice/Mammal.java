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
    private boolean produceMilk;
    private boolean hair;

    public boolean isProduceMilk() {
        return produceMilk;
    }

    public void setProduceMilk(boolean produceMilk) {
        this.produceMilk = produceMilk;
    }

    public boolean isHair() {
        return hair;
    }

    public void setHair(boolean hair) {
        this.hair = hair;
    }

   
    
    public void feedBaby(){
        if(produceMilk == true){
            System.out.println("This is a mammal");
        }
    }
    
}
