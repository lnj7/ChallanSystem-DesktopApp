/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challansystem;

import java.sql.SQLException;
import java.util.Random;
import javax.swing.JOptionPane;


public class Traffic_Management_Center extends Connection {

    
    public Traffic_Management_Center() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        trafficMClbl = new javax.swing.JLabel();
        reciptnolbl = new javax.swing.JLabel();
        cntxt = new javax.swing.JTextField();
        vtypetxt = new javax.swing.JTextField();
        vehiclenolbl = new javax.swing.JLabel();
        vtype = new javax.swing.JTextField();
        vehicletypelbl = new javax.swing.JLabel();
        pname = new javax.swing.JTextField();
        officetnamelbl = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        datelbl = new javax.swing.JLabel();
        approvedbytxt = new javax.swing.JLabel();
        violationlocationlbl = new javax.swing.JLabel();
        amt = new javax.swing.JLabel();
        vlo = new javax.swing.JTextField();
        violationtypetxt = new javax.swing.JLabel();
        grbtn = new javax.swing.JButton();
        amounttxt = new javax.swing.JTextField();
        vio = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        grbtn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        trafficMClbl.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        trafficMClbl.setText("    Allahabad Traffic Police");

        reciptnolbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        reciptnolbl.setForeground(new java.awt.Color(51, 0, 51));
        reciptnolbl.setText("Challan No. :");

        cntxt.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        cntxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cntxtActionPerformed(evt);
            }
        });

        vtypetxt.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        vtypetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vtypetxtActionPerformed(evt);
            }
        });
        vtypetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                vtypetxtKeyReleased(evt);
            }
        });

        vehiclenolbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        vehiclenolbl.setText("Vehicle No :");

        vtype.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        vehicletypelbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        vehicletypelbl.setText("Vehicle Type :");

        pname.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        officetnamelbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        officetnamelbl.setText("Violator Name :");

        date.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        datelbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        datelbl.setText("Date :");

        approvedbytxt.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        approvedbytxt.setText("Approved By :");

        violationlocationlbl.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        violationlocationlbl.setText("Violation Location:");

        amt.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        amt.setText("Amount :");

        vlo.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        violationtypetxt.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        violationtypetxt.setText("Violation type :");

        grbtn.setText("Generate Receipt");
        grbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grbtnActionPerformed(evt);
            }
        });

        amounttxt.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        vio.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N

        area.setColumns(20);
        area.setFont(new java.awt.Font("PMingLiU-ExtB", 0, 24)); // NOI18N
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(141, Short.MAX_VALUE))
        );

        grbtn1.setText("Print");
        grbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grbtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(468, Short.MAX_VALUE)
                .addComponent(trafficMClbl, javax.swing.GroupLayout.PREFERRED_SIZE, 501, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(356, 356, 356))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(officetnamelbl)
                                    .addGap(74, 74, 74))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(vehicletypelbl)
                                        .addComponent(vehiclenolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(reciptnolbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(77, 77, 77)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datelbl, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(violationlocationlbl, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amt, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(violationtypetxt)
                                    .addComponent(approvedbytxt, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cntxt, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vtype, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vtypetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vlo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vio, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(396, 396, 396)
                        .addComponent(grbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(grbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(trafficMClbl, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(reciptnolbl)
                            .addComponent(cntxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(vehiclenolbl)
                                    .addComponent(vtypetxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(vtype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(vehicletypelbl))
                                .addGap(161, 161, 161))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(officetnamelbl)
                                    .addComponent(pname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(48, 48, 48)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(datelbl)
                                    .addComponent(date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(violationlocationlbl)
                            .addComponent(vlo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(57, 57, 57)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(violationtypetxt)
                            .addComponent(vio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amt)
                            .addComponent(amounttxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addComponent(approvedbytxt))
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(grbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(grbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jPanel2.setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(736, 736, 736)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(917, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cntxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cntxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cntxtActionPerformed
    
     public void  randomnumbers(){
           Random r = new Random();
           int n = r.nextInt(1000000)+1;
           String val=String.valueOf(n);
           cntxt.setText(val);
     }
    
    
    private void grbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grbtnActionPerformed

  area.setText("******************************************\n");
  area.setText(area.getText()+"  **        Allahabad Traffic Police      **\n");
  area.setText(area.getText()+"*******************************************\n");
        
    area.setText(area.getText()+"Date :" +date.getText()+"\n");
     area.setText(area.getText()+"Challan Number :" +cntxt.getText()+"\n");
      area.setText(area.getText()+"Vehicle Number :" +vtypetxt.getText()+"\n");
      area.setText(area.getText()+"Vehicle Type :" +vtype.getText()+"\n");
      area.setText(area.getText()+"Officer Name :" +pname.getText()+"\n");
      
      area.setText(area.getText()+"Violation Location :" +vlo.getText()+"\n");
      area.setText(area.getText()+"Violation Type :" +vio.getText()+"\n");
      area.setText(area.getText()+"Amount :" +amounttxt.getText()+"\n\n\n");
      
area.setText(area.getText()+"Aproved By :\n\n");
area.setText(area.getText()+"                       Signature :");





        // TODO add your handling code here:
    }//GEN-LAST:event_grbtnActionPerformed

    private void vtypetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vtypetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vtypetxtActionPerformed

    private void vtypetxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vtypetxtKeyReleased
        // TODO add your handling code here:
         String sql="Select * from person where vehicle_no='"+vtypetxt.getText()+"'";
       
        String sql1="Select * from offence where vehicle_no='"+vtypetxt.getText()+"'";
      
        try{
        rs=st.executeQuery(sql);
        if(rs.next()){
            String add1=rs.getString("p_name");
         pname.setText(add1);
         String add2=rs.getString("vehicle_type");
         vtype.setText(add2);
        
    
        }
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,e);
        }
         
          //offence
            try{
        rs=st.executeQuery(sql1);
        if(rs.next()){
             String add1=rs.getString("odescription");
           vio.setText(add1);
              String add2=rs.getString("offencedate");
        date.setText(add2);
              String add3=rs.getString("location");
        vlo.setText(add3);
              String add4=rs.getString("amount");
        amounttxt.setText(add4);
         
       
        
         
        }
        }
        catch(SQLException e){
        JOptionPane.showMessageDialog(null,e);
        }
      
       randomnumbers(); 
        
    }//GEN-LAST:event_vtypetxtKeyReleased

    private void grbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grbtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_grbtn1ActionPerformed

   
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
            java.util.logging.Logger.getLogger(Traffic_Management_Center.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Traffic_Management_Center.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Traffic_Management_Center.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Traffic_Management_Center.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Traffic_Management_Center().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amounttxt;
    private javax.swing.JLabel amt;
    private javax.swing.JLabel approvedbytxt;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField cntxt;
    private javax.swing.JTextField date;
    private javax.swing.JLabel datelbl;
    private javax.swing.JButton grbtn;
    private javax.swing.JButton grbtn1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel officetnamelbl;
    private javax.swing.JTextField pname;
    private javax.swing.JLabel reciptnolbl;
    private javax.swing.JLabel trafficMClbl;
    private javax.swing.JLabel vehiclenolbl;
    private javax.swing.JLabel vehicletypelbl;
    private javax.swing.JTextField vio;
    private javax.swing.JLabel violationlocationlbl;
    private javax.swing.JLabel violationtypetxt;
    private javax.swing.JTextField vlo;
    private javax.swing.JTextField vtype;
    private javax.swing.JTextField vtypetxt;
    // End of variables declaration//GEN-END:variables

    static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
