package JavaObjetos;

public enum Color {
    ROJO("Rojo"),
    AZUL("Azul"),
    NARANJA("Naranja"),
    ROSA("Rosa");
    public final String color;

    public String getColor() {
        return color;
    }

    Color(String color){
        this.color= color;
    }
    @Override
    public String toString(){
        return this.color;
    }

}
