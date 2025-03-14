package Model.Objetos;

public class Textil extends Producte{

    String composicionTextil;

    protected Textil(float precio, String nombre, String codgioBarras, String composicionTextil) {
        super(precio, nombre, codgioBarras);
        this.composicionTextil = composicionTextil;
    }

    public String getComposicionTextil() {
        return composicionTextil;
    }

    public void setComposicionTextil(String composicionTextil) {
        this.composicionTextil = composicionTextil;
    }

    @Override
    public float calcularPrecio() {
        return precio;
    }
}
