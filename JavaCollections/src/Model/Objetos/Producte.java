package Model.Objetos;

public abstract class Producte {
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

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setCodgioBarras(String codgioBarras) {
        this.codgioBarras = codgioBarras;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
