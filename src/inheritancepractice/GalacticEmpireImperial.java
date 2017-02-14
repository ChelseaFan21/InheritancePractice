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
public class GalacticEmpireImperial extends StarWarsCharacter {
    private boolean forceWielder = false;
    private String search;

    public boolean isForceWielder() {
        return forceWielder;
    }

    public void setForceWielder(boolean forceWielder) {
        this.forceWielder = forceWielder;
    }

   

    
    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
    public void isSith(){
        if(forceWielder == true){
            System.out.println("You are a sith lord.");
        }else{
            System.out.println("You are a soldier of the galactic empire.");
        }
    }
}
