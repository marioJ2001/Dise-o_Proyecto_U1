import java.util.ArrayList;

public class Serie extends Media{
    private String titulo;
    private ArrayList<Temporada> Temporadas;

    public Serie(String titulo, Restriccion_edad resEdad) {
        Temporadas = new ArrayList<>();
        this.titulo = titulo;
        this.resEdad = resEdad;
    }

    public ArrayList<Temporada> getTemporadas(){
        return this.Temporadas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void addTemporada(Temporada temporada){
        Temporadas.add(temporada);
    }

    public Restriccion_edad getResEdad(){
        return this.resEdad;
    }
}
