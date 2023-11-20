package TestPractice.src.Day1120.피보나치;

public class Main {
    public static void main(String[] args) {
            fibonacci(0,1, 100);
    }

    public static void fibonacci(int a, int b, int z){
        System.out.print(b + " ");
        int c = a + b;
        if(c < z) {
            fibonacci(b, c, z);
        }
    }
}
