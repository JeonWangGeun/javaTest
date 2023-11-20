package TestPractice.src.Day1120.행렬곱하기;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int m = 2; // 행렬 A의 행 수
        int n = 2; // 행렬 A의 열 수, 행렬 B의 행 수
        int p = 2; // 행렬 B의 열 수

        int[][] arr1 = inputArr(m, n);
        int[][] arr2 = inputArr(n, p);

        int[][] arr3 = new int[2][2];

//        arr3[0][0] = arr1[0][0] * arr2[0][0] + arr1[0][1] * arr2[1][0] ;
//        arr3[0][1] = arr1[0][0] * arr2[0][1] + arr1[0][1] * arr2[1][1] ;
//        arr3[1][0] = arr1[1][0] * arr2[0][0] + arr1[1][1] * arr2[1][0] ;
//        arr3[1][1] = arr1[1][0] * arr2[0][1] + arr1[1][1] * arr2[1][1] ;

        arr3 = multiplyArr(arr1, arr2);

        System.out.println("arr1");
        writeArr(arr1);
        System.out.println("arr2");
        writeArr(arr2);
        System.out.println("result");
        writeArr(arr3);
    }

    public static int[][] inputArr(int row, int col){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[row][col];

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                System.out.print( (i+1) + "행" + (j+1) + "열 정수 입력 ");
                arr[i][j] = sc.nextInt();
            }
        }

        return arr;
    }

    public static int[][] multiplyArr(int[][] arr1, int[][] arr2){
        int[][] result = new int[arr1.length][arr2[0].length];

            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr1[0].length; j++){
                    int sum = 0;
                    for(int k = 0; k < arr2[0].length; k++){
                        sum += arr1[i][k] * arr2[k][j];
                    }
                    result[i][j] = sum;
                }
            }

        return result;
    }

    public static void writeArr(int[][] arr){
        System.out.println("[");
        for(int i = 0; i < arr.length; i++){
            System.out.print("[");
            for(int j = 0; j < arr[i].length; j++){
                System.out.print(arr[i][j]);
                if(j < arr[i].length - 1){
                    System.out.print(",");
                }
            }
            System.out.println("]");
        }
        System.out.println("]");
    }

}
