import java.util.Scanner;

public class Example1Point1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int i = 1;

        while(i <= number){

            System.out.println(i);
            i++;

        }

    }
}
