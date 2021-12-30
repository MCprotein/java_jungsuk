package ch4_statement;
//4-31
public class FlowEx31 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i%3 == 0)
                continue;
            System.out.println(i);
        }
    }
}
