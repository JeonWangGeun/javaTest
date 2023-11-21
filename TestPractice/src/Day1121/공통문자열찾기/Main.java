package TestPractice.src.Day1121.공통문자열찾기;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문저열1을 입력하세요 >> ");
        String text1 = sc.nextLine();
        System.out.print("문저열2을 입력하세요 >> ");
        String text2 = sc.nextLine();

        Set<Character> text1Set = new HashSet<>();

        for(char c : text1.toCharArray()){
            text1Set.add(c);
        }

        Set<Character> equalTextSet = new HashSet<>();

        for(char c : text2.toCharArray()){
            if(text1Set.contains(c)){
                equalTextSet.add(c);
            }
        }

        System.out.println("문자열1 : " + text1);
        System.out.println("문자열2 : " + text2);
        System.out.println("공통문자열 : " + equalTextSet.toString());

    }
}
