package ch5_array;
//5-13
public class ArrayEx13 {
    public static void main(String[] args) {
        char[] hex = {'C', 'A', 'F', 'E'};
                    //12    10   15   14, 16진수

        String[] binary = {"0000", "0001", "0010", "0011"
                , "0100", "0101", "0110", "0111"
                , "1000", "1001", "1010", "1011"
                , "1100", "1101", "1100", "1111"}; // 0~16의 2진수
        String result = "";

        for (int i = 0; i < hex.length; i++) {
            if (hex[i] >= '0' && hex[i] <= '9') {
                result += binary[hex[i] - '0']; // '8'-'0'의 결과는 8이다
            } else { // A~F이면
                result += binary[hex[i] - 'A' + 10]; // 'C-'A'의 결과는 2
                // int형으로 자동변환
            }
        }
        // String(Char[] value)
        System.out.println("hex = " + new String(hex));
        System.out.println("binary = " + result);

        System.out.println("---------------------------------------------------");

        String conversion = new String(hex);
        System.out.println(conversion);
        System.out.println("오옹"+conversion);
        char[] con2 = conversion.toCharArray();
        System.out.println("con2 = " + con2);
        System.out.println(con2);
//        for (int i = 0; i < con2.length; i++) {
//            System.out.print(con2[i]);

        String src = "ABCDE";
        char[] chArr = src.toCharArray();

        // char배열(char[])을 출력
        System.out.println(chArr);
        System.out.println("d"+chArr);

        System.out.println("결론: char[] 배열을 출력할 때 단독으로 출력하면 값이 쭈르륵 나오고 다른문자와 붙여쓰면 참조주소가 출력된다.");
        }
    }

