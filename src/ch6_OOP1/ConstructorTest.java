package ch6_OOP1;
//6-23

class Data1 { // 생성자가 하나도 없으면 컴파일러가 자동으로 기본생성자를 추가해준다.
    int value;
}
class Data2 {
    int value;
//    Data2() {} // 기본 생성자
    Data2(int x) { // 매개변수가 있는 생성자.
        value = x;
    }
}

public class ConstructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
//        Data2 d2 = new Data2(); // compile error 발생
    }
}
