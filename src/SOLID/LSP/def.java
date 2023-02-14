package SOLID.LSP;

public class def {
    /*
     * Liskov substitution principle
     * s is a subtype of T then objects of type T may be replaced with objects of types s
     * Derived types must be completely substuitable for their base types
     * LSP is a subtyping relation, called strong behavioural subtyping
     * Extension of the open closed principle
    */

    /*
     * Implementation guidelines
     * No new exceptions can be thrown by subtypes
     * Clients should not know which subtype they are calling
     * New derived classes just extend without replacing the functionality of old classes
    */


    public static void main(String[] args) {
        // Employee Mani = new PermanenetEmployee(1,"Mani1");
        // Employee Mani2 = new TemporaryEmployee(2,"Mani2");
        // Employee Mani3 = new ContractEmployee(3,"Mani3");

        // System.out.println(Mani.toString());
        // System.out.println(Mani.calculateBonus(1000));

        // System.out.println(Mani2.toString());
        // System.out.println(Mani2.calculateBonus(5000));

        // System.out.println(Mani3.toString());
        // System.out.println(Mani3.calculateBonus(6000));

        
    }
    
}
