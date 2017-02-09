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
public class Rebel extends StarWarsCharacter{
    private String flyStarship;
    private String hide;

    public String getFlyStarship() {
        return flyStarship;
    }

    public void setFlyStarship(String flyStarship) {
        this.flyStarship = flyStarship;
    }

    public String getHide() {
        return hide;
    }

    public void setHide(String hide) {
        this.hide = hide;
    }
    
    public void goOnMission(){
        System.out.println("You have decided to try and save the galaxy.");
    }
    
}
