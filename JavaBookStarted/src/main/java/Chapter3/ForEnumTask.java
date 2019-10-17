package Chapter3;
import java.lang.Enum;

public class ForEnumTask {
    enum Size {SMALL, MEDIUM, LARGE};
    public static void main(String[] args) {
       Size s = Size.LARGE;

        System.out.println(s);
    }
}
