/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;
import java.util.ArrayList;
import exceptions.LivroIndisponivelException;
import model.Livro;
import model.Usuario;
/**
 *
 * @author brandoon
 */
public class BibliotecaService {
    
    private ArrayList<Livro> livros;
    
    public BibliotecaService(){
    
        livros = new ArrayList<>();
    
    }
    
     public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void listarLivrosDisponiveis() {

        System.out.println("\nLivros disponíveis:");

        for (Livro livro : livros) {

            if (livro.isDisponivel()) {
                System.out.println("- " + livro.getTitulo() + " - " + livro.getAutor());
            }

        }
    }

    public void emprestarLivro(Livro livro, Usuario usuario)
            throws LivroIndisponivelException {

        if (!livro.isDisponivel()) {
            throw new LivroIndisponivelException(
                    "O livro \"" + livro.getTitulo() + "\" não está disponível.");
        }

        livro.setDisponivel(false);

        System.out.println(usuario.getNome()
                + " realizou o empréstimo do livro "
                + livro.getTitulo());
    }

    public void devolverLivro(Livro livro) {

        livro.setDisponivel(true);

        System.out.println("Livro "
                + livro.getTitulo()
                + " devolvido com sucesso.");
    }
    
}
