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
public class InheritancePractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     
        Bear newBear = new Bear();
        Snake newSnake = new Snake();
        Beaver newBeaver = new Beaver();
        
        System.out.println("Bear");
        newBear.findCave();
        newBear.feedBaby();
        
        System.out.println("Snake");
        newSnake.baskInSun();
        
        System.out.println("Beaver");
        newBeaver.buildDam();
        newBeaver.sleep();
        
        
        GalacticEmpireRebel newSolo = new GalacticEmpireRebel();
        GalacticEmpireImperial newTrooper = new GalacticEmpireImperial();
        System.out.println("Han Solo");
        newSolo.goOnMission();
        
      
        
        System.out.println("Stormtrooper");
        newTrooper.fireBlaster();
        
    }
    
}
