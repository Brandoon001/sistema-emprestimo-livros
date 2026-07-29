/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author brandoon
 */
public class Livro {
    
    private String titulo;
    private String autor;
    private boolean disponivel;
    
    public Livro(String titulo, String autor){
    
        this.autor = autor;
        this.titulo = titulo;
        this.disponivel = true;
        
    }
    
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }
    
    public void setDisponivel(boolean disponivel){
    
        this.disponivel = disponivel;
    
    }
    
}
