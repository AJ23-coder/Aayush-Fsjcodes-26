/* 
AIM: WAP to create a calculator class to add two numbers. Use constructor overloading to
     initialize the data with either default values or user provided values. Use method
     overloading to add integer or double.
Coder: Aayush Jha 
Class: SE Comps A
*/
import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println("A:" +c1.a+"B:"+c1.b);
        
        Calculator c2 = new Calculator(3,4);
        System.out.println("A:" +c2.a+"B:"+c2.b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        int x = sc.nextInt();
        System.out.println("Enter the Second Number: ");
        int y = sc.nextInt();
        c1.add(x,y);

        Scanner er = new Scanner(System.in);
        System.out.println("Enter the First Number: ");
        double k = sc.nextDouble();
        System.out.println("Enter the Second Number: ");
        double l = sc.nextDouble();
        c1.add(k,l);

    }
}
