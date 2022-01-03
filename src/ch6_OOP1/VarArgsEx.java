package ch6_OOP1;

public class VarArgsEx {
    public static void main(String[] args) {
        String[] strArr = {"100", "200", "300"};

        System.out.println(concatenate("", "100", "200", "300"));
        System.out.println(concatenate("-", strArr));
        System.out.println(concatenate(",", new String[]{"1", "2", "3"}));
        System.out.println("[" + concatenate(",", new String[0]) + "]"); //왜 결과값이 [] 이거지?
        System.out.println("["+concatenate(",")+"]"); //왜 결과값이 [] 이거지?
    }

    static String concatenate(String delim, String... args) {
        String result = "";

        for (String str : args) {
            result += str + delim;
            System.out.println("result = " + result);
        }



        return result;
    }
/*
    static String concatenate(String... args) {
        return concatenate("", args);

 */
} // class

