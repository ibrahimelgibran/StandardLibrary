package iegcode.standard.classes;

import java.util.StringJoiner;

public class StringJoinerApp {
    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner(", ", "[",  "]");

        joiner.add("Ibrahim");
        joiner.add("El");
        joiner.add("Gibran");

        String value = joiner.toString();
        System.out.println(value);
    }
}
