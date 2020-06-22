
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;

import javax.swing.JOptionPane;

/**
 *
 * @author Free User
 */
public class Tiket extends javax.swing.JFrame {
 String t1,b1,T1,jam;
    /**
     * Creates new form Tiket
     */
    String Cetak,kelas;
    public Tiket() {
        initComponents();
        
    }
    
    
 public void kelas(){
      if (RbEkonomi.isSelected()){
                  TxtHarga.setText("");
        if (CbNopnrbgn.getSelectedItem().equals("==PILIH KODE==")){   
         }
          if (CbNopnrbgn.getSelectedItem().equals("SP01")){
             TxtHarga.setText("1000000");
         }
               if (CbNopnrbgn.getSelectedItem().equals("SP02")){
           
             TxtHarga.setText("800000");
         }
         if (CbNopnrbgn.getSelectedItem().equals("SP03")){
           
              TxtHarga.setText("700000");                   
           }
       
            
        if (CbNopnrbgn.getSelectedItem().equals("ARL01")){
            
                   
             TxtHarga.setText("1500000");
         }if (CbNopnrbgn.getSelectedItem().equals("ARL02")){
            
           
             TxtHarga.setText("1000000");
         }if (CbNopnrbgn.getSelectedItem().equals("ARL03")){
            
              TxtHarga.setText("900000");                   
         }
        
        }
        if (RbBisnis.isSelected()){
            TxtHarga.setText("");
         if (CbNopnrbgn.getSelectedItem().equals("==PILIH KODE==")){   
         }
          if (CbNopnrbgn.getSelectedItem().equals("SP01")){
            
             TxtHarga.setText("2000000");
         }
               if (CbNopnrbgn.getSelectedItem().equals("SP02")){
           
             TxtHarga.setText("1000000");
         }
         if (CbNopnrbgn.getSelectedItem().equals("SP03")){
          
              TxtHarga.setText("900000");                   
           }
       
            
        if (CbNopnrbgn.getSelectedItem().equals("ARL01")){
            
              
             TxtHarga.setText("2000000");
         }if (CbNopnrbgn.getSelectedItem().equals("ARL02")){
            
         
             TxtHarga.setText("1500000");
         }if (CbNopnrbgn.getSelectedItem().equals("ARL03")){
        
              TxtHarga.setText("1000000");                   
         }   
        }   
 }
 public void jam(){
     
     if (RbJam1.isSelected()){
         jam = RbJam1.getText();
     }
     else if (RbJam2.isSelected()){
         jam=RbJam2.getText();
     }
     else if (RbJam3.isSelected()){
         jam =RbJam3.getText();
 }
     else if (RbJam4.isSelected()){
         jam =RbJam4.getText();
     }
 }
 
     
 public void cetak(){
    
       int h ;
        h=JOptionPane.showConfirmDialog(null, "Cetak tiket?", "Cetak", JOptionPane.YES_NO_OPTION ,JOptionPane.QUESTION_MESSAGE);
        if (h==JOptionPane.YES_OPTION){
            //tanggal
                    if (CbTgl.getSelectedItem().equals("Pilih")){
                        t1="";
                    }else if (CbTgl.getSelectedItem().equals("1")){
                        t1="1";
                     
                    }else if (CbTgl.getSelectedItem().equals("2")){
                        t1="2";
                    }else if (CbTgl.getSelectedItem().equals("3")){
                        t1="3";
                    }else if (CbTgl.getSelectedItem().equals("4")){
                        t1="4";
                    }else if (CbTgl.getSelectedItem().equals("5")){
                        t1="5";
                    }else if (CbTgl.getSelectedItem().equals("6")){
                        t1="6";
                    }else if (CbTgl.getSelectedItem().equals("7")){
                        t1="7";
                    }else if (CbTgl.getSelectedItem().equals("8")){
                        t1="8";
                    }else if (CbTgl.getSelectedItem().equals("9")){
                        t1="9";
                    }else if (CbTgl.getSelectedItem().equals("10")){
                        t1="10";
                    }else if (CbTgl.getSelectedItem().equals("11")){
                        t1="11";
                    }else if (CbTgl.getSelectedItem().equals("12")){
                        t1="12";
                    }else if (CbTgl.getSelectedItem().equals("13")){
                        t1="13";
                    }else if (CbTgl.getSelectedItem().equals("14")){
                        t1="14";
                    }else if (CbTgl.getSelectedItem().equals("15")){
                        t1="15";
                    }else if (CbTgl.getSelectedItem().equals("16")){
                        t1="16";
                    }else if (CbTgl.getSelectedItem().equals("17")){
                        t1="17";
                    }else if (CbTgl.getSelectedItem().equals("18")){
                        t1="18";
                    }else if (CbTgl.getSelectedItem().equals("19")){
                        t1="19";
                    }else if (CbTgl.getSelectedItem().equals("20")){
                        t1="20";
                    }else if (CbTgl.getSelectedItem().equals("21")){
                        t1="21";
                    }else if (CbTgl.getSelectedItem().equals("22")){
                        t1="22";
                    }else if (CbTgl.getSelectedItem().equals("23")){
                        t1="23";
                    }else if (CbTgl.getSelectedItem().equals("24")){
                        t1="24";
                    }else if (CbTgl.getSelectedItem().equals("25")){
                        t1="25";
                    }else if (CbTgl.getSelectedItem().equals("26")){
                        t1="26";
                    }else if (CbTgl.getSelectedItem().equals("27")){
                        t1="27";
                    }else if (CbTgl.getSelectedItem().equals("28")){
                        t1="28";
                    }else if (CbTgl.getSelectedItem().equals("29")){
                        t1="29";
                    }else if (CbTgl.getSelectedItem().equals("30")){
                        t1="30";
                    }else if (CbTgl.getSelectedItem().equals("31")){
                        CbTgl.addItem("31");
                    }
        //Bulan
                    if (CbBln.getSelectedItem().equals("Pilih")){
                        b1="";
                    }else if(CbBln.getSelectedItem().equals("Januari")){
                        b1="Januari";
                    }else if(CbBln.getSelectedItem().equals("Februari")){
                        b1="Februari";
                    }else if(CbBln.getSelectedItem().equals("Maret")){
                        b1="Maret";
                    }else if(CbBln.getSelectedItem().equals("April")){
                        b1="April";
                    }else if(CbBln.getSelectedItem().equals("Mei")){
                        b1="Mei";
                    }else if(CbBln.getSelectedItem().equals("Juni")){
                        b1="Juni";
                    }else if(CbBln.getSelectedItem().equals("Juli")){
                        b1="Juli";
                    }else if(CbBln.getSelectedItem().equals("Agustus")){
                        b1="Agustus";
                    }else if(CbBln.getSelectedItem().equals("September")){
                        b1="September";
                    }else if(CbBln.getSelectedItem().equals("Oktober")){
                        b1="Oktober";
                    }else if(CbBln.getSelectedItem().equals("November")){
                        b1="November";
                    }else if(CbBln.getSelectedItem().equals("Desember")){
                        b1="Desember";
                    }
                 //tahun
                   if (CbThn.getSelectedItem().equals("Pilih")){
                        T1="";
                    }else if (CbThn.getSelectedItem().equals("2020")){
                        T1="2020";}
 
       if (RbBisnis.isSelected()){
           kelas=RbBisnis.getText();
       }
       if (RbEkonomi.isSelected()){
           kelas=RbEkonomi.getText();
       }
       Cetak=" Nama                                  : "+TxtNama.getText()+
           "\n No Penerbangan              : "+CbNopnrbgn.getSelectedItem()+
           "\n Kelas                                   : "+kelas+""+
           "\n Maskapai Penerbangan  : "+Txtmskpi.getText()+
           "\n Tujuan                                 : "+TxtTjn.getText()+
           "\n Tanggal Keberangkatan  : "+t1+" "+b1+" "+T1+
           "\n Jam keberangkatan         : "+jam+
           "\n Harga                                  : Rp. "+TxtHarga.getText();
       
        JOptionPane.showMessageDialog(null, Cetak ,"Data Pemesanan Tiket Pesawat" ,JOptionPane.INFORMATION_MESSAGE);
                
       
        if (h==JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(null,"Silahkan periksa kembali","Cek",JOptionPane.INFORMATION_MESSAGE);
        }

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

        BtnGrpKelas = new javax.swing.ButtonGroup();
        BtnGrpJam = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Jnama = new javax.swing.JLabel();
        Jdari = new javax.swing.JLabel();
        Jtujuan = new javax.swing.JLabel();
        Jkelas = new javax.swing.JLabel();
        Jharga = new javax.swing.JLabel();
        Jtanggal = new javax.swing.JLabel();
        JnoPnbn = new javax.swing.JLabel();
        Jjam = new javax.swing.JLabel();
        TxtNama = new javax.swing.JTextField();
        TxtHarga = new javax.swing.JTextField();
        Txtmskpi = new javax.swing.JTextField();
        CbNopnrbgn = new javax.swing.JComboBox<>();
        CbTgl = new javax.swing.JComboBox<>();
        CbBln = new javax.swing.JComboBox<>();
        CbThn = new javax.swing.JComboBox<>();
        RbEkonomi = new javax.swing.JRadioButton();
        RbBisnis = new javax.swing.JRadioButton();
        RbJam1 = new javax.swing.JRadioButton();
        RbJam2 = new javax.swing.JRadioButton();
        RbJam3 = new javax.swing.JRadioButton();
        RbJam4 = new javax.swing.JRadioButton();
        JbCtk = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        JbExt = new javax.swing.JButton();
        Kback = new keeptoo.KButton();
        TxtTjn = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        BACKGROUND = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                formMouseReleased(evt);
            }
        });

        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(0, 51, 51));

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("P E M E S A N A N  T I K E T");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(-10, 0, 680, 52);

        Jnama.setForeground(new java.awt.Color(255, 255, 255));
        Jnama.setText("NAMA");
        jPanel1.add(Jnama);
        Jnama.setBounds(40, 80, 50, 20);

        Jdari.setForeground(new java.awt.Color(255, 255, 255));
        Jdari.setText("Maskapai Penerbangan");
        jPanel1.add(Jdari);
        Jdari.setBounds(40, 160, 120, 14);

        Jtujuan.setForeground(new java.awt.Color(255, 255, 255));
        Jtujuan.setText("Tujuan");
        jPanel1.add(Jtujuan);
        Jtujuan.setBounds(40, 200, 60, 14);

        Jkelas.setForeground(new java.awt.Color(255, 255, 255));
        Jkelas.setText("Kelas");
        jPanel1.add(Jkelas);
        Jkelas.setBounds(450, 120, 50, 14);

        Jharga.setForeground(new java.awt.Color(255, 255, 255));
        Jharga.setText("Harga");
        jPanel1.add(Jharga);
        Jharga.setBounds(40, 360, 60, 14);

        Jtanggal.setForeground(new java.awt.Color(255, 255, 255));
        Jtanggal.setText("Tanggal Keberangkatan");
        jPanel1.add(Jtanggal);
        Jtanggal.setBounds(40, 250, 140, 14);

        JnoPnbn.setForeground(new java.awt.Color(255, 255, 255));
        JnoPnbn.setText("No Penerbangan");
        jPanel1.add(JnoPnbn);
        JnoPnbn.setBounds(40, 120, 130, 14);

        Jjam.setForeground(new java.awt.Color(255, 255, 255));
        Jjam.setText("Jam Keberangkatan");
        jPanel1.add(Jjam);
        Jjam.setBounds(40, 300, 120, 20);

        TxtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtNama);
        TxtNama.setBounds(200, 70, 250, 30);

        TxtHarga.setEditable(false);
        TxtHarga.setText("0");
        TxtHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtHargaActionPerformed(evt);
            }
        });
        jPanel1.add(TxtHarga);
        TxtHarga.setBounds(220, 360, 90, 30);

        Txtmskpi.setEditable(false);
        Txtmskpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtmskpiActionPerformed(evt);
            }
        });
        jPanel1.add(Txtmskpi);
        Txtmskpi.setBounds(200, 150, 150, 30);

        CbNopnrbgn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==PILIH==", "SP01", "SP02", "SP03", "ARL01", "ARL02", "ARL03" }));
        CbNopnrbgn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbNopnrbgnActionPerformed(evt);
            }
        });
        jPanel1.add(CbNopnrbgn);
        CbNopnrbgn.setBounds(200, 110, 190, 30);

        CbTgl.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==Tanggal==", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "15", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "29", "29", "30", "31" }));
        CbTgl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbTglActionPerformed(evt);
            }
        });
        jPanel1.add(CbTgl);
        CbTgl.setBounds(200, 240, 110, 30);

        CbBln.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "==Bulan==", "Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember" }));
        CbBln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbBlnActionPerformed(evt);
            }
        });
        jPanel1.add(CbBln);
        CbBln.setBounds(320, 240, 130, 30);

        CbThn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ==Tahun==", "2020" }));
        CbThn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CbThnActionPerformed(evt);
            }
        });
        jPanel1.add(CbThn);
        CbThn.setBounds(460, 240, 100, 30);

        BtnGrpKelas.add(RbEkonomi);
        RbEkonomi.setForeground(new java.awt.Color(255, 255, 255));
        RbEkonomi.setText("EKONOMI");
        RbEkonomi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbEkonomiActionPerformed(evt);
            }
        });
        jPanel1.add(RbEkonomi);
        RbEkonomi.setBounds(540, 110, 90, 23);

        BtnGrpKelas.add(RbBisnis);
        RbBisnis.setForeground(new java.awt.Color(255, 255, 255));
        RbBisnis.setText("BISNIS");
        RbBisnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbBisnisActionPerformed(evt);
            }
        });
        jPanel1.add(RbBisnis);
        RbBisnis.setBounds(540, 150, 90, 23);

        BtnGrpJam.add(RbJam1);
        RbJam1.setForeground(new java.awt.Color(255, 255, 255));
        RbJam1.setText("09:00");
        RbJam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbJam1ActionPerformed(evt);
            }
        });
        jPanel1.add(RbJam1);
        RbJam1.setBounds(200, 300, 53, 23);

        BtnGrpJam.add(RbJam2);
        RbJam2.setForeground(new java.awt.Color(255, 255, 255));
        RbJam2.setText("13:00");
        RbJam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbJam2ActionPerformed(evt);
            }
        });
        jPanel1.add(RbJam2);
        RbJam2.setBounds(280, 300, 53, 23);

        BtnGrpJam.add(RbJam3);
        RbJam3.setForeground(new java.awt.Color(255, 255, 255));
        RbJam3.setText("16:00");
        RbJam3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbJam3ActionPerformed(evt);
            }
        });
        jPanel1.add(RbJam3);
        RbJam3.setBounds(360, 300, 53, 23);

        BtnGrpJam.add(RbJam4);
        RbJam4.setForeground(new java.awt.Color(255, 255, 255));
        RbJam4.setText("20:00");
        RbJam4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RbJam4ActionPerformed(evt);
            }
        });
        jPanel1.add(RbJam4);
        RbJam4.setBounds(440, 300, 53, 23);

        JbCtk.setText("CETAK");
        JbCtk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbCtkActionPerformed(evt);
            }
        });
        jPanel1.add(JbCtk);
        JbCtk.setBounds(510, 410, 100, 30);

        jButton1.setText("C L E A R");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(290, 453, 100, 30);

        JbExt.setForeground(new java.awt.Color(255, 0, 0));
        JbExt.setText("EXIT");
        JbExt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JbExtActionPerformed(evt);
            }
        });
        jPanel1.add(JbExt);
        JbExt.setBounds(510, 460, 100, 23);

        Kback.setText("KEMBALI");
        Kback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KbackActionPerformed(evt);
            }
        });
        jPanel1.add(Kback);
        Kback.setBounds(30, 450, 120, 30);

        TxtTjn.setEditable(false);
        jPanel1.add(TxtTjn);
        TxtTjn.setBounds(200, 190, 230, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rp.");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(190, 350, 20, 40);

        BACKGROUND.setIcon(new javax.swing.ImageIcon(getClass().getResource("/home.jpeg"))); // NOI18N
        BACKGROUND.setText("jLabel1");
        BACKGROUND.setAutoscrolls(true);
        jPanel1.add(BACKGROUND);
        BACKGROUND.setBounds(0, 0, 680, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 502, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RbBisnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbBisnisActionPerformed
        // TODO add your handling code here:
kelas();
    }//GEN-LAST:event_RbBisnisActionPerformed

    private void TxtHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtHargaActionPerformed

    private void TxtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaActionPerformed
        // TODO add your handling code here:
          
    }//GEN-LAST:event_TxtNamaActionPerformed

    private void RbEkonomiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbEkonomiActionPerformed
        // TODO add your handling code here:
          kelas();
    }//GEN-LAST:event_RbEkonomiActionPerformed

    private void CbTglActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbTglActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CbTglActionPerformed

    private void CbNopnrbgnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbNopnrbgnActionPerformed
        // TODO add your handling code here
        int harga,total;
       
        if (CbNopnrbgn.getSelectedItem().equals("==PILIH KODE==")){   
         }
          if (CbNopnrbgn.getSelectedItem().equals("SP01")){
            Txtmskpi.setText("Supadio");
               TxtTjn.setText("Pontianak-jakarta");
           
         }
               if (CbNopnrbgn.getSelectedItem().equals("SP02")){
            Txtmskpi.setText("Supadio");
         TxtTjn.setText("Pontianak-Bandung");
             
         }
         if (CbNopnrbgn.getSelectedItem().equals("SP03")){
            Txtmskpi.setText("Supadio");
         TxtTjn.setText("Pontianak-Sumatera");
                                
           }
       
            
        if (CbNopnrbgn.getSelectedItem().equals("ARL01")){
            
             Txtmskpi.setText("airlangga");      
            TxtTjn.setText("Singkawang-jakarta");        
           
         }if (CbNopnrbgn.getSelectedItem().equals("ARL02")){
            
             Txtmskpi.setText("airlangga");
         TxtTjn.setText("Singkawang-Bandung");
             
         }if (CbNopnrbgn.getSelectedItem().equals("ARL03")){
             Txtmskpi.setText("airlangga");
             TxtTjn.setText("Singkawang-Sumatera");
                 
         }
        
        
        
    }//GEN-LAST:event_CbNopnrbgnActionPerformed

    private void TxtmskpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtmskpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtmskpiActionPerformed

    private void CbBlnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbBlnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbBlnActionPerformed

    private void CbThnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CbThnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CbThnActionPerformed

    private void KbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KbackActionPerformed
        // TODO add your handling code here:
        new AirLineLotay().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KbackActionPerformed

    private void RbJam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbJam1ActionPerformed
        // TODO add your handling code here:
        jam();
    }//GEN-LAST:event_RbJam1ActionPerformed

    private void RbJam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbJam2ActionPerformed
        // TODO add your handling code here:
        jam();
    }//GEN-LAST:event_RbJam2ActionPerformed

    private void RbJam3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbJam3ActionPerformed
        // TODO add your handling code here:
        jam();
    }//GEN-LAST:event_RbJam3ActionPerformed

    private void RbJam4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RbJam4ActionPerformed
        // TODO add your handling code here:
        jam();
    }//GEN-LAST:event_RbJam4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseReleased
        // TODO add your handling code
    }//GEN-LAST:event_formMouseReleased

    private void JbExtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbExtActionPerformed
        // TODO add your handling code here:
        int e;
        e=JOptionPane.showConfirmDialog(null, "Apakah anda yakin" ,"E X I T" ,JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if (e==JOptionPane.YES_OPTION){
          dispose();
        }
    }//GEN-LAST:event_JbExtActionPerformed

    private void JbCtkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JbCtkActionPerformed
        // TODO add your handling code here:
        cetak();
    }//GEN-LAST:event_JbCtkActionPerformed
   
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
            java.util.logging.Logger.getLogger(Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tiket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tiket().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BACKGROUND;
    private javax.swing.ButtonGroup BtnGrpJam;
    private javax.swing.ButtonGroup BtnGrpKelas;
    private javax.swing.JComboBox<String> CbBln;
    private javax.swing.JComboBox<String> CbNopnrbgn;
    private javax.swing.JComboBox<String> CbTgl;
    private javax.swing.JComboBox<String> CbThn;
    private javax.swing.JButton JbCtk;
    private javax.swing.JButton JbExt;
    private javax.swing.JLabel Jdari;
    private javax.swing.JLabel Jharga;
    private javax.swing.JLabel Jjam;
    private javax.swing.JLabel Jkelas;
    private javax.swing.JLabel Jnama;
    private javax.swing.JLabel JnoPnbn;
    private javax.swing.JLabel Jtanggal;
    private javax.swing.JLabel Jtujuan;
    private keeptoo.KButton Kback;
    private javax.swing.JRadioButton RbBisnis;
    private javax.swing.JRadioButton RbEkonomi;
    private javax.swing.JRadioButton RbJam1;
    private javax.swing.JRadioButton RbJam2;
    private javax.swing.JRadioButton RbJam3;
    private javax.swing.JRadioButton RbJam4;
    private javax.swing.JTextField TxtHarga;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField TxtTjn;
    private javax.swing.JTextField Txtmskpi;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
public void clear(){
CbNopnrbgn.setSelectedItem("==pilih==");
    
TxtNama.setText("");
TxtHarga.setText("");
Txtmskpi.setText("");
TxtTjn.setText("");
BtnGrpKelas.clearSelection();
BtnGrpJam.clearSelection();
CbNopnrbgn.setSelectedItem("==PILIH==");
CbTgl.setSelectedItem("==Tanggal==");
CbBln.setSelectedItem("==Bulan==");
CbThn.setSelectedItem("==Tahun==");
JOptionPane.showMessageDialog(null, "Data telah di clear" ,"Clear",JOptionPane.INFORMATION_MESSAGE);


}









}

