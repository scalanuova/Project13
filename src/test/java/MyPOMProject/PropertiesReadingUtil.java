package MyPOMProject;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReadingUtil {
    private static Properties properties = new Properties();
    static {
        String pathForPropertiesFile="configuration.properties";
        try{
            FileInputStream fileInputStream = new FileInputStream(pathForPropertiesFile);
            properties.load(fileInputStream);
        } catch (IOException e){
            e.printStackTrace();
            System.out.println("Properties file could not be find");
        }
    }
    public static String getProperties(String keyword){
        return  properties.getProperty(keyword);
    }
}
