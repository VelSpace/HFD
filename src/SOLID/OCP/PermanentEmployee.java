package SOLID.OCP;

public class PermanentEmployee extends Employee {
    PermanentEmployee(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public void calculateBonus(double salary) {
        System.out.println(this.id +" "+this.name+" "+salary*1.5D);
    }
    
}
