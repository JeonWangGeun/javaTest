package TestPractice.src.Day1120.문자열뒤집기;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("문자열을 입력하세요 >> ");
        String text = sc.nextLine();

        String regex = "[^0-9A-Za-z]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        String newText = matcher.replaceAll(" ");

        String[] arr1 = newText.split("\\s+");
        String[] arr2 = text.split("[0-9A-Za-z]+");

        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = new StringBuilder(arr1[i]).reverse().toString();
        }

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < arr1.length; i++){
            result.append(arr2[0]);
            result.append(arr1[i]);
            if (i < arr2.length) {
                result.append(arr2[i+1]);
            }
        }

        System.out.println(result.toString());
    }
}
