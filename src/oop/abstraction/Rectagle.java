package oop.abstraction;

// applied encap
public class Rectagle extends Shape {
    private Double length;
    private Double width;

    // const no agm
    public Rectagle() {
    }

    @Override
    // method
    public void myInfo() {
//        System.out.println("Type: " + getType());
//        System.out.println("Length: " + length);
//        System.out.println("Width: " +  width);

        System.out.printf("""
                     %s { length: %.2f , width: %.2f }
                     Area: %.2f , perimeter: %.2f
                """, getType(), length, width, calculateArea(), calculatePerimeter());
    }

    // const
    public Rectagle(String type,Double length, Double width) {
        super(type);
        this.length = length;
        this.width = width;
    }

    // set and get
    public void setLength(double length) {
        this.length = length;
    }

    public Double getLength() {
        return length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Double getWidth() {
        return width;
    }

    // overrid from obstract class Shape
    @Override
    public  double calculateArea(){
        return width*length;
    };

    @Override
    public  double calculatePerimeter(){
        return (width+length)*2;
    };



    @Override
    public String toString() {
        return "Rectagle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
