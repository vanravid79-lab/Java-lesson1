package oop.abstraction;

import java.awt.*;

public class MainPoly {
    public static void main(String[] args) {
//            // when we abstract class, we can't use with const Shape();
//            Shape shape1 = new Shape();

        // we use like this
        // obj with const Rectagle and store in class Shape Parent
        System.out.println("===============Rectangle==============");
        Shape shape2 = new Rectagle("Rec", 30.00, 20.00);
        shape2.myInfo();

        System.out.println("===============Circle==============");
        // obj with const Circle
        Shape shape3 = new Circle("Circle", 390.00);
        shape3.myInfo();






    }
}
