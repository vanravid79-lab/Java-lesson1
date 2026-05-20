import java.util.Scanner;

public class RegisterSystem {

    static Scanner scanner = new Scanner(System.in);
    static String grade = "";

    public static void main(String[] args) {
        userRegister();
    }

    public static void userRegister() {

        // name
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();

        // score
        System.out.print("Enter Score: ");
        int score = Integer.parseInt(scanner.nextLine());

        // gender
        System.out.print("Enter Gender (M/F): ");
        String gender = scanner.nextLine().toUpperCase();

        System.out.println();

        // grade function
        myGrade(score);
        // subjectMenu function
        subjectMenu(name, score, gender);
    }

    // grade fun
    public static void myGrade(int score) {

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        } else if (score >= 70) {
            grade = "C";
        } else if (score >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    // subject menu function
    public static void subjectMenu(String name, int score, String gender) {

        System.out.println("1. MIS ($300)");
        System.out.println("2. DESIGN ($250)");
        System.out.println("3. BIT ($350)");
        System.out.println("4. Associate ($200)");

        System.out.print("\nChoose Subject: ");

        // scanner to select subject
        String choice = scanner.nextLine();

        String subject = "";
        double basePrice = 0;

        if (choice.equals("1")) {
            subject = "MIS";
            basePrice = 300;
        } else if (choice.equals("2")) {
            subject = "DESIGN";
            basePrice = 250;
        } else if (choice.equals("3")) {
            subject = "BIT";
            basePrice = 350;
        } else if (choice.equals("4")) {
            subject = "ASSOCIATE";
            basePrice = 200;
        } else {
            System.out.println("Invalid Subject");
            return;
        }

        if(grade.equals("F") && !subject.equals("ASSOCIATE")) {
            System.out.println("Grade F can only register Associate");
            return;
        }

        if (!grade.equals("F") && subject.equals("ASSOCIATE")) {
            System.out.println("Only Grade F can choose Associate");
            return;
        }

        // result
        System.out.println("========================= RESULT =========================\n");
        System.out.printf("%-12s: %s%n", "Name", name);
        System.out.printf("%-12s: %s%n", "Score", score);
        System.out.printf("%-12s: %s%n", "Gender", gender);
        System.out.printf("%-12s: %s%n", "Grade", grade);
        System.out.printf("%-12s: %s%n", "Subject", subject);
        
        // calculation
        System.out.println("====================== CALCULATION ======================\n");

        double finalPrice = basePrice;
        double oldPrice;
        System.out.printf("%-12s: $%.2f%n", "basePrice: ", basePrice);

        // Grade A scholarship
        if (grade.equals("A")) {

            oldPrice = finalPrice;
            finalPrice = finalPrice - (finalPrice * 0.50);

            System.out.printf("%-12s: $%.2f -> $%.2f%n", "Scholarship(50%)", oldPrice, finalPrice);
        }

        // Grade B scholarship
        else if (grade.equals("B")) {

            oldPrice = finalPrice;
            finalPrice = finalPrice - (finalPrice * 0.30);

            System.out.printf("%-12s: $%.2f -> $%.2f%n", "Scholarship(30%)", oldPrice, finalPrice);
        }

        // Grade C scholarship
        else if (grade.equals("C")) {

            oldPrice = finalPrice;
            finalPrice = finalPrice - (finalPrice * 0.10);

            System.out.printf("%-12s: $%.2f -> $%.2f%n", "Scholarship (10%)", oldPrice, finalPrice);

            // Admin Fee
            oldPrice = finalPrice;
            finalPrice = finalPrice + 10;

            System.out.printf("%-12s: $%.2f -> $%.2f%n", "Admin Fee", oldPrice, finalPrice);
        }

        // Grade F
        else if (grade.equals("F")) {

            System.out.println("Scholarship        : None");

            // Admin Fee
            oldPrice = finalPrice;
            finalPrice = finalPrice + 10;

            System.out.printf("%-12s: $%.2f -> $%.2f%n", "Admin Fee", oldPrice, finalPrice);

            // Lab Fee
            oldPrice = finalPrice;
            finalPrice = finalPrice + 20;

            System.out.printf("%-12s: $%.2f -> $%.2f%n", "Lab Fee", oldPrice, finalPrice);
        }

        // High score discount
        if (score >= 90) {

            oldPrice = finalPrice;
            finalPrice = finalPrice - (finalPrice * 0.10);

            System.out.printf("%-12s: $%.2f -> $%.2f%n", "High Score (10%) ", oldPrice, finalPrice);
        }

        // Women discount
        if (gender.equals("F") && !grade.equals("F")) {

            oldPrice = finalPrice;
            finalPrice = finalPrice - (finalPrice * 0.05);
            System.out.printf("%-12s: $%.2f -> $%.2f%n", "Women Discount (5%)", oldPrice, finalPrice);
        }

        // Normal Fee
        if (!grade.equals("F")) {

            oldPrice = finalPrice;
            finalPrice = finalPrice + 10;

            System.out.printf("%-12s: $%.2f -> $%.2f%n", "Normal Fee", oldPrice, finalPrice);
        }

        System.out.println("=========================================================");
        System.out.printf("%-12s: $%.2f%n", "Final Price", finalPrice);
    }
}