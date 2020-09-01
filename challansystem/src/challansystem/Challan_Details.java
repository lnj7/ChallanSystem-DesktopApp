/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challansystem;

public class Challan_Details extends javax.swing.JFrame {

    public Challan_Details() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        challandetailslbl = new javax.swing.JLabel();
        radio2 = new javax.swing.JRadioButton();
        radio1 = new javax.swing.JRadioButton();
        radio3 = new javax.swing.JRadioButton();
        lbl = new javax.swing.JLabel();
        idlbl = new javax.swing.JLabel();
        idtxt = new javax.swing.JTextField();
        fdetailsbtn = new javax.swing.JButton();
        gdetailsbtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.setForeground(new java.awt.Color(255, 51, 0));

        challandetailslbl.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        challandetailslbl.setText("Challan Details");

        radio2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        radio2.setText("Vehicle Number");
        radio2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio2ActionPerformed(evt);
            }
        });

        radio1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        radio1.setText("Challan Number");
        radio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio1ActionPerformed(evt);
            }
        });

        radio3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        radio3.setText("Registration No");
        radio3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radio3ActionPerformed(evt);
            }
        });

        lbl.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        lbl.setText("After Getting challan Details you can further go for online payment");

        idlbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        idtxt.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        idtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtActionPerformed(evt);
            }
        });

        fdetailsbtn.setBackground(new java.awt.Color(0, 0, 204));
        fdetailsbtn.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        fdetailsbtn.setForeground(new java.awt.Color(255, 0, 0));
        fdetailsbtn.setText("Forget Details");
        fdetailsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fdetailsbtnActionPerformed(evt);
            }
        });

        gdetailsbtn.setBackground(new java.awt.Color(0, 0, 204));
        gdetailsbtn.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        gdetailsbtn.setForeground(new java.awt.Color(255, 0, 0));
        gdetailsbtn.setText("Get Details");
        gdetailsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gdetailsbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(radio1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(radio2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                                .addComponent(radio3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(fdetailsbtn)
                                        .addGap(59, 59, 59)
                                        .addComponent(gdetailsbtn)
                                        .addGap(0, 110, Short.MAX_VALUE))
                                    .addComponent(idtxt)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(427, 427, 427)
                        .addComponent(challandetailslbl))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(355, 355, 355)
                        .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 624, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(368, 368, 368))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(challandetailslbl)
                .addGap(41, 41, 41)
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radio1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(idlbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(idtxt))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fdetailsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gdetailsbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(175, 175, 175))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(495, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(244, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void idtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtActionPerformed
        // TODO add your handling code here:
          String name = idtxt.getText(); 
    }//GEN-LAST:event_idtxtActionPerformed

    private void fdetailsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fdetailsbtnActionPerformed
          // TODO add your handling code here:
            //close();
            Login_Page l = new Login_Page();
            l.setVisible(true);
    }//GEN-LAST:event_fdetailsbtnActionPerformed

    private void gdetailsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gdetailsbtnActionPerformed
                // TODO add your handling code here:
              Traffic_Management_Center t = new Traffic_Management_Center();  
                t.setVisible(true);
    }//GEN-LAST:event_gdetailsbtnActionPerformed

    private void radio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio1ActionPerformed
               // TODO add your handling code here:
               if(radio1.isSelected())
               idlbl.setText(radio1.getText());
               radio2.setSelected(false);
               radio3.setSelected(false); 
    }//GEN-LAST:event_radio1ActionPerformed

    private void radio2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio2ActionPerformed
        // TODO add your handling code here:
                if(radio2.isSelected())
               idlbl.setText(radio2.getText()); 
                 radio1.setSelected(false);
               radio3.setSelected(false); 
    }//GEN-LAST:event_radio2ActionPerformed

    private void radio3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radio3ActionPerformed
        // TODO add your handling code here:
                if(radio3.isSelected())
               idlbl.setText(radio3.getText());
                 radio1.setSelected(false);
               radio2.setSelected(false); 
    }//GEN-LAST:event_radio3ActionPerformed

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
            java.util.logging.Logger.getLogger(Challan_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Challan_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Challan_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Challan_Details.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Challan_Details().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel challandetailslbl;
    private javax.swing.JButton fdetailsbtn;
    private javax.swing.JButton gdetailsbtn;
    private javax.swing.JLabel idlbl;
    private javax.swing.JTextField idtxt;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl;
    private javax.swing.JRadioButton radio1;
    private javax.swing.JRadioButton radio2;
    private javax.swing.JRadioButton radio3;
    // End of variables declaration//GEN-END:variables
}
