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

    private String produceMilk;
    private String hair;

    public String getProduceMilk() {
        return produceMilk;
    }

    public void setProduceMilk(String produceMilk) {
        this.produceMilk = produceMilk;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    public void feedBaby() {

        System.out.println("Baby is fed.");

    }

}
