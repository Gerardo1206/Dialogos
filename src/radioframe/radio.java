/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radioframe;

import java.util.Enumeration;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author ceivg
 */
public class radio extends javax.swing.JFrame {

    /**
     * Creates new form radio
     */
    public radio() {
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

        Respuestas = new javax.swing.ButtonGroup();
        rbInfo = new javax.swing.JRadioButton();
        rbQuest = new javax.swing.JRadioButton();
        rbWarning = new javax.swing.JRadioButton();
        rbError = new javax.swing.JRadioButton();
        btnGenerar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        edtTitle = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        edtMsg = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Respuestas.add(rbInfo);
        rbInfo.setSelected(true);
        rbInfo.setText("Informaciion");
        rbInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbInfoActionPerformed(evt);
            }
        });

        Respuestas.add(rbQuest);
        rbQuest.setText("Pregunta");
        rbQuest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbQuestActionPerformed(evt);
            }
        });

        Respuestas.add(rbWarning);
        rbWarning.setText("Precaucion");
        rbWarning.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbWarningActionPerformed(evt);
            }
        });

        Respuestas.add(rbError);
        rbError.setText("Error");
        rbError.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbErrorActionPerformed(evt);
            }
        });

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jLabel1.setText("Titulo:");

        edtTitle.setText("Ingrese titulo a generar");

        jLabel2.setText("Mensaje");

        edtMsg.setText("Ingrese mensaje a generar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbInfo)
                    .addComponent(rbQuest)
                    .addComponent(rbError)
                    .addComponent(rbWarning))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(edtTitle, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtMsg, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbInfo)
                    .addComponent(jLabel1))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbQuest)
                    .addComponent(edtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(edtMsg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbWarning)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbError)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnGenerar)
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbInfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbInfoActionPerformed

    private void rbQuestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbQuestActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbQuestActionPerformed

    private void rbWarningActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbWarningActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbWarningActionPerformed

    private void rbErrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbErrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbErrorActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
       if(rbInfo.isSelected()){
           JOptionPane.showMessageDialog(this, edtMsg.getText(),edtTitle.getText(),JOptionPane.INFORMATION_MESSAGE);
       } 
       if(rbWarning.isSelected()){
           JOptionPane.showMessageDialog(this, edtMsg.getText(),edtTitle.getText(),JOptionPane.WARNING_MESSAGE);
       }
       if(rbError.isSelected()){
           JOptionPane.showMessageDialog(this, edtMsg.getText(),edtTitle.getText(),JOptionPane.ERROR_MESSAGE);
       }
       if(rbQuest.isSelected()){
           JOptionPane.showMessageDialog(this, edtMsg.getText(),edtTitle.getText(),JOptionPane.QUESTION_MESSAGE);
       }
    }//GEN-LAST:event_btnGenerarActionPerformed
   /* private JRadioButton getSelectedButton(ButtonGroup Respuesta){
    Enumeration a=Respuestas.getElements();
        for (a=Respuestas.getElements(); a.hasMoreElements();) {
            JRadioButton b=(JRadioButton) a.nextElement();
            if(b.getModel()==Respuestas.getSelection()){
                return b;
            }
        }
        return null;   
    }*/
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
            java.util.logging.Logger.getLogger(radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(radio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new radio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Respuestas;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JTextField edtMsg;
    private javax.swing.JTextField edtTitle;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JRadioButton rbError;
    private javax.swing.JRadioButton rbInfo;
    private javax.swing.JRadioButton rbQuest;
    private javax.swing.JRadioButton rbWarning;
    // End of variables declaration//GEN-END:variables
}
