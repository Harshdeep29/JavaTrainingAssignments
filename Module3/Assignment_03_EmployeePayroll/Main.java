package Assignment_03_EmployeePayroll;

public class Main {
    public static void main(String[] args) {
        FullTimeEmployee f1= new FullTimeEmployee("Harshdeep",7586578,65000.00);
        PartTimeEmployee p1= new PartTimeEmployee("Smit", 7868682,200, 300);
        f1.display();
        p1.display();
    }
}
