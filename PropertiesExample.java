import java.util.*;
import java.io.*;

public class PropertiesExample {
    public static void main(String[] args) throws IOException {
        Properties props = new Properties();

        // Set properties
        props.setProperty("username", "admin");
        props.setProperty("password", "12345");
        System.out.println("Properties: " + props);

        // Save to a file
        java.io.FileOutputStream out = new java.io.FileOutputStream("config.properties");
        props.store(out, "User Credentials");
        out.close();

        // Load from a file
        Properties newProps = new Properties();
        java.io.FileInputStream in = new java.io.FileInputStream("config.properties");
        newProps.load(in);
        in.close();
        System.out.println("Loaded Properties: " + newProps);

        // Print individual properties
        System.out.println("Username: " + newProps.getProperty("username"));
        System.out.println("Password: " + newProps.getProperty("password"));

        // Print via output stream
        newProps.list(System.out);
    }`
}