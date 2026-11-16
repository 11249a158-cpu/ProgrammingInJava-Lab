Aim: To implement hybrid inheritance using interfaces.

Algorithm:
1. Create two interfaces.
2. Create a class implementing both interfaces.
3. Define their methods.
4. Create an object.
5. Display the result.
Program:
interface A {
    void show();
}
interface B {
    void display();
}
class C implements A, B {
    public void show() {
        System.out.println("Show");
    }
    public void display() {
        System.out.println("Display");
    }
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
