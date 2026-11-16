Aim: To print the Fibonacci series.

Algorithm:
1. Start.
2. Initialize two numbers as 0 and 1.
3. Print the numbers.
4. Add the previous two numbers.
5. Repeat for n terms.
6. Stop.
Program:
class Fibonacci {
    public static void main(String[] args) {
        int a=0, b=1, c;

        for(int i=1; i<=10; i++) {
            System.out.print(a+" ");
            c=a+b;
            a=b;
            b=c;
        }
    }
}
//result:the program is successfully executed
