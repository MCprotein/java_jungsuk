package ch6_OOP1;
//6-3
public class TvTest3 {
    public static void main(String[] args) {
        Tv t1 = new Tv();
        Tv t2 = new Tv();
        System.out.println("t1의 channel 값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel 값은 " + t2.channel + "입니다.");

        t2 = t1; // t1이 저장하고 있는 값(주소)을 t2에 저장한다.
        t1.channel = 7; // channel 값을 7로 한다.
        System.out.println("t1의 channel값을 7로 변경하였습니다.");

        System.out.println("t1의 channel값은 " + t1.channel + "입니다.");
        System.out.println("t2의 channel값은 " + t2.channel + "입니다.");

        // 자신을 참조하고 있는 참조변수가 하나도 없는 인스턴스는 더 이상 사용되어질 수 없으므로 '가비지 컬렉터'에 의해서 자동적으로 메모리에서 제거된다.
    }
}
