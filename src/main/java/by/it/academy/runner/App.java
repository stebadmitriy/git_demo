package by.it.academy.runner;

import by.it.academy.printing.PrintService;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Properties properties = new Properties();
        try(InputStream stream = App.class.getClassLoader().getResourceAsStream("config.properties")){
           properties.load(stream);

           for (Map.Entry<Object, Object> property: properties.entrySet()){
               System.out.println("property = " + property);
           }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
