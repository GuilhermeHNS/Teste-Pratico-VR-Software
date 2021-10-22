/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * Classe CursoAluno
 * @author guilh
 */
public class CursoAluno {
    /**
     * Codigo do CursoAluno
     */
    private int codigo;
    
    /**
     * Codigo do Aluno
     */
    private int codigoAluno;
    
    /**
     * Codigo do Curso
     */
    private int codigoCurso;

    /**
     * Construtor CursoAluno com codigo, codigo do Aluno e codigo do Curso
     * @param codigo
     * @param codigoAluno
     * @param codigoCurso 
     */
    public CursoAluno(int codigo, int codigoAluno, int codigoCurso) {
        this.codigo = codigo;
        this.codigoAluno = codigoAluno;
        this.codigoCurso = codigoCurso;
    }

    /**
     * Construtor CursoAluno com codigo do Aluno e codigo do Curso
     * @param codigoAluno
     * @param codigoCurso 
     */
    public CursoAluno(int codigoAluno, int codigoCurso) {
        this.codigoAluno = codigoAluno;
        this.codigoCurso = codigoCurso;
    }
    
    /**
     * Construtor CursoAluno vazio
     */
    public CursoAluno(){}
    
    /**
     * Recupera o codigo do CursoAluno
     * @return o codigo do CursoAluno
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * Atribui o codigo ao CursoAluno
     * @param codigo 
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * Recupera o codigo do Aluno
     * @return o codigo do Aluno
     */
    public int getCodigoAluno() {
        return codigoAluno;
    }

    /**
     * Atribui o codigo do Aluno ao Aluno
     * @param codigoAluno 
     */
    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    /**
     * Recupera o codigo do Curso
     * @return o codigo do Curso
     */
    public int getCodigoCurso() {
        return codigoCurso;
    }

    /**
     * Atribui o codigo do Curso ao Curso
     * @param codigoCurso 
     */
    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    
    
}
