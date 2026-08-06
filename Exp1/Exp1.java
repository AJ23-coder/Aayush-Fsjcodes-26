/*Aim: WAP to store and display student information of few students.
        Information like name,uin,cgpa.
  Coder: Aayush Jha
  Class: SE Comps A
*/

public class Experiment1 {
    public static void main(String[] args) {

        /*Adding Details of Students */

        Student s1 = new Student();
        s1.name = "Aayush";
        s1.uin = "251P042";
        s1.cgpa = 8.69;
        s1.displayInfo();

        Student s2 = new Student();
        s2.name = "Shashvat";
        s2.uin = "251P023";
        s2.cgpa = 8.5;
        s2.displayInfo();

        Student s3 = new Student();
        s3.name = "Ajit";
        s3.uin = "251P050";
        s3.cgpa = 8.9;
        s3.displayInfo();

    }
    
}

/**
 * Student
 */
class Student{
    String name;
    String uin;
    double cgpa;

    /*Function to display details */

    void displayInfo(){
        System.out.println("------------------------");
        System.out.println("Name: "+name);
        System.out.println("UIN: "+uin);
        System.out.println("CGPA: "+cgpa);
        System.out.println("------------------------");

    }
}

