package ch6_OOP1;
//6-11

public class ReferenceParamEx2 {

    public static void main(String[] args) {

        int[] x = {10}; // 크기가 1인 배열. x[0] = 10;
        System.out.println("main() : x = " + x[0]);
        change(x);
        System.out.println("x[0] = " + x[0]);
    }

    static void change(int[] x) {//참조형 매개변수}
        x[0] = 1000;
        System.out.println("x[0] = " + x[0]);

    }
}
