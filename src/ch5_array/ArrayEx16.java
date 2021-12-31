package ch5_array;
//5-16
public class ArrayEx16 {
    public static void main(String[] args) {
        //JVM이 입력된 매개변수가 없을 때, null 대신 크기가 0인 배열을 생성해서 args에 전달하도록 구현되어있다.
        if (args != null) { //args가 null이 아닐 때만 괄호{}의 문장들을 수행
            System.out.println("매개변수의 개수: " + args.length);
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] = \" " + args[i] + "\"");
            }
        }
    }
}
