package Remember;

public class Estudiante {
    public String nombre;
    public int cedula;
    public int edad;
    public Estudiante(String nombre, int cedula, int edad){
        this.nombre = nombre;
        this.cedula = cedula;
        this.edad = edad;

    }
    @Override
    public boolean equals(Object e){

        if(e == this){
            return true;
        }else if(e != null && e instanceof Estudiante){
            Estudiante other= (Estudiante) e;
            if(other.nombre.equals(this.nombre)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Estudiante diego = new Estudiante("Diego",9,2);
        Estudiante Diego = new Estudiante("Diego",0,0);
        if(diego.equals(Diego)){
            System.out.println("sep");
        }
    }
}
