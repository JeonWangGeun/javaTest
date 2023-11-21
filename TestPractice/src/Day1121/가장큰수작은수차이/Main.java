package TestPractice.src.Day1121.가장큰수작은수차이;

public class Main {
    public static void main(String[] args) {

        int[] numArr = {10, 21, 5, 65, 14};

        int maxNum = numArr[0];
        int minNum = numArr[0];

        for(int num : numArr){
            if(maxNum < num){
                maxNum = num;
            } else if(minNum > num){
                minNum = num;
            }
        }

        System.out.println("최댓값 : " + maxNum);
        System.out.println("최솟값 : " + minNum);
        System.out.println("최댓값 - 최솟값 : " + ( maxNum - minNum ) );

    }
}
