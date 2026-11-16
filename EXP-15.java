Aim: To implement a functional interface using lambda expression.

Algorithm:
1. Create a functional interface.
2. Declare one abstract method.
3. Use a lambda expression.
4. Call the method.
5. Display the output.
Program:
@FunctionalInterface
interface A {
    void show();
}
class Test {
    public static void main(String[] args) {
        A obj = () -> System.out.println("Hello Java");
        obj.show();
    }
}
