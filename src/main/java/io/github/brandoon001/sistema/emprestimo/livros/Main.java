/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package io.github.brandoon001.sistema.emprestimo.livros;
import io.github.brandoon001.sistema.emprestimo.livros.exceptions.LivroIndisponivelException;
import io.github.brandoon001.sistema.emprestimo.livros.model.Aluno;
import io.github.brandoon001.sistema.emprestimo.livros.model.Livro;
import io.github.brandoon001.sistema.emprestimo.livros.model.Professor;
import io.github.brandoon001.sistema.emprestimo.livros.service.BibliotecaService;
/**
 *
 * @author brandoon
 */
public class Main {

    public static void main(String[] args) {
        
        BibliotecaService biblioteca = new BibliotecaService();

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("O Pequeno Príncipe", "Antoine de Saint-Exupéry");
        Livro livro3 = new Livro("Java Como Programar", "Deitel");

        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLivro(livro3);

        Aluno aluno = new Aluno("João", "joao@email.com");
        Professor professor = new Professor("Carlos", "carlos@email.com");

        biblioteca.listarLivrosDisponiveis();

        try {

            biblioteca.emprestarLivro(livro1, aluno);

            biblioteca.emprestarLivro(livro1, professor);

        } catch (LivroIndisponivelException e) {

            System.out.println("\nErro: " + e.getMessage());

        }

        biblioteca.devolverLivro(livro1);

        try {

            biblioteca.emprestarLivro(livro1, professor);

        } catch (LivroIndisponivelException e) {

            System.out.println(e.getMessage());

        }

        biblioteca.listarLivrosDisponiveis();

        
    }
}
