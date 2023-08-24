package org.example;

public class Calculator {
    public int add(int a, int b) throws Exception{

        if (a > 10 || b > 10) {                   // || 는 or 연산자
            throw new Exception();                // a or b 가 10을 넘으면 에러를 던질꺼야
        } else {

            int result = a + b;
            return result;
        }
    }
}
