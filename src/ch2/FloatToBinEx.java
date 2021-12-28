package ch2;
//2-11
public class FloatToBinEx {
    public static void main(String[] args) {
        float f = 9.1234567f;
        int i = Float.floatToIntBits(f); // float타입의 값을 int타입의 값으로 변환

        System.out.printf("%f%n", f);
        System.out.printf("%X%n", i); //16진수로 출력
        //main의 끝
    }
}
