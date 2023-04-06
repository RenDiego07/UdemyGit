package ClaseSystem;
import java.io.*;
import java.util.Properties;

public class AsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            FileInputStream lector = new FileInputStream("src/ClaseSystem/config.properties");
             Properties pro = new Properties(System.getProperties());
             pro.load(lector);
             System.setProperties(pro);
             System.getProperties().list(System.out);
        }catch(Exception e){
            System.out.println("no se encuentra el archivo");
        }
    }
}
