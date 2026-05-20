package oop;

public class Person {
    // what have in class OOP

    // field or proper
    String name;
    int age;
    String gender;
    double salary;

    // default const
    // if we not assign value in object in class MyData
    // the name const the same our class
    public Person() {
        this.name = "N/A";
        this.age = 0;
        this.gender = "N/A";
        this.salary = 0;
    }

    // third cons
    public Person(String name, int age, String gender) {
        this(); // we need it to call other cons, if we not call any field, auto it will call the default const
        this.name = name;
        this.age = age;
        this.gender = gender;
    }


    // method
    // constructor : constructor's name need to the same class
    // why we call method Person, cause If object Person on MyData don't
    // have data, it will call constructor Person below

    // using this const in class MyData
    // just declare another object
    // second const
    public Person(String name, int age, String gender, double salary) {
        // this.name is representing of object Person
        // if we call name, age and gender, it will call third cons
        this(name, age, gender);
        this.salary = salary;
    }

    // method
    public void myInfor(){
        System.out.println("======== Person Information ========");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Salary: " + salary);
    }

    // method
    public boolean isSalary(){
        return salary < 100;
    }

    public void setSalary(double salary){
        this.salary += salary;
    }


    // we need to override Person
    // cause we want to see whole object in class MyData
    // just print and output like this: Person{name='nana', age=23, gender='M', salary=500.0} on object person2

    // Without @Override
    //By default, if you do System.out.println(person2),
    // Java doesn't know how to print a Person object,
    // so it prints something like:
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", salary=" + salary +
                '}';
    }

    //       public Person(String name, int age, String gender, double salary) {
//
//           this.name = name;
//       }


    // className objectName = new className(); new className(): we call constructor
    // mean className() the value will replace into objectName


}
