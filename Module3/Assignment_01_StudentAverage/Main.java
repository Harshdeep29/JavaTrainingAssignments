package Assignment_01_StudentAverage;

public class Main {
    public static void main(String[] args) {
        int[] marks1 = {87,65,78,58,38};
        Student stu1 = new Student("Harshdeep", 33, marks1);
        int[] marks2 = {67,69,54,38,50};
        Student stu2 = new Student("Smit", 97, marks2);
        System.out.println("Student 1");
        stu1.displayDetails();
        System.out.println("Student 2");
        stu2.displayDetails();

        System.out.println("Student 1 average is: "+stu1.calculateAverage());
        System.out.println("Student 2 average is: "+stu2.calculateAverage());
    }
}
