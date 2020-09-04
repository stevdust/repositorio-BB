package hipotecas;

public class ClasePrincipal  {
    public static void main(String[] args) {
        ClaseMenu msg=new ClaseCostoVivienda();
        msg.setCostoVivienda(50000);
        msg.setPorcentaje(18);
        msg.Operaciones();
        
      
    }
}
