package Chapter3.Mass;

import java.util.Arrays;

public class MassJob {
    public static void main(String[] args) {
        int [] mass = new int[100];

        for ( int i = 0; i < 100; i++){
            mass[i] = i;
        }
        Arrays.sort(mass);

        String [] names = new  String[10];
        for (int i = 0; i < 10; i++){
            names[i] = "";
        }

        for (int elment : mass) System.out.println(elment);
    }
}
