Aim: To check whether a number is even or odd using switch case.

Algorithm:
1. Start.
2. Read a number.
3. Find its remainder when divided by 2.
4. Use switch case.
5. Print even or odd.
6. Stop.
Program:
import java.util.*;
class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        switch(n % 2) {
            case 0: System.out.println("Even"); break;
            case 1: System.out.println("Odd"); break;
        }
    }
}
//result:the program is successfully executed
