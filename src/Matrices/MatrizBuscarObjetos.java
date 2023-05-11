package Matrices;

public class MatrizBuscarObjetos {
    public static void main(String[] args) {
        Estudiante [][] grupo = new Estudiante[2][2];
        grupo[0][0] = new Estudiante("Diego",0,20);
        grupo [0][1] = new Estudiante("jaime",0,21);
        grupo[1][0] = new Estudiante("Ricardo",0,27);
        grupo[1][0] = new Estudiante("Dome",0,24);
        for(int x = 0; x< grupo.length; x++){
            System.out.println("Grupo "+ (x+1));
            for( int y = 0; y<grupo[x].length; y++){
                System.out.println(grupo[x][y]);
            }
        }
        System.out.println("Descubrir cuantos Diegos hay en cada equipo");
        int equipo1,equipo2;
        equipo1= 0;
        equipo2 =0;
        for(int x = 0; x< grupo.length; x++){
            for(Estudiante e: grupo[x]){
                if(x == 0){
                    if(e.equals(new Estudiante("Diego",0,0))){
                        equipo1++;
                    }
                }
                if(x ==1){
                    System.out.println(e.nombre);
                }
            }

         }
        System.out.println("En el equipo 1 hay "+ equipo1 +" Diegos");
        System.out.println("En el equipo 2 hay "+ equipo2 +" Diegos");
        }

    }

