
package hipotecas;

public class Clase10 extends ClaseMenu{
    int valor,porcentaje;
    
    @Override
    public void RealizarCalculo(){
        operacionTemporal = getCostoVivienda();
        porcentaje = getPorcentaje();
        valor = (operacionTemporal * porcentaje / 100) * 10;
        costoTotal = (operacionTemporal + valor)/120;
        System.out.println("El costo vivienda para pagar en 10 años " + costoTotal);

    }
    
}
