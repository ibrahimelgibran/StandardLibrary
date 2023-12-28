package iegcode.standard.classes;

public class NumberApp {
    public static void main(String[] args) {

        Integer intValue = 10;

        long longValue = intValue.longValue();
        Double doubleValue = ((Long) longValue).doubleValue(); // Corrected line
        Short shortValue = doubleValue.shortValue();

        String contoh = "1000";

        Double contohInt = Double.valueOf(contoh);
        System.out.println(contohInt);
    }
}
