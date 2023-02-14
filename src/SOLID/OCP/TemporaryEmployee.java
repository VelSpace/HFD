package SOLID.OCP;

public class TemporaryEmployee extends Employee{

    TemporaryEmployee(int id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public void calculateBonus(double salary) {
        System.out.println(this.id+" "+this.name+" "+salary*.5D);
    }
}
