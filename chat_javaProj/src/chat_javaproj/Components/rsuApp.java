
package chat_javaproj.Components;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class rsuApp extends javax.swing.JFrame {

    StringBuilder response = new StringBuilder();
    
    /**
     * Creates new form rsuApp
     */
    public rsuApp() {
        initComponents();
        txtSearching.setVisible(false); 
        jTabbedPane1.setSelectedIndex(0);
        
        
        //handler
        try {
        //  apiShoot
//      String url = "https://api.exchangerate.host/convert?from=" + contry1 + "&to=" + contry2 + "&amount=" + amount + "&access_key=beb5978d539bc75cba9b77e170dcc526";    
        String url = "https://api.exchangerate.host/live?access_key=beb5978d539bc75cba9b77e170dcc526";
        HttpURLConnection connect = (HttpURLConnection) new URL(url).openConnection();
        connect.setRequestMethod("GET");

        BufferedReader bfReader = new BufferedReader(new InputStreamReader(connect.getInputStream()));
        response = new StringBuilder();
        String line;
        
        while ((line = bfReader.readLine()) != null) {            
            response.append(line);
        }
        
        bfReader.close();
        
        fetchAPI api = new fetchAPI();
        api.call(response.toString(),lbContry1,lbContry2,lbContry3,lbContry4,lbContry5,lbContry6,lbContry7,lbContry8,lbContry9,lbPrice1,lbPrice2,lbPrice3,lbPrice4,lbPrice5,lbPrice6,lbPrice7,lbPrice8,lbPrice9); //put response inform String

        }
        catch (Exception e) {
            System.out.println(e);
        }// catchErr
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel16 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        titleState = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lbNotification = new javax.swing.JLabel();
        lbSearching = new javax.swing.JLabel();
        lbMessenger = new javax.swing.JLabel();
        lbAccount = new javax.swing.JLabel();
        txtSearching = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        pnUsers = new javax.swing.JPanel();
        lbUsers = new javax.swing.JLabel();
        pnOverview = new javax.swing.JPanel();
        lbOverview = new javax.swing.JLabel();
        pnChart = new javax.swing.JPanel();
        lbChart = new javax.swing.JLabel();
        pnSetting = new javax.swing.JPanel();
        lbSetting = new javax.swing.JLabel();
        pnLogout = new javax.swing.JPanel();
        lbLogout = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        pnFormOverview = new javax.swing.JPanel();
        pnAUD = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbContry1 = new javax.swing.JLabel();
        lbPrice1 = new javax.swing.JLabel();
        lbContryName1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbContry2 = new javax.swing.JLabel();
        lbContryName2 = new javax.swing.JLabel();
        lbPrice2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbContry3 = new javax.swing.JLabel();
        lbContryName3 = new javax.swing.JLabel();
        lbPrice3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        lbContry5 = new javax.swing.JLabel();
        lbContryName5 = new javax.swing.JLabel();
        lbPrice5 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        lbContry4 = new javax.swing.JLabel();
        lbContryName4 = new javax.swing.JLabel();
        lbPrice4 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        lbContry6 = new javax.swing.JLabel();
        lbContryName6 = new javax.swing.JLabel();
        lbPrice6 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        lbContry8 = new javax.swing.JLabel();
        lbContryName8 = new javax.swing.JLabel();
        lbPrice8 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        lbContry7 = new javax.swing.JLabel();
        lbContryName7 = new javax.swing.JLabel();
        lbPrice7 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        lbContry9 = new javax.swing.JLabel();
        lbContryName9 = new javax.swing.JLabel();
        lbPrice9 = new javax.swing.JLabel();
        pnFormUsers = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        User_txtUserInput = new javax.swing.JTextField();
        User_cb2nd = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        User_cb1st = new javax.swing.JComboBox<>();
        User_lbOutput = new javax.swing.JLabel();
        User_lbRate = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        pnFormChart = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        pnFormSetting = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel16.setBackground(new java.awt.Color(204, 0, 51));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/icons8_menu_48px_1.png"))); // NOI18N
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
        });
        jPanel16.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 17, -1, 37));

        jLabel1.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("l");
        jPanel16.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(77, 17, -1, 37));

        titleState.setFont(new java.awt.Font("K2D", 0, 36)); // NOI18N
        titleState.setForeground(new java.awt.Color(255, 255, 255));
        titleState.setText("Ipae_");
        titleState.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                titleStatePropertyChange(evt);
            }
        });
        jPanel16.add(titleState, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 17, -1, 37));

        jLabel3.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 50)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("l");
        jPanel16.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1136, 3, -1, -1));

        jLabel4.setFont(new java.awt.Font(".AppleSystemUIFont", 0, 50)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("l");
        jPanel16.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1071, 0, -1, 66));

        lbNotification.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/bell_26px.png"))); // NOI18N
        lbNotification.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbNotificationMouseEntered(evt);
            }
        });
        jPanel16.add(lbNotification, new org.netbeans.lib.awtextra.AbsoluteConstraints(1098, 23, -1, -1));

        lbSearching.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/search_26px.png"))); // NOI18N
        lbSearching.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbSearchingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbSearchingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbSearchingMouseExited(evt);
            }
        });
        jPanel16.add(lbSearching, new org.netbeans.lib.awtextra.AbsoluteConstraints(1033, 17, -1, 37));

        lbMessenger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/group_message_26px.png"))); // NOI18N
        lbMessenger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbMessengerMouseEntered(evt);
            }
        });
        jPanel16.add(lbMessenger, new org.netbeans.lib.awtextra.AbsoluteConstraints(1163, 22, -1, -1));

        lbAccount.setFont(new java.awt.Font("Lao MN", 1, 18)); // NOI18N
        lbAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/male_user_50px.png"))); // NOI18N
        lbAccount.setText("Watanyu onnum");
        lbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAccountMouseEntered(evt);
            }
        });
        jPanel16.add(lbAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 0, -1, 70));

        txtSearching.setBackground(new java.awt.Color(204, 204, 204));
        txtSearching.setColumns(20);
        txtSearching.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        txtSearching.setForeground(new java.awt.Color(255, 255, 255));
        txtSearching.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtSearching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchingActionPerformed(evt);
            }
        });
        jPanel16.add(txtSearching, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 250, 30));

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        pnUsers.setBackground(new java.awt.Color(0, 0, 0));
        pnUsers.setForeground(new java.awt.Color(127, 127, 127));
        pnUsers.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnUsersMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnUsersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnUsersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnUsersMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnUsersMouseReleased(evt);
            }
        });
        pnUsers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbUsers.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbUsers.setForeground(new java.awt.Color(255, 255, 255));
        lbUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/add_user_group_woman_man_24px.png"))); // NOI18N
        lbUsers.setText(" Users");
        pnUsers.add(lbUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 50));

        pnOverview.setBackground(new java.awt.Color(0, 0, 0));
        pnOverview.setForeground(new java.awt.Color(204, 204, 204));
        pnOverview.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnOverviewMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnOverviewMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnOverviewMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnOverviewMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnOverviewMouseReleased(evt);
            }
        });
        pnOverview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbOverview.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbOverview.setForeground(new java.awt.Color(255, 255, 255));
        lbOverview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/home_24px.png"))); // NOI18N
        lbOverview.setText(" Overview");
        pnOverview.add(lbOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 50));

        pnChart.setBackground(new java.awt.Color(0, 0, 0));
        pnChart.setForeground(new java.awt.Color(127, 127, 127));
        pnChart.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnChartMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnChartMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnChartMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnChartMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnChartMouseReleased(evt);
            }
        });
        pnChart.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbChart.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbChart.setForeground(new java.awt.Color(255, 255, 255));
        lbChart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/account_24px.png"))); // NOI18N
        lbChart.setText(" Chart");
        pnChart.add(lbChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 50));

        pnSetting.setBackground(new java.awt.Color(0, 0, 0));
        pnSetting.setForeground(new java.awt.Color(127, 127, 127));
        pnSetting.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnSettingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnSettingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnSettingMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnSettingMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnSettingMouseReleased(evt);
            }
        });
        pnSetting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSetting.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbSetting.setForeground(new java.awt.Color(255, 255, 255));
        lbSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/edit_property_24px.png"))); // NOI18N
        lbSetting.setText(" Setting");
        pnSetting.add(lbSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 50));

        pnLogout.setBackground(new java.awt.Color(0, 0, 0));
        pnLogout.setForeground(new java.awt.Color(127, 127, 127));
        pnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnLogoutMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnLogoutMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pnLogoutMouseReleased(evt);
            }
        });
        pnLogout.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbLogout.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        lbLogout.setForeground(new java.awt.Color(255, 255, 255));
        lbLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/sort_window_24px.png"))); // NOI18N
        lbLogout.setText("Logout");
        pnLogout.add(lbLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 50));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnOverview, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
            .addComponent(pnChart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnSetting, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnOverview, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnChart, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addComponent(pnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 250, 740));

        pnAUD.setBackground(new java.awt.Color(61, 61, 61));
        pnAUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnAUDMouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/flag_128px.png"))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("$");

        lbContry1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry1.setForeground(new java.awt.Color(255, 255, 255));
        lbContry1.setText("unknown");

        lbPrice1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice1.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice1.setText("UNKNOWN");

        lbContryName1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName1.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName1.setText("AUD - Australian Dolla");

        javax.swing.GroupLayout pnAUDLayout = new javax.swing.GroupLayout(pnAUD);
        pnAUD.setLayout(pnAUDLayout);
        pnAUDLayout.setHorizontalGroup(
            pnAUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAUDLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnAUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnAUDLayout.createSequentialGroup()
                        .addComponent(lbPrice1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(pnAUDLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbContry1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(pnAUDLayout.createSequentialGroup()
                        .addComponent(lbContryName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        pnAUDLayout.setVerticalGroup(
            pnAUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnAUDLayout.createSequentialGroup()
                .addGroup(pnAUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnAUDLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnAUDLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(pnAUDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContry1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lbContryName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPrice1)
                .addGap(12, 12, 12))
        );

        jPanel4.setBackground(new java.awt.Color(61, 61, 61));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/CAD_128px.png"))); // NOI18N

        jLabel11.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("$");

        lbContry2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry2.setForeground(new java.awt.Color(255, 255, 255));
        lbContry2.setText("unknown");

        lbContryName2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName2.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName2.setText("CAD - Cannada Dolla");

        lbPrice2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice2.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice2.setText("UNKNOWN");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lbPrice2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbContry2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(lbContryName2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContry2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lbContryName2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPrice2)
                .addGap(12, 12, 12))
        );

        jPanel5.setBackground(new java.awt.Color(61, 61, 61));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/japan_128px.png"))); // NOI18N

        jLabel14.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("¥");

        lbContry3.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry3.setForeground(new java.awt.Color(255, 255, 255));
        lbContry3.setText("unknown");

        lbContryName3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName3.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName3.setText("JPY - Japanese Yen");

        lbPrice3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice3.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice3.setText("UNKNOWN");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(lbPrice3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbContry3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lbContryName3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContry3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lbContryName3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPrice3)
                .addGap(12, 12, 12))
        );

        jPanel6.setBackground(new java.awt.Color(61, 61, 61));

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/south-korea_128px.png"))); // NOI18N

        jLabel30.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("₩");

        lbContry5.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry5.setForeground(new java.awt.Color(255, 255, 255));
        lbContry5.setText("unknown");

        lbContryName5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName5.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName5.setText("KRW - South Korean Won ");

        lbPrice5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice5.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice5.setText("UNKNOWN");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(lbPrice5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel30)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbContry5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(lbContryName5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContry5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lbContryName5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPrice5)
                .addGap(12, 12, 12))
        );

        jPanel7.setBackground(new java.awt.Color(61, 61, 61));

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/india_128px.png"))); // NOI18N

        jLabel28.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("₹");

        lbContry4.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry4.setForeground(new java.awt.Color(255, 255, 255));
        lbContry4.setText("unknown");

        lbContryName4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName4.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName4.setText("INR - Indian Rupee");

        lbPrice4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice4.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice4.setText("UNKNOWN");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(lbPrice4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbContry4, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(lbContryName4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContry4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lbContryName4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPrice4)
                .addGap(12, 12, 12))
        );

        jPanel8.setBackground(new java.awt.Color(61, 61, 61));

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/singapore_128px.png"))); // NOI18N

        jLabel32.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("S$");

        lbContry6.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry6.setForeground(new java.awt.Color(255, 255, 255));
        lbContry6.setText("unknown");

        lbContryName6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName6.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName6.setText("SGN - Singapore Dollar");

        lbPrice6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice6.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice6.setText("UNKNOWN");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addComponent(lbPrice6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel32)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbContry6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(lbContryName6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel31)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContry6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lbContryName6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPrice6)
                .addGap(12, 12, 12))
        );

        jPanel9.setBackground(new java.awt.Color(61, 61, 61));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/brazil_128px.png"))); // NOI18N

        jLabel36.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("R$");

        lbContry8.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry8.setForeground(new java.awt.Color(255, 255, 255));
        lbContry8.setText("unknown");

        lbContryName8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName8.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName8.setText("BRL - Brazilian Real");

        lbPrice8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice8.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice8.setText("UNKNOWN");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addComponent(lbPrice8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel36)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbContry8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(lbContryName8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel35)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContry8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lbContryName8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPrice8)
                .addGap(12, 12, 12))
        );

        jPanel10.setBackground(new java.awt.Color(61, 61, 61));

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/united-states_128px.png"))); // NOI18N

        jLabel34.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("฿");

        lbContry7.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry7.setForeground(new java.awt.Color(255, 255, 255));
        lbContry7.setText("unknown");

        lbContryName7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName7.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName7.setText("THB - Thai Baht");

        lbPrice7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice7.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice7.setText("UNKNOWN");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addComponent(lbPrice7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbContry7, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(lbContryName7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel33)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel34, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContry7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lbContryName7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPrice7)
                .addGap(12, 12, 12))
        );

        jPanel11.setBackground(new java.awt.Color(61, 61, 61));

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/EU_128px.png"))); // NOI18N

        jLabel38.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("€");

        lbContry9.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry9.setForeground(new java.awt.Color(255, 255, 255));
        lbContry9.setText("unknown");

        lbContryName9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName9.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName9.setText("EUR - Euro");

        lbPrice9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice9.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice9.setText("UNKNOWN");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(lbPrice9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel38)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbContry9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(lbContryName9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel37)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbContry9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(lbContryName9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbPrice9)
                .addGap(12, 12, 12))
        );

        javax.swing.GroupLayout pnFormOverviewLayout = new javax.swing.GroupLayout(pnFormOverview);
        pnFormOverview.setLayout(pnFormOverviewLayout);
        pnFormOverviewLayout.setHorizontalGroup(
            pnFormOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormOverviewLayout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addGroup(pnFormOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnAUD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFormOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFormOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        pnFormOverviewLayout.setVerticalGroup(
            pnFormOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormOverviewLayout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(pnFormOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnAUD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFormOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnFormOverviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", pnFormOverview);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        User_txtUserInput.setColumns(10);
        User_txtUserInput.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        User_txtUserInput.setText("UserInput");
        User_txtUserInput.setToolTipText("UserInput");
        User_txtUserInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        User_txtUserInput.setMargin(new java.awt.Insets(2, 0, 2, 6));
        User_txtUserInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                User_txtUserInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                User_txtUserInputFocusLost(evt);
            }
        });
        jPanel2.add(User_txtUserInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 150, 60));

        User_cb2nd.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        User_cb2nd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUD", "CAD", "JPY", "INR", "KRW", "SGN", "THB", "BRL", "EUR" }));
        jPanel2.add(User_cb2nd, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 130, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/arrow_impli24px.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, 30, 30));

        User_cb1st.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        User_cb1st.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUD", "CAD", "JPY", "INR", "KRW", "SGN", "THB", "BRL", "EUR" }));
        jPanel2.add(User_cb1st, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 130, -1));

        User_lbOutput.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        User_lbOutput.setText("224.32 EUR");
        User_lbOutput.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                User_lbOutputPropertyChange(evt);
            }
        });
        jPanel2.add(User_lbOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, -1, -1));

        User_lbRate.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        User_lbRate.setForeground(new java.awt.Color(153, 153, 153));
        User_lbRate.setText("1  USD = 0.90 EUR");
        jPanel2.add(User_lbRate, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/tap_64px.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 1, 48)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 153, 153));
        jLabel16.setText("GraphUI");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 300, -1, -1));

        javax.swing.GroupLayout pnFormUsersLayout = new javax.swing.GroupLayout(pnFormUsers);
        pnFormUsers.setLayout(pnFormUsersLayout);
        pnFormUsersLayout.setHorizontalGroup(
            pnFormUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormUsersLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnFormUsersLayout.setVerticalGroup(
            pnFormUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormUsersLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnFormUsersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("tab2", pnFormUsers);

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 204, 204));
        jLabel7.setText("FORM 3");

        javax.swing.GroupLayout pnFormChartLayout = new javax.swing.GroupLayout(pnFormChart);
        pnFormChart.setLayout(pnFormChartLayout);
        pnFormChartLayout.setHorizontalGroup(
            pnFormChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormChartLayout.createSequentialGroup()
                .addGap(558, 558, 558)
                .addComponent(jLabel7)
                .addContainerGap(543, Short.MAX_VALUE))
        );
        pnFormChartLayout.setVerticalGroup(
            pnFormChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormChartLayout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel7)
                .addContainerGap(424, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab3", pnFormChart);

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(204, 204, 204));
        jLabel8.setText("FORM 4");

        javax.swing.GroupLayout pnFormSettingLayout = new javax.swing.GroupLayout(pnFormSetting);
        pnFormSetting.setLayout(pnFormSettingLayout);
        pnFormSettingLayout.setHorizontalGroup(
            pnFormSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormSettingLayout.createSequentialGroup()
                .addGap(558, 558, 558)
                .addComponent(jLabel8)
                .addContainerGap(543, Short.MAX_VALUE))
        );
        pnFormSettingLayout.setVerticalGroup(
            pnFormSettingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnFormSettingLayout.createSequentialGroup()
                .addGap(282, 282, 282)
                .addComponent(jLabel8)
                .addContainerGap(424, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab4", pnFormSetting);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 30, 1190, 770));

        setSize(new java.awt.Dimension(1440, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnOverviewMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnOverviewMouseEntered
        // TODO add your handling code here:
        pnOverview.setBackground(new Color(255, 255, 255));
        lbOverview.setForeground(Color.BLACK);
        pnOverview.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pnOverviewMouseEntered

    private void pnOverviewMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnOverviewMouseExited
        // TODO add your handling code here:
        pnOverview.setBackground(Color.BLACK);
        lbOverview.setForeground(Color.WHITE);
    }//GEN-LAST:event_pnOverviewMouseExited

    private void pnUsersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnUsersMouseEntered
        // TODO add your handling code here:
        pnUsers.setBackground(new Color(255, 255, 255));
        lbUsers.setForeground(Color.BLACK);
        pnUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pnUsersMouseEntered

    private void pnUsersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnUsersMouseExited
        // TODO add your handling code here:
        pnUsers.setBackground(Color.BLACK);
        lbUsers.setForeground(Color.WHITE);
    }//GEN-LAST:event_pnUsersMouseExited

    private void pnChartMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnChartMouseEntered
        // TODO add your handling code here:
        pnChart.setBackground(new Color(255, 255, 255));
        lbChart.setForeground(Color.BLACK);
        pnChart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pnChartMouseEntered

    private void pnChartMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnChartMouseExited
        // TODO add your handling code here:
        pnChart.setBackground(Color.BLACK);
        lbChart.setForeground(Color.WHITE);
    }//GEN-LAST:event_pnChartMouseExited

    private void pnSettingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSettingMouseEntered
        // TODO add your handling code here:
        pnSetting.setBackground(new Color(255, 255, 255));
        lbSetting.setForeground(Color.BLACK);
        pnSetting.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pnSettingMouseEntered

    private void pnSettingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSettingMouseExited
        // TODO add your handling code here:
        pnSetting.setBackground(Color.BLACK);
        lbSetting.setForeground(Color.WHITE);
    }//GEN-LAST:event_pnSettingMouseExited

    private void pnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLogoutMouseEntered
        // TODO add your handling code here:
        pnLogout.setBackground(Color.decode("#FC2B2C"));
        lbLogout.setForeground(Color.BLACK);
        pnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_pnLogoutMouseEntered

    private void pnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLogoutMouseExited
        // TODO add your handling code here:
        pnLogout.setBackground(Color.BLACK);
        lbLogout.setForeground(Color.WHITE);
    }//GEN-LAST:event_pnLogoutMouseExited

    private void pnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLogoutMouseClicked
        // TODO add your handling code here:
        logIn end = new logIn();
        end.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnLogoutMouseClicked
  
    private void lbSearchingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSearchingMouseEntered
        lbSearching.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbSearchingMouseEntered

    private void lbSearchingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSearchingMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_lbSearchingMouseExited

    private void lbNotificationMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbNotificationMouseEntered
        // TODO add your handling code here:
        lbNotification.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbNotificationMouseEntered

    private void lbMessengerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbMessengerMouseEntered
        // TODO add your handling code here:
        lbMessenger.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbMessengerMouseEntered

    private void lbAccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbAccountMouseEntered
        // TODO add your handling code here:
        lbAccount.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_lbAccountMouseEntered

    private void txtSearchingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchingActionPerformed
