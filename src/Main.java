import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat usdFormatter = NumberFormat.getCurrencyInstance(Locale.US);

        System.out.print("Enter Total times: ");
        int totalTimes = scanner.nextInt();

        int defaultSalary = 50;

        double bonus1 = 1.25;
        double bonus2 = 1.5;
        double lostRate = 0.5;

        if (totalTimes > 100) {
            int overTimeWorker = totalTimes - 100;

            // Math.min(a, b): This method compares two values and returns the smaller one.
            // Returns the SMALLER number between a and b
            // ex: Math.min(60, 20) it will take 20
            int extraTime1 = Math.min(overTimeWorker, 20);

            // Returns the BIGGER number between a and b
            int extraTime2 = Math.max(overTimeWorker - 20, 0);

            double bonusSalary = (extraTime1 * bonus1) + (extraTime2 * bonus2);
            double totalSalary = bonusSalary + defaultSalary;

            System.out.println("ExtraTime1: " + extraTime1);
            System.out.println("ExtraTime2: " + extraTime2);
            System.out.println("Bonus Salary: " + usdFormatter.format(bonusSalary));
            System.out.println("Totel Salary: " + usdFormatter.format(totalSalary));

        } else if (totalTimes < 100) {
            double lostSalary = (100 - totalTimes) * lostRate;
            double totalSalary = defaultSalary - lostSalary;

            System.out.println("Lost Salary: " + lostSalary);
            System.out.println("Totel Salary: " + totalSalary);

        } else {
            int extraTime1 = 0;
            int extraTime2 = 0;

            double bonusSalary = (extraTime1 * bonus1) + (extraTime2 * bonus2);
            double totalSalary = defaultSalary + bonusSalary;

            System.out.println("Extra Time1: " + extraTime1);
            System.out.println("Extra Time2: " + extraTime2);
            System.out.println("Bonus Salary: " + bonusSalary);
            System.out.println("TotalSalary: " + totalSalary);
        }




    }
}
