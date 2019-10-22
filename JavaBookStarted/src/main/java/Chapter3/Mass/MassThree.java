package Chapter3.Mass;

import java.util.Arrays;

public class MassThree {

    public static void main(String[] args) {

        int [] mass = {1, 2, 4};
        Arrays.fill(mass, 4);

        for (int i:mass){
            System.out.println(i);
        }
    }
}
