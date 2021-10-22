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
 *
 * @author guilh
 */
public class CursoAlunoDAO {
    Connection con = null;
    
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
    
    public boolean excluir(int idCursoAluno) throws SQLException, ClassNotFoundException{
        boolean excluiu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "DELETE FROM curso_aluno WHERE idcurso_aluno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, idCursoAluno);
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
