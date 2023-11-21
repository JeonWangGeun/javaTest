package TestPractice.src.Day1121.중복문자찾기;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 >> ");
        String text = sc.nextLine();

        Set<Character> textSet = new HashSet<>();

        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(!(textSet.contains(c))){
                textSet.add(c);
            } else {
                System.out.println("중복된 문자: " + c);
            }
        }

        if(textSet.size() == text.length()){
            System.out.println("중복된 문자가 없습니다.");
        }
    }
}
