package iegcode.standard.classes;

public class StringBuilderApp {
    public static void main(String[] args) {

        StringBuilder builder =  new StringBuilder();
        builder.append("Ibrahim");
        builder.append(" ");
        builder.append("El");
        builder.append(" ");
        builder.append("Gibran");

        String name = builder.toString();
        System.out.println(name);
    }
}
