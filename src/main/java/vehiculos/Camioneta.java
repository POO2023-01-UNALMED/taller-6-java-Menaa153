package vehiculos;

public class Camioneta extends Vehiculo {
    private boolean volco;

    public Camioneta(String placa, int puertas, String nombre, double precio, double peso, boolean volco, Fabricante fabricante) {
        super(placa, puertas, 90, nombre, precio, peso, "4X4", fabricante);
        this.volco = volco;
    }

    public boolean tieneVolco() {
        return volco;
    }

    public void setVolco(boolean volco) {
        this.volco = volco;
    }
}
