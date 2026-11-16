Aim: To reverse a given string.

Algorithm:
1. Start.
2. Read a string.
3. Use StringBuilder.
4. Reverse the string.
5. Display the result.
6. Stop.
Program:
import java.util.*;
class Reverse {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a=s.nextLine();

        System.out.println(new StringBuilder(a).reverse());
    }
}
//result:the program is successfully executed
