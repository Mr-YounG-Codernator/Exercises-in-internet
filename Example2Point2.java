import java.util.Scanner;

public class Example2Point2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());

        int i = 10;

        while(i >= number){

            System.out.println(i);
            i--;
        }

    }
}