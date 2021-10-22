/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Classe Curso
 * @author guilh
 */
public class Curso {
    /**
     * Codigo do Curso
     */
    private int codigo;
    
    /**
     * Descrição do Curso
     */
    private String descricao;
    
    /**
     * Ementa do Curso
     */
    private String ementa;

    /**
     * Construtor Curso com codigo, descrição e ementa
     * @param codigo
     * @param descricao
     * @param ementa 
     */
    public Curso(int codigo, String descricao, String ementa) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.ementa = ementa;
    }

    /**
     * Construtor Curso vazio
     */
    public Curso(){}
    
    /**
     * Construtor Curso com descrição e ementa
     * @param descricao
     * @param ementa 
     */
    public Curso(String descricao, String ementa){
        this.descricao = descricao;
        this.ementa = ementa;
    }

    /**
     * Construtor Curso com codigo
     * @param idCurso 
     */
    public Curso(int idCurso) {
        this.codigo = idCurso;
    }
    
    /**
     * Recupera o codigo do Curso
     * @return o codigo do Curso
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Atribui o codigo ao Curso
     * @param codigo 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Recupera a descrição do Curso
     * @return a descrição do Curso
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * Atribui a descrição ao Curso
     * @param descricao 
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * Recupera a ementa do Curso
     * @return a ementa do Curso
     */
    public String getEmenta() {
        return ementa;
    }

    /**
     * Atribui a ementa ao Curso
     * @param ementa 
     */
    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
    
    
}
