package biblioteca;

import java.util.List;

public class Livro {
    private String titulo;
    private String genero;
    private String autor;
    private int quantidade;

    public Livro() {}

    public Livro(String titulo, String genero, String autor, int quantidade) {
        this.titulo = titulo;
        this.genero = genero;
        this.autor = autor;
        this.quantidade = quantidade;
    }

    public boolean temDisponivel(List<Livro> e, String livroBuscado) {
        for (Livro l: e) {
            if (livroBuscado.equalsIgnoreCase(l.titulo) && l.quantidade < 0) {
                l.quantidade -= 1;
                return true;
            }
        }
        return false;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
