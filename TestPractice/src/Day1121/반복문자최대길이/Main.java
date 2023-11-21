package TestPractice.src.Day1121.반복문자최대길이;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 >> ");
        String text = sc.nextLine();

        Map<Character, Integer> textMap = new HashMap<>();

        for(int i = 0; i < text.length(); i++){
            char c = text.charAt(i);
            if(!(textMap.containsKey(c))){
                textMap.put(c, 1);
            } else {
                textMap.put(c, textMap.get(c) + 1);
            }
        }

        int maxNum = 0;
        for(int i : textMap.values()){
            if(maxNum < i){
                maxNum = i;
            }
        }

        for(char c : textMap.keySet()){
            if(textMap.get(c) == maxNum){
                System.out.println("최대반복문자열 : " + c + ", 길이 : " + maxNum);
                break;
            }
        }

    }
}
