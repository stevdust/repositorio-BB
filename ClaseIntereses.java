package hipotecas;

public class ClaseIntereses extends ClaseMenu {

    int interes10, interes20, porciento, vivienda;

    @Override
    public void RealizarCalculo() {
        porciento = getPorcentaje();
        vivienda = getCostoVivienda();
        interes10 = (vivienda * porciento / 100) * 10;
        interes20 = (vivienda * porciento / 100) * 20;
        System.out.println("Intereses a 10 años " + interes10 + " Intereses a 20 años " + interes20);

    }

}
