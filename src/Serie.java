public class Serie extends Plataforma {
    private int cantEpisodios;
    private int cantTemporadas;
    private boolean finalizada = false;


    public Serie (int cantEpisodios, int cantTemporadas, boolean finalizada, String titulo, int lanzamiento, Director director) {
        super( titulo, lanzamiento, director);
        this.cantEpisodios = cantEpisodios;
        this.cantTemporadas = cantTemporadas;
        this.finalizada = finalizada;

    }

    public int getCantEpisodios(){

        return this.cantEpisodios;
    }

    public void setCantEpisodios(int cantEpisodios) {

        this.cantEpisodios = cantEpisodios;
    }

    public int getCantTemporadas(){

        return this.cantTemporadas;
    }

    public void setCantTemporadas(int cantTemporadas){

        this.cantTemporadas = cantTemporadas;
    }

    public boolean getFinalizada() {

        return this.finalizada;
    }

    public void setFinalizada( boolean finalizada){

        this.finalizada = finalizada;
    }

    public String categoria(){

        if(this.cantTemporadas == 1 && this.finalizada == true){
            return "Miniserie";
        }
        else {
            return "Serie normal";
        }
    }

    @Override
    public int duracionTotal() {
        return this.cantEpisodios + this.cantTemporadas;
    }
}


