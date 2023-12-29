package iegcode.standard.classes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertisApp {
    public static void main(String[] args) {
        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));

            String host =  properties.getProperty("database.host");
            String port =  properties.getProperty("database.port");
            String username =  properties.getProperty("database.username");
            String password =  properties.getProperty("database.password");

            System.out.println(host);
            System.out.println(port);
            System.out.println(username);
            System.out.println(password);

        } catch (FileNotFoundException exception){
            System.out.println("File tidak ketemu");
        } catch (IOException exception){
            System.out.println("Gagal load data dari file");
        }

        try {
            Properties properties = new Properties();
            properties.put("name.first", "Ibrahim");
            properties.put("name.middle", "El");
            properties.put("name.last", "Gibran");

            properties.store(new FileOutputStream("name.properties"), "Konfigurasi Nama");
        } catch (FileNotFoundException exception){
            System.out.println("Error");
        } catch (IOException exception){
            System.out.println("Error menyimpan properties");
        }

    }
}
