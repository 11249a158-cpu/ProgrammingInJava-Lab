Aim: To calculate area and perimeter using packages.

Algorithm:
1. Create a package.
2. Create a class for area and perimeter.
3. Import the package.
4. Create an object.
5. Call the methods.
6. Display the results.
Program:

File 1: Shape.java
package mypack;

public class Shape {
    public void calculate(int l,int b) {
        System.out.println("Area: "+l*b);
        System.out.println("Perimeter: "+2*(l+b));
    }
}

File 2: Main.java
import mypack.Shape;

class Main {
    public static void main(String[] args) {
        Shape s=new Shape();
        s.calculate(5,4);
    }
}
