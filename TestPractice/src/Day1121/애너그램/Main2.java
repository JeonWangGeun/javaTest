package TestPractice.src.Day1121.애너그램;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        // 또다른방법
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열1 입력 >> ");
        String text1 = sc.nextLine();

        System.out.print("문자열2 입력 >> ");
        String text2 = sc.nextLine();

        if(text1.length() == text2.length()) {

            char[] text1Arr = text1.toUpperCase().toCharArray();
            char[] text2Arr = text2.toUpperCase().toCharArray();

            Arrays.sort(text1Arr);
            Arrays.sort(text2Arr);

            boolean anagram = true;

            for (int i = 0; i < text1Arr.length; i++) {
                if (text1Arr[i] == text2Arr[i]) continue;
                else {
                    anagram = false;
                    break;
                }
            }

            System.out.println(anagram ? "애너그램 입니다." : "애너그램이 아닙니다.");
        } else{
            System.out.println("애너그램이 아닙니다.");
        }
    }
}

