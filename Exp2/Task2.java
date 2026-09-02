public class Rectangle {
    int l;
    int b;

    Rectangle(){

        this.l=0;
        this.b=0;
    }

    Rectangle(int m, int n){

        this.l=m;
        this.b=n;
    }

    void calculateArea(int i, int j){
        int area = i * j;
        System.out.println("Area Of Rectangle using Integers: "+area);
    }
    
    void calculateArea(double p, double q){
        double area = p * q;
        System.out.println("Area of Rectangle using Double:"+area);
    }
}


import java.util.Scanner;

public class RectangleTest {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        System.out.println("A: " + r1.l + " B: " + r1.b);

        Rectangle r2 = new Rectangle(3, 4);
        System.out.println("A: " + r2.l + " B: " + r2.b);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Length: ");
        int x = sc.nextInt();

        System.out.println("Enter the Breadth: ");
        int y = sc.nextInt();

        r1.calculateArea(x, y);

        System.out.println("Enter the Length: ");
        double u = sc.nextDouble();

        System.out.println("Enter the Breadth: ");
        double v = sc.nextDouble();

        r1.calculateArea(u, v);

        sc.close();
    }
}


