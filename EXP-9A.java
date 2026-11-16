Aim: To implement single inheritance in Java.

Algorithm:
1. Create a parent class.
2. Create a child class using extends.
3. Define methods.
4. Create child object.
5. Display the result.
Program:
class A {
    void show() {
        System.out.println("Parent");
    }
}
class B extends A {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
//result:the program is successfully executed
