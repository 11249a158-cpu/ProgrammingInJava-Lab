//Aim: To write a Java program to sort array elements in ascending order.

/*Algorithm:
1. Start the program.
2. Read the array elements.
3. Compare adjacent elements.
4. Swap if the first element is greater.
5. Display the sorted array.
6. Stop.*/
//Program:
import java.util.*;
class Sort {
    public static void main(String[] args) {
        int a[] = {5, 2, 8, 1, 3};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
//result: The program is successfully completed
