
package chat_javaproj.Components;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Date;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;



public class rsuApp extends javax.swing.JFrame {

    StringBuilder response = new StringBuilder();
    
    public rsuApp() {
        initComponents();
        txtSearching.setVisible(false); 
        jTabbedPane1.setSelectedIndex(0);
        
// ============================= Prop change lbAccount =================================
        String sql = "SELECT * FROM class_Account WHERE token <> ''";

        try (Connection conn = databaseConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()){
            
            while (rs.next()) {
                String username = rs.getString("Username");
                String token = rs.getString("Token");
                String name = rs.getString("Name");
                
                System.out.println("Username: " + username + ", Token: " + token + ", Name: " + name);
                lbAccount.setText(name);
            }
            
        } catch (Exception e) {
           e.printStackTrace();
        }
// ============================= Prop change lbAccount =================================

// ============================= show TOP 3 country =================================
        String query = "SELECT currencyTo, COUNT(*) AS count FROM class_insertData GROUP BY currencyTo ORDER BY count DESC LIMIT 3";

        try (Connection conn = databaseConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()){
            
            int index = 1;
            while (rs.next()) {
                String currency = rs.getString("currencyTo");
                int count = rs.getInt("count");

            switch (index) {
                case 1:
                    first_lbCount.setText(count + " Times");
                    first_lbFlag.setText(currency);
                    break;
                case 2:
                    second_lbCount.setText(count + " Times");
                    second_lbFlag.setText(currency);
                    break;
                case 3:
                    third_lbCount.setText(count + " Times");
                    third_lbFlag.setText(currency);
                    break;
            }
            index++;
        }
           
        } catch (Exception e) {
           e.printStackTrace();
        }
// ============================= show TOP 3 country =================================

// ==================================  API GET ====================================
        try {
            
        String url = "https://api.exchangerate.host/live?access_key=beb5978d539bc75cba9b77e170dcc526";
        String url2 = "http://localhost:3000"; // server API mock

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
            System.out.println("GET API exception :" + e);
        }
        
// ==================================  API GET ====================================

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
        jPanel14 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        second_lbCount = new javax.swing.JLabel();
        second_lbFlag = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        first_lbFlag = new javax.swing.JLabel();
        first_lbCount = new javax.swing.JLabel();
        jPanel21 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        third_lbCount = new javax.swing.JLabel();
        third_lbFlag = new javax.swing.JLabel();
        pnFormConvertor = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        User_txtUserInput = new javax.swing.JTextField();
        User_cb2nd = new javax.swing.JComboBox<>();
        User_cb1st = new javax.swing.JComboBox<>();
        User_lbOutput = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        pnFormDataList = new javax.swing.JPanel();
        JscrollPane = new javax.swing.JScrollPane();
        tableDataList = new javax.swing.JTable();
        pnFormSetting = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableManageMembership = new javax.swing.JTable();
        jPanel17 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        ctrlPN_txtID = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        ctrlPN_txtUsername = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        ctrlPN_txtName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ctrlPN_cbRole = new javax.swing.JComboBox<>();
        jPanel13 = new javax.swing.JPanel();
        ctrlPN_btnDELETE = new javax.swing.JButton();
        ctrlPN_btnEDIT = new javax.swing.JButton();

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
        titleState.setText("Title");
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

        lbAccount.setFont(new java.awt.Font("Lao Sangam MN", 1, 18)); // NOI18N
        lbAccount.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAccount.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/male_user_50px.png"))); // NOI18N
        lbAccount.setText("Account name");
        lbAccount.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbAccountMouseEntered(evt);
            }
        });
        lbAccount.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lbAccountPropertyChange(evt);
            }
        });
        jPanel16.add(lbAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 0, -1, 70));

        txtSearching.setColumns(20);
        txtSearching.setFont(new java.awt.Font("Helvetica Neue", 0, 12)); // NOI18N
        txtSearching.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtSearching.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtSearching.setMargin(new java.awt.Insets(0, 0, 0, 0));
        txtSearching.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchingActionPerformed(evt);
            }
        });
        jPanel16.add(txtSearching, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 20, 250, 30));

        getContentPane().add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1440, -1));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        lbUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/sort_window_24px.png"))); // NOI18N
        lbUsers.setText(" Convertor");
        pnUsers.add(lbUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 150, 50));

        jPanel1.add(pnUsers, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 250, 70));

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

        jPanel1.add(pnOverview, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 70));

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
        lbChart.setText(" History");
        pnChart.add(lbChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 130, 50));

        jPanel1.add(pnChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 250, 70));

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
        lbSetting.setText(" Admin tools");
        pnSetting.add(lbSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 190, 50));

        jPanel1.add(pnSetting, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 250, 70));

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

        jPanel1.add(pnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 250, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 250, 740));

        pnFormOverview.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnAUD.setBackground(new java.awt.Color(61, 61, 61));
        pnAUD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnAUDMouseClicked(evt);
            }
        });
        pnAUD.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/flag_128px.png"))); // NOI18N
        pnAUD.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 12, -1, 86));

        jLabel9.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("$");
        pnAUD.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(154, 41, -1, 41));

        lbContry1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry1.setForeground(new java.awt.Color(255, 255, 255));
        lbContry1.setText("unknown");
        pnAUD.add(lbContry1, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 48, 114, -1));

        lbPrice1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice1.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice1.setText("UNKNOWN");
        pnAUD.add(lbPrice1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 145, 259, -1));

        lbContryName1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName1.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName1.setText("AUD - Australian Dolla");
        pnAUD.add(lbContryName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 276, -1));

        pnFormOverview.add(pnAUD, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 300, 180));

        jPanel4.setBackground(new java.awt.Color(61, 61, 61));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/CAD_128px.png"))); // NOI18N
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, 98));

        jLabel11.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("$");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 40, -1, 41));

        lbContry2.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry2.setForeground(new java.awt.Color(255, 255, 255));
        lbContry2.setText("unknown");
        jPanel4.add(lbContry2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 47, 104, -1));

        lbContryName2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName2.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName2.setText("CAD - Cannada Dolla");
        jPanel4.add(lbContryName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, 266, -1));

        lbPrice2.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice2.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice2.setText("UNKNOWN");
        jPanel4.add(lbPrice2, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 145, 249, -1));

        pnFormOverview.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 290, 180));

        jPanel5.setBackground(new java.awt.Color(61, 61, 61));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/japan_128px.png"))); // NOI18N
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, 98));

        jLabel14.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("¥");
        jPanel5.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 41, -1, 41));

        lbContry3.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry3.setForeground(new java.awt.Color(255, 255, 255));
        lbContry3.setText("unknown");
        jPanel5.add(lbContry3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 48, 124, -1));

        lbContryName3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName3.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName3.setText("JPY - Japanese Yen");
        jPanel5.add(lbContryName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, 286, -1));

        lbPrice3.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice3.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice3.setText("UNKNOWN");
        jPanel5.add(lbPrice3, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 145, 269, -1));

        pnFormOverview.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, 310, 180));

        jPanel6.setBackground(new java.awt.Color(61, 61, 61));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/south-korea_128px.png"))); // NOI18N
        jPanel6.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, 98));

        jLabel30.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setText("₩");
        jPanel6.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 36, -1, 41));

        lbContry5.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry5.setForeground(new java.awt.Color(255, 255, 255));
        lbContry5.setText("unknown");
        jPanel6.add(lbContry5, new org.netbeans.lib.awtextra.AbsoluteConstraints(189, 43, 95, -1));

        lbContryName5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName5.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName5.setText("KRW - South Korean Won ");
        jPanel6.add(lbContryName5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, 266, -1));

        lbPrice5.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice5.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice5.setText("UNKNOWN");
        jPanel6.add(lbPrice5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 145, 249, -1));

        pnFormOverview.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 290, 180));

        jPanel7.setBackground(new java.awt.Color(61, 61, 61));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/india_128px.png"))); // NOI18N
        jPanel7.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, 98));

        jLabel28.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("₹");
        jPanel7.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 37, -1, 41));

        lbContry4.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry4.setForeground(new java.awt.Color(255, 255, 255));
        lbContry4.setText("unknown");
        jPanel7.add(lbContry4, new org.netbeans.lib.awtextra.AbsoluteConstraints(177, 44, 117, -1));

        lbContryName4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName4.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName4.setText("INR - Indian Rupee");
        jPanel7.add(lbContryName4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, 276, -1));

        lbPrice4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice4.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice4.setText("UNKNOWN");
        jPanel7.add(lbPrice4, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 145, 259, -1));

        pnFormOverview.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 300, 180));

        jPanel8.setBackground(new java.awt.Color(61, 61, 61));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/singapore_128px.png"))); // NOI18N
        jPanel8.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 12, -1, 86));

        jLabel32.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("S$");
        jPanel8.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(156, 36, -1, 41));

        lbContry6.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry6.setForeground(new java.awt.Color(255, 255, 255));
        lbContry6.setText("unknown");
        jPanel8.add(lbContry6, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 43, 111, -1));

        lbContryName6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName6.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName6.setText("SGN - Singapore Dollar");
        jPanel8.add(lbContryName6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 110, 288, -1));

        lbPrice6.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice6.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice6.setText("UNKNOWN");
        jPanel8.add(lbPrice6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 145, 288, -1));

        pnFormOverview.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 310, 180));

        jPanel9.setBackground(new java.awt.Color(61, 61, 61));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/brazil_128px.png"))); // NOI18N
        jPanel9.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 6, -1, 98));

        jLabel36.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("R$");
        jPanel9.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 39, -1, 41));

        lbContry8.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry8.setForeground(new java.awt.Color(255, 255, 255));
        lbContry8.setText("unknown");
        jPanel9.add(lbContry8, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 46, -1, -1));

        lbContryName8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName8.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName8.setText("BRL - Brazilian Real");
        jPanel9.add(lbContryName8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, 266, -1));

        lbPrice8.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice8.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice8.setText("UNKNOWN");
        jPanel9.add(lbPrice8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 145, 249, -1));

        pnFormOverview.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 560, -1, 180));

        jPanel10.setBackground(new java.awt.Color(61, 61, 61));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/thailand_128px.png"))); // NOI18N
        jPanel10.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 12, -1, 92));

        jLabel34.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("฿");
        jPanel10.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 41, 20, 41));

        lbContry7.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry7.setForeground(new java.awt.Color(255, 255, 255));
        lbContry7.setText("unknown");
        jPanel10.add(lbContry7, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 48, 116, -1));

        lbContryName7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName7.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName7.setText("THB - Thai Baht");
        jPanel10.add(lbContryName7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, 276, -1));

        lbPrice7.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice7.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice7.setText("UNKNOWN");
        jPanel10.add(lbPrice7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 145, 259, -1));

        pnFormOverview.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 560, 300, 180));

        jPanel11.setBackground(new java.awt.Color(61, 61, 61));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/EU_128px.png"))); // NOI18N
        jPanel11.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 12, -1, 92));

        jLabel38.setFont(new java.awt.Font("Thonburi", 1, 24)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("€");
        jPanel11.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 39, -1, 41));

        lbContry9.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        lbContry9.setForeground(new java.awt.Color(255, 255, 255));
        lbContry9.setText("unknown");
        jPanel11.add(lbContry9, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, 46, 128, -1));

        lbContryName9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbContryName9.setForeground(new java.awt.Color(153, 153, 153));
        lbContryName9.setText("EUR - Euro");
        jPanel11.add(lbContryName9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, 288, -1));

        lbPrice9.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        lbPrice9.setForeground(new java.awt.Color(255, 255, 255));
        lbPrice9.setText("UNKNOWN");
        jPanel11.add(lbPrice9, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 145, 271, -1));

        pnFormOverview.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 560, 312, 180));

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));
        jPanel14.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/second.png"))); // NOI18N
        jPanel14.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 16, -1, 77));

        second_lbCount.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        second_lbCount.setText("count");
        jPanel14.add(second_lbCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        second_lbFlag.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        second_lbFlag.setText("secondFlag");
        jPanel14.add(second_lbFlag, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        pnFormOverview.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 350, 110));

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));
        jPanel20.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/first.png"))); // NOI18N
        jPanel20.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 16, -1, 77));

        first_lbFlag.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        first_lbFlag.setText("secondFlag");
        jPanel20.add(first_lbFlag, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        first_lbCount.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        first_lbCount.setText("count");
        jPanel20.add(first_lbCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        pnFormOverview.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 30, 350, 110));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));
        jPanel21.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel21.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/third.png"))); // NOI18N
        jPanel21.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 16, -1, 77));

        third_lbCount.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        third_lbCount.setText("count");
        jPanel21.add(third_lbCount, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, -1, -1));

        third_lbFlag.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        third_lbFlag.setText("secondFlag");
        jPanel21.add(third_lbFlag, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, -1, -1));

        pnFormOverview.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 30, 350, 110));

        jTabbedPane1.addTab("tab1", pnFormOverview);

        pnFormConvertor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        User_txtUserInput.setColumns(10);
        User_txtUserInput.setFont(new java.awt.Font("Helvetica Neue", 0, 24)); // NOI18N
        User_txtUserInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        User_txtUserInput.setText("Your price here!!");
        User_txtUserInput.setToolTipText("UserInput");
        User_txtUserInput.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        User_txtUserInput.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                User_txtUserInputFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                User_txtUserInputFocusLost(evt);
            }
        });
        jPanel2.add(User_txtUserInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 480, 60));

        User_cb2nd.setFont(new java.awt.Font("Beirut", 0, 18)); // NOI18N
        User_cb2nd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUD", "CAD", "JPY", "INR", "KRW", "SGD", "THB", "BRL", "EUR" }));
        jPanel2.add(User_cb2nd, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 300, 40));

        User_cb1st.setFont(new java.awt.Font("Beirut", 0, 18)); // NOI18N
        User_cb1st.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AUD", "CAD", "JPY", "INR", "KRW", "SGD", "THB", "BRL", "EUR" }));
        jPanel2.add(User_cb1st, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 300, 40));

        User_lbOutput.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        User_lbOutput.setText("Result here");
        User_lbOutput.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                User_lbOutputPropertyChange(evt);
            }
        });
        jPanel2.add(User_lbOutput, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chat_javaproj/icon/exchange_64px.png"))); // NOI18N
        jLabel6.setToolTipText("Hit me to convert");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        pnFormConvertor.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 760));

        jPanel3.setBackground(new java.awt.Color(204, 204, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Silom", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("ChartUI");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        pnFormConvertor.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 0, 590, 760));

        jTabbedPane1.addTab("tab2", pnFormConvertor);

        pnFormDataList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableDataList.setAutoCreateRowSorter(true);
        tableDataList.setFont(new java.awt.Font("Niramit", 0, 14)); // NOI18N
        tableDataList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "From", "To", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableDataList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tableDataList.setShowVerticalLines(true);
        JscrollPane.setViewportView(tableDataList);

        pnFormDataList.add(JscrollPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 1190, 740));

        jTabbedPane1.addTab("tab3", pnFormDataList);

        pnFormSetting.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tableManageMembership.setFont(new java.awt.Font("Al Bayan", 0, 14)); // NOI18N
        tableManageMembership.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Username", "Name", "Role", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableManageMembership.setRowHeight(25);
        tableManageMembership.setRowMargin(2);
        tableManageMembership.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tableManageMembershipFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(tableManageMembership);

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1150, Short.MAX_VALUE)
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
        );

        pnFormSetting.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 1150, 460));

        jPanel17.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(0, 0, 0)), "Controller panel", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kefa", 1, 24))); // NOI18N
        jPanel17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel7.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel7.setText("ID :");

        ctrlPN_txtID.setColumns(18);
        ctrlPN_txtID.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel8.setText("Username :");

        ctrlPN_txtUsername.setColumns(18);
        ctrlPN_txtUsername.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel15.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel15.setText("Name :");

        ctrlPN_txtName.setColumns(18);
        ctrlPN_txtName.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N

        jLabel16.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jLabel16.setText("Role :");

        ctrlPN_cbRole.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        ctrlPN_cbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Admin", "Member" }));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel15))
                .addGap(37, 37, 37)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ctrlPN_txtID, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ctrlPN_txtName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(37, 37, 37)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ctrlPN_txtUsername)
                    .addComponent(ctrlPN_cbRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ctrlPN_txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(ctrlPN_cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(ctrlPN_txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(ctrlPN_txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jPanel17.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 890, 150));

        jPanel13.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        ctrlPN_btnDELETE.setText("DELETE");
        ctrlPN_btnDELETE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctrlPN_btnDELETEMouseClicked(evt);
            }
        });

        ctrlPN_btnEDIT.setText("EDIT");
        ctrlPN_btnEDIT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ctrlPN_btnEDITMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ctrlPN_btnEDIT, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ctrlPN_btnDELETE, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE))
                .addGap(25, 25, 25))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(ctrlPN_btnDELETE, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ctrlPN_btnEDIT, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        jPanel17.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 30, 210, 150));

        pnFormSetting.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 1150, 200));

        jTabbedPane1.addTab("tab4", pnFormSetting);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 1190, 790));

        setSize(new java.awt.Dimension(1441, 806));
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
    try (Connection conn = databaseConnection.connect()) {
        String sql = "UPDATE class_Account SET Token = '', Status = '' WHERE Name = ?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        
        pstmt.setString(1, lbAccount.getText());
        System.out.println(lbAccount.getText());
        
        int rowsUpdated = pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
        
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
        
        // ============================= show TOP 3 country =================================
        String query = "SELECT currencyTo, COUNT(*) AS count FROM class_insertData GROUP BY currencyTo ORDER BY count DESC LIMIT 3";

        try (Connection conn = databaseConnection.connect();
             PreparedStatement stmt = conn.prepareStatement(query);
             ResultSet rs = stmt.executeQuery()){
            
            int index = 1;
            while (rs.next()) {
                String currency = rs.getString("currencyTo");
                int count = rs.getInt("count");

            switch (index) {
                case 1:
                    first_lbCount.setText(count + " Times");
                    first_lbFlag.setText(currency);
                    break;
                case 2:
                    second_lbCount.setText(count + " Times");
                    second_lbFlag.setText(currency);
                    break;
                case 3:
                    third_lbCount.setText(count + " Times");
                    third_lbFlag.setText(currency);
                    break;
            }
            index++;
        }
           
        } catch (Exception e) {
           e.printStackTrace();
        }
// ============================= show TOP 3 country =================================
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
        
        // ================================== Table list data ====================================

        try (Connection conn = databaseConnection.connect()) {
    
            String currentUser = getCurrentUserName(); // custom method getCurrentUserName() from below this method
            String userRole = getUserRole(currentUser); // custom method getUserRole(String) from below this method
    
            String query;
            PreparedStatement pstmt;
    
        if (userRole.equalsIgnoreCase("Admin")) {
            // ถ้าเป็น admin ดึงข้อมูลทั้งหมด
            query = "SELECT * FROM class_insertData";
            pstmt = conn.prepareStatement(query);
        } else {
            // ถ้าเป็น member ดึงข้อมูลเฉพาะของตัวเอง
            query = "SELECT * FROM class_insertData WHERE username = ?";
            pstmt = conn.prepareStatement(query);
            pstmt.setString(1, currentUser);
        }
    
        DefaultTableModel model = (DefaultTableModel) tableDataList.getModel();
        ResultSet rs = pstmt.executeQuery();
    
        model.setRowCount(0);
    
        int displayID = 1;
    
        while(rs.next()) {
            model.addRow(new Object[] {
                displayID,
                rs.getString("username"),
                rs.getString("currencyFrom"),
                rs.getString("currencyTo"),
                rs.getString("date")
            });
            displayID++;
        }
    
        rs.close();
        pstmt.close();
    
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e, "Table list data Fail", JOptionPane.ERROR_MESSAGE);
        }

