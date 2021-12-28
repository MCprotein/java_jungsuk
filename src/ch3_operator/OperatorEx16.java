package ch3_operator;
//3-16
public class OperatorEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        float shortPi = (int) (pi * 1000) / 1000f; // 1000을 곱하고 int로 캐스팅된 후 1000으로 나눈다.
        System.out.println(shortPi);
    }
}
