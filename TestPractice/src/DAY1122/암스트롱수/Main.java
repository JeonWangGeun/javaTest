package TestPractice.src.DAY1122.암스트롱수;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 입력하세요. >> ");
        int num = sc.nextInt();

        List<Integer> armstrongNum = new ArrayList<>();

        for(int i = 10; i <= num; i++){
            int sum = 0;
            int temp = i;
            int powNum = changePow(i);

            while(temp > 0){
                int a = temp % 10;
                temp /= 10;
                sum += Math.pow(a, powNum);
            }

            if(sum == i){
                armstrongNum.add(sum);
            }
        }

        if(armstrongNum.isEmpty()){
            System.out.print("1부터 " + num + "까지 암스트롱수가 없습니다 ");
        } else{
            System.out.print("1부터 " + num + "까지 암스트롱수 = ");
            for(int i : armstrongNum){
                System.out.print(i + " ");
            }
        }
    }

    public static int changePow(int num){
        int count = 0;
        while(num != 0){
            num /= 10;
            count ++;
        }
        return count;
    }
}
