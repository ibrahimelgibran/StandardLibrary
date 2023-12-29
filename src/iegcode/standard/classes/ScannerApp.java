package iegcode.standard.classes;

import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name : ");
        String name = scanner.nextLine();

        System.out.print("Umur : ");
        Integer age = scanner.nextInt();

        System.out.println("Hello " + name + " Umur ada adalah " + age + " Tahun");
    }
}
