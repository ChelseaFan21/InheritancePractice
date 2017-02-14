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
public class StarWarsCharacter extends FictionalCharacter{
    private boolean flyStarShip = false;
    private boolean fireBlaster = false;

    public boolean isFlyStarShip() {
        return flyStarShip;
    }

    public void setFlyStarShip(boolean flyStarShip) {
        this.flyStarShip = flyStarShip;
    }

    public boolean isFireBlaster() {
        return fireBlaster;
    }

    public void setFireBlaster(boolean fireBlaster) {
        this.fireBlaster = fireBlaster;
    }
    
    public void isDogFighting(){
        if(flyStarShip == true){
            if(fireBlaster == true){
                System.out.println("You are in a dog fight.");
            }
        }
    }
}