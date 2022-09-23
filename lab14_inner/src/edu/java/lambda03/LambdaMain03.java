package edu.java.lambda03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaMain03 {

    public static void main(String[] args) {
        // 정수들을 저장하는 리스트
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(numbers);
        
        // numbers에서 짝수들만 선택해서 저장한 리스트.
        List<Integer> evens = new ArrayList<>();
        for (Integer x : numbers) { // 리스트의 모든 원소를 차례로 반복하면서
            if (x % 2 == 0) { // 짝수들을 필터링
                evens.add(x);
            }
        }
        System.out.println(evens);
        
        List<Integer> evens2 = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evens2);
        
        // numbers에서 홀수들만 선택해서 저장한 리스트.
        List<Integer> odds; 

    }

}
