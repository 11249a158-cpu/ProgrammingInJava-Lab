Aim: To check whether a number is a perfect square.

Algorithm:
1. Start.
2. Read a number.
3. Find its square root.
4. Check whether the square root is an integer.
5. Display the result.
6. Stop.
Program:
import java.util.*;
class PerfectSquare {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int r=(int)Math.sqrt(n);

        if(n>=0 && r*r==n)
            System.out.println("Perfect Square");
        else
            System.out.println("Not Perfect Square");
    }
}
