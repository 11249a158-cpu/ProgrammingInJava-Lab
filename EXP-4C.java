Aim: To print the multiplication table of a number.

Algorithm:
1. Start.
2. Read a number.
3. Repeat from 1 to 10.
4. Multiply the number by each value.
5. Display the result.
6. Stop.
Program:
import java.util.*;
class Table {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();

        for(int i=1; i<=10; i++)
            System.out.println(n+" x "+i+" = "+n*i);
    }
}
