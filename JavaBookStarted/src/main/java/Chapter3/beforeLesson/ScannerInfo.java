package Chapter3.beforeLesson;

import java.io.Console;
import java.util.Scanner;

public class ScannerInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?" );
        String name = in.nextLine();
        System.out.println(name);
        String firstName = in.next();
        System.out.println(firstName);

        System.out.println("How old are you? ");
        int age = in.nextInt();
        System.out.println(age);

    }
}
