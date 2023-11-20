package TestPractice.src.Day1120.중복문자제거;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("텍스트를 입력하세요. ");
        String text = sc.nextLine();

        StringBuffer newText = new StringBuffer();

        // 문자열이 길어질수록 이 중첩문은 효율성이 떨어짐
//        newText.append(text.charAt(0));

//        for(int i = 1; i < text.length(); i++){
//            boolean pair = false;
//            for(int j = 0; j < newText.length(); j++){
//                if(text.charAt(i) == newText.charAt(j)){
//                    pair = true;
//                    break;
//                }
//            }
//            if(!pair){
//                newText.append(text.charAt(i));
//            }
//        }

        Set<Character> examine = new HashSet<>();
        for(int i = 0; i < text.length(); i++){
            char currentChar = text.charAt(i);

            if(!examine.contains(currentChar)){
                newText.append(currentChar);
                examine.add(currentChar);
            }
        }



        System.out.println("중복문자 제거 결과 = " + newText.toString());
    }
}
