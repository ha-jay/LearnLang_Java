package _6_container;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class Array_Multi {

    public static void main(String[] args) {    
      // 2차원 배열 선언 및 초기화
        //2차원 배열은 데이터를 행과 열로 구성된 표 형태로 저장할때 사용됩니다. 
        //예를들면 학생의 시험점수표
        //행은 학생, 열은 과목으로 구성된 표 형태로 저장할때 사용됩니다. 
        //리터럴 이용해 초기화 가능
        int[][] scores = {
            {100, 90, 80, 70},
            {60, 50, 40, 30},
            {20, 10, 0, -10}
        };

        //예를들면 첫번째 배열은 어느학생인지, 두번째 배열은 특정과목의 점수를 저장하는 형태

        // 2차원 배열 값 출력
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
            }
            System.out.println();
        }

        //2차원 배열을 대신할 대안 - ArrayList - 크기가 유동적인 2차원 배열처럼 사용할 수 있음
        List<List<Integer>> dynamicArray = new ArrayList<>();

        // 행 추가
        dynamicArray.add(new ArrayList<>(Arrays.asList(1, 2, 3)));
        dynamicArray.add(new ArrayList<>(Arrays.asList(4, 5, 6)));
        dynamicArray.add(new ArrayList<>(Arrays.asList(7, 8, 9)));

        // 행 출력
        System.out.println(dynamicArray.get(1).get(2)); // 두번째 행의 세번째 요소 출력

        //2차원 배열을 대신할 대안 Map사용
        Map<String, List<Integer>> map = new HashMap<>();
        map.put("row1", Arrays.asList(1, 2, 3));
        map.put("row2", Arrays.asList(4, 5, 6));
        map.put("row3", Arrays.asList(7, 8, 9));

        System.out.println(map.get("row2").get(1)); // 두번째 행의 두번째 요소 출력
    }
}
