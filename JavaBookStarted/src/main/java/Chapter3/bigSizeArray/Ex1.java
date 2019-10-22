package Chapter3.bigSizeArray;

public class Ex1 {
    public static void main(String[] args) {
        int [][] balances = new int [5][5];

        for (int i = 0; i < balances.length; i++){
            for (int j = 0; j < balances[i].length; j++){
                balances[i][j] = j+1;
            }
        }

        for (int i = 0; i <balances.length; i++){
            for (int j = 0; j < balances[0].length; j++){
                System.out.print(" " + balances[i][j] + " ");

            }
            System.out.println();
        }
    }
}
