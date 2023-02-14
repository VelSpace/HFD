package SOLID.LSP.exp2;

public abstract class Employee implements IEmployee{
    int id;
    String name;
    
    Employee(){}
    Employee(int id, String name){
        this.id = id;
        this.name = name;
    }
    public abstract double getMinimumSalary();
    public String toString(){
        return id+" "+name;
    }
}
class PermanenetEmployee extends Employee implements IEmployeeBonus {

    PermanenetEmployee(){}
    PermanenetEmployee(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public double calculateBonus(double salary) {
        // TODO Auto-generated method stub
        return salary*5;
    }

    @Override
    public double getMinimumSalary() {
        // TODO Auto-generated method stub
        return 10000;
    }
    
}
class TemporaryEmployee extends Employee implements IEmployeeBonus{

    TemporaryEmployee(){}
    TemporaryEmployee(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public double calculateBonus(double salary) {
        // TODO Auto-generated method stub
        return salary*2;
    }

    @Override
    public double getMinimumSalary() {
        // TODO Auto-generated method stub
        return 7500;
    }
    
}
class ContractEmployee extends Employee implements IEmployee {

    ContractEmployee(){}
    ContractEmployee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public double getMinimumSalary() {
        // TODO Auto-generated method stub
        return 7500;
    }
    
}


