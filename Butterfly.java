import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        //Top
        for (int i = 1; i <= 2*(n-2)/2 ; i++) {

            if (i %2 == 1){
                System.out.println(repeatStr("*",n-2)+ "\\ /"+repeatStr("*",n-2) );
            }
            else {
                System.out.println(repeatStr("-",n-2)+ "\\ /"+repeatStr("-",n-2) );
            }

        }

        //Middle
        System.out.println(repeatStr(" ",n-1)+"@"+repeatStr(" ",n-1));


        //Bottom
        for (int i = 1; i <= 2*(n-2)/2 ; i++) {

            if (i %2 == 1){
                System.out.println(repeatStr("*",n-2)+ "\\ /"+repeatStr("*",n-2) );
            }
            else {
                System.out.println(repeatStr("-",n-2)+ "\\ /"+repeatStr("-",n-2) );
            }

        }
    }
    static String repeatStr (String text,int count){
            StringBuilder result = new StringBuilder();

            for (int i = 0; i <count ; i++) {

                result.append(text);
            }
            return result.toString();
        }
}
