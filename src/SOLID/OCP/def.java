package SOLID.OCP;

import Strategy.main;

public class def {

    //implementation guidelines
    /*
     Most important SOLID principle is considered by uncle bob
     * The simplest way to apply OCP is to implement the new functionality on new Derived class
     * Allow clients to access the original class with abstract interface
     * 
     * 
     * If not followed
     * End up testing the entire functionality
     * QA team need to test the entire flow
     * Costly process for the organisation
     * Breaks the single responsibility principle as well
     * Maintenance overheads increase on the class
     */

     //

     public static void main(String [] args) {
        Employee Mani = new PermanentEmployee(1,"Mani");
        Employee vel = new TemporaryEmployee(2,"Vel");

        Mani.calculateBonus(1000);
        vel.calculateBonus(1500);
     }
    
}
