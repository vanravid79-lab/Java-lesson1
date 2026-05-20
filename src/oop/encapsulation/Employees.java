package oop.encapsulation;

public class Employees {
    // Interger and int : objects(wrapper classes) vs Primitives
    // form 1 : Field with Private = protect data
    private Integer id;
    private String name;
    private Double salary;
    private String gender;

     // form2: const with no argument
    // const with no argument
    public Employees() {
    }

    // form3: const with full argument
    // const with full argument
    public Employees(Integer id, String name, Double salary, String gender) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.gender = gender;
    }
//    // method
//    public void employSalary(Double salary) {
//       if(salary >= 3000) this.salary += salary;
//    }
    // form4 getter
    // Getter
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getSalary() {
        return salary;
    }

    public String getGender() {
        return gender;
    }

    // form5 setter
    // setter
    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(Double salary) {
        if(salary >= 2200) this.salary = salary;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // last form: override, when sout obj in main class like DataOpp
    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                '}';
    }
}
