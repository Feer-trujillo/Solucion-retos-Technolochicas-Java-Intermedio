public class Video extends MaterialCurso{
    private final int duracion ;



    public Video(String titulo, String autor , int duracion){
        super (titulo, autor );
        this.duracion = duracion ;
    }


    public int getDuracion (){ return duracion; }


    @Override
    public void mostrarDetalles() {
        System.out.println("🎥 Video: " + getTitulo() + " - Autor: " + getAutor() + " - Duración: " + duracion + " min");

    }

}