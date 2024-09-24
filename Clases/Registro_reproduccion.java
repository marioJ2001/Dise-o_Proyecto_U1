import java.util.ArrayList; 

public class Registro_reproduccion {
    private ArrayList<Instancia_pelicula> visto_Pelicula;
    private ArrayList <Instancia_episodio> visto_Episodio;


    //Metodos
    public void guardar_pelicula(Instancia_pelicula _instancia_pelicula){
        this.visto_Pelicula.add(_instancia_pelicula);
    }
    
    public void guardar_episodio(Instancia_episodio _instancia_episodio){
        this.visto_Episodio.add(_instancia_episodio);
    }

    public void setter_ultimo_episodio(Instancia_episodio _episodio){
        for (int i=0; i < this.visto_Episodio.size(); i++ ) {
            if (this.visto_Episodio.get(i).getUltimo_visto()){
                this.visto_Episodio.get(i).setUltimo_visto(false);
            }
        }
        for (int i=0; i < this.visto_Episodio.size(); i++ ) {
            if (this.visto_Episodio.get(i) == _episodio){
                this.visto_Episodio.get(i).setUltimo_visto(true);
            }
        }
    }

    public Episodio busca_ultimo_episodio(){
        for (int i=0; i < this.visto_Episodio.size(); i++ ) {
            if (this.visto_Episodio.get(i).getUltimo_visto()){
                return this.visto_Episodio.get(i).getEpisodio();
            }
        }
        return null;
    }
}
