import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();

        int days = Integer.parseInt(scanner.nextLine());

        double moneyForApartament = 0;
        double moneyForStuio = 0;

        if (month.equalsIgnoreCase("may")||month.equalsIgnoreCase("october")){
            moneyForStuio = 50;
            moneyForApartament = 65;

            if (days > 7 && days < 14){
                moneyForStuio *= 0.95;
            }
            if (days> 14){
                moneyForStuio *= 0.70;
                moneyForApartament *= 0.90;
            }
        }
        else if (month.equalsIgnoreCase("june")||month.equalsIgnoreCase("september")){
            moneyForStuio = 75.2;
            moneyForApartament = 68.70;

            if (days > 14){
                moneyForStuio *= 0.80;
                moneyForApartament *= 0.90;
            }
        }
        else {
            moneyForStuio = 76;
            moneyForApartament = 77;
            if (days > 14){
                moneyForApartament *= 0.90;
            }
        }

        System.out.printf("Apartment: %.2f lv.%n",moneyForApartament * days);

        System.out.printf("Studio: %.2f lv.%n",moneyForStuio * days);

    }
}
