package ClaseSystem;
import java.io.*;
import java.util.Properties;

public class AsignarPropiedadesDeSistema {
    public static void main(String[] args) {
        try {
            // cargamos el archivo
            FileInputStream archivo = new FileInputStream("src/ClaseSystem/config.properties");
            // cargamos las propiedades en el objeto properties "pro"
             Properties pro = new Properties(System.getProperties());
             // cargamos el archivo config.properties
            pro.setProperty("apellido", "Flores");
             pro.load(archivo);
             //ahora si se carga las nuevas configuraciones que hemos creado
             System.setProperties(pro);
             //
            Properties ps = System.getProperties();
            System.out.println(ps.getProperty("apellido"));


        }catch(Exception e){
            System.out.println("no se encuentra el archivo");
            //System.exit(1); --> no salimos del programa
            main(args); //---> volvemos a ejecutar el programa
            //System.gc() --> para liberar espacio
        }
    }
}
