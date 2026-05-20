import java.util.Scanner;
public class SalaryExercise {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Total Times: ");
        int totalTimes = Integer.parseInt(scanner.nextLine());

        double defaultSalary = 50;

        if(totalTimes >= 100){

            double extraTime1 = 0, extraTime2 = 0;
            double bonus1 = 1.25;
            double bonus2 = 1.5;

            // user input the total times
            double extraTime = totalTimes - 100;

            if(extraTime <= 20){
                extraTime1 = extraTime;
            }
            else{
                 extraTime1 = 20;
                 extraTime2 = extraTime - 20;
            }
            double bonusSalary = (extraTime1 * bonus1) + (extraTime2 * bonus2);
            double totalSalary = defaultSalary + bonusSalary;

            System.out.println("Bonus Salary: " + bonusSalary);
            System.out.println("Total Salary: " + totalSalary);


        }
        else{
            double lostRate = 0.5;
            double lostSalary = (100 - totalTimes) * lostRate;

            double totalSalary = defaultSalary - lostSalary;

            System.out.println("Lost Salary: " + lostSalary);
            System.out.println("Total Salary: " + totalSalary);
        }
    }
}
