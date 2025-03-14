package Model.Objetos;

public class Producte {
    protected float precio;
    protected String nombre;
    protected String codgioBarras;

    protected Producte(float precio, String nombre, String codgioBarras){
        this.precio = precio;
        this.nombre = nombre;
        this.codgioBarras = codgioBarras;
    }

    public abstract float calcularPrecio();

    protected float getPrecio(){
        return precio;
    }

    protected String getNombre(){
        return nombre;
    }

    protected String getCodgioBarras(){
        return codgioBarras;
    }
}
