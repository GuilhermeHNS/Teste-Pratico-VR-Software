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
public class CursoDAO {
    Connection con = null;
    
    /**
     *
     * @param cs
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public boolean insereCurso(Curso cs) throws SQLException, ClassNotFoundException
    {
        boolean inseriu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "INSERT INTO curso (descricao, ementa) VALUES (?,?)";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cs.getDescricao());
            stmt.setString(2, cs.getEmenta());
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
    
    public boolean alteraDados(Curso cs) throws SQLException{
        boolean alterou = false;
        
        try{
            con = new Conexao().getConnection();
            String sql = "UPDATE curso SET descricao = ?, ementa = ? WHERE idcurso = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setString(1, cs.getDescricao());
            stmt.setString(2, cs.getEmenta());
            stmt.setInt(3,cs.getCodigo());
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
    
    public boolean excluir(Curso cs) throws SQLException, ClassNotFoundException{
        boolean excluiu = false;
        try{
            con = new Conexao().getConnection();
            String sql = "DELETE FROM curso WHERE idcurso = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, cs.getCodigo());
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
    
    public ArrayList<Curso> verificaId(int id) throws SQLException, ClassNotFoundException{
        ArrayList<Curso> resultCurso = new ArrayList();
        ResultSet rs = null;
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM curso WHERE idcurso = ?";
            PreparedStatement stmt = con.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();
            while(rs.next()){
                String descricao = rs.getString("descricao");
                String ementa = rs.getString("ementa");
                
                Curso cs = new Curso(descricao, ementa);
                resultCurso.add(cs);
            }
            stmt.close();
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            con.close();
        }
        
        return resultCurso;
    }
    
    public ArrayList<Curso> buscaTodosCursos() throws SQLException, ClassNotFoundException{
        ArrayList<Curso> lista = new ArrayList();
        ResultSet rs;
        try{
            con = new Conexao().getConnection();
            String sql = "SELECT * FROM curso";
            PreparedStatement stmt = con.prepareStatement(sql);
            rs = stmt.executeQuery();
            
            while(rs.next()){
                int idCurso = rs.getInt("idcurso");
                String descricao = rs.getString("descricao");
                String ementa = rs.getString("ementa");
                
                Curso cs = new Curso(idCurso, descricao, ementa);
                lista.add(cs);
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

