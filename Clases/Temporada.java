import java.time.LocalDate;
import java.util.ArrayList;

public class Temporada {
    private int numero;
    private LocalDate lanzamiento;
    private ArrayList<Episodio> episodio;
    
    //Constructor
    public Temporada(int numero, LocalDate lanzamiento) {
        this.numero = numero;
        this.lanzamiento = lanzamiento;
        episodio = new ArrayList<>();
    }

    //Getters
    public int getNumero() {
        return numero;
    }
    public LocalDate getLanzamiento() {
        return lanzamiento;
    }
    public ArrayList<Episodio> getEpisodio() {
        return episodio;
    }
    
    //Setters
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public void setLanzamiento(LocalDate lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public void addEpisodio(Episodio episodio){
        this.episodio.add(episodio);
    }
}
