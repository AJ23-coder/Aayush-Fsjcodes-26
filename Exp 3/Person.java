/* Aim: WAP to create a program demonstrating multilevel inheritance using the classes
        Person, Employee, and Manager. Accept the manager details and display them. Handle
        invalid salary input using exception handling.
  Coder: Aayush Jha 
  Class: SE Comps A    */

public class Person {
    private String name;
    private int age;
    private String gender;
    private double height;

    Person(String name,int age,String gender,double height){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.height=height;
    }
    void display(){
        System.out.println("Name: "+this.name);
        System.out.println("Age: "+this.age);
        System.out.println("Gender: "+this.gender);
        System.out.println("Height: "+this.height);
    }
}
