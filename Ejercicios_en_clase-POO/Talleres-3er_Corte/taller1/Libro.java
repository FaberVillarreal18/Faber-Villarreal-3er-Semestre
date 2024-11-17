public class Libro {
    protected String titulo;
    protected String autor;
    protected int n_paginas;

    public Libro() {
        this.titulo="Desconocida";
        this.autor="desconocida";
        this.n_paginas=0;
    }

    public Libro(String autor, int n_paginas, String titulo) {
        this.autor = autor;
        this.n_paginas = n_paginas;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getN_paginas() {
        return n_paginas;
    }

    public void setN_paginas(int n_paginas) {
        this.n_paginas = n_paginas;
    }

    @Override
    public String toString() {
        return "Libro [titulo=" + titulo + ", autor=" + autor + ", n_paginas=" + n_paginas + "]";
    }
    
}
