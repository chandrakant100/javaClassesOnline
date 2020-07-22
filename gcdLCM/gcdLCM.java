import java.util.Scanner;

class gcdLCM {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();

        // GCD calculation
        int gcd = 1;

        for (int i = 1; i <= num1 || i <= num2; ++i)
            if (num1 % i == 0 && num2 % i == 0)
                gcd = i;

        // LCM calculation

        int lcm = (num1 * num2) / gcd;
        /*int temp1 = num1;
        int temp2 = num2;
        int lcm   = 1;

        for (int j = 1; j <= temp1 || j <= temp2; ++j)
            if (temp1 % j == 0 && temp2 % j == 0) {
                temp1 = temp1 / j;
                temp2 = temp2 / j;
                lcm = lcm * j;
            }
            else if (temp1 % j == 0) {
                temp1 = temp1 / j;
                lcm = lcm * j;
            }
            else if (temp2 % j == 0) {
                temp2 = temp2 / j;
                lcm = lcm * j;
            }*/

        System.out.println("GCD & LCM of " + num1 + ", " + num2 + " = " + gcd + ", " + lcm);
            
        input.close();
    }
}