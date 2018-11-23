import java.util.Scanner;

public class DailyReward {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int workDays = Integer.parseInt(scanner.nextLine());
        double moneyForDay = Double.parseDouble(scanner.nextLine());
        double dollarCourse = Double.parseDouble(scanner.nextLine());

        double moneyForMonth = workDays * moneyForDay;

        double moneyForYear = moneyForMonth * 12 + moneyForMonth*2.5;

        moneyForYear = moneyForYear - (moneyForYear *0.25);

        moneyForYear = moneyForYear * dollarCourse;

        moneyForYear /= 365;

        System.out.printf("%.2f",moneyForYear);


    }
}
