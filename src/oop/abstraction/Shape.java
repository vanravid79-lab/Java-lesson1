package oop.abstraction;

// form for writing OOP encapsulation
// abstract class Shape, we can't create Obj with it
public abstract class Shape {
    // encap
    private String type;

    // form 2
    // const no ag
    public Shape(){

    }

    // form 3 : 2nd const
    public Shape(String type){
        this.type = type;
    }

    // method
    public void myInfo(){
        System.out.println("Your type: " + type);
    }

    //form 4
    // set and get
    public void setType(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }


    // form 5:
    @Override
    public String toString() {
        return "Shape{" +
                "type='" + type + '\'' +
                '}';
    }
}
