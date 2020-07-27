import java.util.Scanner;

public class Employee {
    String name;
    int age;
    float salary;

    public void input() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        name = in.nextLine();
        System.out.print("Enter Employee Age: ");
        age = in.nextInt();
        System.out.print("Enter Employee Salary(Rs): ");
        salary = in.nextFloat();
    }
    
    public void output() {
        System.out.println("\tEMPLOYEE DETAILS");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary(Rs): " + salary);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.input();
        emp1.output();
    }
}