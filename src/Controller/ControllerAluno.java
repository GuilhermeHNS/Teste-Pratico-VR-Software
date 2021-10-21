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
 *
 * @author guilh
 */
public class ControllerAluno {
    public boolean insereAluno(String nome) throws SQLException, ClassNotFoundException{
        Aluno al = new Aluno(nome);
        AlunoDAO alDAO = new AlunoDAO();
        boolean inseriu = alDAO.insereAluno(al);
        
        return inseriu;
    }
    
    public boolean excluiuVeiculo(int idAluno) throws SQLException, ClassNotFoundException{
        Aluno al = new Aluno(idAluno);
        AlunoDAO alDAO = new AlunoDAO();
        boolean excluiu = alDAO.excluir(al);
        return excluiu;
    }
    
    public boolean alterarDados(int idAluno, String nome) throws SQLException, ClassNotFoundException{
        Aluno al = new Aluno(idAluno, nome);
        AlunoDAO alDAO = new AlunoDAO();
        
        boolean alterou = alDAO.alteraDados(al);
        return alterou;
    }
    
    public ArrayList<Aluno> listar() throws SQLException, ClassNotFoundException{
        AlunoDAO alDAO = new AlunoDAO();
        return alDAO.buscaTodosAlunos();
    }
    
    public boolean verificaId(int id) throws SQLException, ClassNotFoundException{
        AlunoDAO alDAO = new AlunoDAO();
        boolean existe = false;
        
        existe = alDAO.verificaId(id);
        return existe;
    }
}
