public class Literatura {
    //Se crea los atributos
    String nombre_libro;
    String autor;
    String editorial;
    int anio;
    int paginas;
    String protagonista;

    //Constructor
    public Literatura(String autor, String editorial, int anio, int paginas, String protagonista, String nombre_libro) {
        this.nombre_libro = nombre_libro;
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
        this.paginas = paginas;
        this.protagonista = protagonista;
    }

    //Metodos
    //Getters y Setters
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getProtagonista() {
        return protagonista;
    }

    public void setProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public String getNombre_libro() {
        return nombre_libro;
    }

    public void setNombre_libro(String nombre_libro) {
        this.nombre_libro = nombre_libro;
    }
}
