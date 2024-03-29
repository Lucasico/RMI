/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.telas;


/**
 *
 * @author lucas
 */
public class DashboardUsuario extends javax.swing.JFrame {

    /**
     * Creates new form DashboardUsuario
     */
    public DashboardUsuario() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        chamaCliente = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cadastrar = new javax.swing.JLabel();
        listaCadastros = new javax.swing.JLabel();
        cadastrarCarro = new javax.swing.JLabel();
        listaCarros = new javax.swing.JLabel();
        cadastroLocar = new javax.swing.JLabel();
        listaLocar = new javax.swing.JLabel();
        sair = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DASHBOARD");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(54, 127, 169));

        jPanel4.setBackground(new java.awt.Color(54, 127, 169));

        jPanel5.setBackground(new java.awt.Color(54, 127, 169));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("My Dashboard");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(54, 127, 169));

        chamaCliente.setBackground(new java.awt.Color(153, 0, 51));
        chamaCliente.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        chamaCliente.setForeground(new java.awt.Color(255, 255, 255));
        chamaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client/telas/imagens/cliente.png"))); // NOI18N
        chamaCliente.setText("Cliente");
        chamaCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        chamaCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chamaClienteMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client/telas/imagens/car.png"))); // NOI18N
        jLabel3.setText("Carro");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client/telas/imagens/car-contract.png"))); // NOI18N
        jLabel4.setText("Locar");

        cadastrar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cadastrar.setForeground(new java.awt.Color(255, 255, 255));
        cadastrar.setText("Cadastrar");
        cadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarMouseClicked(evt);
            }
        });

        listaCadastros.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        listaCadastros.setForeground(new java.awt.Color(255, 255, 255));
        listaCadastros.setText("Listar");
        listaCadastros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaCadastros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCadastrosMouseClicked(evt);
            }
        });

        cadastrarCarro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cadastrarCarro.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarCarro.setText("Cadastrar");
        cadastrarCarro.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastrarCarro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarCarroMouseClicked(evt);
            }
        });
        cadastrarCarro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cadastrarCarroKeyPressed(evt);
            }
        });

        listaCarros.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        listaCarros.setForeground(new java.awt.Color(255, 255, 255));
        listaCarros.setText("Listar");
        listaCarros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaCarros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaCarrosMouseClicked(evt);
            }
        });
        listaCarros.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                listaCarrosKeyPressed(evt);
            }
        });

        cadastroLocar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cadastroLocar.setForeground(new java.awt.Color(255, 255, 255));
        cadastroLocar.setText("Cadastrar");
        cadastroLocar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cadastroLocar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastroLocarMouseClicked(evt);
            }
        });

        listaLocar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        listaLocar.setForeground(new java.awt.Color(255, 255, 255));
        listaLocar.setText("Listar");
        listaLocar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        listaLocar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaLocarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(chamaCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(listaCadastros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(169, 169, 169)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaCarros, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastrarCarro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 164, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaLocar, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cadastroLocar))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cadastrar, chamaCliente, jLabel3, jLabel4, listaCadastros});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chamaCliente)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cadastrar)
                        .addComponent(cadastrarCarro))
                    .addComponent(cadastroLocar, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listaCadastros)
                    .addComponent(listaCarros)
                    .addComponent(listaLocar))
                .addContainerGap(109, Short.MAX_VALUE))
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cadastrar, chamaCliente, jLabel3, jLabel4, listaCadastros});

        sair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        sair.setForeground(new java.awt.Color(255, 255, 255));
        sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/client/telas/imagens/logout.png"))); // NOI18N
        sair.setText("sair");
        sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sairMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(sair)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(sair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(6, 6, 6))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chamaClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chamaClienteMouseClicked
       
    }//GEN-LAST:event_chamaClienteMouseClicked

    private void cadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarMouseClicked
        CadastroUsuario usuario = new CadastroUsuario();
        usuario.setVisible(true); 
        dispose();
       
    }//GEN-LAST:event_cadastrarMouseClicked

    private void listaCadastrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCadastrosMouseClicked
        ListaUsuario lista = new ListaUsuario();
        lista.setVisible(true);
        dispose();
    }//GEN-LAST:event_listaCadastrosMouseClicked

    private void sairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sairMouseClicked
      TelaLogin retorna = new TelaLogin();
      retorna.setVisible(true);
      dispose();
    }//GEN-LAST:event_sairMouseClicked

    private void cadastrarCarroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cadastrarCarroKeyPressed
       
    }//GEN-LAST:event_cadastrarCarroKeyPressed

    private void listaCarrosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_listaCarrosKeyPressed
        
    }//GEN-LAST:event_listaCarrosKeyPressed

    private void cadastrarCarroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarCarroMouseClicked
        CadastroCarro carro = new CadastroCarro();
        carro.setVisible(true); 
        dispose();
    }//GEN-LAST:event_cadastrarCarroMouseClicked

    private void listaCarrosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaCarrosMouseClicked
        ListaCarros listCar = new ListaCarros();
        listCar.setVisible(true); 
        dispose();
    }//GEN-LAST:event_listaCarrosMouseClicked

    private void cadastroLocarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastroLocarMouseClicked
        CadastroLocar locar = new CadastroLocar();
        locar.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_cadastroLocarMouseClicked

    private void listaLocarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaLocarMouseClicked
        ListaLocar listar = new ListaLocar();
        listar.setVisible(true);
        dispose();
    }//GEN-LAST:event_listaLocarMouseClicked

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
            java.util.logging.Logger.getLogger(DashboardUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cadastrar;
    private javax.swing.JLabel cadastrarCarro;
    private javax.swing.JLabel cadastroLocar;
    private javax.swing.JLabel chamaCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel listaCadastros;
    private javax.swing.JLabel listaCarros;
    private javax.swing.JLabel listaLocar;
    private javax.swing.JLabel sair;
    // End of variables declaration//GEN-END:variables
}
