import javax.swing.*;
import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author NIMESH NAIR
 */
public class login extends javax.swing.JFrame {

    /**
     * Creates new form login
     */
    public login() {
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

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        pass = new javax.swing.JPasswordField();
        butlog = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 102));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.red);
        jLabel1.setText("LOGIN PAGE");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("PASSWORD");

        id.setForeground(new java.awt.Color(255, 0, 0));

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        butlog.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        butlog.setText("LOGIN");
        butlog.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butlogActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "STUDENT", "FACULTY" }));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("USER TYPE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(186, 186, 186)
                                .addComponent(butlog, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(butlog, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(556, 439));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void butlogActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butlogActionPerformed
        
        Connection conn=null;
        ResultSet rs=null,rs2=null,rs3=null;
        PreparedStatement ps=null,ps2=null,ps3=null;
        try {
            conn =   (Connection) DriverManager.getConnection("jdbc:postgresql://localhost:5432/UNIVERSITY","postgres","1234");
            String a="118A9090";        
            String s= (String) jComboBox1.getSelectedItem();
            String[] options={"Student","Faculty"};
        if(id.getText().equals(a) &&  pass.getText().equals("12345678") && s.equals("ADMIN") )
        {

            int x=JOptionPane.showOptionDialog(null, "LOGIN SUCCESSFULL.\nWHOSE DATABASE DO YOU WANT TO ACCESS ?","OPTIONS",JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            if(x==0)
            {
                AdminForm j=new AdminForm();
                j.setVisible(true);
            }
            
            if(x==1)
            {
                AdminForm2 j=new AdminForm2();
                j.setVisible(true);
            }
            
            this.dispose();
        }
        
        else if(s=="STUDENT")
                {
                    try{
                     ps = conn.prepareStatement("select student_id,s_pass from Student where(student_id=? and s_pass=?)");
                     ps.setString(1,id.getText());
                     ps.setString(2,pass.getText());
                     rs=ps.executeQuery();
                     while(rs.next())
                     {
                     if(id.getText().equals(rs.getString(1)) && pass.getText().equals(rs.getString(2)))
                     {
                     JOptionPane.showInternalMessageDialog(null, "LOGIN SUCCESSFULL");   
                     Student j=new Student();
                     j.setVisible(true);
                     
                     String st="select c_name from course where d_id in (select d_id from student where student_id=? )";
        
                     ps2=conn.prepareStatement("select * from student where student_id =?");
                     ps3=conn.prepareStatement(st);
                     ps2.setString(1,id.getText());
                     ps3.setString(1,id.getText());
                     rs2=ps2.executeQuery();
                     rs3=ps3.executeQuery();
             while(rs2.next()) 
              {
                 j.id.setText(rs2.getString("student_id"));
                 j.name.setText(rs2.getString("stu_name"));
                 j.age.setText(""+rs2.getInt("age")); 
                 j.contact.setText(rs2.getString("mob_no"));
                 j.pass2.setText(rs2.getString("s_pass"));
                 j.dep.setText(""+rs2.getInt("d_id"));
                 j.proj.setText(rs2.getString("project"));
                 j.Welcome.setText("WELCOME "+rs2.getString("stu_name"));
        
              }
             while(rs3.next())
              {
                       
                     j.c.append(rs3.getString("c_name"));
                     j.c.append("\n");
                     
              }
             conn.close();
             this.dispose();
                    }
                     else{
                       JOptionPane.showInternalMessageDialog(null, "LOGIN UNSUCCESSFULL");
                     }
                }
                     
             
         }catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
}
         else if(s=="FACULTY")
                {
                    try{
                     ps = conn.prepareStatement("select faculty_id,f_pass from faculty where(faculty_id=? and f_pass=?)");
                     ps.setString(1,id.getText());
                     ps.setString(2,pass.getText());
                     rs=ps.executeQuery();
                     while(rs.next())
                     {
                     if(id.getText().equals(rs.getString(1)) && pass.getText().equals(rs.getString(2)))
                     {
                     JOptionPane.showInternalMessageDialog(null, "LOGIN SUCCESSFULL");   
                     Faculty j=new Faculty();
                     j.setVisible(true);
                     
                     ps2=conn.prepareStatement("select * from faculty where faculty_id =?");
                    
                     ps2.setString(1,id.getText()); 
                     rs2=ps2.executeQuery();
                     while(rs2.next())
                    {
                        j.id.setText(rs2.getString("faculty_id"));
                        j.name.setText(rs2.getString("faculty_name"));
                        j.age.setText(""+rs2.getInt("age")); 
                        j.contact.setText(rs2.getString("mob_no"));
                        j.dob.setText(rs2.getString("dob"));
                        j.pass.setText(rs2.getString("f_pass"));
                        j.gender.setText(rs2.getString("gender"));
                        j.dep.setText(""+rs2.getInt("d_id"));
                        j.welcome.setText("WELCOME "+rs2.getString("faculty_name"));
        
                    }
                     conn.close();
                     this.dispose();
                     }
                     else{
                       JOptionPane.showInternalMessageDialog(null, "LOGIN UNSUCCESSFULL");
                     }
                     }
                    }
                     catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        }
                     
                       
                     
                         
                     
                         
                     }
        
        else
         {
             JOptionPane.showInternalMessageDialog(null, "LOGIN UNSUCCESSFULL"); 
         }
         
        } catch (SQLException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
        } 

            
    
    }//GEN-LAST:event_butlogActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

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
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new login().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butlog;
    private javax.swing.JTextField id;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField pass;
    // End of variables declaration//GEN-END:variables
}
