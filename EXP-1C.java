//Aim: To find the largest and smallest elements in an array.

/*Algorithm:
1. Start.
2. Initialize an array.
3. Assume the first element is largest and smallest.
4. Compare all elements.
5. Display largest and smallest.
6. Stop.*/
//Program:
class LargeSmall {
    public static void main(String[] args) {
        int a[] = {10, 5, 30, 2, 20};
        int max = a[0], min = a[0];

        for(int x : a) {
            if(x > max) max = x;
            if(x < min) min = x;
        }
        System.out.println("Largest: " + max);
        System.out.println("Smallest: " + min);
    }
}
//result:the program is successfully executed
