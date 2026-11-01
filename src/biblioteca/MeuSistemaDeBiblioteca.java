package biblioteca;

import java.util.ArrayList;
import java.util.List;

public class MeuSistemaDeBiblioteca implements SistemaBiblioteca {
    List<Livro> livros = new ArrayList<>();

    @Override
    public void cadastrarLivro(String titulo, String genero, String autor, int quantidade) {
        Livro livro = new Livro(titulo, genero, autor, quantidade);
        livros.add(livro);
    }

    @Override
    public String pegarLivro(List<Livro> e, String livro) {
        Livro l = new Livro();
        boolean disponivel = l.temDisponivel(e, livro);
        if (disponivel) {
            return "Há livros disponíveis, pode levar!";
        }
        return "Não há livros com esse titulo disponíveis no momento!";
    }

    @Override
    public List<Livro> buscarLivro(List<Livro> e, String nome) {
        List<Livro> livrosBuscados = new ArrayList<>();
        for (Livro l : e) {
            if (l.getTitulo().equalsIgnoreCase(nome)) {
                livrosBuscados.add(l);
            }
        }
        if (livrosBuscados.isEmpty()) {
            System.out.println("Não foram encontrados livros com este titulo em nosso Sistema...");
        }

        return  livrosBuscados;
    }
}
