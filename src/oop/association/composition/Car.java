package oop.association.composition;

public class Car {
    // form 1: field
    private Integer id;
    private String model;

    // declare obj Engine
    // Car has-a Engine — that's association in OOP.
    private Engine engine;

    // form 4: const with no argument
    public Car(){}

    // form5: const with argument
    public Car(Integer id, String model, Engine engine) {
         this.id = id;
         this.model = model;
         this.engine = engine;
    }

    // form 2 : setter and getter
    // getter and sett
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    // form3 : Override
    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
