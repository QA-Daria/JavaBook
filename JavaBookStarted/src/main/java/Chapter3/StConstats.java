package Chapter3;

/**
 * Использование статической константы
 */
public class StConstats {
    public static final double CM_SPER = 2.55;

    public static void main(String[] args) {
        double paperWidt = 8.5;
        System.out.println("Paper sixe: "+paperWidt* CM_SPER);

        outMet();
    }

    public static void outMet(){
        System.out.println(CM_SPER);

    }
}
