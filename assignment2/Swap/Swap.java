import java.util.Scanner;

class FirstNum {
    int num1;

    firstNum(int num) {
        num1 = num;
    }

    void show() {
        System.out.println("Value of num1: " + num1);
    }
}

class SecNum {
    int num2;

    secNum(int num) {
        num2 = num;
    }

    void show() {
        System.out.println("Value of num2: " + num2);
    }
}

public class Swap {

    public swap(firstNum obj1, secNum obj2) {
        int temp;

        temp      = obj2.num2;
        obj2.num2 = obj1.num1;
        obj1.num1 = temp;
    }
    
    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner input = new Scanner(System.in);

        System.out.println("\t BEFORE SWAPPING");

        System.out.print("Enter value of num1: ");
        num1 = input.nextInt();
        FirstNum var1 = new firstNum(num1);

        System.out.print("Enter value of num2: ");
        num2 = input.nextInt();
        SecNum var2 = new secNum(num2);

        var1.show();
        var2.show();

        System.out.println("\tAFTER SWAPPING");
        
        Swap obj = new swap(var1, var2);
        var1.show();
        var2.show(); 
    }
}