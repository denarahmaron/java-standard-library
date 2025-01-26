package classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();

            properties.load(new FileInputStream("application.properties"));
            System.out.println(properties.getProperty("database.username"));
            System.out.println(properties.getProperty("database.password"));
            properties.put("hobby", "Coding");
            properties.store(new FileOutputStream("application.properties"), "add hobby");

        }catch (FileNotFoundException exception){
            System.out.println("File not found");
        }catch (IOException exception){
            System.out.println("Failed to load data");
        }

        try {
            Properties properties = new Properties();
            properties.put("name.first","Denar");
            properties.put("name.middle","Ahmaron");
            properties.put("name.last","Surya");

            properties.store(new FileOutputStream("name.properties"), "add name configuration");

        }catch (FileNotFoundException e){
            System.out.println("Failed to create a file");
        }catch (IOException e){
            System.out.println("Failed to save file");
        }
    }
}
