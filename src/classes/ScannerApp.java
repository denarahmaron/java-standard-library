package classes;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nama : ");
        String name = scanner.nextLine();

        System.out.print("Age : ");
        int age = scanner.nextInt();

        System.out.println("Your name is : " + name + ", Your age : " + age);



    }
}
