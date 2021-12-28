package ch3_operator;
//3-8
public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000; // 1,000,000 1백만
        int b = 2_000_000; // 2,000,000 2백만

        long c = a * b; // a*b = 2,000,000,000,000? 값이 int범위를 넘어서서 오버플로우가 일어나 엉뚱한 값이 도출됨
        System.out.println(c);
    }
}
