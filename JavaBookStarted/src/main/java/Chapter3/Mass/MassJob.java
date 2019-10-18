package Chapter3.Mass;

public class MassJob {
    public static void main(String[] args) {
        int [] mass = new int[100];

        for ( int i = 0; i < 100; i++){
            mass[i] = i;
        }

        String [] names = new  String[10];
        for (int i = 0; i < 10; i++){
            names[i] = "";
        }

        for (int elment : mass) System.out.println(elment);
    }
}
