public abstract class MaterialCurso {

    private final String titulo ;
    private final String autor ;



    public MaterialCurso (String titulo, String autor ){
        this.titulo = titulo ;
        this.autor = autor;
    }

    public String getTitulo(){return titulo; }
    public String getAutor (){return autor;  }


    public abstract void mostrarDetalles();

    public void mostrarDetalle() {
    }
}
