/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Curso;
import Model.CursoDAO;
import java.sql.SQLException;
import java.util.ArrayList;
/**
 *
 * @author guilh
 */
public class ControllerCurso {
    public boolean insereCurso(String descricao, String ementa) throws SQLException, ClassNotFoundException{
        Curso cs = new Curso(descricao, ementa);
        CursoDAO csDAO = new CursoDAO();
        boolean inseriu = csDAO.insereCurso(cs);
        
        return inseriu;
    }
    
    public boolean excluiuCurso(int idCurso) throws SQLException, ClassNotFoundException{
        Curso cs = new Curso(idCurso);
        CursoDAO csDAO = new CursoDAO();
        boolean excluiu = csDAO.excluir(cs);
        return excluiu;
    }
    public boolean alterarDados(int idCurso, String descricao, String ementa) throws SQLException, ClassNotFoundException{
        Curso cs = new Curso(idCurso, descricao, ementa);
        CursoDAO csDAO = new CursoDAO();
        
        boolean alterou = csDAO.alteraDados(cs);
        return alterou;
    }
    
    public ArrayList<Curso> listar() throws SQLException, ClassNotFoundException{
        CursoDAO csDAO = new CursoDAO();
        return csDAO.buscaTodosCursos();
    }
    
    public ArrayList<Curso> verificaId(int id) throws SQLException, ClassNotFoundException{
        CursoDAO csDAO = new CursoDAO();
        return csDAO.verificaId(id);
    }
    
}
