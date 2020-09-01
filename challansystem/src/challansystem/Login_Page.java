
package challansystem;

import java.awt.HeadlessException;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Login_Page extends Connection {

    public Login_Page() {
        initComponents();
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        loginlbl = new javax.swing.JLabel();
        usernamelbl = new javax.swing.JLabel();
        usernametxt = new javax.swing.JTextField();
        passwordlbl = new javax.swing.JLabel();
        nextbtn = new javax.swing.JButton();
        challandetailsbtn = new javax.swing.JButton();
        needhelpbtn = new javax.swing.JButton();
        passwordtxt = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setLayout(null);

        loginlbl.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        loginlbl.setText("Login");
        jPanel3.add(loginlbl);
        loginlbl.setBounds(510, 40, 140, 60);

        usernamelbl.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        usernamelbl.setText("User Name : ");
        jPanel3.add(usernamelbl);
        usernamelbl.setBounds(190, 240, 174, 35);

        usernametxt.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        usernametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernametxtActionPerformed(evt);
            }
        });
        jPanel3.add(usernametxt);
        usernametxt.setBounds(430, 240, 490, 41);

        passwordlbl.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        passwordlbl.setText("Password :");
        jPanel3.add(passwordlbl);
        passwordlbl.setBounds(200, 340, 146, 35);

        nextbtn.setFont(new java.awt.Font("Arial", 1, 32)); // NOI18N
        nextbtn.setText("Submit");
        nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnActionPerformed(evt);
            }
        });
        jPanel3.add(nextbtn);
        nextbtn.setBounds(500, 440, 150, 47);

        challandetailsbtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        challandetailsbtn.setText("Challan Details");
        challandetailsbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                challandetailsbtnActionPerformed(evt);
            }
        });
        jPanel3.add(challandetailsbtn);
        challandetailsbtn.setBounds(260, 550, 210, 40);

        needhelpbtn.setBackground(new java.awt.Color(204, 204, 204));
        needhelpbtn.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        needhelpbtn.setText("Need Help?");
        needhelpbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                needhelpbtnActionPerformed(evt);
            }
        });
        jPanel3.add(needhelpbtn);
        needhelpbtn.setBounds(720, 550, 170, 40);

        passwordtxt.setFont(new java.awt.Font("Arial", 0, 30)); // NOI18N
        passwordtxt.setForeground(new java.awt.Color(255, 255, 51));
        passwordtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordtxtActionPerformed(evt);
            }
        });
        jPanel3.add(passwordtxt);
        passwordtxt.setBounds(430, 340, 490, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1071, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
             
             String sql="Select username,password from trafficofficer ";
           String user=usernametxt.getText();
           String pwd=String.valueOf(passwordtxt.getPassword());
           try{
              rs= st.executeQuery(sql);
            int tmp=0;
            while(rs.next()) {
              String uname = rs.getString("username");
              String password=rs.getString("password");

            if ((user.equals(uname)) && (pwd.equals(password))) {
              new TrafficFines().setVisible(true);
              tmp++;
         }

     }
     if (tmp==0) {
             JOptionPane.showMessageDialog(null, "Username and Password not in database!");
         }
       }     
                     
        catch (HeadlessException | SQLException ex) {
           JOptionPane.showMessageDialog(null,ex);
        }  
     
    }//GEN-LAST:event_nextbtnActionPerformed

    private void usernametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernametxtActionPerformed
                // TODO add your handling code here:                              
    }//GEN-LAST:event_usernametxtActionPerformed

    private void passwordtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordtxtActionPerformed
         // TODO add your handling code here        
    }//GEN-LAST:event_passwordtxtActionPerformed

    private void needhelpbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_needhelpbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_needhelpbtnActionPerformed

    private void challandetailsbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_challandetailsbtnActionPerformed
        // TODO add your handling code here:

        new Challan_Details().setVisible(true);
    }//GEN-LAST:event_challandetailsbtnActionPerformed

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
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login_Page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Page().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton challandetailsbtn;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel loginlbl;
    private javax.swing.JButton needhelpbtn;
    private javax.swing.JButton nextbtn;
    private javax.swing.JLabel passwordlbl;
    private javax.swing.JPasswordField passwordtxt;
    private javax.swing.JLabel usernamelbl;
    private javax.swing.JTextField usernametxt;
    // End of variables declaration//GEN-END:variables
}
