import java.util.Scanner;

public class StoppingNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int end = Integer.parseInt(scanner.nextLine());
        int start = Integer.parseInt(scanner.nextLine());

        int stoppingNum = Integer.parseInt(scanner.nextLine());

        for (int i = start; i > end ; i--) {

            if (i % 2 == 0 && i%3 == 0){
                if (i == stoppingNum){
                    break;
                }
                else {
                    System.out.println(i);
                }
            }
        }

    }
}
