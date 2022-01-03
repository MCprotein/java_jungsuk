package ch6_OOP1;
class Car{
    String color; // 색상
    String gearType; // 변속기 종류 - auto(자동), manual(수동)
    int door; // 문의 개수

    Car() {
        this("white", "auto", 4);
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}
//6-25
public class CarTest2 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car("blue");

        System.out.println("c1 = " + c1.color+c1.gearType+c1.door);
        System.out.println("c2 = " + c2.color+c2.gearType+c2.door);

    }

}
