package most;

import java.awt.Choice;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.SwingUtilities;

/**
 *
 * @author Rafał
 */
public class BridgeFrame extends javax.swing.JFrame implements Runnable {

    private int threadSleepTime = 1000;
    private final Helper helper = new Helper();

    public BridgeFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jPanel1 = new javax.swing.JPanel();
        comboBoxSelectWay = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtFieldAddCars = new javax.swing.JTextField();
        btnAddCars = new javax.swing.JButton();
        labelError = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanelBridge = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        greenEast = new javax.swing.JLabel();
        redEast = new javax.swing.JLabel();
        greenWest = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelCarOnEast = new javax.swing.JLabel();
        jLabelCarOnWest = new javax.swing.JLabel();
        redWest = new javax.swing.JLabel();
        jBtnAddCarToWest = new javax.swing.JButton();
        jBtnAddCarToEast = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jBtnStartWest = new javax.swing.JButton();
        jBtnStartBridge = new javax.swing.JButton();
        jBtnStartEast = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        comboBoxSelectWay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "West", "East" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Add Cars");

        btnAddCars.setText("Add");
        btnAddCars.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCarsActionPerformed(evt);
            }
        });

        labelError.setForeground(new java.awt.Color(255, 0, 0));
        labelError.setText("Error. You must enter a correct number of car.");

        jLabel5.setText("Number of cars:");

        jLabel6.setText("to");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(labelError)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtFieldAddCars, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(comboBoxSelectWay, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAddCars)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFieldAddCars, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboBoxSelectWay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelError)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddCars)
                .addContainerGap())
        );

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imageBridge.png"))); // NOI18N

        greenEast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green.png"))); // NOI18N

        redEast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red.png"))); // NOI18N

        greenWest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/green.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("WEST");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("EAST");

        jLabelCarOnEast.setText("0");

        jLabelCarOnWest.setText("0");
        jLabelCarOnWest.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        redWest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/red.png"))); // NOI18N

        jBtnAddCarToWest.setText("+10");
        jBtnAddCarToWest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddCarToWestActionPerformed(evt);
            }
        });

        jBtnAddCarToEast.setText("+10");
        jBtnAddCarToEast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAddCarToEastActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelBridgeLayout = new javax.swing.GroupLayout(jPanelBridge);
        jPanelBridge.setLayout(jPanelBridgeLayout);
        jPanelBridgeLayout.setHorizontalGroup(
            jPanelBridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBridgeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBridgeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelCarOnWest, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelBridgeLayout.createSequentialGroup()
                        .addComponent(jBtnAddCarToWest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelBridgeLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(greenWest)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redWest)
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelBridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelBridgeLayout.createSequentialGroup()
                        .addComponent(greenEast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(redEast))
                    .addGroup(jPanelBridgeLayout.createSequentialGroup()
                        .addGroup(jPanelBridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelCarOnEast, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtnAddCarToEast)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBridgeLayout.setVerticalGroup(
            jPanelBridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBridgeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel7)
                    .addGroup(jPanelBridgeLayout.createSequentialGroup()
                        .addGroup(jPanelBridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelBridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBtnAddCarToWest))
                            .addGroup(jPanelBridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jBtnAddCarToEast)))
                        .addGroup(jPanelBridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelBridgeLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jLabelCarOnWest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(redWest))
                            .addGroup(jPanelBridgeLayout.createSequentialGroup()
                                .addGap(39, 39, 39)
                                .addComponent(jLabelCarOnEast, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanelBridgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(greenWest, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(greenEast, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanelBridgeLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(redEast)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jBtnStartWest.setText("Start West");
        jBtnStartWest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnStartWestActionPerformed(evt);
            }
        });

        jBtnStartBridge.setText("Start Bridge");
        jBtnStartBridge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnStartBridgeActionPerformed(evt);
            }
        });

        jBtnStartEast.setText("Start East");
        jBtnStartEast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnStartEastActionPerformed(evt);
            }
        });

        jLabel8.setText("Control Panel");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtnStartWest, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnStartBridge, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBtnStartEast, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel8)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnStartWest, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnStartBridge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnStartEast, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(325, 325, 325)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(267, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanelBridge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBridge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnStartBridgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnStartBridgeActionPerformed
        if (threadBridge.isAlive() == false) {

            threadBridge.start();
            jBtnStartBridge.setBackground(Color.green);
        }
    }//GEN-LAST:event_jBtnStartBridgeActionPerformed

    private void jBtnStartEastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnStartEastActionPerformed
        if (threadEast.isAlive() == false) {
            threadEast.start();
            jBtnStartEast.setBackground(Color.green);
        }
    }//GEN-LAST:event_jBtnStartEastActionPerformed

    private void jBtnStartWestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnStartWestActionPerformed
        if (threadWest.isAlive() == false) {
            threadWest.start();
            jBtnStartWest.setBackground(Color.green);
        }
    }//GEN-LAST:event_jBtnStartWestActionPerformed

    private void jBtnAddCarToWestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddCarToWestActionPerformed

        //add 10 car to west
        helper.setWest(10);
        jLabelCarOnWest.setText(String.valueOf(helper.getWest()));
        System.out.println(helper.getWest());
    }//GEN-LAST:event_jBtnAddCarToWestActionPerformed

    private void jBtnAddCarToEastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAddCarToEastActionPerformed
        // addd 10 car to east
        helper.setEast(10);
        jLabelCarOnEast.setText(String.valueOf(helper.getEast()));
        System.out.println(helper.getEast());

    }//GEN-LAST:event_jBtnAddCarToEastActionPerformed

    private void btnAddCarsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCarsActionPerformed
        try {
            int cars = Integer.parseInt(txtFieldAddCars.getText());
            labelError.setVisible(false);
            if (comboBoxSelectWay.getSelectedItem().toString() == "West") {
                helper.setWest(cars);
                jLabelCarOnWest.setText(String.valueOf(helper.getWest()));
            } else if (comboBoxSelectWay.getSelectedItem().toString() == "East") {
                helper.setEast(cars);
                jLabelCarOnEast.setText(String.valueOf(helper.getEast()));

            }

        } catch (NumberFormatException e) {
            labelError.setVisible(true);
        }
    }//GEN-LAST:event_btnAddCarsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCars;
    private javax.swing.JComboBox<String> comboBoxSelectWay;
    private javax.swing.JLabel greenEast;
    private javax.swing.JLabel greenWest;
    private javax.swing.JButton jBtnAddCarToEast;
    private javax.swing.JButton jBtnAddCarToWest;
    private javax.swing.JButton jBtnStartBridge;
    private javax.swing.JButton jBtnStartEast;
    private javax.swing.JButton jBtnStartWest;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelCarOnEast;
    private javax.swing.JLabel jLabelCarOnWest;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelBridge;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelError;
    private javax.swing.JLabel redEast;
    private javax.swing.JLabel redWest;
    private javax.swing.JTextField txtFieldAddCars;
    // End of variables declaration//GEN-END:variables

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
            java.util.logging.Logger.getLogger(BridgeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BridgeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BridgeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BridgeFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
 /*    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               bf.setVisible(true);
            }
        });  
         */
        BridgeFrame bf = new BridgeFrame();
        bf.start();

    }

    public void start() {
        this.setVisible(true);
        greenWest.setVisible(false);
        redWest.setVisible(true);
        greenEast.setVisible(false);
        redEast.setVisible(true);
        labelError.setVisible(false);
        

    }

    public Thread threadEast = new Thread(new Runnable() {
        public void run() {
            while (true) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
//metody wykonywane w wątku
                        System.out.println("Thread East");
                        if ((helper.getEast()) > 0) {

                            if (helper.getSemafor() == 0) {
                                helper.setEast(-1);
                                jLabelCarOnEast.setText(String.valueOf(helper.getEast()));
                            }
                        }
                    }
                });
                try {
                    threadEast.sleep(threadSleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });

    public Thread threadBridge = new Thread(new Runnable() {
        public void run() {
            while (true) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
//metody wykonywane w wątku
                        System.out.println("Thread Bridge");

                        if (helper.getEast() > helper.getWest()) {
                            helper.setSemafor(0);
                            greenEast.setVisible(true);
                            redEast.setVisible(false);
                            greenWest.setVisible(false);
                            redWest.setVisible(true);

                        } else {
                            helper.setSemafor(1);
                            greenWest.setVisible(true);
                            redWest.setVisible(false);
                            greenEast.setVisible(false);
                            redEast.setVisible(true);
                        }
                    }
                });
                try {
                    threadBridge.sleep(threadSleepTime);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    });

    public Thread threadWest = new Thread(new Runnable() {
        public void run() {
            while (true) {
                SwingUtilities.invokeLater(new Runnable() {
                    public void run() {
//metody wykonywane w wątku
                        System.out.println("Thread West");

                        if (helper.getWest() > 0) {

                            if (helper.getSemafor() == 1) {

                                helper.setWest(-1);
                                jLabelCarOnWest.setText(String.valueOf(helper.getWest()));
                            }
                        }

                    }
                });
                try {
                    threadWest.sleep(threadSleepTime);
                } catch (InterruptedException e) {
// TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    });

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

}
