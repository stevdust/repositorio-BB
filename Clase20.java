
package hipotecas;


public class Clase20 extends ClaseMenu{
    int valor,porcentaje;
    @Override
    public void RealizarCalculo(){
        operacionTemporal = getCostoVivienda();
        porcentaje = getPorcentaje();
        valor = (operacionTemporal * porcentaje / 100) * 20;
        costoTotal = (operacionTemporal + valor)/240;
        System.out.println("El costo vivienda para pagar en 20 años " + costoTotal);

    }
}
