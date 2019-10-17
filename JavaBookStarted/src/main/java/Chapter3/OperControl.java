package Chapter3;

public class OperControl {
    public static void main(String[] args) {
        int yoir = 4;
        int target = 5;
        String performance = "";
        int bonus = 0;

        if (yoir >= target){
            performance = "Satisfactory";
            bonus = 100;
        }
        else System.out.println("Упс");

        while (yoir < target){
            yoir+=target;
            yoir++;
        }
    }
}
