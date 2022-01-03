package ch6_OOP1;
//6-24


public class CarTest {
    static class Car{
        String color; // 색상
        String gearType; // 변속기 종류 - auto(자동), manual (수동)
        int door; // 문의 개수

        Car() {}


        public Car(String color, String gearType, int door) {
            this.color = color;
            this.gearType = gearType;
            this.door = door;
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "auto";
        c1.door = 4;

        Car c2 = new Car("white", "auto", 4);

        System.out.println("c1.color,c1.gearType,c1.door = " + c1.color + c1.gearType + c1.door);
        System.out.println("c2.color+c2.gearType+c2.door = " + c2.color + c2.gearType + c2.door);
    }
}
