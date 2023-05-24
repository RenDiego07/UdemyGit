package Generics;

// se importan todos los metodos estaticos de la clase estudiante

import JavaObjetos.Calculadora;
import JavaObjetos.Color;
import JavaObjetos.Deportistas;
import JavaObjetos.Factura;

import static JavaObjetos.Estudiante.saludar;

public class Carro {
    public Color c1;
    public Factura f1;

    public Deportistas getDe() {
        return de;
    }

    public Deportistas de;
    public Carro(){

    }

    public Carro(Color c1) {
        this.c1 = c1;
    }
    public Carro(Deportistas de){
        this.de = de;
    }

    public Carro(Color d, Factura f){
        this.c1 = d;
        this.f1= f;
    }
    public Color getColor(){
        return this.c1;
    }
    @Override
    public boolean equals(Object e){

        if (this == e){
            return true;
        }else if( e != null && e instanceof Carro){
            Carro other = (Carro) e;
            if(this.c1.equals(other.c1))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Color.ROJO);
        Carro c1 = new Carro(Deportistas.FUTBOLISTA);
        Carro DiegosCar = new Carro(Color.NARANJA);
        Carro ScarletsCar= new Carro(Color.NARANJA);
        if(DiegosCar.equals(ScarletsCar)){
            System.out.println("we made it!");
        }
        System.out.println(DiegosCar.getColor());
        System.out.println(c1.getDe().getEdad());
        // conseguir todas las constantes
        for(Deportistas de: Deportistas.values()){
            System.out.println(de);
        }
        String hola = saludar();
        System.out.println(hola);
        Calculadora e = new Calculadora();


    }


}
