package classes;

public class StringBuilderApp {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Denar");
        builder.append(" ");
        builder.append("Ahmaron");

        String name = builder.toString();
        System.out.println(name);
    }
}
