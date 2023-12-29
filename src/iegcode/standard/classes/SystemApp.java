package iegcode.standard.classes;

public class SystemApp {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        System.out.println(System.nanoTime());

        System.out.println(System.getenv("HOME"));

        System.gc();

        System.exit(0);

        System.out.println("Hi");
    }
}
