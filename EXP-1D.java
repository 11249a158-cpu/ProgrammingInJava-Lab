//Aim: To print students' marks above 60.

/*Algorithm:
1. Start.
2. Initialize marks.
3. Check each mark.
4. Print marks greater than 60.
5. Stop.*/
//Program:
class Marks {
    public static void main(String[] args) {
        int a[] = {45, 75, 80, 55, 90};

        for(int x : a)
            if(x > 60)
                System.out.println(x);
    }
}
//result:the program is successfully executed
