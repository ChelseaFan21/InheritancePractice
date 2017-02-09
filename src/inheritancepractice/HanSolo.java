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
public class HanSolo extends Rebel{
    private String charm;
    private String smuggle;

    public String getCharm() {
        return charm;
    }

    public void setCharm(String charm) {
        this.charm = charm;
    }

    public String getSmuggle() {
        return smuggle;
    }

    public void setSmuggle(String smuggle) {
        this.smuggle = smuggle;
    }
    
    public void sneakIntoBase (){
            System.out.println("You have snuck into the imperial base.");
    }
}
