package oop.inheritance;

// inheritance in oop mean: there are superclass and subclass
// like mean parent and child
// mean child extends from parent
// purpose of inher reduce writing tha same code

public class Parent {
    // field
    // private mean we applied encapsulation to make our data secure
    // Interger like this mean wrapper class
    int a;
    int b;

}

// we need to another class to extends from Parent class
class Child extends Parent {
    int c;
}
// we also can write like this
class Child2 extends Parent{}

class SubChild extends Child {
    int d;
}

class Main {
    // we need to create main method to run our whole code
    public static void main(String[] args){
        // to assign value for class Child, we need to create object of that class
        Child child = new Child();
        child.a = 2;
        child.b = 3;
        child.c = 4;
        System.out.println(child.a);
        System.out.println(child.b);
        System.out.println(child.c);

        SubChild subChild = new SubChild();
        subChild.d = 8;
        System.out.println(subChild.d);
    }
}
