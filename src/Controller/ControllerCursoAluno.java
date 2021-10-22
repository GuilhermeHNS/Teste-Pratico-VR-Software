/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Curso;
import Model.CursoAluno;
import Model.CursoAlunoDAO;
import Model.CursoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author guilh
 */
public class ControllerCursoAluno {
    public boolean insereCursoAluno(int idAluno, int idCurso) throws SQLException, ClassNotFoundException{
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        boolean inseriu = caDAO.matriculaAlunoCurso(idAluno, idCurso);
        
        return inseriu;
    }
    
    public boolean excluiuCursoAluno(int idCursoAluno) throws SQLException, ClassNotFoundException{
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        boolean excluiu = caDAO.excluir(idCursoAluno);
        return excluiu;
    }
    
    public boolean verificaId(int idCursoAluno) throws SQLException, ClassNotFoundException{
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        boolean existe = false;
        return existe = caDAO.verificaIdCursoAluno(idCursoAluno);
    }
    
    public ArrayList<CursoAluno> listar() throws SQLException, ClassNotFoundException{
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        return caDAO.buscaTodasMatriculas();
    }
    
    public boolean verificaAlunoECurso(int idAluno, int idCurso) throws SQLException, ClassNotFoundException{
        boolean existe;
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        return existe = caDAO.verificaAlunoECurso(idAluno, idCurso);
    }
    
    public boolean verificaSeEstaCadastrado(int idAluno, int idCurso) throws SQLException, ClassNotFoundException{
        boolean estaCadastrado;
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        return estaCadastrado = caDAO.verificaSeEstaCadastrado(idAluno, idCurso);
    }
}
