/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Connection.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe que executa querys do CursoAluno
 * @author guilh
 */
public class CursoAlunoDAO {
    Connection con = null;
    
    /**
     * Metodo que executa o cadastro de um Aluno em um Curso
     * @param idAluno
     * @param idCurso
     * @return um <code>boolean</code> representando o resultado do cadastro
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean matriculaAlunoCurso(int idAluno, int idCurso) throws SQLException, ClassNotFoundException{
        boolean inseriu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO curso_aluno (idaluno, idCurso) VALUES (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, idAluno);
            stmt.setInt(2, idCurso);
            stmt.execute();
            stmt.close();
            inseriu = true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        return inseriu;
    }
    
    /**
     * Metodo que exclui a matricula de um Aluno em determinado Curso
     * @param idCursoAluno
     * @return um <code>boolean</code> representando o resultado da exclusão
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean excluiAluno(int idAluno) throws SQLException, ClassNotFoundException{
        boolean excluiu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "DELETE FROM curso_aluno WHERE idaluno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, idAluno);
            stmt.execute();
            stmt.close();
            excluiu = true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        
        return excluiu;
    }
    
    /**
     * Metodo que apaga matriculas de um curso
     * @param idCurso
     * @return um <code>boolean</code> representando o resultado da exclusão
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean excluiCursos(int idCurso) throws SQLException, ClassNotFoundException{
        boolean excluiu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "DELETE FROM curso_aluno WHERE idcurso = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, idCurso);
            stmt.execute();
            stmt.close();
            excluiu = true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        
        return excluiu;
    }
    
    /**
     * Metodo que faz a verifica a existencia de uma matricula
     * @param idCursoAluno
     * @return um <code>boolean</code> representando o resultado da verificação
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean verificaIdCursoAluno(int idCursoAluno) throws SQLException, ClassNotFoundException{
        boolean existe = false;
        ResultSet rs = null;
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM curso_aluno WHERE idcurso_aluno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, idCursoAluno);
            rs = stmt.executeQuery();
            if(rs.next())
                existe = true;
            stmt.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        
        return existe;
    }
    
    /**
     * Metodo que verifica se o Aluno e o Curso estão cadastrado
     * @param idAluno
     * @param idCurso
     * @return um <code>boolean</code> representando o resultado da verificação
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean verificaAlunoECurso(int idAluno, int idCurso) throws SQLException, ClassNotFoundException{
        boolean existe = false;
        ResultSet rs = null;
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT idcurso, idaluno FROM curso JOIN aluno WHERE idcurso LIKE ? AND idaluno LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, idCurso);
            stmt.setInt(2, idAluno);
            rs = stmt.executeQuery();
            if(rs.next())
                existe = true;
            stmt.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        System.out.println(existe);
        return existe;
        
    }
    
    /**
     * Metodo que verifica se o Aluno ja está matriculado em um Curso
     * @param idAluno
     * @param idCurso
     * @return um <code>boolean</code> representando o resultado da verificação
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean verificaSeEstaCadastrado(int idAluno, int idCurso) throws SQLException, ClassNotFoundException{
        boolean existe = false;
        ResultSet rs = null;
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT idcurso_aluno FROM curso_aluno WHERE idcurso LIKE ? AND idaluno LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, idCurso);
            stmt.setInt(2, idAluno);
            rs = stmt.executeQuery();
            if(rs.next())
                existe = true;
            stmt.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        
        return existe;
    }
    
    /**
     * Metodo que verifica se o Aluno ja está matriculado em um Curso
     * @param idAluno
     * @return um <code>Integer</code> com o Id do CursoAluno
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean verificaSeEstaCadastrado(int idAluno) throws SQLException, ClassNotFoundException{
        boolean estaCadastrado = false;
        ResultSet rs = null;
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT idcurso_aluno FROM curso_aluno WHERE idaluno LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, idAluno);
            rs = stmt.executeQuery();
            if(rs.next()){
                estaCadastrado = true;
            }
                
            stmt.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        
        return estaCadastrado;
    }
    
    /**
     * Metodo que verifica se o Curso possui matriculas
     * @param idCurso
     * @return um <code>Integer</code> com o Id do CursoAluno
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean verificaSeCursoEstaCadastrado(int idCurso) throws SQLException, ClassNotFoundException{
        boolean estaCadastrado = false;
        ResultSet rs = null;
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT idcurso_aluno FROM curso_aluno WHERE idcurso LIKE ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, idCurso);
            rs = stmt.executeQuery();
            if(rs.next()){
                estaCadastrado = true;
            }
                
            stmt.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        
        return estaCadastrado;
    }
    
    /**
     * Metodo que lista todas as matriculas existentes no banco de dados
     * @return um <code>ArrayList</code> com todos os dados cadastrados
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public ArrayList<CursoAluno> buscaTodasMatriculas() throws SQLException, ClassNotFoundException{
        ArrayList<CursoAluno> lista = new ArrayList();
        ResultSet rs;
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM curso_aluno";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int idCursoAluno = rs.getInt("idcurso_aluno");
                int idAluno = rs.getInt("idaluno");
                int idCurso = rs.getInt("idcurso");
                
                CursoAluno cursoAluno = new CursoAluno(idCursoAluno, idAluno, idCurso);
                lista.add(cursoAluno);
            }
            stmt.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        
        return lista;
    }
}
