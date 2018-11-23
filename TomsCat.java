import java.util.Scanner;

public class TomsCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int holidays = Integer.parseInt(scanner.nextLine());

        double plyingHours = holidays * 127;

        plyingHours += (365-holidays) * 63;

        if (plyingHours > 30000){
            System.out.println("Tom will run away");
            plyingHours -= 30000;
            double hours =  Math.floor(plyingHours/60);
            plyingHours -= Math.floor(hours) *60;

            System.out.printf("%.0f hours and %.0f minutes more for play%n",hours,plyingHours);
        }
        else {
            System.out.println("Tom sleeps well");
            plyingHours = 30000 - plyingHours;
            double hours =  plyingHours/60;
            plyingHours -= Math.floor(hours) *60;

            System.out.printf("%.0f hours and %.0f minutes less for play%n",hours,plyingHours);
        }
    }
}