// ================================== Table list data ====================================
    }//GEN-LAST:event_pnChartMouseClicked

    // ============================================================== CUSTOM Method ==============================================
    
    private String getCurrentUserName() {
    String username = "";
    
    try (Connection conn = databaseConnection.connect()) {
        String query = "SELECT Username FROM class_Account WHERE Status = 'ON'";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        if (rs.next()) {
            username = rs.getString("Username");
            System.out.println("CheckUser : " + username);
        }
        
        rs.close();
        stmt.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return username;
}
    
    private String getUserRole(String username) {
    String role = "";
    
    try (Connection conn = databaseConnection.connect()) {
        String query = "SELECT Role FROM class_Account WHERE Username = ?";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, username);
        ResultSet rs = pstmt.executeQuery();
        
        if (rs.next()) {
            role = rs.getString("Role");
            System.out.println("CheckRole : " + role);
        }
        
        rs.close();
        pstmt.close();
    } catch (Exception e) {
        e.printStackTrace();
    }
    
    return role;
}
    
    // ============================================================== CUSTOM Method ==============================================
    
    private void pnSettingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnSettingMouseClicked
        // TODO add your handling code here:
        String roleUser = getUserRole(getCurrentUserName());
        
        if (roleUser.equalsIgnoreCase("Member")) {
            // can't do nothing :X
            // warning
            JOptionPane.showMessageDialog(this, "Your permission can't do this panel. Sorry for that :l");
        } else { // ================================== else case =================================
            jTabbedPane1.setSelectedIndex(3);
        titleState.setText(lbSetting.getText());
        
        // ================================== Table list data ====================================

        try (Connection conn = databaseConnection.connect()) {
            
            String query = "SELECT * FROM class_Account";
            
            try (PreparedStatement pstmt = conn.prepareStatement(query)) {
                DefaultTableModel model = (DefaultTableModel) tableManageMembership.getModel();
                ResultSet rs = pstmt.executeQuery();
                
                model.setRowCount(0); // reset for clear old data.
                
                while(rs.next()) {
                    model.addRow(new Object[] {
                        rs.getInt("ID"),
                        rs.getString("Username"),
                        rs.getString("Name"),
                        rs.getString("Role"),
                        rs.getString("Status")
                    });
                    
                }
                rs.close();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, e, "Table Management err",JOptionPane.ERROR_MESSAGE);
        }
        
        // ================================== Table list data ====================================
        } // ================================== end else case ====================================

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
        
        jLabel6.setCursor(new Cursor(Cursor.WAIT_CURSOR));
        

        Timer timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {

                jLabel6.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));

            }
        });
        
        timer.setRepeats(false);
        
        timer.start();
        

    
    
    
        try {
        String contry1 = User_cb1st.getSelectedItem().toString();
        String contry2 = User_cb2nd.getSelectedItem().toString();
        String amount = Double.valueOf(User_txtUserInput.getText()) + "";
        

        fetchAPI api = new fetchAPI();
        api.changes(response.toString(),User_cb1st, User_cb2nd, User_txtUserInput, User_lbOutput, contry1, contry2); // exchange each country method

        } catch (Exception ex) {
            System.out.println("fetchAPI2nd_Error -----> " + ex);
        }
        
        // insert Table 5 column to Database
        // ID, username_used, currency1, currency2, date(now)

        
