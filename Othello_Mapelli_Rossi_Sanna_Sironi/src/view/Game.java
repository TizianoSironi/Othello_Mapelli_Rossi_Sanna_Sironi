/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.Toolkit;
import model.ClasseModel;
import java.io.IOException;
import javax.swing.JButton;
import model.Server;
import model.ConnectionClient;

/**
 *
 * @author sironi.tiziano
 */
public class Game extends javax.swing.JFrame {

    public static JButton bottoni[][];
    boolean premuto;
    int cordX;
    int cordY;
    ServerGUI s;

    public Game() {
        setIcon();  //richiama il metodo per aggiungere l'icona al frame
        initComponents();
        bottoni = new JButton [8][8];
         bottoni [0][0] = jButton1;
         bottoni [0][1] = jButton2;
         bottoni [0][2] = jButton3;
         bottoni [0][3] = jButton4;
         bottoni [0][4] = jButton5;
         bottoni [0][5] = jButton6;
         bottoni [0][6] = jButton7;
         bottoni [0][7] = jButton8;
         bottoni [1][0] = jButton9;
         bottoni [1][1] = jButton10;
         bottoni [1][2] = jButton11;
         bottoni [1][3] = jButton12;
         bottoni [1][4] = jButton13;
         bottoni [1][5] = jButton14;
         bottoni [1][6] = jButton15;
         bottoni [1][7] = jButton16;
         bottoni [2][0] = jButton17;
         bottoni [2][1] = jButton18;
         bottoni [2][2] = jButton19;
         bottoni [2][3] = jButton20;
         bottoni [2][4] = jButton21;
         bottoni [2][5] = jButton22;
         bottoni [2][6] = jButton23;
         bottoni [2][7] = jButton24;
         bottoni [3][0] = jButton25;
         bottoni [3][1] = jButton26;
         bottoni [3][2] = jButton27;
         bottoni [3][3] = jButton28;
         bottoni [3][4] = jButton29;
         bottoni [3][5] = jButton30;
         bottoni [3][6] = jButton31;
         bottoni [3][7] = jButton32;
         bottoni [4][0] = jButton33;
         bottoni [4][1] = jButton34;
         bottoni [4][2] = jButton35;
        bottoni [4][3] = jButton36;
         bottoni [4][4] = jButton37;
         bottoni [4][5] = jButton38;
        bottoni [4][6] = jButton39;
        bottoni [4][7] = jButton40;
         bottoni [5][0] = jButton41;
         bottoni [5][1] = jButton42;
         bottoni [5][2] = jButton43;
         bottoni [5][3] = jButton44;
         bottoni [5][4] = jButton45;
         bottoni [5][5] = jButton46;
         bottoni [5][6] = jButton47;
         bottoni [5][7] = jButton48;
         bottoni [6][0] = jButton49;
         bottoni [6][1] = jButton50;
         bottoni [6][2] = jButton51;
         bottoni [6][3] = jButton52;
         bottoni [6][4] = jButton53;
         bottoni [6][5] = jButton54;
         bottoni [6][6] = jButton55;
         bottoni [6][7] = jButton56;
         bottoni [7][0] = jButton57;
          bottoni [7][1] = jButton58;
         bottoni [7][2] = jButton59;
         bottoni [7][3] = jButton60;
         bottoni [7][4] = jButton61;
         bottoni [7][5] = jButton62;
         bottoni [7][6] = jButton63;
         bottoni [7][7] = jButton64; 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton65 = new javax.swing.JButton();
        jButton66 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton67 = new javax.swing.JButton();
        jButton68 = new javax.swing.JButton();

        jButton65.setText("jButton65");

        jButton66.setText("jButton66");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Othello");
        setBackground(new java.awt.Color(110, 110, 110));
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 101, 42));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 97, 94), 4));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new java.awt.GridLayout(8, 8, 8, 8));

        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setAlignmentY(0.0F);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton2.setToolTipText("<1>, <2>");
        jButton2.setContentAreaFilled(false);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton3.setToolTipText("<1>, <3>");
        jButton3.setContentAreaFilled(false);
        jButton3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton4.setToolTipText("<1>, <4>");
        jButton4.setContentAreaFilled(false);
        jButton4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton5.setToolTipText("<1>, <5>");
        jButton5.setContentAreaFilled(false);
        jButton5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton6.setToolTipText("<1>, <6>");
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton7.setToolTipText("<1>, <7>");
        jButton7.setContentAreaFilled(false);
        jButton7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton8.setToolTipText("<1>, <8>");
        jButton8.setContentAreaFilled(false);
        jButton8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton9.setToolTipText("<2>, <1>");
        jButton9.setContentAreaFilled(false);
        jButton9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton10.setToolTipText("<2>, <2>");
        jButton10.setContentAreaFilled(false);
        jButton10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);

        jButton11.setForeground(new java.awt.Color(255, 255, 255));
        jButton11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton11.setToolTipText("<2>, <3>");
        jButton11.setContentAreaFilled(false);
        jButton11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);

        jButton12.setForeground(new java.awt.Color(255, 255, 255));
        jButton12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton12.setToolTipText("<2>, <4>");
        jButton12.setContentAreaFilled(false);
        jButton12.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);

        jButton13.setForeground(new java.awt.Color(255, 255, 255));
        jButton13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton13.setToolTipText("<2>, <5>");
        jButton13.setContentAreaFilled(false);
        jButton13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);

        jButton14.setForeground(new java.awt.Color(255, 255, 255));
        jButton14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton14.setToolTipText("<2>, <6>");
        jButton14.setContentAreaFilled(false);
        jButton14.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);

        jButton15.setForeground(new java.awt.Color(255, 255, 255));
        jButton15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton15.setToolTipText("<2>, <7>");
        jButton15.setContentAreaFilled(false);
        jButton15.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);

        jButton16.setForeground(new java.awt.Color(255, 255, 255));
        jButton16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton16.setToolTipText("<2>, <8>");
        jButton16.setContentAreaFilled(false);
        jButton16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);

        jButton17.setForeground(new java.awt.Color(255, 255, 255));
        jButton17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton17.setToolTipText("<3>, <1>");
        jButton17.setContentAreaFilled(false);
        jButton17.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);

        jButton18.setForeground(new java.awt.Color(255, 255, 255));
        jButton18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton18.setToolTipText("<3>, <2>");
        jButton18.setContentAreaFilled(false);
        jButton18.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);

        jButton19.setForeground(new java.awt.Color(255, 255, 255));
        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton19.setToolTipText("<3>, <3>");
        jButton19.setContentAreaFilled(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);

        jButton20.setForeground(new java.awt.Color(255, 255, 255));
        jButton20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton20.setToolTipText("<3>, <4>");
        jButton20.setContentAreaFilled(false);
        jButton20.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);

        jButton21.setForeground(new java.awt.Color(255, 255, 255));
        jButton21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton21.setToolTipText("<3>, <5>");
        jButton21.setContentAreaFilled(false);
        jButton21.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);

        jButton22.setForeground(new java.awt.Color(255, 255, 255));
        jButton22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton22.setToolTipText("<3>, <6>");
        jButton22.setContentAreaFilled(false);
        jButton22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22);

        jButton23.setForeground(new java.awt.Color(255, 255, 255));
        jButton23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton23.setToolTipText("<3>, <7>");
        jButton23.setContentAreaFilled(false);
        jButton23.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23);

        jButton24.setForeground(new java.awt.Color(255, 255, 255));
        jButton24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton24.setToolTipText("<3>, <8>");
        jButton24.setContentAreaFilled(false);
        jButton24.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24);

        jButton25.setForeground(new java.awt.Color(255, 255, 255));
        jButton25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton25.setToolTipText("<4>, <1>");
        jButton25.setContentAreaFilled(false);
        jButton25.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25);

        jButton26.setForeground(new java.awt.Color(255, 255, 255));
        jButton26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton26.setToolTipText("<4>, <2>");
        jButton26.setContentAreaFilled(false);
        jButton26.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26);

        jButton27.setForeground(new java.awt.Color(255, 255, 255));
        jButton27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton27.setToolTipText("<4>, <3>");
        jButton27.setContentAreaFilled(false);
        jButton27.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27);

        jButton28.setForeground(new java.awt.Color(255, 255, 255));
        jButton28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/white.png"))); // NOI18N
        jButton28.setToolTipText("<4>, <4>");
        jButton28.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton28);

        jButton29.setForeground(new java.awt.Color(255, 255, 255));
        jButton29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/black.png"))); // NOI18N
        jButton29.setToolTipText("<4>, <5>");
        jButton29.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton29);

        jButton30.setForeground(new java.awt.Color(255, 255, 255));
        jButton30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton30.setToolTipText("<4>, <6>");
        jButton30.setContentAreaFilled(false);
        jButton30.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton30);

        jButton31.setForeground(new java.awt.Color(255, 255, 255));
        jButton31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton31.setToolTipText("<4>, <7>");
        jButton31.setContentAreaFilled(false);
        jButton31.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton31);

        jButton32.setForeground(new java.awt.Color(255, 255, 255));
        jButton32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton32.setToolTipText("<4>, <8>");
        jButton32.setContentAreaFilled(false);
        jButton32.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton32);

        jButton33.setForeground(new java.awt.Color(255, 255, 255));
        jButton33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton33.setToolTipText("<5>, <1>");
        jButton33.setContentAreaFilled(false);
        jButton33.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton33);

        jButton34.setForeground(new java.awt.Color(255, 255, 255));
        jButton34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton34.setToolTipText("<5>, <2>");
        jButton34.setContentAreaFilled(false);
        jButton34.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton34);

        jButton35.setForeground(new java.awt.Color(255, 255, 255));
        jButton35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton35.setToolTipText("<5>, <3>");
        jButton35.setContentAreaFilled(false);
        jButton35.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton35);

        jButton36.setForeground(new java.awt.Color(255, 255, 255));
        jButton36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/black.png"))); // NOI18N
        jButton36.setToolTipText("<5>, <4>");
        jButton36.setContentAreaFilled(false);
        jButton36.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton36);

        jButton37.setForeground(new java.awt.Color(255, 255, 255));
        jButton37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/white.png"))); // NOI18N
        jButton37.setToolTipText("<5>, <5>");
        jButton37.setContentAreaFilled(false);
        jButton37.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton37);

        jButton38.setForeground(new java.awt.Color(255, 255, 255));
        jButton38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton38.setToolTipText("<5>, <6>");
        jButton38.setContentAreaFilled(false);
        jButton38.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton38);

        jButton39.setForeground(new java.awt.Color(255, 255, 255));
        jButton39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton39.setToolTipText("<5>, <7>");
        jButton39.setContentAreaFilled(false);
        jButton39.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton39);

        jButton40.setForeground(new java.awt.Color(255, 255, 255));
        jButton40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton40.setToolTipText("<5>, <8>");
        jButton40.setContentAreaFilled(false);
        jButton40.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton40);

        jButton41.setForeground(new java.awt.Color(255, 255, 255));
        jButton41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton41.setToolTipText("<6>, <1>");
        jButton41.setContentAreaFilled(false);
        jButton41.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton41);

        jButton42.setForeground(new java.awt.Color(255, 255, 255));
        jButton42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton42.setToolTipText("<6>, <2>");
        jButton42.setContentAreaFilled(false);
        jButton42.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton42);

        jButton43.setForeground(new java.awt.Color(255, 255, 255));
        jButton43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton43.setToolTipText("<6>, <3>");
        jButton43.setContentAreaFilled(false);
        jButton43.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton43);

        jButton44.setForeground(new java.awt.Color(255, 255, 255));
        jButton44.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton44.setToolTipText("<6>, <4>");
        jButton44.setContentAreaFilled(false);
        jButton44.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton44);

        jButton45.setForeground(new java.awt.Color(255, 255, 255));
        jButton45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton45.setToolTipText("<6>, <5>");
        jButton45.setContentAreaFilled(false);
        jButton45.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton45);

        jButton46.setForeground(new java.awt.Color(255, 255, 255));
        jButton46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton46.setToolTipText("<6>, <6>");
        jButton46.setContentAreaFilled(false);
        jButton46.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton46);

        jButton47.setForeground(new java.awt.Color(255, 255, 255));
        jButton47.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton47.setToolTipText("<6>, <7>");
        jButton47.setContentAreaFilled(false);
        jButton47.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton47);

        jButton48.setForeground(new java.awt.Color(255, 255, 255));
        jButton48.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton48.setToolTipText("<6>, <8>");
        jButton48.setContentAreaFilled(false);
        jButton48.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton48);

        jButton49.setForeground(new java.awt.Color(255, 255, 255));
        jButton49.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton49.setToolTipText("<7>, <1>");
        jButton49.setContentAreaFilled(false);
        jButton49.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton49);
        jButton49.getAccessibleContext().setAccessibleDescription("<6>, <0>");

        jButton50.setForeground(new java.awt.Color(255, 255, 255));
        jButton50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton50.setToolTipText("<7>, <2>");
        jButton50.setContentAreaFilled(false);
        jButton50.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton50);

        jButton51.setForeground(new java.awt.Color(255, 255, 255));
        jButton51.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton51.setToolTipText("<7>, <3>");
        jButton51.setContentAreaFilled(false);
        jButton51.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton51);

        jButton52.setForeground(new java.awt.Color(255, 255, 255));
        jButton52.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton52.setToolTipText("<7>, <4>");
        jButton52.setContentAreaFilled(false);
        jButton52.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton52);

        jButton53.setForeground(new java.awt.Color(255, 255, 255));
        jButton53.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton53.setToolTipText("<7>, <5>");
        jButton53.setContentAreaFilled(false);
        jButton53.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton53);

        jButton54.setForeground(new java.awt.Color(255, 255, 255));
        jButton54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton54.setToolTipText("<7>, <6>");
        jButton54.setContentAreaFilled(false);
        jButton54.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton54);

        jButton55.setForeground(new java.awt.Color(255, 255, 255));
        jButton55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton55.setToolTipText("<7>, <7>");
        jButton55.setContentAreaFilled(false);
        jButton55.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton55);

        jButton56.setForeground(new java.awt.Color(255, 255, 255));
        jButton56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton56.setToolTipText("<7>, <8>");
        jButton56.setContentAreaFilled(false);
        jButton56.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton56);

        jButton57.setForeground(new java.awt.Color(255, 255, 255));
        jButton57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton57.setToolTipText("<8>, <1>");
        jButton57.setContentAreaFilled(false);
        jButton57.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton57);

        jButton58.setForeground(new java.awt.Color(255, 255, 255));
        jButton58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton58.setToolTipText("<8>, <2>");
        jButton58.setContentAreaFilled(false);
        jButton58.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton58);

        jButton59.setForeground(new java.awt.Color(255, 255, 255));
        jButton59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton59.setToolTipText("<8>, <3>");
        jButton59.setContentAreaFilled(false);
        jButton59.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton59);

        jButton60.setForeground(new java.awt.Color(255, 255, 255));
        jButton60.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton60.setToolTipText("<8>, <4>");
        jButton60.setContentAreaFilled(false);
        jButton60.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton60);

        jButton61.setForeground(new java.awt.Color(255, 255, 255));
        jButton61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton61.setToolTipText("<8>, <5>");
        jButton61.setContentAreaFilled(false);
        jButton61.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton61);

        jButton62.setForeground(new java.awt.Color(255, 255, 255));
        jButton62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton62.setToolTipText("<8>, <6>");
        jButton62.setContentAreaFilled(false);
        jButton62.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton62);

        jButton63.setForeground(new java.awt.Color(255, 255, 255));
        jButton63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton63.setToolTipText("<8>, <7>");
        jButton63.setContentAreaFilled(false);
        jButton63.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton63);

        jButton64.setForeground(new java.awt.Color(255, 255, 255));
        jButton64.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/images/empty.png"))); // NOI18N
        jButton64.setToolTipText("<8>, <8>");
        jButton64.setContentAreaFilled(false);
        jButton64.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton64);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setText("        a           b           c           d          e           f           g          h");
        jLabel1.setOpaque(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("1");
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("2");
        jLabel9.setOpaque(true);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("3");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("4");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("5");
        jLabel4.setOpaque(true);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("6");
        jLabel5.setOpaque(true);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("7");
        jLabel6.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("8");
        jLabel7.setOpaque(true);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jButton67.setText("Start Game");
        jButton67.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton67ActionPerformed(evt);
            }
        });

        jButton68.setText("Start Server");
        jButton68.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton68ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton67)
                    .addComponent(jButton68))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jButton67)
                        .addGap(18, 18, 18)
                        .addComponent(jButton68)))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        int x = 5;
        int y = 5;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int x = 0;
        int y = 0;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        int x = 2;
        int y = 6;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int x = 0;
        int y = 1;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int x = 0;
        int y = 2;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int x = 0;
        int y = 3;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        int x = 0;
        int y = 4;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int x = 0;
        int y = 5;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        int x = 0;
        int y = 6;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        int x = 0;
        int y = 7;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton67ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton67ActionPerformed
        if (ClasseModel.gameStarted == false) {
            System.out.println("versione client");
            new ConnectionClient(this);
        } else {
            System.out.println("Partita gia iniziata");
        }
    }//GEN-LAST:event_jButton67ActionPerformed

    private void jButton68ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton68ActionPerformed
        System.out.println("versione server");
        this.setVisible(false);
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ServerGUI().setVisible(true);
            }
        });
    }//GEN-LAST:event_jButton68ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        int x = 1;
        int y = 0;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        int x = 1;
        int y = 1;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        int x = 1;
        int y = 2;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        int x = 1;
        int y = 3;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        int x = 1;
        int y = 4;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        int x = 1;
        int y = 5;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        int x = 1;
        int y = 6;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        int x = 1;
        int y = 7;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        int x = 2;
        int y = 0;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        int x = 2;
        int y = 1;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        int x = 2;
        int y = 2;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        int x = 2;
        int y = 3;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        int x = 2;
        int y = 4;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        int x = 2;
        int y = 5;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        int x = 2;
        int y = 7;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        int x = 3;
        int y = 0;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        int x = 3;
        int y = 1;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        int x = 3;
        int y = 2;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        int x = 3;
        int y = 3;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        int x = 3;
        int y = 4;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        int x = 3;
        int y = 5;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        int x = 3;
        int y = 6;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        int x = 3;
        int y = 7;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        int x = 4;
        int y = 0;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        int x = 4;
        int y = 1;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        int x = 4;
        int y = 2;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        int x = 4;
        int y = 3;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        int x = 4;
        int y = 4;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        int x = 4;
        int y = 5;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        int x = 4;
        int y = 6;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        int x = 4;
        int y = 7;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        int x = 5;
        int y = 0;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        int x = 5;
        int y = 1;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        int x = 5;
        int y = 2;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        int x = 5;
        int y = 3;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        int x = 5;
        int y = 4;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        int x = 5;
        int y = 6;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        int x = 5;
        int y = 7;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        int x = 6;
        int y = 0;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        int x = 6;
        int y = 1;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        int x = 6;
        int y = 2;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        int x = 6;
        int y = 3;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        int x = 6;
        int y = 4;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        int x = 6;
        int y = 5;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        int x = 6;
        int y = 6;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        int x = 6;
        int y = 7;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        int x = 7;
        int y = 0;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        int x = 7;
        int y = 1;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        int x = 7;
        int y = 2;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        int x = 7;
        int y = 3;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        int x = 7;
        int y = 4;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        int x = 7;
        int y = 5;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        int x = 7;
        int y = 6;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        int x = 7;
        int y = 7;
        System.out.println("pos<" + x + "><" + y + ">");
        cordX = x;
        cordY = y;
        premuto = true;
    }//GEN-LAST:event_jButton64ActionPerformed

    public String getButtonPushed() {
        while (!premuto) {

        }
        premuto = false;
        return String.valueOf(cordX) + "," + String.valueOf(cordY);
    }

    public static void main(String args[]) throws IOException {
        java.awt.EventQueue.invokeLater(new Runnable() {
            ServerGUI server = new ServerGUI();

            public void run() {
                String posizione;
                new Game().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton65;
    private javax.swing.JButton jButton66;
    private javax.swing.JButton jButton67;
    private javax.swing.JButton jButton68;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables

    /**
     * metodo per aggiungere l'icona al frame
     */
    private void setIcon() {    //metodo per impostare l'icona dell'applicazione Calcolatrice
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("othello.png")));
    }

}
