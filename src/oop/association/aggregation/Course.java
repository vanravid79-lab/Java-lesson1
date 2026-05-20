package oop.association.aggregation;

import java.util.Arrays;

// we use and applied encapsulation
// we write private before field because we don't want anyone can access our field
public class Course {
   private Integer id;
   private String name;
   private Subject[] subject;

   // const with no argument
   public Course() {}

   // const
   public Course(Integer id, String name, Subject[] subject) {
      this.id = id;
      this.name = name;
      this.subject = subject;
   }

   // getter and setter
   public Integer getId() {
      return id;
   }

   public void setId(Integer id) {
      this.id = id;
   }

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public Subject[] getSubject() {
      return subject;
   }

   public void setSubject(Subject[] subject) {
      this.subject = subject;
   }

   @Override
   public String toString() {
      return "Course{" +
              "id=" + id +
              ", name='" + name + '\'' +
              ", subject=" + Arrays.toString(subject) +
              '}';
   }
}






