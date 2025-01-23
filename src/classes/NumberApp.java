package classes;

public class NumberApp {
    public static void main(String[] args) {
        Integer intValue = 10;

        Long longValue = intValue.longValue();
        Double doubleValue = intValue.doubleValue();

        String contoh = "1000";
        String contoh2 = "20.00";

        int contohInt = Integer.parseInt(contoh);
        Integer contohInteger = Integer.valueOf(contoh);

        Double contohDouble = Double.valueOf(contoh2);

        System.out.println(contohInt);
        System.out.println(contohInteger);
        System.out.println(contohDouble);
    }
}
