package vehiculos;
import java.util.HashMap;
import java.util.Map;


public class Fabricante {
    private String nombre;
    private Pais pais;
    static Map<Fabricante, Integer> ventasPorFabricante=new HashMap<Fabricante, Integer>(); // mapa de ventas por fabricante

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

        for (Map.Entry<Fabricante, Integer> entry : ventasPorFabricante.entrySet()) {

            if (entry.getValue() > mayorVentas) {

                mayorVentas = entry.getValue();
                fabricanteMayorVentas = entry.getKey();
            }
        }
        return fabricanteMayorVentas;
    }

}
