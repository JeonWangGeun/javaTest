package TestPractice.src.DAY1122.강아지와병아리;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dog;
        int chick;
        boolean endgame = true;

        while (endgame){

            System.out.print("강아지와 병아리의 합, 다리갯수 합 : ");
            int sum = sc.nextInt();
            int footSum = sc.nextInt();

            for(int i = 0; i <= sum; i++){
                dog = i;
                chick = sum - dog;
                if(((dog * 4) + (chick * 2)) == footSum){
                    System.out.print("강아지 : " + dog + "마리, ");
                    System.out.println("병아리 : " + chick + "마리");
                    break;
                }
                if(i == sum){
                    System.out.println("맞는 답이 없습니다.");
                }
            }

            if(sum == 0 && footSum == 0){
                endgame = false;
            }


        }

    }
}
