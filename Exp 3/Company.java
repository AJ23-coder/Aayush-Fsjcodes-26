/* Aim: WAP to create a program demonstrating multilevel inheritance using the classes
        Person, Employee, and Manager. Accept the manager details and display them. Handle
        invalid salary input using exception handling.
  Coder: Aayush Jha 
  Class: SE Comps A    */

import.java.util.InputMismatchException;
import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Name: ");
            String name = sc.nextLine();
            System.out.println("Enter Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Gender: ");
            String gender = sc.nextLine();
            System.out.println("Enter Height: ");
            double height = sc.nextDouble();
            System.out.println("Enter Employee ID: ");
            int empId = sc.nextInt();
            System.out.println("Enter Salary: ");
            int salary = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter Job Role: ");
            String role = sc.nextLine();
            System.out.println("Enter Department: ");
            String dept = sc.nextLine();
            System.out.println("Enter No.of Projects: ");
            int no_of_projects = sc.nextInt();
            System.out.println("Enter No.of Team Members: ");
            int no_of_team_members = sc.nextInt();

            Manager m1 = new Manager(name,age,gender,height,empId,salary,role,dept,no_of_projects,no_of_team_members);
            m1.display();

        } catch (InputMismatchException e) {
            // TODO: handle exception
          System.out.println("Invalid Input. Please enter values again.");

        }
    }
}

