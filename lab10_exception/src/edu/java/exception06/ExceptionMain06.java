package edu.java.exception06;

public class ExceptionMain06 {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        try {
            int result = calc.divide(100, 0);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}
