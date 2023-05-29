package TDAs;

public class Arroz implements comible{
    public String name ;
    public Arroz(String name){
        this.name = name;
    }
    @Override
    public void comer(comible e) {
        e = new Arroz("g");

    }
}
