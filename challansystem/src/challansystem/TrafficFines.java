
package challansystem;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;

public class TrafficFines extends Connection {

    public TrafficFines() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        cb2 = new javax.swing.JCheckBox();
        cb14 = new javax.swing.JCheckBox();
        cb1 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JCheckBox();
        cb4 = new javax.swing.JCheckBox();
        cb5 = new javax.swing.JCheckBox();
        cb6 = new javax.swing.JCheckBox();
        cb7 = new javax.swing.JCheckBox();
        cb8 = new javax.swing.JCheckBox();
        cb9 = new javax.swing.JCheckBox();
        cb10 = new javax.swing.JCheckBox();
        cb11 = new javax.swing.JCheckBox();
        cb12 = new javax.swing.JCheckBox();
        cb13 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        subm = new javax.swing.JButton();
        cal = new javax.swing.JButton();
        cal1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        totaltf = new javax.swing.JTextField();
        vehicleidtxt = new javax.swing.JTextField();
        datetxt = new com.toedter.calendar.JDateChooser();
        localtxt = new javax.swing.JTextField();
        vehicleidtxtl = new javax.swing.JLabel();
        personnametxtl1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("      Traffic Penalty");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(273, 273, 273)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 80));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cb2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb2.setText("  2.  Driving Vehicle With out a license");
        cb2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb2ActionPerformed(evt);
            }
        });
        jPanel2.add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        cb14.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb14.setText("  14.  Overloaded Vehicle");
        cb14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb14ActionPerformed(evt);
            }
        });
        jPanel2.add(cb14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 740, -1, -1));

        cb1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb1.setText("   1.  Drunken Driving");
        cb1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cb1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb1ActionPerformed(evt);
            }
        });
        jPanel2.add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        cb3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb3.setText("  3.  Driving Vehicle With out a Permit");
        cb3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb3ActionPerformed(evt);
            }
        });
        jPanel2.add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        cb4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb4.setText("  4.  Speeding or racing");
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });
        jPanel2.add(cb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        cb5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb5.setText("  5.  Not wearing helmet");
        cb5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb5ActionPerformed(evt);
            }
        });
        jPanel2.add(cb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        cb6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb6.setText("  6.  Driving despite disqualification of license or permit ");
        cb6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb6ActionPerformed(evt);
            }
        });
        jPanel2.add(cb6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        cb7.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb7.setText("  7.  Overloading of two-Wheelers");
        cb7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb7ActionPerformed(evt);
            }
        });
        jPanel2.add(cb7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        cb8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb8.setText("  8.  Dangerous Driving  Violating traffic signals ");
        cb8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb8ActionPerformed(evt);
            }
        });
        jPanel2.add(cb8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, -1));

        cb9.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb9.setText("  9.  Using unauthorised vehicles without license");
        cb9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb9ActionPerformed(evt);
            }
        });
        jPanel2.add(cb9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 490, -1, -1));

        cb10.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb10.setText("  10.  Not using seatbelt while driving ");
        cb10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb10ActionPerformed(evt);
            }
        });
        jPanel2.add(cb10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        cb11.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb11.setText("  11. Driving vehicle without Insorance");
        cb11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb11ActionPerformed(evt);
            }
        });
        jPanel2.add(cb11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 590, -1, -1));

        cb12.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb12.setText("  12.  Violating Rules and Regulations ");
        cb12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb12ActionPerformed(evt);
            }
        });
        jPanel2.add(cb12, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 640, -1, -1));

        cb13.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cb13.setText("  13.  Traveling without ticke  pass or permit");
        cb13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb13ActionPerformed(evt);
            }
        });
        jPanel2.add(cb13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 690, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("       Violation");
        jLabel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 180, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("   20000");
        jLabel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 730, 110, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("   Penalty");
        jLabel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, 110, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("   10000");
        jLabel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 80, 110, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("   5000");
        jLabel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 130, 110, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("   10000");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 180, 110, 30));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("    5000");
        jLabel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 230, 110, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("   1000");
        jLabel10.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 110, 30));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("   10000");
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 330, 110, 30));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("    2000");
        jLabel12.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 110, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("   5000");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 430, 110, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("   5000");
        jLabel14.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 110, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setText("    1000");
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 530, 110, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("   1000");
        jLabel16.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 580, 110, 30));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("   1000");
        jLabel17.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 630, 110, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("   500");
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 680, 110, 30));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 740, 800));

        subm.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        subm.setText("Submit");
        subm.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submActionPerformed(evt);
            }
        });
        getContentPane().add(subm, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 670, 140, 50));

        cal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cal.setText("Reset");
        cal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calActionPerformed(evt);
            }
        });
        getContentPane().add(cal, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 590, 140, 50));

        cal1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cal1.setText("Calculate");
        cal1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cal1ActionPerformed(evt);
            }
        });
        getContentPane().add(cal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 430, 170, 50));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("      Total");
        jLabel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 510, 120, 40));
        getContentPane().add(totaltf, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 510, 120, 40));

        vehicleidtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                vehicleidtxtKeyPressed(evt);
            }
        });
        getContentPane().add(vehicleidtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 130, 120, 50));
        getContentPane().add(datetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 210, 120, 40));
        getContentPane().add(localtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 290, 120, 40));

        vehicleidtxtl.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(vehicleidtxtl, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 200, 140, 20));

        personnametxtl1.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(personnametxtl1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 150, 140, 20));

        jButton1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton1.setText("Vehicle No");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 130, 120, 50));

        jButton2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton2.setText("Date");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 110, 40));

        jButton3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jButton3.setText("Location");
        jButton3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 290, 110, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb2ActionPerformed

    private void cb14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb14ActionPerformed

    private void cb1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb1ActionPerformed

    private void cb3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb3ActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb4ActionPerformed

    private void cb5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb5ActionPerformed

    private void cb6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb6ActionPerformed

    private void cb7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb7ActionPerformed

    private void cb8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb8ActionPerformed

    private void cb9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb9ActionPerformed

    private void cb10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb10ActionPerformed

    private void cb11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb11ActionPerformed

    private void cb12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb12ActionPerformed

    private void cb13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb13ActionPerformed
