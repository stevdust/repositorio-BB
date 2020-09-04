package hipotecas;

public class ClaseCostoTotal extends ClaseMenu {

    int porcentaje;
    int valor;

    @Override
    public void RealizarCalculo() {

        System.out.println("Introdusca años para cancelar ");
        CostoTotal();
        operacionTemporal = getCostoVivienda();
        porcentaje = getPorcentaje();
        valor = (operacionTemporal * porcentaje / 100) * años;
        costoTotal = operacionTemporal + valor;
        System.out.println("El costo vivienda para pagar en un año " + costoTotal);

    }
}
