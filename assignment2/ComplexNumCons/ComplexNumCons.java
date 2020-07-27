import java.util.Scanner;

class ComplexNum {
    float real;
    float img;

    ComplexNum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Real number: ");
        real = sc.nextFloat();
        System.out.print("Enter Imaginary number: ");
        img = sc.nextFloat();
    }

    void output() {
        System.out.println("Complex number: " + real + " + " + img + "i");
    }

    void add(ComplexNum var1, ComplexNum var2) {
        real = var1.real + var2.real;
        img  = var1.img + var2.img;
    }
}

public class ComplexNumCons {
    public static void main(String[] args) {
        ComplexNum Obj1 = new ComplexNum();
        Obj1.output();

        ComplexNum Obj2 = new ComplexNum();
        Obj2.output();

        System.out.println("\tADDITION OF TWO COMPLEX NUMBERS");
        ComplexNum Obj3 = new ComplexNum();
        Obj3.add(Obj1, Obj2);
        Obj3.output();
    }
}
