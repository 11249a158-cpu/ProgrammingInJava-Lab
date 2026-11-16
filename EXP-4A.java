Aim: To check whether a number is an Armstrong number.

Algorithm:
1. Start.
2. Read a number.
3. Find the sum of cubes of its digits.
4. Compare the sum with the original number.
5. Display the result.
6. Stop.
Program:
import java.util.*;
class Armstrong {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt(), t=n, sum=0;

        while(t>0) {
            int r=t%10;
            sum+=r*r*r;
            t/=10;
        }

        if(sum==n)
            System.out.println("Armstrong");
        else
            System.out.println("Not Armstrong");
    }
}
//result:the program is successfully executed
