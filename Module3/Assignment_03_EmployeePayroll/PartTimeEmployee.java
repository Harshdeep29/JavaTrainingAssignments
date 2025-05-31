package Assignment_03_EmployeePayroll;

public class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;
    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
    PartTimeEmployee(String name, int employeeID,double hourlyRate, double hoursWorked) {
        this.name=name;
        this.employeeID=employeeID;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    public void display() {
        System.out.println("Employee Name: "+name);
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Salary: "+calculateSalary());
    }
}
