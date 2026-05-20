package oop.abstraction;

public class Circle extends Shape {
    // field
    private Double radius;

    // const no agm
    public Circle() {
    }

    // override from superclass
    @Override
    // method
    public void myInfo() {
        System.out.printf("""
                     %s { radius = %.2f}
                     Area: %.2f , perimeter: %.2f
                """, getType(), radius , calculateArea(), calculatePerimeter());
    }


    public Circle(String type, Double radius) {
        // we want to call from our supperclass (Shape)
        super(type);
        this.radius = radius;
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    // there have no @Override, this class will error
    // for cal Circle
    @Override
    public  double calculateArea(){
        return Math.PI * radius * radius;
    };

    @Override
    public  double calculatePerimeter(){
        return 2 * Math.PI * radius;
    };


}