public void addPlace( String cbox, String date, String vid,Double point,String local) throws Exception{

       

        String sql="Insert into offence(vehicle_no,odescription,offencedate,Location,amount)VALUES (?,?,?,?,?)";

        ps=conn.prepareStatement(sql);
        ps.setString(2,cbox);
        ps.setString(3,date);
        ps.setString(1,vid);
        
        ps.setDouble(5,point);
       ps.setString(4,local);
        ps.executeUpdate();
        conn.close();
        ps.close();
    }
    private void submActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submActionPerformed
    //    Traffic_Management_Center.setVisible setVisible = new Traffic_Management_Center.setVisible(true);
     String place=null;
            //    String a=personnametxt.getText();
                String b=vehicleidtxt.getText();
                SimpleDateFormat d =new SimpleDateFormat("YYYY-MM-dd");
         String date = d.format(datetxt.getDate());

                if(cb1.isSelected() && cb3.isSelected() && cb5.isSelected())
                {
                    place=String.valueOf(cb1.getText())+String.valueOf(cb3.getText())+String.valueOf(cb5.getText());
                } 
                
                if(cb2.isSelected()&&cb4.isSelected() && cb6.isSelected())
                {
                    place=String.valueOf(cb2.getText())+String.valueOf(cb4.getText())+String.valueOf(cb6.getText());

                }
                
                 if(cb1.isSelected()&&cb2.isSelected() && cb3.isSelected())
                {
                    place=String.valueOf(cb1.getText())+String.valueOf(cb2.getText())+String.valueOf(cb3.getText());

                }
                 
                  if(cb1.isSelected()&&cb2.isSelected() && cb4.isSelected())
                {
                    place=String.valueOf(cb1.getText())+String.valueOf(cb2.getText())+String.valueOf(cb4.getText());

                }
                   if(cb1.isSelected()&&cb2.isSelected() && cb6.isSelected())
                {
                    place=String.valueOf(cb1.getText())+String.valueOf(cb2.getText())+String.valueOf(cb6.getText());

                }
                   
                    if(cb1.isSelected()&&cb2.isSelected() && cb5.isSelected())
                {
                    place=String.valueOf(cb1.getText())+String.valueOf(cb2.getText())+String.valueOf(cb5.getText());

                }
                     if(cb2.isSelected()&&cb4.isSelected() && cb5.isSelected())
                {
                    place=String.valueOf(cb2.getText())+String.valueOf(cb4.getText())+String.valueOf(cb5.getText());

                }
                      if(cb14.isSelected()&&cb13.isSelected() && cb12.isSelected())
                {
                    place=String.valueOf(cb12.getText())+String.valueOf(cb13.getText())+String.valueOf(cb14.getText());

                }
                  
                          
                       if(cb1.isSelected()&&cb2.isSelected() && cb3.isSelected()&&cb4.isSelected()&&cb5.isSelected() && cb6.isSelected())
                {
                    place=String.valueOf(cb3.getText()+cb4.getText())+String.valueOf(cb1.getText())+String.valueOf(cb2.getText())+String.valueOf(cb5.getText())+String.valueOf(cb6.getText());

                }
                       
                           
                       if(cb1.isSelected()&&cb2.isSelected() && cb3.isSelected()&&cb4.isSelected())
                {
                    place=String.valueOf(cb3.getText()+cb4.getText())+String.valueOf(cb1.getText())+String.valueOf(cb2.getText());

                }
                      
                      
           
               Double total=Double.parseDouble(totaltf.getText());
             
              String local=localtxt.getText();
   
     try {
                    addPlace(place,date,b,total,local);
                    JOptionPane.showMessageDialog(null,"saved");
                    new Traffic_Management_Center().setVisible(true);

                } catch (Exception e1) {
                    // TODO Auto-generated catch block
                    JOptionPane.showMessageDialog(null,e1);
                }
        // TODO add your handling code here:
    }//GEN-LAST:event_submActionPerformed

    private void calActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calActionPerformed
         
        
         cb1.setSelected(false);
         cb2.setSelected(false);
         cb3.setSelected(false);
         cb4.setSelected(false);
         cb5.setSelected(false);
         cb6.setSelected(false);
         cb7.setSelected(false);
         cb8.setSelected(false);
         cb9.setSelected(false);
         cb10.setSelected(false);
         cb11.setSelected(false);
         cb12.setSelected(false);
         cb13.setSelected(false);
         cb14.setSelected(false);
         
         
         



        // TODO add your handling code here:
    }//GEN-LAST:event_calActionPerformed

    private void cal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cal1ActionPerformed
             double total=0;
             
             if(cb1.isSelected())
             {
                 total=total+10000;
             }
              if(cb2.isSelected())
             {
                 total=total+5000;
             }
           
               if(cb3.isSelected())
             {
                 total=total+10000;
             }
              if(cb4.isSelected())
             {
                 total=total+5000;
             }
              if(cb5.isSelected())
             {
                 total=total+1000;
             }
              if(cb6.isSelected())
             {
                 total=total+10000;
             }
              if(cb7.isSelected())
             {
                 total=total+2000;
             }
              if(cb8.isSelected())
             {
                 total=total+5000;
             }
              if(cb9.isSelected())
             {
                 total=total+5000;
             }
              if(cb10.isSelected())
             {
                 total=total+1000;
             }
              if(cb11.isSelected())
             {
                 total=total+1000;
             }
              if(cb12.isSelected())
             {
                 total=total+1000;
             }
              if(cb13.isSelected())
             {
                 total=total+500;
             }
              if(cb14.isSelected())
             {
                 total=total+20000;
             }
         
          totaltf.setText(Double.toString(total));





       




        // TODO add your handling code here:
    }//GEN-LAST:event_cal1ActionPerformed

    private void vehicleidtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_vehicleidtxtKeyPressed

 String Vi=vehicleidtxt.getText();
    int length=Vi.length();
    char c=evt.getKeyChar();
    if(Character.isLetter(c)){
       
           
            vehicleidtxtl.setText("");
        
                    
       
    }

        else{   
              
                 
        if(length>15){
           
            vehicleidtxtl.setText("Enter valid Vehicle ID Number");
        }
         
         else
         
         {
                  vehicleidtxt.setEditable(true);
                  vehicleidtxtl.setText("");
                 }
     
                  
                 
                }
        // TODO add your handling code here:
    }//GEN-LAST:event_vehicleidtxtKeyPressed

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
            java.util.logging.Logger.getLogger(TrafficFines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrafficFines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrafficFines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrafficFines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrafficFines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cal;
    private javax.swing.JButton cal1;
    private javax.swing.JCheckBox cb1;
    private javax.swing.JCheckBox cb10;
    private javax.swing.JCheckBox cb11;
    private javax.swing.JCheckBox cb12;
    private javax.swing.JCheckBox cb13;
    private javax.swing.JCheckBox cb14;
    private javax.swing.JCheckBox cb2;
    private javax.swing.JCheckBox cb3;
    private javax.swing.JCheckBox cb4;
    private javax.swing.JCheckBox cb5;
    private javax.swing.JCheckBox cb6;
    private javax.swing.JCheckBox cb7;
    private javax.swing.JCheckBox cb8;
    private javax.swing.JCheckBox cb9;
    private com.toedter.calendar.JDateChooser datetxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField localtxt;
    private javax.swing.JLabel personnametxtl1;
    private javax.swing.JButton subm;
    private javax.swing.JTextField totaltf;
    private javax.swing.JTextField vehicleidtxt;
    private javax.swing.JLabel vehicleidtxtl;
    // End of variables declaration//GEN-END:variables

    static class setVisible {

        public setVisible(boolean b) {
        }
    }
}
