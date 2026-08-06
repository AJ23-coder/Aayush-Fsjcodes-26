/* 
AIM: WAP to create a calculator class to add two numbers. Use constructor overloading to
     initialize the data with either default values or user provided values. Use method
     overloading to add integer or double.
Coder: Aayush Jha 
Class: SE Comps A
*/
public class Calculator {
    
    int a;
    int b;

    Calculator(){

        this.a = 0;
        this.b = 0;
    }

    Calculator(int m, int n){

        this.a = m;
        this.b = n;
    }

    void add(int i, int j){
        int sum = i+j;
        System.out.println("Integer Addition: "+ sum);
    }

    void add(double p, double q){
        double sum = p+q;
        System.out.println("Double Addition: "+sum);

    }
    
}
