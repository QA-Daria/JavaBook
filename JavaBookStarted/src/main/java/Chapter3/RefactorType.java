package Chapter3;

public class RefactorType {
    public static void main(String[] args) {
        double x = 4.44;
        int nx = (int)x;

        System.out.println(nx);

        //округление до ближайшего целого

        int nnx = (int)Math.round(x);

        short sh = 1;
        int ish = (int)sh;
        System.out.println(ish);

        int init = 7;
        long linit = (long)init;

        System.out.println(linit);
    }
}
