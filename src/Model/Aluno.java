/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Classe Aluno
 * @author guilh
 */
public class Aluno {
    
    /**
     * Codigo de indentificação do aluno
     */
    private int codigo;
    
    /**
     * Nome do aluno
     */
    private String nome;

    /**
     * Construtor Aluno com codigo e nome
     * @param codigo
     * @param nome 
     */
    public Aluno(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    /**
     * Construtor Aluno vazio
     */
    public Aluno(){
        
    }
    
    /**
     * Construtor Aluno com nome
     * @param nome 
     */
    public Aluno(String nome){
        this.nome = nome;
    }
    
    /**
     * Construtor Aluno com codigo
     * @param codigo 
     */
    public Aluno(int codigo){
        this.codigo = codigo;
    }
    
    /**
     * Recupera o codigo do aluno
     * @return codigo do Aluno
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Atribui codigo ao Aluno
     * @param codigo 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Recupera o nome do Aluno
     * @return o nome do Aluno
     */
    public String getNome() {
        return nome;
    }

    /**
     * Atribui o nome ao Aluno
     * @param nome 
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
