package ch3_operator;
//3-17
public class OperatorEx17 {
    public static void main(String[] args) {
        double pi = 3.141592;
        double shortPi = (int) (pi * 1000 + 0.5) / 1000.0;
        System.out.println(shortPi); // 반올림한것과 같은 결과 출력
    }
}
