package hipotecas;

import java.util.*;

public abstract class ClaseMenu {

    protected int costoTotal, mesualidad_diez, mensualidad_Veinte, interesPagar, años, operacionTemporal;
    private static int costoVivienda, porcentaje;

    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 1;
        int opcion = 1;
        do {
            System.out.println("1.- Costo Vicienda ");
            System.out.println("2.- Costo Total ");
            System.out.println("3.- Mensualidad a 10 Años ");
            System.out.println("4.- Mensualidad a 20 Años ");
            System.out.println("5.- Intereses a Cancelar ");
            System.out.println("0.- Finalizar ");
            System.out.print("  Seleccione la opcion ==> ");
            opcion = entrada.nextInt();
            if (opcion == 1) {
                ClaseMenu msg = new ClaseCostoVivienda();
                msg.RealizarCalculo();

            } else if (opcion == 2) {
                ClaseMenu msg = new ClaseCostoTotal();
                msg.RealizarCalculo();
            } else if (opcion == 3) {
                ClaseMenu msg = new Clase10();
                msg.RealizarCalculo();
            } else if (opcion == 4) {
                ClaseMenu msg = new Clase20();
                msg.RealizarCalculo();
            } else if (opcion == 5) {
                ClaseMenu msg=new ClaseIntereses();
                msg.RealizarCalculo();

            } else if (opcion == 0) {
                bandera = 0;
                System.out.println("Finaliza la aplicacion ");
            } else {
                System.out.println("La opcion seleccionada no es permitida .. ");
            }

        } while (bandera != 0);
    }

    public void CostoVivienda() {

    }

    public void InteresesCancelar() {

    }

    public void CostoTotal() {
        años = entrada.nextInt();
    }

    public abstract void RealizarCalculo();

    /**
     * @return the costoVivienda
     */
    public static int getCostoVivienda() {
        return costoVivienda;
    }

    /**
     * @param aCostoVivienda the costoVivienda to set
     */
    public static void setCostoVivienda(int aCostoVivienda) {
        costoVivienda = aCostoVivienda;
    }

    /**
     * @return the porcentaje
     */
    public static int getPorcentaje() {
        return porcentaje;
    }

    /**
     * @param aPorcentaje the porcentaje to set
     */
    public static void setPorcentaje(int aPorcentaje) {
        porcentaje = aPorcentaje;
    }

}
