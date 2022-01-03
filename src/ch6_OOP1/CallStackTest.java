package ch6_OOP1;
//6-7
public class CallStackTest {

    static void firstMethod() {
        secondMethod();
    }
    static void secondMethod() {
        System.out.println("secondMethod()");
    }

    public static void main(String[] args) {
        firstMethod();
    }
}
