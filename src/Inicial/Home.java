
package Inicial;

public class Home extends javax.swing.JFrame {

    public Home() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuHome = new javax.swing.JMenu();
        itmHistoria = new javax.swing.JMenuItem();
        mnuServicos = new javax.swing.JMenu();
        itmHotel = new javax.swing.JMenuItem();
        itmBanhoTosa = new javax.swing.JMenuItem();
        itmPetShop = new javax.swing.JMenuItem();
        mnuMuralDeFotos = new javax.swing.JMenu();
        itmAvaliar = new javax.swing.JMenuItem();
        mnuLogin = new javax.swing.JMenu();
        itmLogin = new javax.swing.JMenuItem();
        mnuContato = new javax.swing.JMenu();
        itmContato = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Home");
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Inicial/fotodehome.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.setMaximumSize(new java.awt.Dimension(1042, 0));
        jLabel1.setMinimumSize(new java.awt.Dimension(1042, 0));
        jLabel1.setName(""); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-290, -100, 940, 450);

        jMenuBar1.setBackground(new java.awt.Color(255, 248, 204));
        jMenuBar1.setForeground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(100, 100));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(50, 70));

        mnuHome.setText("Home");

        itmHistoria.setText("História");
        itmHistoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmHistoriaActionPerformed(evt);
            }
        });
        mnuHome.add(itmHistoria);

        jMenuBar1.add(mnuHome);

        mnuServicos.setText("Serviços    ");

        itmHotel.setText("Hotel");
        itmHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmHotelActionPerformed(evt);
            }
        });
        mnuServicos.add(itmHotel);

        itmBanhoTosa.setText("Banho e Tosa");
        itmBanhoTosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmBanhoTosaActionPerformed(evt);
            }
        });
        mnuServicos.add(itmBanhoTosa);

        itmPetShop.setText("Pet Shop");
        itmPetShop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmPetShopActionPerformed(evt);
            }
        });
        mnuServicos.add(itmPetShop);

        jMenuBar1.add(mnuServicos);

        mnuMuralDeFotos.setText("Mural de Fotos       ");

        itmAvaliar.setText("Avaliar");
        itmAvaliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAvaliarActionPerformed(evt);
            }
        });
        mnuMuralDeFotos.add(itmAvaliar);

        jMenuBar1.add(mnuMuralDeFotos);

        mnuLogin.setText("Login       ");

        itmLogin.setText("Login");
        itmLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmLoginActionPerformed(evt);
            }
        });
        mnuLogin.add(itmLogin);

        jMenuBar1.add(mnuLogin);

        mnuContato.setText("Contato");

        itmContato.setText("Contato");
        itmContato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmContatoActionPerformed(evt);
            }
        });
        mnuContato.add(itmContato);

        jMenuBar1.add(mnuContato);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(564, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void itmHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmHotelActionPerformed
        new Serviços().setVisible(true);
    }//GEN-LAST:event_itmHotelActionPerformed

    private void itmBanhoTosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmBanhoTosaActionPerformed
        new Serviços().setVisible(true);
    }//GEN-LAST:event_itmBanhoTosaActionPerformed

    private void itmPetShopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmPetShopActionPerformed
        new Serviços().setVisible(true);
    }//GEN-LAST:event_itmPetShopActionPerformed

    private void itmAvaliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAvaliarActionPerformed
        new MuraldeFotos().setVisible(true);
    }//GEN-LAST:event_itmAvaliarActionPerformed

    private void itmLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmLoginActionPerformed
        new Logiin().setVisible(true);
    }//GEN-LAST:event_itmLoginActionPerformed

    private void itmContatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmContatoActionPerformed
        new Contato().setVisible(true);
    }//GEN-LAST:event_itmContatoActionPerformed

    private void itmHistoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmHistoriaActionPerformed
        new História().setVisible(true);
    }//GEN-LAST:event_itmHistoriaActionPerformed

        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itmAvaliar;
    private javax.swing.JMenuItem itmBanhoTosa;
    private javax.swing.JMenuItem itmContato;
    private javax.swing.JMenuItem itmHistoria;
    private javax.swing.JMenuItem itmHotel;
    private javax.swing.JMenuItem itmLogin;
    private javax.swing.JMenuItem itmPetShop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu mnuContato;
    private javax.swing.JMenu mnuHome;
    private javax.swing.JMenu mnuLogin;
    private javax.swing.JMenu mnuMuralDeFotos;
    private javax.swing.JMenu mnuServicos;
    // End of variables declaration//GEN-END:variables

}