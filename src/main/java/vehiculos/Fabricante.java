package vehiculos;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;;


public class Fabricante {
    private String nombre;
    private Pais pais;
    private static Map<Fabricante, Integer> ventasPorFabricante=new HashMap<Fabricante, Integer>();

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

    public static Fabricante fabricaMayorVentas() {
        Fabricante fabricanteMayorVentas = null;
        int mayorVentas = -1;
        for (Entry<Fabricante, Integer> entry : ventasPorFabricante.entrySet()) {
            if (entry.getValue() > mayorVentas) {
                fabricanteMayorVentas = entry.getKey();
                mayorVentas = entry.getValue();
            }
        }
        return fabricanteMayorVentas;
    }

}
