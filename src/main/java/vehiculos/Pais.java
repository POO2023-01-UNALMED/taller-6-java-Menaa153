package vehiculos;

import java.util.HashMap;
import java.util.Map;


public class Pais {
    private String nombre;
    private int unidadesVendidas;
    static Map<Pais, Integer> ventasPorPais=new HashMap <Pais, Integer>(); // mapa de ventas por pais

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

    public static Pais paisMasVendedor() {
        Pais paisMasVendedor = null;
        int unidadesVendidas = -1;
        for (Map.Entry<Pais, Integer> entry : ventasPorPais.entrySet()) {
            if (entry.getValue() > unidadesVendidas) {
                unidadesVendidas = entry.getValue();
                paisMasVendedor = entry.getKey();
            }
        }
        return paisMasVendedor;
    }
}


