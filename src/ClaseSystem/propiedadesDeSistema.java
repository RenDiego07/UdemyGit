package ClaseSystem;

import java.util.Properties;

public class propiedadesDeSistema {
    public static void main(String[] args) {
        // si quiere obtener el nombre del usuario del sistem operativo
        // para hacer uso de los metodos estaticos de la clase System se debe de ingresar una clave
        // esta clave esta dada en la documentación de oracle
        // link ---> https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html
        String username = System.getProperty("user.name");

        System.out.println(username);
        String hombe = System.getProperty("user.home");
        String workSpae = System.getProperty("user.dir");
        String javaVersion = System.getProperty("java.version");
        String lineSeparator = System.getProperty("line.separator");
        System.out.println(hombe);

        System.out.println(workSpae);

        System.out.println(javaVersion);
        System.out.println(lineSeparator);

        Properties pro = System.getProperties();
        pro.list(System.out);
    }
}
