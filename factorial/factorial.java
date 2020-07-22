import java.util.Scanner;

class factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = input.nextInt();

        long result = 1;

        for (int i = num; i != 1; --i)
            result = result * i;

        System.out.println("Factorial of " + num + " = " + result);
        input.close();
    }
}