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
public class GalacticEmpireRebel extends StarWarsCharacter{
    private boolean forceUser = false;
    private String smuggle;

    public boolean isForceUser() {
        return forceUser;
    }

    public void setForceUser(boolean forceUser) {
        this.forceUser = forceUser;
    }

   

    public String getSmuggle() {
        return smuggle;
    }

    public void setSmuggle(String smuggle) {
        this.smuggle = smuggle;
    }
    
   public void isJedi(){
       if(forceUser == true){
           System.out.println("You are a jedi.");
       }else{
           System.out.println("You are a member of the rebellion.");
       }
   }
}
