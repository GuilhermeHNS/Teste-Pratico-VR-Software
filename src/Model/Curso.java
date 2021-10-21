/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author guilh
 */
public class Curso {
    private int codigo;
    private String descricao;
    private String ementa;

    public Curso(int codigo, String descricao, String ementa) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.ementa = ementa;
    }

    public Curso(){}
    
    public Curso(String descricao, String ementa){
        this.descricao = descricao;
        this.ementa = ementa;
    }

    public Curso(int idCurso) {
        this.codigo = idCurso;
    }
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEmenta() {
        return ementa;
    }

    public void setEmenta(String ementa) {
        this.ementa = ementa;
    }
    
    
}
