Aim: To implement hierarchical inheritance in Java.

Algorithm:
1. Create a parent class.
2. Create two child classes.
3. Extend both from parent.
4. Create objects.
5. Display the results.
Program:
class A {
    void show() {
        System.out.println("Parent");
    }
}
class B extends A {}
class C extends A {
    public static void main(String[] args) {
        B b = new B();
        C c = new C();
        b.show();
        c.show();
    }
}
