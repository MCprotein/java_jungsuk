package ch3_operator;
//3-14
public class OperatorEx14 {
    public static void main(String[] args) {
        char c = 'a';
        for (int i = 0; i < 26; i++) { //블럭{} 안의 문장을 26번 반복한다.
            System.out.print(c++); //println은 값을 출력하고 줄을 바꾸지만, print는 줄을 바꾸지 않고 출력한다.
        }
        System.out.println(); // 줄바꿈을 한다.

        c='A';
        for (int i = 0; i < 26; i++) { //블럭{} 안의 문장을 26번 반복한다.
            System.out.print(c++);
        }
        System.out.println();

        c = '0';
        for (int i = 0; i < 10; i++) {
            System.out.print(c++);
        }
        System.out.println();
    }
}