// =============================== SQL Insert data ===============================

        try (Connection conn = databaseConnection.connect()) {
            String insertQuery = "INSERT INTO class_insertData (ID, username, currencyFrom, currencyTo, date) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(insertQuery);
            
            String queryCheckID = "SELECT MAX(ID) FROM class_insertData";
            PreparedStatement pstmt2 = conn.prepareStatement(queryCheckID);
            ResultSet rs = pstmt2.executeQuery();
            
            int id = 0;
            
            if (rs.next()) {
                id = rs.getInt(1) + 1;
            } // auto increament ID column
            
            pstmt.setInt(1, id);
            pstmt.setString(2, getCurrentUserName());
            pstmt.setString(3, User_txtUserInput.getText() + " " + User_cb1st.getSelectedItem().toString());
            pstmt.setString(4, User_cb2nd.getSelectedItem().toString());
            pstmt.setString(5, new Date().toString());
            
            pstmt.executeUpdate();
            
            System.out.println(id);
            System.out.println(getCurrentUserName());
            System.out.println(User_txtUserInput.getText() + " " + User_cb1st.getSelectedItem().toString());
            System.out.println(User_cb2nd.getSelectedItem().toString());
            System.out.println(new Date().toString());
            
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, "Insertdata Error",JOptionPane.ERROR);
        }
        
