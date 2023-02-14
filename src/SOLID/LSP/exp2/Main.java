package SOLID.LSP.exp2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new PermanenetEmployee(1,"Manikandan");
        Employee e2 = new TemporaryEmployee(2,"Vel");
        Employee e3 = new ContractEmployee(3,"Mani");
        

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        for(Employee employee : employees){
            System.out.println(employee.toString());
            System.out.println(employee.getMinimumSalary());
        }
    }
}
