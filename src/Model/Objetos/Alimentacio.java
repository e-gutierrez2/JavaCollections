package Model.Objetos;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class Alimentacio extends Producte {

    String fechaCaducidad;

    protected Alimentacio(float precio, String nombre, String codgioBarras, String fechaCaducidad) {
        super(precio, nombre, codgioBarras);
        this.fechaCaducidad = fechaCaducidad;
    }

    private LocalDate convertirFecha(String fecha){
        DateTimeFormatter fomato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            return LocalDate.parse(fecha,fomato);
        }
        catch (DateTimeException e){
            return LocalDate.now().plusDays(7);
        }
    }

    @Override
    public float calcularPrecio(){
       LocalDate dataCaducidad = convertirFecha(fechaCaducidad);
       int diasCaducidad = Period.between(dataCaducidad,LocalDate.now()).getDays();
       return (float) (precio - precio * ((double) 1 / (diasCaducidad + 1) + (precio * 0.1)));
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
}
