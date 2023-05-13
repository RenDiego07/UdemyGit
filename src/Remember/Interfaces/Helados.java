package Remember.Interfaces;

public class Helados extends Comida{
    private String sabor;
    @Override
    public String toString(){
        String texto = super.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(texto).append(sabor);
        return sb.toString();

    }
}
