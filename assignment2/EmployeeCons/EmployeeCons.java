import java.util.Scanner;

class Employee {
    String name;
    int    age;
    float  salary;

    Employee() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        name = input.nextLine();
        System.out.print("Enter Employee Age: ");
        age = input.nextInt();
        System.out.print("Enter Employee Salary(Rs): ");
        salary = input.nextFloat();

        input.close();        
    }

    void output() {
        System.out.println("\tEMPLOYEE DETAILS");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Age: " + age);
        System.out.println("Employee Salary(Rs): " + salary);
    }
}

public class EmployeeCons {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        emp1.output();
    }
}