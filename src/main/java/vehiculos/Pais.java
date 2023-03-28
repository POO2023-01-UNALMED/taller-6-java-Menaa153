package vehiculos;

import java.util.HashMap;
import java.util.Map;

public class Pais {
    private String nombre;
    private int unidadesVendidas;
    private static Map<String, Integer> ventasPorPais=new HashMap<>(); // mapa de ventas por pais

    public Pais(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getUnidadesVendidas(){
        return unidadesVendidas;
    }

    public static void registrarVenta(String país) {
        ventasPorPais.put(país, ventasPorPais.getOrDefault(país, 0) + 1); // registrar venta para el país
    }

    public static String paisMasVendedor() {
        String paísMasVendedor = null;
        int unidadesVendidas = 0;
        for (Map.Entry<String, Integer> venta : ventasPorPais.entrySet()) {
            if (venta.getValue() > unidadesVendidas) {
                unidadesVendidas = venta.getValue();
                paísMasVendedor = venta.getKey();
            }
        }
        return paísMasVendedor;
    }
}


