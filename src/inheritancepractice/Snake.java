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
public class Snake extends Reptile{
    private String slither;
    private String swallow;

    public String getSlither() {
        return slither;
    }

    public void setSlither(String slither) {
        this.slither = slither;
    }

    public String getSwallow() {
        return swallow;
    }

    public void setSwallow(String swallow) {
        this.swallow = swallow;
    }
    
    public void bite(){
        System.out.println("The snake is poisonous.");
    }
}
