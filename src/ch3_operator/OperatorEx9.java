package ch3_operator;
//3-9
public class OperatorEx9 {
    public static void main(String[] args) {
        long a = 1_000_000L; // 1,000,000 1백만
        long b = 2_000_000L; // 2,000,000 2백만

        long c = a * b; // a*b = 2,000,000,000,000?
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
