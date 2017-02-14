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
    private boolean slither;
    private boolean swallow;

    public boolean isSlither() {
        return slither;
    }

    public void setSlither(boolean slither) {
        this.slither = slither;
    }

    public boolean isSwallow() {
        return swallow;
    }

    public void setSwallow(boolean swallow) {
        this.swallow = swallow;
    }
    public void isMoving(){
        if(!isSlither()){
            System.out.println("You are resting.");
        }else{
            System.out.println("You are searching for food.");
        }
    }
    

    
    
    
}
