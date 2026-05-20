import java.util.Scanner;

public class ReExercise {
    // we need to declare scanner outside main method, cause we use in different function
    static Scanner scanner = new Scanner(System.in);
    static String grade = "";

    static class Subject{
        String courseName;
        double coursePrice;

        Subject(String courseName, double coursePrice){
            this.courseName = courseName;
            this.coursePrice = coursePrice;
        }
    }

    public static void main(String[] args){
//         Scanner scanner = new Scanner(System.in);

         System.out.print("Enter Name: ");
         String name = scanner.nextLine();

         System.out.print("Enter Gender (M/F): ");
         String gender = scanner.nextLine();

         System.out.print("Enter Score: ");
         int score = scanner.nextInt();
         scanner.nextLine();

//        // Subject method with string
//        String subject = subjectSelected();
        // Grade
         studentGrade(score);
         Subject subject = subjectSelected();

         System.out.println();
         System.out.println("================Result==============");
         System.out.println("Name: " + name);
         System.out.println("Gender: " + gender.toUpperCase());
         System.out.println("Score: " + score);


        System.out.println("Grade: " + grade);
        System.out.println("Subject: " + subject.courseName);
        System.out.println();

        System.out.println("================Calculation==============");
        System.out.println("Base Price: " + subject.coursePrice);

        // Scholarship
        double discount = 0;
        String scholarship = "";
        double basePrice = subject.coursePrice;

        if(grade.equals("A"))      { discount = 0.5;  scholarship = "Scholarship (50%)"; }
        else if(grade.equals("B")) { discount = 0.3;  scholarship = "Scholarship (30%)"; }
        else if(grade.equals("C")) { discount = 0.1;  scholarship = "Scholarship (10%)"; }
        else if(grade.equals("D")) { discount = 0.05; scholarship = "Scholarship (5%)";  }
        else                       { scholarship = "Scholarship: none"; }

        double discountPrice = basePrice * discount;
        double price =basePrice - discountPrice;
        double finalPrice = price;

        System.out.println(scholarship);



        if(score >= 95){
            double basePriceHs = finalPrice;
            double highScoreDiscountCal =   basePriceHs * 0.10;
            finalPrice =basePriceHs - highScoreDiscountCal;
            System.out.println("High Score (10%): " + basePriceHs + "->" + finalPrice);
        }

        if(gender.equalsIgnoreCase("F")){
            double basePriceWd = finalPrice;
            double womenDis = basePriceWd * 0.05;
            finalPrice = basePriceWd - womenDis;
            System.out.println("Women Dis: " + basePriceWd + "->" + finalPrice);
        }

        if(grade.equals("C")){
            double basePriceC = finalPrice;
            double fee = finalPrice * 0.10;
            double finalFee = finalPrice + fee;
            finalPrice = finalFee;
            System.out.println("Nomal Fee: "+ basePriceC  + "->" +  finalPrice );
        }

          // admin fee
           if(subject.courseName.equals("Associate")){
               double basePriceAs = finalPrice;
               // admin fee
               double adminF = finalPrice * 0.05;
               double finalAdminF = finalPrice + adminF;
               // lab fee
               double labF = finalAdminF + 20;
               finalPrice = labF;


               System.out.println("Admin Fee: "+ basePriceAs + "->" + finalAdminF);
               System.out.println("Lab Fee: "+ finalAdminF + "->" + labF);

           }

           // lab fee


//        if(subject.courseName.equals("Associate")){
//            double basePriceAs = finalPrice;
//            double adminF = finalPrice * 0.10;
//            double finalPriceAs = finalPrice + adminF;
//            finalPrice = finalPriceAs;
//
//
//            System.out.println("Admin Fee: "+ basePriceAs + "->" +  finalPrice);
//        }

        System.out.println();
        System.out.println("==============================");
        System.out.println("Final Price: " + finalPrice);



    }

    public static void studentGrade(int score){

         if(score >= 90){
              grade = "A";
         }
         else if(score >= 80){
             grade = "B";
         }
         else if(score >= 70){
             grade = "C";
         }
         else if(score >= 60){
             grade = "D";
         }
         else{
             grade = "F";
         }

         System.out.println("Grade: " +  grade);
    }

    public static Subject subjectSelected(){
//        1. MIS ($300)
//        2. DESIGN ($250)
//        3. BIT ($350)
//        4. Associate ($200)
          System.out.println("1. MIS ($300)");
          System.out.println("2. DESIGN ($250)");
          System.out.println("3. BIT ($350)");
          System.out.println("4. Associate ($200)");

          System.out.print("Choose Subject: ");
          String choices = scanner.nextLine();

        if(grade.equals("F") && !choices.equals("4")){
            System.out.print("You can choose only Associate");
            return new Subject("Unknown", 0);
        }

        if(!grade.equals("F") && choices.equals("4")){
             System.out.print("You can't choose Associate");
             return new Subject("Unknown", 0);
        }


          if(choices.equals("1")) return new Subject("MIS", 300);
          else if(choices.equals("2")) return new Subject("DESIGN", 250);
          else if(choices.equals("3")) return new Subject("BIT", 350);
          else if(choices.equals("4")) return new Subject("Associate", 200);
          else{
              System.out.println("Invalid Choice");
              return new Subject("Unknown", 0);
          }








    }
}
