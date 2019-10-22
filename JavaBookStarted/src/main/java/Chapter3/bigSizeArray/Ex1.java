package Chapter3.bigSizeArray;

public class Ex1 {
    public static void main(String[] args) {
        int [][] balances = new int [5][5];

        for (int i = 0; i < balances.length; i++){
            for (int j = 0; j < balances.length; j++){
               balances[i][0] = 5;
                balances[0][j] =  3;
            }
        }

        for (int i = 0; i <2; i++){
            for (int j = 0; j < 2; j++){
                System.out.print(" " + balances[i][j] + " ");

            }
            System.out.println();
        }
    }
}
