package TestPractice.src.Day1120.문자등장횟수;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 >> ");
        String text = sc.nextLine();

        Map<Character, Integer> charCount = new HashMap<>();


//        for(int i = 0; i < text.length(); i++){
//            Character chars = text.charAt(i);
//            if(charCount.containsKey(chars)){
//                int count = charCount.get(chars);
//                charCount.put(chars, count+1);
//            } else{
//                charCount.put(chars, 1);
//            }
//        }

        // 좀 더 효율적인 코드
        for(char c : text.toCharArray()){
            if(charCount.containsKey(c)){
                charCount.put(c, charCount.get(c) + 1);
            } else{
                charCount.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : charCount.entrySet()){
            System.out.println("'" + entry.getKey() + "'는 " + entry.getValue() + "번 등장");
        }

    }
}
