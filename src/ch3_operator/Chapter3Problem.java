package ch3_operator;

public class Chapter3Problem {
    public static void main(String[] args) {
        //3-2
        int a = 123;
        int s = 10;
        int b = a / s + (a % s != 0 ? 1 : 0);
        System.out.println(b);
        //3-3
        int num = 10;
        System.out.println(num > 0 ? "양수" : (num ==0 ? 0 : "음수"));
        //3-4
        int num2 = 456;
        System.out.println((int)(num2/100.0)*100);
        //3-5
        int num3 = 333;
        System.out.println((int)(num3/10.0)*10+1);
        //3-6
        int num4 = 24;
        System.out.println(10-num4%10);
        //3-7
        int far = 100;
        float ccc = (int)((5 / 9f * (far - 32))*100+0.5)/100f;
        System.out.println("far = " + far);
        System.out.println("ccc = " + ccc);
        //3-9
        char ch = 'z';
        boolean bb = (('a' <= ch && ch <= 'z') || ('1' <= ch && ch <= '9'));
        System.out.println(bb);
        //3-10
        char ch2 = 'A';
        char lowerCase = ('A' <= ch2 && ch2 <= 'Z') ? (char)(ch2 + 32) : ch2;

        System.out.println("ch2 = " + ch2);
        System.out.println("lowerCase = " + lowerCase);

    }
}
