package Model.Objetos;

public class Electronica extends Producte{

    protected int diesGarantia;

    protected Electronica(float precio, String nombre, String codgioBarras, int diesGarantia) {
        super(precio, nombre, codgioBarras);
        this.diesGarantia = diesGarantia;
    }

    @Override
    public float calcularPrecio() {
       return precio = (float) (precio + precio+(diesGarantia/365) * 0.1);
    }

    public int getDiesGarantia() {
        return diesGarantia;
    }

    public void setDiesGarantia(int diesGarantia) {
        this.diesGarantia = diesGarantia;
    }
}
