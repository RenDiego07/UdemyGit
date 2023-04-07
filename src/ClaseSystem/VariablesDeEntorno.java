package ClaseSystem;
import java.util.*;
public class VariablesDeEntorno {
    public static void main(String[] args) {
        // un  mapa en java es un arreglo asociativo que asocia valores que estan guardados con un nombre
        // llave y valor "diccionario"
        // podemos crear variables ambiente, tmb podemos crear nuestras propias variables ambiente en el sistema operativo
        Map <String, String> varEnv = System.getenv();
        System.out.println("variables de ambiente del sistema = " + varEnv);
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);
        // imprime texto en rojo
        System.err.println("soy chingon");

        // tmb se puede acceder por medio del objeto Map
        System.out.println(varEnv.get("Path"));
// se pueden crear variables de entorno por medio de ir a windows bsucador y variables de entorno
        retorna_un_set:
        for(String key : varEnv.keySet()){

            System.out.println("varEnv.get(key) = " + varEnv.get(key));
        }
    }
}
