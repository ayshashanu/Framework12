package day15;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DynamicPath {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();
        System.out.println(System.getProperty("user.dir"));
        properties.load(new FileInputStream("C:\\Users\\ELCOT\\IdeaProjects\\EY-Training\\src\\main\\java\\day13\\global.properties"));
        System.out.println(properties.getProperty("environment"));
    }
}

