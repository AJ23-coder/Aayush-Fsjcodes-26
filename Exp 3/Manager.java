/* Aim: WAP to create a program demonstrating multilevel inheritance using the classes
        Person, Employee, and Manager. Accept the manager details and display them. Handle
        invalid salary input using exception handling.
  Coder: Aayush Jha 
  Class: SE Comps A   */

public class Manager extends Employee {
    private int no_of_projects;
    private int no_of_team_members;

    Manager(String name,int age,String gender,double height,int empId,int salary,String role,String dept,int no_of_projects,int no_of_team_members){
        super(name, age, gender,height,empId,salary,role,dept);
        this.no_of_projects=no_of_projects;
        this.no_of_team_members=no_of_team_members;
    }

    void display(){
        super.display();
        System.out.println("No. of Projects: "+this.no_of_projects);
        System.out.println("No. of Team Members: "+this.no_of_team_members);
    }
}
