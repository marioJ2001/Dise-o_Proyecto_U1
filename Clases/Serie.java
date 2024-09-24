import java.util.ArrayList;

public class Serie {
    private String titulo;
    private ArrayList<Temporada> Temporadas;

    public Serie(String titulo) {
        Temporadas = new ArrayList<>();
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void addTemporada(Temporada temporada){
        Temporadas.add(temporada);
    }
}
