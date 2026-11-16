Aim: To check whether a given year is a leap year.

Algorithm:
1. Start.
2. Read the year.
3. Check divisibility by 400 or 4 and not 100.
4. Print leap year or not.
5. Stop.
Program:
import java.util.*;
class Leap {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int y = s.nextInt();

        if(y%400==0 || (y%4==0 && y%100!=0))
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}
//result:the program is successfully executed
