package oop;

import java.util.Scanner;

public class MyData {

    // create main to run the whole code and get value from class Person
    public static void main(String[] args) {

        // get data from class Person method
        // person.age = 20 mean for assign value to object person
        // Person person = new Person(); this's object of person
        // this from field that we created in class Person
//        Person person = new Person(); // Person() just default Constructor, we not yer creating from Class Person
//        person.age = 20;
//        person.name = "Raa";
//        person.gender = "Male";
//        person.salary = 4000;
//
//        System.out.printf("""
//                           %-12s%-20d
//                           %-12s%-12s
//                           %-8s%-12s
//                           %-8s%-12.2f
//                        """,
//                "Age:", person.age,
//                "Name:", person.name,
//                "Gender:", person.gender,
//                "Salary:", person.salary);

        // other object
        // Person = className
        // person2 = objectName
        // new Person() = constructor
//        Person person2 = new Person("nana", 23, "M", 100);
////        System.out.println(person2);
//        person2.myInfor();
//
//        // other object
//        Person person3 = new Person("nang", 21, "M", 1000);
////        System.out.println(person3);
//        person3.myInfor();

        // object as Array
        Person [] people = new Person[4];
        people[0] = new Person("hh", 40, "M", 999);
        people[1] = new Person("gg", 45, "F", 444);
        people[2] = new Person("nn", 41, "M", 879);
        people[3] = new Person("jj", 45, "F", 90);

        // think how to get 3 object above, just use array method
        // use forEach or forLoop

//        // forEach
//        for (Person p : people){
//            p.myInfor();
//        }

        Scanner scanner = new Scanner(System.in);

        // forLoop
        for (int i = 0; i < people.length; i++){
            Person p = people[i];
            p.myInfor();
        }

        for(Person p : people){
            if (p.isSalary()){
                System.out.println("Please increase salary:  " + p.name);
                System.out.print("[+] add here: ");
                double salary = scanner.nextDouble();

                p.setSalary(salary);
            }
        }

        for (int i = 0; i < people.length; i++){
            Person p = people[i];
            p.myInfor();
        }



    }
}
