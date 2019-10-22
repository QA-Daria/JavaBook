package Chapter3.beforeLesson;

import java.util.Scanner;

public class ForSwotch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Select an option 1, 2, 3 or 4");

        int choice = in.nextInt();

        switch (choice){
            case 1:{ System.out.println("Kotik 1");
                break;}
            case 2:{
                System.out.println("Kotik 2");
                break;
            }
            case 3:
                System.out.println("Kotik 3");
                break;
            default:
                System.out.println("Yps");
                break;


        }
    }
}