//final boolean[] isOne = {false}; // เริ่มต้นที่ 1
        
    private boolean isVisible = false;
    
    private void lbSearchingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbSearchingMouseClicked
        // TODO add your handling code here:
         txtSearching.setVisible(!isVisible);
         isVisible = !isVisible;
         
         txtSearching.requestFocus();
       
    }//GEN-LAST:event_lbSearchingMouseClicked

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered
        // TODO add your handling code here:
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel13MouseEntered

    private void pnOverviewMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnOverviewMouseClicked
        // TODO add your handling code here:
        //handler
        jTabbedPane1.setSelectedIndex(0);
        titleState.setText(lbOverview.getText());       
    }//GEN-LAST:event_pnOverviewMouseClicked

    private void pnUsersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnUsersMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
        titleState.setText(lbUsers.getText());
    }//GEN-LAST:event_pnUsersMouseClicked

    private void pnChartMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnChartMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
        titleState.setText(lbChart.getText());
    }//GEN-LAST:event_pnChartMouseClicked

    private void pnSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSettingMouseClicked
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(3);
        titleState.setText(lbSetting.getText());
    }//GEN-LAST:event_pnSettingMouseClicked

    private void pnAUDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnAUDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnAUDMouseClicked

    private void pnOverviewMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnOverviewMousePressed
        // TODO add your handling code here:
        pnOverview.setBackground(Color.decode("#D6D9DF"));
    }//GEN-LAST:event_pnOverviewMousePressed

    private void pnOverviewMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnOverviewMouseReleased
        // TODO add your handling code here:
        pnOverview.setBackground(new Color(255, 255, 255));
        if (pnOverview.contains(evt.getPoint())) {
            pnOverview.setBackground(new Color(255, 255, 255)); // hover on go white
        } else {
            pnOverview.setBackground(Color.BLACK); // not hover go black
        }
    }//GEN-LAST:event_pnOverviewMouseReleased

    private void pnUsersMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnUsersMouseReleased
        // TODO add your handling code here:
