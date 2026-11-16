Aim: To implement multilevel inheritance in Java.

Algorithm:
1. Create three classes.
2. Extend the second class from first.
3. Extend the third class from second.
4. Create third class object.
5. Display the result.
Program:
class A {
    void show() {
        System.out.println("A");
    }
}
class B extends A {}
class C extends B {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();
    }
}
//result:the program is successfully executed
