/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.CursoAluno;
import Model.CursoAlunoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe que intermedeia a View e os Models
 * @author guilh
 */
public class ControllerCursoAluno {
    
    /**
     * Metodo que requisita para o modelDAO o cadastro de uma Matricula
     * @param idAluno
     * @param idCurso
     * @return um <code>boolean</code> representando o resultado do cadastro
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean insereCursoAluno(int idAluno, int idCurso) throws SQLException, ClassNotFoundException{
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        boolean inseriu = caDAO.matriculaAlunoCurso(idAluno, idCurso);
        
        return inseriu;
    }
    
    /**
     * Metodo que requisita para o CursoAlunoDAO a exclusão de uma Matricula
     * @param idCursoAluno
     * @return um <code>boolean</code> representando o resultado da exclusão
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean excluiuCursoAluno(int idCursoAluno) throws SQLException, ClassNotFoundException{
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        boolean excluiu = caDAO.excluiAluno(idCursoAluno);
        return excluiu;
    }
    
    /**
     * Metodo que requisita para o CursoAunoDAo a exclusão de matriculas com determinado curso
     * @param idCurso
     * @return um <code>boolean</code> representando o resultado da exclusão
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean excluiuCursos(int idCurso) throws SQLException, ClassNotFoundException{
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        boolean excluiu = caDAO.excluiCursos(idCurso);
        return excluiu;
    }
    
    /**
     * Metodo que requisita para o CursoAlunoDAO a verificação do cadastro de um Id de uma matricula
     * @param idCursoAluno
     * @return um <code>boolean</code> representando se o Id da matricula esta cadastrado
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean verificaId(int idCursoAluno) throws SQLException, ClassNotFoundException{
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        boolean existe = false;
        return existe = caDAO.verificaIdCursoAluno(idCursoAluno);
    }
    
    /**
     * Metodo que requisita para o CursoAlunoDAO um ArrayList com todas as mastriculas cadastradas
     * @return um <code>ArrayList</code> com todos as matriculas cadastradas
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public ArrayList<CursoAluno> listar() throws SQLException, ClassNotFoundException{
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        return caDAO.buscaTodasMatriculas();
    }
    
    /**
     * Metodo que requisita para o CursoAlunoDAO a verificação da existencia de um Aluno e um Curso
     * @param idAluno
     * @param idCurso
     * @return um <code>boolean</code> representando o resultado da verificação
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean verificaAlunoECurso(int idAluno, int idCurso) throws SQLException, ClassNotFoundException{
        boolean existe;
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        return existe = caDAO.verificaAlunoECurso(idAluno, idCurso);
    }
    
    /**
     * Metodo que requisita para o CursoAlunoDAO a verificação do cadadastro de um Aluno em um Curso
     * @param idAluno
     * @param idCurso
     * @return um <code>boolean</code> representando o resultado da verificação
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean verificaSeEstaCadastrado(int idAluno, int idCurso) throws SQLException, ClassNotFoundException{
        boolean estaCadastrado;
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        return estaCadastrado = caDAO.verificaSeEstaCadastrado(idAluno, idCurso);
    }
    
    /**
     * Metodo que requisita para o CursoAlunoDAO a verificação do cadadastro de um Aluno em um Curso
     * @param idAluno
     * @return um <code>Integer</code> com o id do CursoAluno
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean verificaSeEstaCadastrado(int idAluno) throws SQLException, ClassNotFoundException{
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        return caDAO.verificaSeEstaCadastrado(idAluno);
    }
    
    public boolean verificaSeCursoEstaCadastrado(int idCurso) throws SQLException, ClassNotFoundException{
        CursoAlunoDAO caDAO = new CursoAlunoDAO();
        return caDAO.verificaSeCursoEstaCadastrado(idCurso);
    }
}
