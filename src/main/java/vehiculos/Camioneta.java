package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;
    private static int cantidadCamionetas;

    public Camioneta(String placa, int puertas, String nombre, double precio, double peso, boolean volco, Fabricante fabricante) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
        cantidadCamionetas++;
    }

    public boolean tieneVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
    
    public static int getCantidadCamionetas(){
        return cantidadCamionetas;
    }

    public void setCantidadCamionetas(int cantidadCamionetas){
        Camioneta.cantidadCamionetas=cantidadCamionetas;
    }
}
