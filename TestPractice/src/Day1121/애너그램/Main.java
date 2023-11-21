package TestPractice.src.Day1121.애너그램;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열1 입력 >> ");
        String text1 = sc.nextLine();

        System.out.print("문자열2 입력 >> ");
        String text2 = sc.nextLine();

        if(text1.length() == text2.length()) {

            char[] text1Arr = text1.toUpperCase().toCharArray();
            char[] text2Arr = text2.toUpperCase().toCharArray();

            List<Character> text1Set = new ArrayList<>();

            for (char c : text1Arr) {
                text1Set.add(c);
            }

            boolean anagram = true;

            for (char c : text2Arr) {
                if (text1Set.contains(c)) continue;
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
