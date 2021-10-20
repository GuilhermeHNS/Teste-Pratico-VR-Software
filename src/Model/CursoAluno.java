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
public class CursoAluno {
    private int codigo;
    private int codigoAluno;
    private int codigoCurso;

    public CursoAluno(int codigo, int codigoAluno, int codigoCurso) {
        this.codigo = codigo;
        this.codigoAluno = codigoAluno;
        this.codigoCurso = codigoCurso;
    }

    public CursoAluno(){}
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigoAluno() {
        return codigoAluno;
    }

    public void setCodigoAluno(int codigoAluno) {
        this.codigoAluno = codigoAluno;
    }

    public int getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }
    
    
}
