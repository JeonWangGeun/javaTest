package TestPractice.src.Day1120.전화번호암호화;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("전화번호 입력(- 입력) >> ");
        String phoneNum = sc.nextLine();

        String regex = "^[0-9]{3}-[0-9]{3,4}-[0-9]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNum);

        while(!matcher.matches()){
            System.out.print("전화번호를 다시 입력해주세요(- 입력) >> ");
            phoneNum = sc.nextLine();
            matcher = pattern.matcher(phoneNum);
        }

        String[] phoneNumArr = phoneNum.split("-");

        phoneNumArr[1] = "*".repeat(phoneNumArr[1].length());

        System.out.println(phoneNumArr[0] + "-" + phoneNumArr[1] + "-" + phoneNumArr[2]);
    }
}
