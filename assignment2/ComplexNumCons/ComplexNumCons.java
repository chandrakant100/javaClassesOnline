import java.util.Scanner;

class ComplexNum {
    float real;
    float img;

    ComplexNum(Scanner sc) {
        

        System.out.print("Enter Real number: ");
        real = sc.nextFloat();
        System.out.print("Enter Imaginary number: ");
        img = sc.nextFloat();
    
    }
    void output() {
        System.out.println("Complex number: " + real + " + " + img + "i");
    }

    ComplexNum(ComplexNum var1, ComplexNum var2) {
        real = var1.real + var2.real;
        img  = var1.img + var2.img;
    }
}

public class ComplexNumCons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ComplexNum Obj1 = new ComplexNum(sc);
        Obj1.output();

        ComplexNum Obj2 = new ComplexNum(sc);
        Obj2.output();

        System.out.println("\tADDITION OF TWO COMPLEX NUMBERS");
        ComplexNum Obj3 = new ComplexNum(Obj1, Obj2);
        Obj3.output();
        sc.close();
    }
}
