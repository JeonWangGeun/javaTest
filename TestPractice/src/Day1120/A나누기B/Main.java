package TestPractice.src.Day1120.A나누기B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1~5사이의 정수를 입력하시오. >>");
        int a = sc.nextInt();
        while(!(a > 0 && a < 5)){
            System.out.print("정수의 범위를 넘어갔습니다. 다시입력하세요. >>");
            a = sc.nextInt();
        }

        System.out.print("1~10사이의 정수를 입력하시오. >>");
        int b = sc.nextInt();
        while(!(b > 0 && b < 10)){
            System.out.print("정수의 범위를 넘어갔습니다. 다시입력하세요. >>");
            b = sc.nextInt();
        }

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a / b = " + (double)a/b);
    }
}
