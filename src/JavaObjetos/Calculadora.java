package JavaObjetos;

public class Calculadora {
    double sumar(float a, float b) {
        double total = 0;
        return total = a + b;
    }

    // argumentos es un array
    // tmb esto se lo puede considerar como una sobrecarga
    double sumar(float... argumentos) {
        double total = 0;
        iterandoLasNVariables:
        for (float valores : argumentos) {
            total += valores;
        }
        return total;
    }

}