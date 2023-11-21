package TestPractice.src.Day1121.공통정수찾기;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {
        // 좀더 효율적인 코드
        int[] list1 = {1, 2, 4, 6, 8};
        int[] list2 = {1, 3, 5, 6, 8};

        List<Integer> equalslist = new ArrayList<>();
        int list1Index = 0;
        int list2Index = 0;

        while(list1Index < list1.length && list2Index < list2.length){
            if(list1[list1Index] == list2[list2Index]){
                equalslist.add(list1[list1Index]);
                list1Index++;
                list2Index++;
            } else if(list1[list1Index] < list2[list2Index]){
                list1Index++;
            } else{
                list2Index++;
            }
        }

        System.out.println("공통정수 = " + equalslist.toString());


    }
}
