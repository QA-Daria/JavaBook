package Chapter3.Mass;

import java.util.Arrays;

public class MassTwo {
    public static void main(String[] args) {
        int [] smallPrimes = {2, 3, 4, 6, 7, 11};

       smallPrimes = new int[] {1, 3, 5};

       int [] lucky = smallPrimes;
       lucky[2] = 12;


       int [] neSort = {5, 3, 0};

        Arrays.sort(neSort);

        for (int i = 0; i < neSort.length; i++){

            System.out.println(neSort[i]);
        }

       int [] copieLucky = Arrays.copyOf(lucky, 2* lucky.length);
    }
}
