public abstract class Plataforma {
    private String titulo;
    private int lanzamiento = 0;
    private Director director;

    public Plataforma(String titulo, int lanzamiento, Director director, String directorNombre, String nacionalidad) {
        this.titulo = titulo;
        this.lanzamiento = lanzamiento;
        this.director.nombre = directorNombre;
        this.director.nacionalidad = director.nacionalidad;
    }


    public String getTitulo() {
        return titulo;
    }
    public void setTtitulo(String titulo){
        this.titulo = titulo;
    }

    public int getLanzamiento(){

        return  this.lanzamiento;
    }

    public void setLanzamiento(int lanzamiento){
        this.lanzamiento = lanzamiento;
    }

    public Director getDirector(){

        return this.director;
    }



    public abstract int duracionTotal();

    public abstract  String categoria();

}
