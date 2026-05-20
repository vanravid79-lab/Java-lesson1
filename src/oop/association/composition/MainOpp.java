package oop.association.composition;

public class MainOpp {
    public static void main(String[] args){
        // obj engine
        Engine engine = new Engine(10, 400.00);
        // obj car
        Car car = new Car(3, "model y", engine);
        System.out.println("Obj Car: " + car);

        car.setId(11);
        car.setEngine(new Engine(20, 480.00));
        car.setModel("model Z");
        System.out.println("Obj Car2: " + car);
    }
}
