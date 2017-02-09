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
public class Empire {
    private String flyStarships;
    private String chase;

    public String getFlyStarships() {
        return flyStarships;
    }

    public void setFlyStarships(String flyStarships) {
        this.flyStarships = flyStarships;
    }

    public String getChase() {
        return chase;
    }

    public void setChase(String chase) {
        this.chase = chase;
    }
    
    public void captureRebels(){
        System.out.println("You have captured the rebel base.");
    }
}
