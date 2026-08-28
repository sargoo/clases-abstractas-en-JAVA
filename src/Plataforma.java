public abstract class Plataforma {
    private String titulo;
    private int lanzamiento = 0;
    private Director director;

    public Plataforma(String titulo, int lanzamiento, String Nombre , String Nacionalidad) {
        this.titulo = titulo;
        this.lanzamiento = lanzamiento;
        this.director = new Director(Nombre, Nacionalidad);
    }

    public String getTitulo() {
        return this.titulo;
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

    public String getDirectorNombre(){

        return this.director.getNombre();
    }

    @Override
    public String toString() {
        return "Plataforma{" +
                "titulo='" + titulo + '\'' +
                ", lanzamiento=" + lanzamiento +
                  director.toString() +
                '}';
    }





    public abstract int duracionTotal();

    public abstract  String categoria();

}
