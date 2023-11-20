package TestPractice.src.Day1120.회문찾기;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 >> ");
        String text = sc.nextLine();

        String regex = "[^A-Za-z0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String newText = matcher.replaceAll("").toUpperCase();
        int length = newText.length();
        int halfLength = length/2;

        String firstText = newText.substring(0, halfLength);
        String secondText = newText.substring(length % 2 == 0 ? halfLength : halfLength+1);

        String reverseSecondText = new StringBuilder(secondText).reverse().toString();

        if(firstText.equals(reverseSecondText)) {
            System.out.println("회문입니다");
        }
        else {
            System.out.println("회문이 아닙니다");
        }
    }
}
