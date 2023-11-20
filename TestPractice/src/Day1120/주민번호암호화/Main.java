package TestPractice.src.Day1120.주민번호암호화;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("주민번호를 입력하세요(- 포함) >> ");
        String idNum = sc.nextLine();

        String regex = "^[0-9]{6}-[0-9]{7}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(idNum);

        while (!matcher.matches()){
            System.out.print("주민번호를 다시 입력하세요(- 포함) >> ");
            idNum = sc.nextLine();
            matcher = pattern.matcher(idNum);
        }

        String[] idNumArr = idNum.split("-");
        idNumArr[1] = idNumArr[1].charAt(0) + "*".repeat(6);

        System.out.println(idNumArr[0] + "-" + idNumArr[1]);
    }
}
