package Chapter3;

/**
 * Глава переменные
 * Инициализация переменных
 * Константы
 */

public class Variables {
    public static void main(String[] args) {
        double salary;
        int vacationDay = 13;
        long earthPopulation;
        char yesChar;
        boolean done;

        Box box;

        System.out.println(vacationDay);
        final double CM_PER_INCH = 2.54;
        double paperWidth = 8.5;
        double PaperHeight = 11;

        System.out.println(StConstats.CM_SPER);

        System.out.println("Paper size in cm: "
        + paperWidth * CM_PER_INCH + " by "+PaperHeight * CM_PER_INCH);
    }
}
