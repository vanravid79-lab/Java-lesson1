package oop.association.aggregation;

public class Subject {
    private Integer id;
    private String lessonName;

    public  Subject() {}

    public Subject(Integer id, String lessonName) {
        this.id = id;
        this.lessonName = lessonName;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLessonName() {
        return lessonName;
    }

    public void setLessonName(String lessonName) {
        this.lessonName = lessonName;
    }


    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", lessonName='" + lessonName + '\'' +
                '}';
    }
}
