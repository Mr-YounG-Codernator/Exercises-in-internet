import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int number2 =Integer.parseInt(scanner.nextLine());

        for(int i = number1; number1 >= number2; number1--){

            System.out.println(number1);

        }

    }
}