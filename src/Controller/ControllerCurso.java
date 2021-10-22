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
 * Classe que intermedeia a View e os Models
 * @author guilh
 */
public class ControllerCurso {
    
    /**
     * Metodo que requisita para o CursoDAO o cadastro de uma Matricula
     * @param descricao
     * @param ementa
     * @return um <code>boolean</code> representando o resultado do cadastro
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean insereCurso(String descricao, String ementa) throws SQLException, ClassNotFoundException{
        Curso cs = new Curso(descricao, ementa);
        CursoDAO csDAO = new CursoDAO();
        boolean inseriu = csDAO.insereCurso(cs);
        
        return inseriu;
    }
    
    /**
     * Metodo que requisida para o CursoDAO a exclusção de uma Matricula
     * @param idCurso
     * @return um <code>boolean</code> representando o resultado da exclusão
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean excluiuCurso(int idCurso) throws SQLException, ClassNotFoundException{
        Curso cs = new Curso(idCurso);
        CursoDAO csDAO = new CursoDAO();
        boolean excluiu = csDAO.excluir(cs);
        return excluiu;
    }
    
    /**
     * Metodo que requisita ao CursoDAO a alteração dos dados do Curso
     * @param idCurso
     * @param descricao
     * @param ementa
     * @return um <code>boolean</code> representando o resultado da alteração
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public boolean alterarDados(int idCurso, String descricao, String ementa) throws SQLException, ClassNotFoundException{
        Curso cs = new Curso(idCurso, descricao, ementa);
        CursoDAO csDAO = new CursoDAO();
        
        boolean alterou = csDAO.alteraDados(cs);
        return alterou;
    }
    
    /**
     * Metodo que requisita ao CursoDAO um ArrayList com todos os Cursos cadastrados
     * @return um <code>ArrayList</code> com todos os Cursos cadastrados
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public ArrayList<Curso> listar() throws SQLException, ClassNotFoundException{
        CursoDAO csDAO = new CursoDAO();
        return csDAO.buscaTodosCursos();
    }
    
    /**
     * Metodo que requisita ao CursoDAO a verificação da existencia de um curso e os seus dados caso encontrado
     * @param id
     * @return um <code>ArrayList</code> com todos os dados do curso encontrado
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    public ArrayList<Curso> verificaId(int id) throws SQLException, ClassNotFoundException{
        CursoDAO csDAO = new CursoDAO();
        return csDAO.verificaId(id);
    }
    
}
