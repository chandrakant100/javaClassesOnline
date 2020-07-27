import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        boolean check = false;

        for (int i = 2; i <= (num/2); ++i)
            if (num % i == 0) {
                check = true;
                break;
            }

        if (num == 1)
            System.out.println("1 is not a prime number");
        else if (check == false)
                System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");

        input.close();
    }
}