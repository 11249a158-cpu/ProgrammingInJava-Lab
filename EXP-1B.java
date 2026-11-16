//Aim: To search an element using binary search.

/*Algorithm:
1. Start.
2. Initialize a sorted array.
3. Read the search element.
4. Apply binary search.
5. Display the position if found.
6. Stop.*/
//Program:
import java.util.*;
class Binary {
    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50};
        int n = 30;
        int p = Arrays.binarySearch(a, n);
        System.out.println("Position: " + p);
    }
}
//result:The program is successfully executed
