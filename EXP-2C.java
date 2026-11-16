Aim: To find the largest of three numbers.

Algorithm:
1. Start.
2. Read three numbers.
3. Compare the numbers.
4. Find the largest number.
5. Display the result.
6. Stop.
Program:
import java.util.*;
class Largest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a=s.nextInt(), b=s.nextInt(), c=s.nextInt();

        if(a>b && a>c)
            System.out.println(a);
        else if(b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
//result:the program is successfully executed
