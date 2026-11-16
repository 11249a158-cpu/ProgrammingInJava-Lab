Aim: To implement an interface in Java.

Algorithm:
1. Create an interface.
2. Declare a method.
3. Implement the interface in a class.
4. Define the method.
5. Create an object and display output.
Program:
interface A {
    void show();
}
class B implements A {
    public void show() {
        System.out.println("Interface");
    }
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
