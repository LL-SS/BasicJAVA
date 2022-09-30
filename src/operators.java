public class operators {

    public static void main(String[] args) {

        String myString = "Hello" + "Codeit!!";

        // 문자열에 숫자를 더할 경우 자동으로 문자열으로 변환
        System.out.println("Hello, I'm " + 27 + ".");

        int a = 9;
        int b = 5;
        // 연산에 소수형이 있다면 결과는 소수형으로 표현
        // double b = 5;
        
        System.out.println("숫자 연산자");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        // 정수형과 정수형의 연산 결과는 항상 정수형으로 표현
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        
        System.out.println("비교 연산자");
        System.out.println(3 + " > " + 2 + " : " + (3 > 2));
        System.out.println(3 + " < " + 2 + " : " + (3 < 2));
        System.out.println(3 + " >= " + 2 + " : " + (3 >= 2));
        System.out.println(3 + " <= " + 2 + " : " + (3 <= 2));
        System.out.println(3 + " == " + 2 + " : " + (3 == 2));
        System.out.println(3 + " != " + 2 + " : " + (3 != 2));

        System.out.println("불린 연산자 - and");
        System.out.println("true && true : " + (true && true));
        System.out.println("true && false : " + (true && false));
        System.out.println("false && true : " + (false && true));
        System.out.println("false && false : " + (false && false));

        System.out.println("불린 연산자 - or");
        System.out.println("true && true : " + (true || true));
        System.out.println("true && false : " + (true || false));
        System.out.println("false && true : " + (false || true));
        System.out.println("false && false : " + (false || false));

        System.out.println("불린 연산자 - not");
        System.out.println("!true : " + !true);
        System.out.println("!false : " + !false);

    }

}
