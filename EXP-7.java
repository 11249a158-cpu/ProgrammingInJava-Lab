Aim: To implement multithreading in Java.

Algorithm:
1. Create a class extending Thread.
2. Override the run() method.
3. Write the thread task.
4. Create an object.
5. Start the thread using start().
6. Stop.
Program:
class MyThread extends Thread {
    public void run() {
        System.out.println("Thread is running");
    }
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
    }
}
//result:the program is successfully executed
