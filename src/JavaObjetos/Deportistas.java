package JavaObjetos;

public enum Deportistas {
    NADADOR("HOMBRE",180,18),
    FUTBOLISTA("HOMBRE",170,18);

    private final String genero;
    private final int estatura;
    private final int edad;
    Deportistas(String genero, int estatura, int edad){
        this.genero = genero;
        this.estatura = estatura;
        this.edad = edad;

    }

    public String getGenero() {
        return genero;
    }

    public int getEstatura() {
        return estatura;
    }

    public int getEdad() {
        return edad;
    }
    @Override
    public String toString(){
        return this.genero +  " : " + this.estatura;
    }
}
