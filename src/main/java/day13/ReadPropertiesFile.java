package day13;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {
    public static void main(String[] args) throws IOException {
        Properties properties=new Properties();
        properties.load(new FileInputStream("C:\\Users\\ELCOT\\IdeaProjects\\EY-Training\\src\\main\\java\\day13\\global.properties"));
        System.out.println("environment");
    }
}
