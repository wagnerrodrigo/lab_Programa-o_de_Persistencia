/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author alunoces
 */
public class T_principal extends javax.swing.JFrame {

    /**
     * Creates new form T_principal
     */
    public T_principal() {
        this.setExtendedState(MAXIMIZED_BOTH);
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        mnCadastro = new javax.swing.JMenu();
        mnAluno = new javax.swing.JMenuItem();
        mnCurso = new javax.swing.JMenuItem();
        mnDisciplina = new javax.swing.JMenuItem();
        mnProfessor = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnSair = new javax.swing.JMenuItem();
        mnEdicao = new javax.swing.JMenu();
        mnRelatorio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema Acadeusmico");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        mnCadastro.setMnemonic('c');
        mnCadastro.setText("Cadastro");

        mnAluno.setText("Aluno");
        mnAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAlunoActionPerformed(evt);
            }
        });
        mnCadastro.add(mnAluno);

        mnCurso.setText("Curso");
        mnCurso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCursoActionPerformed(evt);
            }
        });
        mnCadastro.add(mnCurso);

        mnDisciplina.setText("Disciplina");
        mnDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnDisciplinaActionPerformed(evt);
            }
        });
        mnCadastro.add(mnDisciplina);

        mnProfessor.setText("Professor");
        mnProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnProfessorActionPerformed(evt);
            }
        });
        mnCadastro.add(mnProfessor);
        mnCadastro.add(jSeparator1);

        mnSair.setText("Sair");
        mnSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSairActionPerformed(evt);
            }
        });
        mnCadastro.add(mnSair);

        jMenuBar1.add(mnCadastro);

        mnEdicao.setText("Edição");
        jMenuBar1.add(mnEdicao);

        mnRelatorio.setText("Relatório");
        jMenuBar1.add(mnRelatorio);

        setJMenuBar(jMenuBar1);

        setBounds(0, 0, 437, 360);
    }// </editor-fold>//GEN-END:initComponents

    private void mnSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSairActionPerformed
        int status = JOptionPane.showConfirmDialog(null, "Deseja mesmo sair da aplicação?", "Fechar", JOptionPane.YES_NO_OPTION);
        if (status==JOptionPane.YES_OPTION)
            this.dispose();
    }//GEN-LAST:event_mnSairActionPerformed

    private void mnAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAlunoActionPerformed
        new Aluno(null, true).setVisible(true);
    }//GEN-LAST:event_mnAlunoActionPerformed

    private void mnCursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCursoActionPerformed
        new Curso(null, true).setVisible(true);
    }//GEN-LAST:event_mnCursoActionPerformed

    private void mnDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnDisciplinaActionPerformed
        new Disciplina(null, true).setVisible(true);
    }//GEN-LAST:event_mnDisciplinaActionPerformed

    private void mnProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnProfessorActionPerformed
        new Professor(null, true).setVisible(true);
    }//GEN-LAST:event_mnProfessorActionPerformed

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
            java.util.logging.Logger.getLogger(T_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(T_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(T_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(T_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new T_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem mnAluno;
    private javax.swing.JMenu mnCadastro;
    private javax.swing.JMenuItem mnCurso;
    private javax.swing.JMenuItem mnDisciplina;
    private javax.swing.JMenu mnEdicao;
    private javax.swing.JMenuItem mnProfessor;
    private javax.swing.JMenu mnRelatorio;
    private javax.swing.JMenuItem mnSair;
    // End of variables declaration//GEN-END:variables
}
