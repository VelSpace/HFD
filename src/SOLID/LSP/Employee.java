package SOLID.LSP;

import org.omg.CORBA.NO_IMPLEMENT;

public abstract class Employee {
    int id;
    String name;
    Employee(){}
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    } 
    public abstract double calculateBonus(double amount);

    public String toString(){
        return id+" "+name;
    }
}
class PermanenetEmployee extends Employee{
    PermanenetEmployee(){}
    PermanenetEmployee(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public double calculateBonus(double amount) {
        return amount*2D;
    }
    
}
class TemporaryEmployee extends Employee{
    TemporaryEmployee(){}
    TemporaryEmployee(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public double calculateBonus(double amount) {
        return amount*1.5D;
    }
    
}
class ContractEmployee extends Employee{
    ContractEmployee(){}
    ContractEmployee(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public double calculateBonus(double amount) {
        throw new NO_IMPLEMENT();
    }
    
}
