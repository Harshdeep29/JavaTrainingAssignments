package Assignment_03_EmployeePayroll;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;
    @Override
    double calculateSalary() {
        return monthlySalary;
    }
    FullTimeEmployee(String name, int employeeID, double monthlySalary) {
        this.name=name;
        this.employeeID=employeeID;
        this.monthlySalary = monthlySalary;
    }
    public void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Monthly Salary: " + calculateSalary());
    }
}
