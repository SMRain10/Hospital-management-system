package View;

import Controller.Create_DB;

import javax.swing.*;

public class RegisterPatientView extends javax.swing.JPanel {

    /**
     * Creates new form PatientView
     */
    public RegisterPatientView() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    //Contains the code for the GUI and intializes the components.
    private void initComponents() {

        //CD code
        dconn = new Create_DB();


        //netbeans variables
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        step1Label = new javax.swing.JLabel();
        HcnInput = new javax.swing.JTextField();
        bdMonthInput = new javax.swing.JComboBox<>();
        bdMonthLabel = new javax.swing.JLabel();
        dayLabel = new javax.swing.JLabel();
        bdDayInput = new javax.swing.JComboBox<>();
        yearLabel = new javax.swing.JLabel();
        bdYearInput = new javax.swing.JComboBox<>();
        registerPatient = new javax.swing.JButton();
        pageLabel = new javax.swing.JLabel();
        hcnLabel = new javax.swing.JLabel();
        pNameLabel = new javax.swing.JLabel();
        pNameInput = new javax.swing.JTextField();
        phoneLabel = new javax.swing.JLabel();
        phoneInput = new javax.swing.JTextField();
        famHistoryLabel = new javax.swing.JLabel();
        famHistoryInput = new javax.swing.JTextField();
        allergyLabel = new javax.swing.JLabel();
        allergyInput = new javax.swing.JTextField();
        smokerLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        smokerInput = new javax.swing.JList<>();
        birthdateLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        pecLabel = new javax.swing.JLabel();
        pecInput = new javax.swing.JTextField();
        addressLabel = new javax.swing.JLabel();
        addressInput = new javax.swing.JTextField();
        cityLabel = new javax.swing.JLabel();
        cityInput = new javax.swing.JTextField();
        provinceLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        provinceInput = new javax.swing.JList<>();
        backButton = new javax.swing.JButton();
        successText = new javax.swing.JLabel();
        createEmergencyContactButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        genderInput = new javax.swing.JList<>();

        step1Label.setText("Please fill out all boxes above.");

        bdMonthInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","January", "February", "March"
                , "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        bdMonthLabel.setText("Month");

        dayLabel.setText("Day");

        bdDayInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"", "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31" }));

        yearLabel.setText("Year");

        bdYearInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "","1900","1901","1902","1903","1904"
                ,"1905","1906","1907","1908","1909","1910","1911","1912","1913","1914","1915","1916","1917","1918"
                ,"1919","1920","1921","1922","1923","1924","1925","1926","1927","1928","1929","1930","1931"
                ,"1932","1933","1934","1935","1936","1937","1938","1939","1940","1941","1942","1943","1944"
                ,"1945","1946","1947","1948","1949","1950","1951","1952","1953","1954","1955","1956","1957"
                ,"1958","1959","1960","1961","1962","1963","1964","1965","1966","1967","1968","1969","1970"
                ,"1971","1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983"
                ,"1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995","1996"
                ,"1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007","2008","2009"
                ,"2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023" }));

        registerPatient.setText("Register Patient");
        registerPatient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerPatientActionPerformed(evt);
            }
        });

        pageLabel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        pageLabel.setText("Patient Registration");

        hcnLabel.setText("Health Card Number");

        pNameLabel.setText("Name");
        phoneLabel.setText("Phone Number");
        famHistoryLabel.setText("Family History");
        allergyLabel.setText("Allergies");
        smokerLabel.setText("Smoker");
        birthdateLabel.setText("Birth Date");
        genderLabel.setText("Gender");
        pecLabel.setText("Pre-existing Conditions");
        addressLabel.setText("Address");
        cityLabel.setText("City");
        provinceLabel.setText("Province");

        smokerInput.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Yes", "No" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(smokerInput);

        provinceInput.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "AB", "BC", "SK", "NW", "YT", "NT", "MB", "QC", "NS", "NB", "PE", "NL" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(provinceInput);

        //Action listener for the back button
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        createEmergencyContactButton.setText("Create Emergency Contact");
        createEmergencyContactButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createEmergencyContactButtonActionPerformed(evt);
            }
        });

        genderInput.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Male", "Female" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(genderInput);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(418, 418, 418)
                                .addComponent(pageLabel)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 739, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(createEmergencyContactButton)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                .addComponent(backButton))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(pecLabel))
                                                                                .addGap(18, 18, 18)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(pecInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                        .addComponent(registerPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                        .addComponent(successText, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(297, 297, 297)))))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        )
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(13, 13, 13)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(hcnLabel)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(HcnInput, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addGap(33, 33, 33)
                                                                                .addComponent(pNameLabel)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(phoneLabel)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(famHistoryLabel)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(famHistoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(70, 70, 70)
                                                                                                .addComponent(allergyInput, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                        .addComponent(allergyLabel))
                                                                                .addGap(42, 42, 42)
                                                                                .addComponent(smokerLabel)
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(birthdateLabel)
                                                                                        .addComponent(genderLabel))
                                                                                .addGap(40, 40, 40)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(22, 22, 22)
                                                                                                .addComponent(bdMonthLabel))
                                                                                        .addComponent(bdMonthInput, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(12, 12, 12)
                                                                                                .addComponent(dayLabel)
                                                                                                .addGap(66, 66, 66)
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                .addGap(24, 24, 24)
                                                                                                                .addComponent(yearLabel))
                                                                                                        .addComponent(bdYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                        .addComponent(bdDayInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(addressLabel)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                        .addComponent(cityLabel)
                                                                                        .addGap(18, 18, 18)
                                                                                        .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                                        .addGap(302, 302, 302)
                                                                                        .addComponent(provinceLabel)))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(281, 281, 281)
                                                                                .addComponent(step1Label)))))
                                                .addGap(0, 38, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(pageLabel)
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(HcnInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hcnLabel)
                                        .addComponent(pNameInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(pNameLabel))
                                .addGap(18, 18, 18)
                                .addComponent(step1Label)
                                .addGap(12, 12, 12)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(phoneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneLabel))
                                .addGap(17, 17, 17)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(famHistoryInput, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(famHistoryLabel))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(allergyInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(allergyLabel)
                                                        .addComponent(smokerLabel))
                                                .addGap(53, 53, 53)
                                                .addComponent(bdMonthLabel)
                                                .addGap(4, 4, 4)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(birthdateLabel)
                                                        .addComponent(bdMonthInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(dayLabel)
                                                                        .addGap(28, 28, 28))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                        .addComponent(yearLabel)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(bdYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addComponent(bdDayInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(37, 37, 37)
                                                .addComponent(genderLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(34, 34, 34)
                                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(pecInput, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(pecLabel))
                                                .addGap(26, 26, 26)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(addressInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(addressLabel))
                                                .addGap(16, 16, 16)
                                                .addComponent(provinceLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                .addComponent(cityInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(cityLabel)))
                                                .addGap(18, 18, 18)
                                                .addComponent(registerPatient, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(successText, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(backButton)
                                        .addComponent(createEmergencyContactButton))
                                .addGap(26, 26, 26))
        );
    }



    private void registerPatientActionPerformed(java.awt.event.ActionEvent evt) {

        String monthToDigit = "01";

        if(bdMonthInput.getSelectedItem() == "Janurary"){
                monthToDigit = "01";
        } else if (bdMonthInput.getSelectedItem() == "February"){
                monthToDigit = "02";
        }else if (bdMonthInput.getSelectedItem() == "March"){
                monthToDigit = "03";
        }else if (bdMonthInput.getSelectedItem() == "April"){
                monthToDigit = "04";
        }else if (bdMonthInput.getSelectedItem() == "May"){
                monthToDigit = "05";
        }else if (bdMonthInput.getSelectedItem() == "June"){
                monthToDigit = "06";
        }else if (bdMonthInput.getSelectedItem() == "July"){
                monthToDigit = "07";
        }else if (bdMonthInput.getSelectedItem() == "August"){
                monthToDigit = "08";
        }else if (bdMonthInput.getSelectedItem() == "September"){
                monthToDigit = "09";
        }
        else if (bdMonthInput.getSelectedItem() == "October"){
                monthToDigit = "10";
        }
        else if (bdMonthInput.getSelectedItem() == "November"){
                monthToDigit = "11";
        }
        else if (bdMonthInput.getSelectedItem() == "December"){
                monthToDigit = "12";
        }
        else if (bdMonthInput.getSelectedItem() == ""){
            monthToDigit = "";
        }

        String birthday = bdYearInput.getSelectedItem() + "-" + monthToDigit + "-" + bdDayInput.getSelectedItem();

        if(bdYearInput.getSelectedItem().equals("") && monthToDigit.equals("") && bdDayInput.getSelectedItem().equals("")){
            birthday = "";
        }

        
        if (pNameInput.getText().equals("") || HcnInput.getText().equals("") ) {
                JOptionPane.showMessageDialog(null, "Must enter name, healthcare number.");
            } else {
                dconn.Registration(pNameInput.getText(), Integer.parseInt(HcnInput.getText()),phoneInput.getText(),allergyInput.getText(),famHistoryInput.getText(),smokerInput.getSelectedValue(),
                birthday,genderInput.getSelectedValue(),pecInput.getText(),cityInput.getText(),provinceInput.getSelectedValue(),addressInput.getText());
        successText.setText("Patient Registered");
            }

    }

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setLoginView(new LoginView());
        mainView.setCard(0);
    }

    private void createEmergencyContactButtonActionPerformed(java.awt.event.ActionEvent evt) {
        MainView mainView = (MainView) SwingUtilities.getWindowAncestor(this);
        mainView.setEmergencyContactView(new EmergencyContactView());
        mainView.setCard(11);
    }


    // Variables declaration - do not modify
    private javax.swing.JTextField HcnInput;
    private javax.swing.JTextField addressInput;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField allergyInput;
    private javax.swing.JLabel allergyLabel;
    private javax.swing.JButton backButton;
    private javax.swing.JComboBox<String> bdDayInput;
    private javax.swing.JComboBox<String> bdMonthInput;
    private javax.swing.JLabel bdMonthLabel;
    private javax.swing.JComboBox<String> bdYearInput;
    private javax.swing.JLabel birthdateLabel;
    private javax.swing.JTextField cityInput;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JButton createEmergencyContactButton;
    private javax.swing.JLabel dayLabel;
    private javax.swing.JTextField famHistoryInput;
    private javax.swing.JLabel famHistoryLabel;
    private javax.swing.JList<String> genderInput;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JLabel hcnLabel;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField pNameInput;
    private javax.swing.JLabel pNameLabel;
    private javax.swing.JLabel pageLabel;
    private javax.swing.JTextField pecInput;
    private javax.swing.JLabel pecLabel;
    private javax.swing.JTextField phoneInput;
    private javax.swing.JLabel phoneLabel;
    private javax.swing.JList<String> provinceInput;
    private javax.swing.JLabel provinceLabel;
    private javax.swing.JButton registerPatient;
    private javax.swing.JList<String> smokerInput;
    private javax.swing.JLabel smokerLabel;
    private javax.swing.JLabel step1Label;
    private javax.swing.JLabel successText;
    private javax.swing.JLabel yearLabel;


    //Added by SR
    private Create_DB dconn;
    // End of variables declaration
}