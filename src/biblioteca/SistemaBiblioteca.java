package biblioteca;

import java.util.List;

public interface SistemaBiblioteca {
    List<Livro> buscarLivro(List<Livro> e, String nome);

    void cadastrarLivro(String titulo, String genero, String autor, int quantidade);

    String pegarLivro(List<Livro> e, String livro);
}
