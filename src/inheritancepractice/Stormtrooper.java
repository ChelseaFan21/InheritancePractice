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
public class Stormtrooper extends Empire {
    private String run;
    private String search;

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
    
    public void fireBlaster(){
        System.out.println("You fired and missed the target.");
    }
}
