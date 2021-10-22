/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Aluno;
import Model.AlunoDAO;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe que intermedeia a Viewl e os Models
 * @author guilh
 */
public class ControllerAluno {
    
    /**
     * Metodo que requisita para o AlunoDAO o cadastro de um Aluno
     * @param nome
     * @return um <code>boolean</code> representando o resultado do cadastro
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean insereAluno(String nome) throws SQLException, ClassNotFoundException{
        Aluno al = new Aluno(nome);
        AlunoDAO alDAO = new AlunoDAO();
        boolean inseriu = alDAO.insereAluno(al);
        
        return inseriu;
    }
    
    /**
     * Metodo que requisita para o AlunoDAO a exclusão 
     * @param idAluno
     * @return um <code>boolean</code> representando o resultado da exclusão
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean excluiuAluno(int idAluno) throws SQLException, ClassNotFoundException{
        Aluno al = new Aluno(idAluno);
        AlunoDAO alDAO = new AlunoDAO();
        boolean excluiu = alDAO.excluir(al);
        return excluiu;
    }
    
    /**
     * Metodo que requisita para o AlunoDAO a alteração de dados de um Aluno
     * @param idAluno
     * @param nome
     * @return um <code>boolean</code> representando o resultado da alteração
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean alterarDados(int idAluno, String nome) throws SQLException, ClassNotFoundException{
        Aluno al = new Aluno(idAluno, nome);
        AlunoDAO alDAO = new AlunoDAO();
        
        boolean alterou = alDAO.alteraDados(al);
        return alterou;
    }
    
    /**
     * Metodo que requisita ao AludoDAO um ArrayList com todos os Alunos cadastrados no banco de dados
     * @return um <code>ArrayList</code> com todos os Alunos cadastrados
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public ArrayList<Aluno> listar() throws SQLException, ClassNotFoundException{
        AlunoDAO alDAO = new AlunoDAO();
        return alDAO.buscaTodosAlunos();
    }
    
    /**
     * Metodo que requisita ao AlunoDAO a verificação da existencia e os seus dados caso econtrado
     * @param id
     * @return um <code>ArrayList</code> com os dados do Aluno encontrado
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public ArrayList<Aluno> verificaId(int id) throws SQLException, ClassNotFoundException{
        AlunoDAO alDAO = new AlunoDAO();
        return alDAO.verificaId(id);
    }
}
