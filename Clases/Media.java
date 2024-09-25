import java.time.LocalDate;
import java.util.ArrayList;


public abstract class Media {
    protected String titulo;
    protected String descrpcion;
    protected ArrayList<String> categorias;
    protected LocalDate fechaLanzamiento;
    protected Restriccion_edad resEdad;
    protected double puntaje;
}

