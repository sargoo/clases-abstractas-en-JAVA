public class Pelicula extends Plataforma {
    private int duracion = 0;
    private int duracionCreditos = 0;
    private String descripcion;


    public Pelicula(int duracion, int duracionCreditos,String descripcion, String titulo, int lanzamiento, Director director) {
        super(titulo, lanzamiento, new Director(director.nombre, director.nacionalidad));
        this.duracion = duracion;
        this.duracionCreditos = duracionCreditos;
        this.descripcion = descripcion;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getDuracionCreditos() {
        return duracionCreditos;
    }

    public void setDuracionCreditos(int duracionCreditos) {
        this.duracionCreditos = duracionCreditos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setDirectorNombre(String directorNombre){


    }

    public String categoria(){

        if(this.duracion >= 120){

            return "Version extendida";
        }
        else {
            return "version estandar";
        }
    }

    public String mostrarPelicula(){
        return "Titulo: " + super.getTitulo() + "\n"
                + "Duracion: " + this.duracion + " minutos \n"
                +"Duracion de los creditos: " + this.duracionCreditos + " minutos \n"
                + "Descripcion: " + this.descripcion + "\n"
                + "Lanzamiento: " + super.getLanzamiento() + "\n"
                + super.getDirector();
    }

    @Override
    public int duracionTotal() {
        return  this.duracion + this.duracionCreditos;
    }
}
