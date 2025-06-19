public  class Articulo extends MaterialCurso {
    private final int palabras;

    public Articulo(String titulo, String autor, int palabras) {
        super(titulo, autor);
        this.palabras = palabras;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Artículo: " + getTitulo() + " - Autor: " + getAutor() + " - Palabras: " + palabras);
    }
}