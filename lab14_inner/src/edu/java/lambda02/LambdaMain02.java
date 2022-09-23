package edu.java.lambda02;

public class LambdaMain02 {

    public static void main(String[] args) {
        // Ex 1.
        Calculator adder = new Calculator(1, 2);
        double result = adder.calculate(null);
        System.out.println("adder result = " + result); // 3.0
        
        // Ex 2. 뺄셈을 계산하는 계산기 기능
        Calculator subtracter = new Calculator(1, 2);
        // TODO
        
        // Ex 3. 곱셈을 계산하는 계산기
        Calculator multiplier = new Calculator(1, 2);
        // TODO
        
        // Ex 4. 나눗셈을 계산하는 계산기
        Calculator divider = new Calculator(1,  2);
        // TODO
        
        // Ex 5. 두 숫자 중에서 더 크거나 같은 수를 찾는 계산기
        Calculator greater = new Calculator(1, 2);
        // TODO:

    }

}
