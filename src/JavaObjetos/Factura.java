package JavaObjetos;

public class Factura {
    public final int idFactura;
    public static int ids = 1;
    public Factura(){
        this.idFactura =ids;
        ids++;
    }
    public int getIdFactura(){
        return this.idFactura;
    }

    public static void main(String[] args) {
        Factura f1 = new Factura();
        Factura f2 = new Factura();
        System.out.println(f1.getIdFactura());
        System.out.println(f2.getIdFactura());


    }
}
