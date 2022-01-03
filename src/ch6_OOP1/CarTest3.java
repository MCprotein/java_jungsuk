package ch6_OOP1;

//6-26
public class CarTest3 {
    static class Car{
        String color; // 색상
        String gearType; // 변속기 종류 - auto(자동), manual(수동)
        int door; // 문의 개수

        Car() {
            this("white", "auto", 4);
        }

        Car(Car c) { // 인스턴스의 복사를 위한 생성자.
            this.color = c.color;
            this.gearType = c.gearType;
            this.door = c.door;
        }

        Car(String color, String gearType, int door) {
            this.color = color;
            this.gearType = gearType;
            this.door = door;
        }
    }

    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1); // c1의 복사본 c2를 생성한다.
        System.out.println("c1.color+c1.gearType+c1.door = " + c1.color + c1.gearType + c1.door);
        System.out.println("c2.color+c2.gearType+c2.door = " + c2.color + c2.gearType + c2.door);
        c1.door = 100; // c1의 인스턴스변수 door의 값을 변경한다.
        System.out.println("변경후");
        System.out.println("c1.color+c1.gearType+c1.door = " + c1.color + c1.gearType + c1.door);
        System.out.println("c2.color+c2.gearType+c2.door = " + c2.color + c2.gearType + c2.door);
    }

}
