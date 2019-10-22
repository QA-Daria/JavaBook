package Chapter3.beforeLesson;

import static java.lang.String.join;

public class ForStrings {
    public static void main(String[] args) {
        String e = ""; //0 sim string
        String greeting = "Hello";

        String s = greeting.substring(0,3);
        System.out.println(s);

        String ex = "EX ";
        int alfa = 3;

        String message = ex +alfa+ greeting + " ! ";
        System.out.println(message);

        String all = join("/","S", "?");
    }
}
