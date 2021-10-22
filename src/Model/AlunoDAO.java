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
 * Classe que executa querys do Aluno
 * @author guilh
 */
public class AlunoDAO {
    Connection con = null;
    
    /**
     * Metodo que executa o cadastro de um Aluno
     * @param al
     * @return um <code>boolean</code> representando o resultado do cadastro
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean insereAluno(Aluno al) throws SQLException, ClassNotFoundException{
        boolean inseriu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO aluno (nome) VALUES (?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1,al.getNome());
            stmt.execute();
            stmt.close();
            inseriu = true;
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        return inseriu;
    }
    
    
    /**
     * Metodo que executa a alteração de dados de um Aluno
     * @param al
     * @return um <code>boolean</code> representando o resultado da alteração
     * @throws SQLException 
     */
    public boolean alteraDados(Aluno al) throws SQLException{
        boolean alterou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "UPDATE aluno SET nome = ? WHERE idaluno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, al.getNome());
            stmt.setInt(2, al.getCodigo());
            stmt.execute();
            stmt.close();
            alterou = true;
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        return alterou;
    }
    
    /**
     * Metodo que executa a exclusão de um aluno
     * @param al
     * @return um <code>boolean</code> representando o resultado da exclusão
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean excluir(Aluno al) throws SQLException, ClassNotFoundException{
        boolean excluiu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "DELETE FROM aluno WHERE idaluno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, al.getCodigo());
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
     * Metodo que verifica a existencia de um aluno e retorna os dados caso encontrado
     * @param id
     * @return um <code>ArrayList</code> com os dados do aluno encontrado
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public ArrayList<Aluno> verificaId(int id) throws SQLException, ClassNotFoundException{
        ArrayList<Aluno> aluno = new ArrayList();
        ResultSet rs = null;
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM aluno WHERE idaluno = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while(rs.next()){
                String nome = rs.getString("nome");
                
                Aluno al = new Aluno(nome);
                aluno.add(al);
            }
            stmt.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        
        return aluno;
    }
    
    /**
     * Metodo que lista todos os alunos cadastrados no banco de dados
     * @return um <code>ArrayList</code> com todos os alunos cadastrados
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public ArrayList<Aluno> buscaTodosAlunos() throws SQLException, ClassNotFoundException{
        ArrayList<Aluno> lista = new ArrayList();
        ResultSet rs;
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM aluno";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int idAluno = rs.getInt("idaluno");
                String nome = rs.getString("nome");
                
                Aluno al = new Aluno(idAluno, nome);
                lista.add(al);
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
