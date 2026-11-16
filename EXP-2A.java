//Aim: To perform arithmetic operations using switch case.

/*Algorithm:
1. Start.
2. Read two numbers and an operator.
3. Use switch case.
4. Perform the selected operation.
5. Display the result.
6. Stop.*/
//Program:
import java.util.*;
class Arithmetic {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        char op = s.next().charAt(0);

        switch(op) {
            case '+': System.out.println(a+b); break;
            case '-': System.out.println(a-b); break;
            case '*': System.out.println(a*b); break;
            case '/': System.out.println(a/b); break;
            default: System.out.println("Invalid");
        }
    }
}
//result:the program is successfully executed
