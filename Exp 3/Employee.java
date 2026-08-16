/* Aim: WAP to create a program demonstrating multilevel inheritance using the classes
        Person, Employee, and Manager. Accept the manager details and display them. Handle
        invalid salary input using exception handling.
  Coder: Aayush Jha 
  Class: SE Comps A   */

public class Employee extends Person {
    private int empId;
    private int salary;
    private String role;
    private String dept;

    Employee(String name,int age,String gender,double height,int empId,int salary,String role,String dept){
        super(name, age, gender,height);
        this.empId=empId;
        this.salary=salary;
        this.role=role;
        this.dept=dept;
    }

     void display() {
        super.display();
        System.out.println("Employee Id: "+this.empId);
        System.out.println("Salary: "+this.salary);
        System.out.println("Job Role: "+this.role);
        System.out.println("Department: "+this.dept);
    }
}
