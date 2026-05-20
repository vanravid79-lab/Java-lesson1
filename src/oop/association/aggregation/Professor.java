package oop.association.aggregation;

public class Professor {
    private Integer id;
    private String name;
    // if many courses, just type Course[] course
    private Course course;

    // form 2: const with no agm
    public Professor(){}

    // form3
    public Professor(Integer id , String name , Course course){
        this.id = id;
        this.name = name;
        this.course = course;
    }
    // getter and setter
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public Course getCourse(){
        return course;
    }

    public void setCourse(Course course){
        this.course = course;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
