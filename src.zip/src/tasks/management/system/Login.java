 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tasks.management.system;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.*;


public class Login extends javax.swing.JFrame {
    public User logged_user;
    public Login() {
        initComponents();
    }
    
    public boolean validateLogin(){
        String id = username.getText();
        String pw = password.getText();
        if (id.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter the username.");
            return false;
        }
         if (pw.equals("")){
            JOptionPane.showMessageDialog(this, "Please enter the password.");
            return false;
        }
         return true;
    }

    public void Login(){
        String user_name = username.getText();
        String pw = password.getText();
        int loginAsIndex = loginAs.getSelectedIndex();
        String logged_in_as = loginAs.getItemAt(loginAsIndex);
        logged_in_as = logged_in_as.toLowerCase();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tasksmanagement","root","1234");
            PreparedStatement pst = con.prepareStatement("select id, role from user where username = ? and password = ? and role = ?");
            pst.setString(1, user_name);
            pst.setString(2, pw);
            pst.setString(3, logged_in_as);
            ResultSet rs = pst.executeQuery();
            if (rs.next()){
                int user_id = rs.getInt(1);
                logged_user = new User(user_id, user_name, pw, logged_in_as);
                int logged_user_id = logged_user.getID();
                if (logged_in_as.equals("employee")){
                    JOptionPane.showMessageDialog(this, "Logged in as employee");
                    this.dispose();
                    EmployeeMissions emp = new EmployeeMissions(logged_user_id);
                    emp.setVisible(true);
                }
                else if (logged_in_as.equals("admin")){
                    JOptionPane.showMessageDialog(this, "Logged in as admin.");
                    this.dispose();
                    AdminProjects ad = new AdminProjects();
                    ad.setVisible(true);
                }
                else if (logged_in_as.equals("leader")){
                    JOptionPane.showMessageDialog(this, "Logged in as leader.");
                    this.dispose();
                    LeaderShowTasks ldr = new LeaderShowTasks();
                    ldr.setVisible(true);
                }
                
            }
            else {
                JOptionPane.showMessageDialog(this, "Wrong username or password. Please contact the admin.");
            }
        } catch (HeadlessException | ClassNotFoundException | SQLException e) {
        }
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        loginAs = new javax.swing.JComboBox<>();
        Exit = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\20115\\Desktop\\final_icon.png")); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(74, 74, 74)
                    .addComponent(jLabel21)
                    .addContainerGap(310, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(90, 90, 90)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(90, Short.MAX_VALUE)))
        );

        jPanel6.setLayout(null);

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel17.setText("USERNAME :");
        jPanel6.add(jLabel17);
        jLabel17.setBounds(60, 170, 120, 45);

        username.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel6.add(username);
        username.setBounds(180, 170, 200, 40);

        loginAs.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        loginAs.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADMIN", "EMPLOYEE", "LEADER" }));
        jPanel6.add(loginAs);
        loginAs.setBounds(180, 100, 200, 40);

        Exit.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        Exit.setText("X");
        Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitMouseClicked(evt);
            }
        });
        jPanel6.add(Exit);
        Exit.setBounds(450, 10, 20, 20);

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel19.setText("PASSWORD :");
        jPanel6.add(jLabel19);
        jLabel19.setBounds(60, 220, 120, 45);

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel20.setText("LOGIN AS :");
        jPanel6.add(jLabel20);
        jLabel20.setBounds(60, 100, 120, 45);

        loginButton.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        loginButton.setText("LOGIN");
        loginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginButtonMouseClicked(evt);
            }
        });
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        jPanel6.add(loginButton);
        loginButton.setBounds(140, 300, 140, 50);

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel22.setText("LOGIN");
        jPanel6.add(jLabel22);
        jLabel22.setBounds(160, 10, 120, 45);
        jPanel6.add(password);
        password.setBounds(180, 220, 200, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitMouseClicked
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_ExitMouseClicked

    private void loginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginButtonMouseClicked
    // TODO add your handling code here:
    }//GEN-LAST:event_loginButtonMouseClicked

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginButtonActionPerformed
        if (validateLogin()){
            Login();
        }
    }//GEN-LAST:event_loginButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox<String> loginAs;
    private javax.swing.JButton loginButton;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables
}
