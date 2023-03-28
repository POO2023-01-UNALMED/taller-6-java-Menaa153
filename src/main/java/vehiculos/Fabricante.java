package vehiculos;
import java.util.HashMap;
import java.util.Map;

public class Fabricante {
    private String nombre;
    private Pais pais;
    private static Map<Fabricante, Integer> ventasPorFabricante = new HashMap<>();

    public Fabricante(String nombre, Pais pais){
        this.nombre=nombre;
        this.pais=pais;
    }
    
    public String getNombre(){
        return nombre;
    }

    public void setNOmbre(String nombre){
        this.nombre=nombre;
    }

    public Pais getPais(){
        return pais;
    }

    public void setPais(Pais pais){
        this.pais=pais;
    }

    public static void registrarVenta(Fabricante fabricante) {
        if (ventasPorFabricante.containsKey(fabricante)) {
            ventasPorFabricante.put(fabricante, ventasPorFabricante.get(fabricante) + 1);
        } else {
            ventasPorFabricante.put(fabricante, 1);
        }
    }

    public static Fabricante fabricaMayorVentas() {
        Fabricante fabricanteMayorVentas = null;
        int mayorVentas = -1;
        for (Map.Entry<Fabricante, Integer> entry : ventasPorFabricante.entrySet()) {
            if (entry.getValue() > mayorVentas) {
                fabricanteMayorVentas = entry.getKey();
                mayorVentas = entry.getValue();
            }
        }
        return fabricanteMayorVentas;
    }

}
