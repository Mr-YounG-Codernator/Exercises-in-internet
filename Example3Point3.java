import java.util.Scanner;

public class Example3Point3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter The Starting Number: ");
        int number1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter The Ending Number: ");
        int number2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Enter The Tables Number: ");
        int number3 = Integer.parseInt(scanner.nextLine());

        while(number1 <= number2){

            System.out.println(number1 + " * " + number3 + " = " + number1 * number3);

            number1++;

        }

    }
}
