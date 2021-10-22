/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.ControllerCursoAluno;
import Model.CursoAluno;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * View de Matricula
 * @author guilh
 */
public class MatriculaFrame extends javax.swing.JFrame {

    /**
     * Creates new form Turma
     */
    ControllerCursoAluno ctrlCa = new ControllerCursoAluno();
    int idMatricula;
    public MatriculaFrame() {
        initComponents();
        btnExcluir.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCadastrar = new javax.swing.JButton();
        txtIdAluno = new javax.swing.JTextField();
        txtIdCurso = new javax.swing.JTextField();
        btnVoltaMenu = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtIdMatricula = new javax.swing.JTextField();
        btnBuscaId = new javax.swing.JButton();
        labelMatriculaEncontrada = new javax.swing.JLabel();
        btnExcluir = new javax.swing.JButton();
        btnVoltaMenu2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMatriculas = new javax.swing.JTable();
        btnListaMatriculas = new javax.swing.JButton();
        btnVoltaMenu3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setText("Cadastro");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setText("ID do aluno");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel3.setText("ID do curso");

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        btnVoltaMenu.setText("Voltar para o menu");
        btnVoltaMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(236, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(249, 249, 249))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(277, 277, 277)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltaMenu)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltaMenu)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtIdAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtIdCurso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar)
                .addContainerGap(189, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cadastro", jPanel1);

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel4.setText("Excluir Matricula");

        jLabel5.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel5.setText("Digite o ID da turma");

        btnBuscaId.setText("Buscar");
        btnBuscaId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscaIdActionPerformed(evt);
            }
        });

        labelMatriculaEncontrada.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N

        btnExcluir.setText("Excluir");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnVoltaMenu2.setText("Voltar para o menu");
        btnVoltaMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaMenu2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtIdMatricula)
                            .addComponent(btnBuscaId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel4))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(labelMatriculaEncontrada))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltaMenu2)))
                .addContainerGap(226, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnVoltaMenu2)
                .addGap(19, 19, 19)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscaId)
                .addGap(4, 4, 4)
                .addComponent(btnExcluir)
                .addGap(18, 18, 18)
                .addComponent(labelMatriculaEncontrada)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Excluir Matricula", jPanel2);

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel8.setText("Listagem");

        tabelaMatriculas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Matricula", "ID Aluno", "ID Curso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaMatriculas);

        btnListaMatriculas.setText("Listar todas as turmas");
        btnListaMatriculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaMatriculasActionPerformed(evt);
            }
        });

        btnVoltaMenu3.setText("Voltar para o menu");
        btnVoltaMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltaMenu3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltaMenu3)
                        .addGap(192, 192, 192)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(btnListaMatriculas)))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltaMenu3)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnListaMatriculas)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Listagem de Turmas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * Evento de click do botão que requisita ao Controller o cadastro de uma Matricula
     * @param evt 
     */
    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        if(txtIdAluno.getText().isEmpty() || txtIdCurso.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Preencha todas as informações");
        } //Verificação do campo para caso ele esteja vazio
        else{
            //Inicialização das variaveis
            int idAluno = Integer.parseInt(txtIdAluno.getText());
            int idCurso = Integer.parseInt(txtIdCurso.getText());
            boolean existe = false;
            boolean estaCadastrado = false;
            boolean cadastrou = false;
            
            
            try {
                existe = ctrlCa.verificaAlunoECurso(idAluno, idCurso); //Requisita ao controller a verificação da existencia do Aluno e do Curso
                estaCadastrado = ctrlCa.verificaSeEstaCadastrado(idAluno, idCurso); //Requisita ao controller a verificação da existencia de um cadastro de Matricula
            }catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(MatriculaFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //Verifica se o resultado foi verdadeiro para a existencia do Aluno e do Curso
            if(existe){
                //Verifica se o resultado foi falso para a existencia de um cadastro de matricula
                if (!estaCadastrado) {
                    try {
                        cadastrou = ctrlCa.insereCursoAluno(idAluno, idCurso); //Requisita ao controller o cadastro de uma matricula
                    } catch (SQLException | ClassNotFoundException ex) {
                        Logger.getLogger(MatriculaFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Aluno ja matriculado!"); //Exibe uma mensagem ao usuario de que ja existe um Aluno com esse id matriculado
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Aluno ou Curso não existe em nossa base de dados"); //Exibe uma mensagem ao usuario de que o Aluno ou o Curso não existe no banco de dados
            }
            
            //Verifica se o resultado foi verdadeiro para o cadastro da matricula
            if(cadastrou){
                JOptionPane.showMessageDialog(null, "Cadastrado efetuado com sucesso!"); //Exibe uma mensagem ao usuario de que o cadastro foi efetuado com sucesso
                txtIdAluno.setText("");
                txtIdCurso.setText("");
            }
            else{
                JOptionPane.showMessageDialog(null, "Falha no cadastro"); //Exibe uma mensagem ao usuario de que houve uma falha no cadastro
                txtIdAluno.setText("");
                txtIdCurso.setText("");
            }
        }
    }//GEN-LAST:event_btnCadastrarActionPerformed

    /**
     * Evento de click do botão que requisita ao controller a verificação da existencia de uma Matricula
     * @param evt 
     */
    private void btnBuscaIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscaIdActionPerformed
        if(txtIdMatricula.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Digite o ID da matricula");
        }//Verificação do campo para caso ele esteja vazio
        else{
            //Atribuição das variaveis
            int idCursoAluno = Integer.parseInt(txtIdMatricula.getText());
            boolean existe = false;
            
            try {
                existe = ctrlCa.verificaId(idCursoAluno); //Requisita ao controller a verificação
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(MatriculaFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            //Verifica se o resultado da requisição foi verdadeiro
            if(existe){
                labelMatriculaEncontrada.setText("Matricula encontrada!");
                btnExcluir.setVisible(true);
                idMatricula = idCursoAluno;
            }
            else{
                JOptionPane.showMessageDialog(null, "Matricula não encontrada!"); //Exibe uma mensagem ao usuario de que a matricula não foi encontrada
                txtIdMatricula.setText("");
            }
            
        }
    }//GEN-LAST:event_btnBuscaIdActionPerformed

    /**
     * Evento de click do botão que requisita a exclusão de uma matricula
     * @param evt 
     */
    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        
        //Inicialização das variaveis
        int resposta = JOptionPane.showConfirmDialog(this, "Deseja excluir esta matricula?"); //Atribui a resposta do usuario
        boolean excluiu = false;
        
        //Verificação da resposta do usuario
        if(resposta == 0){
            try {
                excluiu = ctrlCa.excluiuCursoAluno(idMatricula); //Requisita ao controller a exclusão da matricula
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(MatriculaFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //Verifica se o resultado da requisição foi verdadeira
        if(excluiu){
            JOptionPane.showMessageDialog(null, "Matricula excluida com sucesso!");//Exibe uma mensagem ao usuario de que a matricula foi excluida com sucesso
            btnExcluir.setVisible(false);
            labelMatriculaEncontrada.setText("");
            txtIdMatricula.setText("");
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    /**
     * Evento de click do botão que requisita ao controller a listagem das matriculas
     * @param evt 
     */
    private void btnListaMatriculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaMatriculasActionPerformed
        ArrayList<CursoAluno> listaMatriculas;//Inicialização do ArrayList
        
        try {
            listaMatriculas = ctrlCa.listar();//Requisição da listagem
            DefaultTableModel dados = (DefaultTableModel) tabelaMatriculas.getModel();//Inicialização da tabela
            dados.setNumRows(0);
            
            //Varredura do ArrayList atribuindo a Classe CursoAluno
            for(CursoAluno ca: listaMatriculas){
                dados.addRow(new Object[]{ca.getCodigo(), ca.getCodigoAluno(), ca.getCodigoCurso()}); //Adicionando as linhas e colunas da tabela os dados retornados
            }
           
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(MatriculaFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnListaMatriculasActionPerformed

    /**
     * Evendo de click do botão para voltar ao menu
     * @param evt 
     */
    private void btnVoltaMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaMenuActionPerformed
        HomeFrame homeFrame = new HomeFrame();
        homeFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltaMenuActionPerformed
    
    /**
     * Evendo de click do botão para voltar ao menu
     * @param evt 
     */
    private void btnVoltaMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaMenu2ActionPerformed
        HomeFrame homeFrame = new HomeFrame();
        homeFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltaMenu2ActionPerformed

    /**
     * Evendo de click do botão para voltar ao menu
     * @param evt 
     */
    private void btnVoltaMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltaMenu3ActionPerformed
        HomeFrame homeFrame = new HomeFrame();
        homeFrame.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnVoltaMenu3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MatriculaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MatriculaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MatriculaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MatriculaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MatriculaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscaId;
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnListaMatriculas;
    private javax.swing.JButton btnVoltaMenu;
    private javax.swing.JButton btnVoltaMenu2;
    private javax.swing.JButton btnVoltaMenu3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelMatriculaEncontrada;
    private javax.swing.JTable tabelaMatriculas;
    private javax.swing.JTextField txtIdAluno;
    private javax.swing.JTextField txtIdCurso;
    private javax.swing.JTextField txtIdMatricula;
    // End of variables declaration//GEN-END:variables
}
