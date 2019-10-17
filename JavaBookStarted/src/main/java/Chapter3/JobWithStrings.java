package Chapter3;

public class JobWithStrings {
    public static void main(String[] args) {
        String greeting = "Hello!";
        "Hello!".equals(greeting);
        "HeLo".equalsIgnoreCase("helo");

        if (greeting.equals("Hello!")){
            System.out.println("One true");
        }
        if (greeting.substring(0,3)=="Hel"){
            System.out.println("This true");
        }
        else System.out.println("This lie");

        if (greeting.length()==0){
            System.out.println("This string null");
        }
        if (greeting.equals("")){
            System.out.println("This string null");
        }
        else System.out.println("This string not null");

        System.out.println("-----------------");

        int n = greeting.length();
        double d = greeting.length();

        int cpCount = greeting.codePointCount(0, greeting.length());
        System.out.println(n);
        System.out.println(d);
        System.out.println(cpCount);

        char first = greeting.charAt(2);
        System.out.println(first);

        //Upper/Lover

        String uppGret = greeting.toUpperCase();
        System.out.println(uppGret);
        String lowUppGr = uppGret.toLowerCase();
        System.out.println(lowUppGr);

        String kotik =  "  Ya Kotik    ";
        System.out.println(kotik.trim());

        //Построение символьных строк

        char ch = '!';
        String str = "Hello";

        StringBuilder builder = new StringBuilder();
        builder.append(ch);
        builder.append(str);
        String complite  = builder.toString();
        System.out.println(complite);



    }
}
