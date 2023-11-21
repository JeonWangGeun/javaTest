package TestPractice.src.Day1121.공통정수찾기;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 4, 6, 8};
        int[] list2 = {1, 3, 5, 6, 8};

        Set<Integer> list1Set = new HashSet<>();

        for(int num : list1){
            list1Set.add(num);
        }

        Set<Integer> newListSet = new HashSet<>();

        for(int num : list2){
            if(list1Set.contains(num)){
                newListSet.add(num);
            }
        }

        System.out.println(newListSet.toString());


    }
}
