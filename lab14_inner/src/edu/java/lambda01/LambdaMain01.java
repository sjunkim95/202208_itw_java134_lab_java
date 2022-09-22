package edu.java.lambda01;

public class LambdaMain01 {
    
    public static void main(String[] args) {
        // 인터페이스를 사용 - 인터페이스를 구현하는 클래스
        // 1. 인터페이스를 구현하는 클래스를 별도의 java 파일에서 정의
        Calculable adder = new Adder();
        double result = adder.calculate(1, 2);
        System.out.println(result);
        
        // 2. 지역 클래스(local class)
        class Subtracter implements Calculable {
            @Override
            public double calculate(double x, double y) {
                return x - y;
            }
        }
        Calculable subtracter = new Subtracter();
        result = subtracter.calculate(1, 2);
        System.out.println(result);
        
        // 3. 익명 클래스(anonymous class)
        Calculable multiplier = new Calculable() {
            @Override
            public double calculate(double x, double y) {
                return x * y;
            }
        };
        result = multiplier.calculate(1, 2);
        System.out.println(result);
        
        // 4. 람다 표현식(Lambda expression)
        Calculable divider = (x, y) -> { return x / y; };
        result = divider.calculate(1, 2);
        System.out.println(result);
        
    } // end main()

} // end class LambdaMain01
