import java.util.ArrayList; 

public class Registro_reproduccion {
    private ArrayList<Instancia_pelicula> visto_Pelicula;
    private ArrayList <Instancia_episodio> visto_Episodio;

    public Registro_reproduccion(){
        this.visto_Episodio = new ArrayList<>();
        this.visto_Pelicula = new ArrayList<>();
    }
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

    public void eliminar_instancia_pelicula(Pelicula _pelicula){
        for(int i =0; i< this.visto_Pelicula.size(); i++){
            if (this.visto_Pelicula.get(i).getPelicula() == _pelicula){
                this.visto_Pelicula.remove(i);
            }
        }
    }

    public void eliminar_instancia_serie (Serie _Serie){
        for(int i =0; i< this.visto_Episodio.size(); i++){
            for (int j = 0; j < _Serie.getTemporadas().size(); j++){
                for (int k = 0; k < _Serie.getTemporadas().get(j).getEpisodio().size(); k++){
                    if(_Serie.getTemporadas().get(j).getEpisodio().get(k) == this.visto_Episodio.get(i).getEpisodio()){
                        this.visto_Episodio.remove(i);
                    }
                }
            }
        }
    }
}
