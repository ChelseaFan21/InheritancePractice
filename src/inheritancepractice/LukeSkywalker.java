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
public class LukeSkywalker extends Rebel{
    private String lightSaber;
    private String mindTrick;

    public String getLightSaber() {
        return lightSaber;
    }

    public void setLightSaber(String lightSaber) {
        this.lightSaber = lightSaber;
    }

    public String getMindTrick() {
        return mindTrick;
    }

    public void setMindTrick(String mindTrick) {
        this.mindTrick = mindTrick;
    }
    
    public void saveFriends(){
        System.out.println("You have saved your friends from the gangster.");
    }
}
