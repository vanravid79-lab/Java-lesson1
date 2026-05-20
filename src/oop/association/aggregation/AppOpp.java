package oop.association.aggregation;

public class AppOpp {
    public static void main(String[] args) {
        // obj subJ
        Subject subject1 = new Subject(1, "OOP");
        Subject subject2 = new Subject(2, "Method");

        System.out.println("===================");

        // obj course
        Course course1 = new Course(3, "Web Design", new Subject[]{subject1, subject2});
        System.out.println(course1);

        // obj profs
        // for we not to assign value like agm or prmt in new Professor()
        // we use set and get method instead
        Professor professor = new Professor();
        professor.setId(20);
        professor.setName("Henry");
        professor.setCourse(course1);
        System.out.println(professor);

    }
}
