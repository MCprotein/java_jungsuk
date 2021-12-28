package ch2;
//2-4
public class PrintEx1 {
    public static void main(String[] args) {
        byte b = 1;
        short s = 2;
        char c = 'A';

        int finger = 10;
        long big = 100_000_000_000L; // long big = 100000000000L;
        long hex = 0xFFFF_FFFF_FFFF_FFFFL;

        int octNum = 010; // 8진수 10, 10진수로는 8
        int hexNum = 0x10; // 16진수 10, 10진수로는 16
        int binNum = 0b10; // 2진수 10, 10진수로는 2

        System.out.printf("b=%d%n", b); // 10진(decimal) 정수의 형식으로 출력
        System.out.printf("s=%d%n", s);
        System.out.printf("c=%c, %d %n", c, (int)c); // 문자(character)로 출력
        System.out.printf("finger=[%5d]%n", finger); // 출력될 값이 차지할 공간 지정, 오른쪽부터 다섯칸 할당
        System.out.printf("finger=[%-5d]%n", finger); //왼쪽부터 다섯칸 할당
        System.out.printf("finger=[%05d]%n", finger);
        System.out.printf("big=%d%n", big);
        System.out.printf("hex=%#x%n", hex); //#는 접두사 (16진수 0x, 8진수 0)
        System.out.printf("hex=%#X%n", hex); //#는 접두사 (16진수 0x, 8진수 0)
        System.out.printf("octNum=%o, %d%n", octNum, octNum); // 8진(octal) 정수의 형식으로 출력
        System.out.printf("hexNum=%x, %d%n", hexNum, hexNum); // 16진(hexa-decimal)정수의 형식으로 출력
        System.out.printf("binNum=%s, %d%n", Integer.toBinaryString(binNum), binNum); // 문자열(string)로 출력


    }
}