//        pnUsers.setBackground(new Color(0, 0, 0));

        if (pnUsers.contains(evt.getPoint())) {
            pnUsers.setBackground(new Color(255, 255, 255)); // hover on go white
        } else {
            pnUsers.setBackground(Color.BLACK); // not hover go black
        }
    }//GEN-LAST:event_pnUsersMouseReleased

    private void pnUsersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnUsersMousePressed
        // TODO add your handling code here:
        pnUsers.setBackground(Color.decode("#D6D9DF"));
    }//GEN-LAST:event_pnUsersMousePressed

    private void pnChartMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnChartMouseReleased
        // TODO add your handling code here:
        pnChart.setBackground(new Color(255, 255, 255));
        
        if (pnChart.contains(evt.getPoint())) {
            pnChart.setBackground(new Color(255, 255, 255)); // hover on go white
        } else {
            pnChart.setBackground(Color.BLACK); // not hover go black
        }
    }//GEN-LAST:event_pnChartMouseReleased

    private void pnSettingMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSettingMouseReleased
        // TODO add your handling code here:
        pnSetting.setBackground(new Color(255, 255, 255));
    }//GEN-LAST:event_pnSettingMouseReleased

    private void pnSettingMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSettingMousePressed
        // TODO add your handling code here:
        pnSetting.setBackground(Color.decode("#D6D9DF"));
    }//GEN-LAST:event_pnSettingMousePressed

    private void pnChartMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnChartMousePressed
        // TODO add your handling code here:
        pnChart.setBackground(Color.decode("#D6D9DF"));
    }//GEN-LAST:event_pnChartMousePressed

    private void pnLogoutMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLogoutMouseReleased
        // TODO add your handling code here:
        pnLogout.setBackground(Color.decode("#CC0A33"));
        
        if (pnLogout.contains(evt.getPoint())) {
            pnLogout.setBackground(Color.decode("#FC2B2C")); // hover on go red
        } else {
            pnLogout.setBackground(Color.BLACK); // not hover go black
        }
    }//GEN-LAST:event_pnLogoutMouseReleased

    private void pnLogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnLogoutMousePressed
        // TODO add your handling code here:
        pnLogout.setBackground(Color.decode("#DD1616"));
    }//GEN-LAST:event_pnLogoutMousePressed

    private void titleStatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_titleStatePropertyChange
        // TODO add your handling code here:
        if (pnOverview.hasFocus()) {
            titleState.setText(lbOverview.getText());
        } else if (pnUsers.hasFocus()) {
            titleState.setText(lbUsers.getText());
        } else if (pnChart.hasFocus()) {
            titleState.setText(lbChart.getText());
        } else if (pnSetting.hasFocus()) {
            titleState.setText(lbSetting.getText());
        }
    }//GEN-LAST:event_titleStatePropertyChange

    private void User_txtUserInputFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_User_txtUserInputFocusGained
        // TODO add your handling code here:
        User_txtUserInput.setText("");
    }//GEN-LAST:event_User_txtUserInputFocusGained

    private void User_lbOutputPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_User_lbOutputPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_User_lbOutputPropertyChange

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        try {
        String contry1 = User_cb1st.getSelectedItem().toString();
        String contry2 = User_cb2nd.getSelectedItem().toString();
        String amount = Double.valueOf(User_txtUserInput.getText()) + "";
        

        fetchAPI api = new fetchAPI();
        api.changes(response.toString(),User_cb1st, User_cb2nd, User_txtUserInput, User_lbOutput, contry1, contry2);

        } catch (Exception ex) {
            System.out.println("fetchAPI2nd_Error -----> " + ex);
        }


    }//GEN-LAST:event_jLabel6MouseClicked

    private void User_txtUserInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_User_txtUserInputFocusLost
        // TODO add your handling code here:
        if (User_txtUserInput.getText().equals("")) {
            User_txtUserInput.setText("UserInput");
        }
    }//GEN-LAST:event_User_txtUserInputFocusLost

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
            java.util.logging.Logger.getLogger(rsuApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rsuApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rsuApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rsuApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rsuApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> User_cb1st;
    private javax.swing.JComboBox<String> User_cb2nd;
    private javax.swing.JLabel User_lbOutput;
    private javax.swing.JLabel User_lbRate;
    private javax.swing.JTextField User_txtUserInput;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbChart;
    private javax.swing.JLabel lbContry1;
    private javax.swing.JLabel lbContry2;
    private javax.swing.JLabel lbContry3;
    private javax.swing.JLabel lbContry4;
    private javax.swing.JLabel lbContry5;
    private javax.swing.JLabel lbContry6;
    private javax.swing.JLabel lbContry7;
    private javax.swing.JLabel lbContry8;
    private javax.swing.JLabel lbContry9;
    private javax.swing.JLabel lbContryName1;
    private javax.swing.JLabel lbContryName2;
    private javax.swing.JLabel lbContryName3;
    private javax.swing.JLabel lbContryName4;
    private javax.swing.JLabel lbContryName5;
    private javax.swing.JLabel lbContryName6;
    private javax.swing.JLabel lbContryName7;
    private javax.swing.JLabel lbContryName8;
    private javax.swing.JLabel lbContryName9;
    private javax.swing.JLabel lbLogout;
    private javax.swing.JLabel lbMessenger;
    private javax.swing.JLabel lbNotification;
    private javax.swing.JLabel lbOverview;
    private javax.swing.JLabel lbPrice1;
    private javax.swing.JLabel lbPrice2;
    private javax.swing.JLabel lbPrice3;
    private javax.swing.JLabel lbPrice4;
    private javax.swing.JLabel lbPrice5;
    private javax.swing.JLabel lbPrice6;
    private javax.swing.JLabel lbPrice7;
    private javax.swing.JLabel lbPrice8;
    private javax.swing.JLabel lbPrice9;
    private javax.swing.JLabel lbSearching;
    private javax.swing.JLabel lbSetting;
    private javax.swing.JLabel lbUsers;
    private javax.swing.JPanel pnAUD;
    private javax.swing.JPanel pnChart;
    private javax.swing.JPanel pnFormChart;
    private javax.swing.JPanel pnFormOverview;
    private javax.swing.JPanel pnFormSetting;
    private javax.swing.JPanel pnFormUsers;
    private javax.swing.JPanel pnLogout;
    private javax.swing.JPanel pnOverview;
    private javax.swing.JPanel pnSetting;
    private javax.swing.JPanel pnUsers;
    private javax.swing.JLabel titleState;
    private javax.swing.JTextField txtSearching;
    // End of variables declaration//GEN-END:variables


}
