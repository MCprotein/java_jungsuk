package ch3_operator;
//3-22
public class OperatorEx22 {
    public static void main(String[] args) {
        float f = 0.1f;
        double d = 0.1;
        double d2 = (double)f;

        System.out.printf("10.0 == 10.0f %b%n", 10.0 == 10.0f); //오차없이 저장됨
        System.out.printf("0.1 == 0.1f %b%n", 0.1 == 0.1f); //소수라서 2진수로 변환할때 오차생김
        System.out.printf("f = %19.17f%n", f);
        System.out.printf("d = %19.17f%n", d);
        System.out.printf("d2 = %19.17f%n", d2);

    }



}
