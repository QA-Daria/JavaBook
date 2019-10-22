package Chapter3.Mass;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryDrawing {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers do you need to draw? ");
        int k = in.nextInt();

        System.out.println("What is the highest number you can draw? ");
        int n = in.nextInt();

        int [] massNum = new int[n];

        for (int i = 0; i < massNum.length; i++){
            massNum[i] = i + 1;
        }

        int [] resultMass = new int[k];
        for (int i = 0; i < resultMass.length; i++){
            int r = (int)(Math.random()* n);

            resultMass[i] = massNum[r];
            massNum[r] = massNum[n-1];
            n--;
        }
        Arrays.sort(resultMass);
        System.out.println("Bet the following combination. It'll make you rich!");

        for (int r : resultMass) System.out.println(r);
    }
}