// =============================== SQL Insert data ===============================
    }//GEN-LAST:event_jLabel6MouseClicked

    private void User_txtUserInputFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_User_txtUserInputFocusLost
        // TODO add your handling code here:
        if (User_txtUserInput.getText().equals("")) {
            User_txtUserInput.setText("UserInput");
        }
    }//GEN-LAST:event_User_txtUserInputFocusLost

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        // TODO add your handling code here:
        jLabel6.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void lbAccountPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lbAccountPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_lbAccountPropertyChange

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        // TODO add your handling code here:
        jLabel6.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_jLabel6MouseExited

    private void tableManageMembershipFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tableManageMembershipFocusGained
        // TODO add your handling code here:
        
        tableManageMembership.addMouseListener(new MouseAdapter() {
        @Override
        public void mouseClicked(MouseEvent e) {
        
        int selectedRow = tableManageMembership.getSelectedRow();
        if (selectedRow != -1) {
            
            ctrlPN_txtID.setText(tableManageMembership.getValueAt(selectedRow, 0).toString());
            ctrlPN_txtUsername.setText(tableManageMembership.getValueAt(selectedRow, 1).toString());
            ctrlPN_txtName.setText(tableManageMembership.getValueAt(selectedRow, 2).toString());
            
            String role = tableManageMembership.getValueAt(selectedRow, 3).toString();
            if (role.equals("Admin")) {
                ctrlPN_cbRole.setSelectedItem("Admin"); // Admin อยู่ที่ index 1
            } else if (role.equals("Member")) {
                ctrlPN_cbRole.setSelectedItem("Member"); // Member อยู่ที่ index 2
            } else {
                ctrlPN_cbRole.setSelectedIndex(0); // default อยู่ที่ index 0
            }
            
        }
        
    }
});
    }//GEN-LAST:event_tableManageMembershipFocusGained

    private void ctrlPN_btnDELETEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctrlPN_btnDELETEMouseClicked
        // TODO add your handling code here:
        
        String id = ctrlPN_txtID.getText().trim();
    
    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter ID field", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try (Connection conn = databaseConnection.connect()) {
        
        String checkQuery = "SELECT * FROM class_Account WHERE ID = ?";
        PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
        checkStmt.setInt(1, Integer.parseInt(id));
        ResultSet rs = checkStmt.executeQuery();
        
        if (!rs.next()) {
            JOptionPane.showMessageDialog(this, "Error. Please recheck your information", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // ถ้ามีข้อมูลให้ลบ
        String deleteQuery = "DELETE FROM class_Account WHERE ID = ?";
        PreparedStatement deleteStmt = conn.prepareStatement(deleteQuery);
        deleteStmt.setInt(1, Integer.parseInt(id));
        
        int rowsAffected = deleteStmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "User deleted successfully");
            // อัพเดตตาราง
            loadAccountTable();
            // เคลียร์ช่องกรอกข้อมูล
            clearFields();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to delete user", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        rs.close();
        checkStmt.close();
        deleteStmt.close();
        
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    }//GEN-LAST:event_ctrlPN_btnDELETEMouseClicked

    private void ctrlPN_btnEDITMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ctrlPN_btnEDITMouseClicked
        // TODO add your handling code here:
        
    String id = ctrlPN_txtID.getText().trim();
    String username = ctrlPN_txtUsername.getText().trim();
    String name = ctrlPN_txtName.getText().trim();
    String role = ctrlPN_cbRole.getSelectedItem().toString();
    
    if (id.isEmpty() || username.isEmpty() || name.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please fill all required fields", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try (Connection conn = databaseConnection.connect()) {
        // ตรวจสอบว่า ID มีอยู่จริงหรือไม่
        String checkQuery = "SELECT * FROM class_Account WHERE ID = ?";
        PreparedStatement checkStmt = conn.prepareStatement(checkQuery);
        checkStmt.setInt(1, Integer.parseInt(id));
        ResultSet rs = checkStmt.executeQuery();
        
        if (!rs.next()) {
            JOptionPane.showMessageDialog(this, "Error. Please recheck your information", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        // ถ้ามีข้อมูลให้อัพเดต
        String updateQuery = "UPDATE class_Account SET Username = ?, Name = ?, Role = ? WHERE ID = ?";
        PreparedStatement updateStmt = conn.prepareStatement(updateQuery);
        updateStmt.setString(1, username);
        updateStmt.setString(2, name);
        updateStmt.setString(3, role);
        updateStmt.setInt(4, Integer.parseInt(id));
        
        int rowsAffected = updateStmt.executeUpdate();
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(this, "User updated successfully");
            // อัพเดตตาราง
            loadAccountTable();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update user", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        rs.close();
        checkStmt.close();
        updateStmt.close();
        
    } catch (Exception ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
        
    }//GEN-LAST:event_ctrlPN_btnEDITMouseClicked

    // ============================================================== CUSTOM Method ==============================================
    private void loadAccountTable() {
    try (Connection conn = databaseConnection.connect()) {
        String query = "SELECT * FROM class_Account";
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(query);
        
        // ใช้ DefaultTableModel
        DefaultTableModel model = (DefaultTableModel) tableManageMembership.getModel();
        model.setRowCount(0); // ล้างข้อมูลเก่า
        
        while (rs.next()) {
            model.addRow(new Object[] {
                rs.getInt("ID"),
                rs.getString("Username"),
                rs.getString("Name"),
                rs.getString("Role"),
                rs.getString("Status"),
            });
        }
        
        rs.close();
        stmt.close();
    } catch (Exception e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error loading account data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void clearFields() {
    ctrlPN_txtID.setText("");
    ctrlPN_txtUsername.setText("");
    ctrlPN_txtName.setText("");
    ctrlPN_cbRole.setSelectedIndex(0);
}
    // ============================================================== CUSTOM Method ==============================================
    
    
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
    private javax.swing.JScrollPane JscrollPane;
    private javax.swing.JComboBox<String> User_cb1st;
    private javax.swing.JComboBox<String> User_cb2nd;
    private javax.swing.JLabel User_lbOutput;
    private javax.swing.JTextField User_txtUserInput;
    private javax.swing.JButton ctrlPN_btnDELETE;
    private javax.swing.JButton ctrlPN_btnEDIT;
    private javax.swing.JComboBox<String> ctrlPN_cbRole;
    private javax.swing.JTextField ctrlPN_txtID;
    private javax.swing.JTextField ctrlPN_txtName;
    private javax.swing.JTextField ctrlPN_txtUsername;
    private javax.swing.JLabel first_lbCount;
    private javax.swing.JLabel first_lbFlag;
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
    private javax.swing.JLabel jLabel19;
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
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
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
    private javax.swing.JPanel pnFormConvertor;
    private javax.swing.JPanel pnFormDataList;
    private javax.swing.JPanel pnFormOverview;
    private javax.swing.JPanel pnFormSetting;
    private javax.swing.JPanel pnLogout;
    private javax.swing.JPanel pnOverview;
    private javax.swing.JPanel pnSetting;
    private javax.swing.JPanel pnUsers;
    private javax.swing.JLabel second_lbCount;
    private javax.swing.JLabel second_lbFlag;
    private javax.swing.JTable tableDataList;
    private javax.swing.JTable tableManageMembership;
    private javax.swing.JLabel third_lbCount;
    private javax.swing.JLabel third_lbFlag;
    private javax.swing.JLabel titleState;
    private javax.swing.JTextField txtSearching;
    // End of variables declaration//GEN-END:variables


}
