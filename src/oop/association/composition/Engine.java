package oop.association.composition;

public class Engine {

    // Field and Property
    private Integer id;
    private Double horsePower;


    // no argument const
    public Engine(){}

    public Engine(Integer id, Double horsePower){
        this.id = id;
        this.horsePower = horsePower;
    }
    // getter and setter
    public void setId(Integer id){
        this.id = id;
    }
    public Integer getId(){
        return id;
    }

    public void setHorsePower(Double horsePower){
        this.horsePower = horsePower;
    }
    public Double getHorsePower(){
        return horsePower;
    }



    @Override
    public String toString() {
        return "Engine{" +
                "id=" + id +
                ", horsePower=" + horsePower +
                '}';
    }
}
