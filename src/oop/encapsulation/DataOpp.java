package oop.encapsulation;

public class DataOpp {


    public static void main(String[] args) {
        // this's that assign value via parameter
        Employees employees = new Employees(1, "tt", 3000.00, "M");
        employees.setSalary(4000.00);
            // we use private string name for this
            // we can't assign newName
            // if we don't have private just String name; we can assign new name
//          employees.name = "heang";

        System.out.println(employees);

        // 1 object need to create 1 const like
        // we have created other obj in class employee already
        // we not yet to sign any value
        Employees employees1 = new Employees();
        employees1.setId(2);
        employees1.setName("hong");
        employees1.setSalary(3000.00);
        employees1.setGender("M");
        System.out.println(employees1);

        // getter from class Employees
        System.out.println("Id: " + employees1.getId());
        System.out.println("Name: " + employees1.getName());
        System.out.println("Salary: " + employees1.getSalary());
        System.out.println("Gender: " + employees1.getGender());
    }
}
