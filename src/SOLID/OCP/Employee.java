package SOLID.OCP;

public abstract class Employee {
    public int id;
    public String name;
    Employee(){}

    public abstract void calculateBonus(double salary);
}
