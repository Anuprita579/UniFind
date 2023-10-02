import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class showcollege extends JFrame implements ActionListener {
    JButton lb;
    JButton back, submit;
    JFrame frame, frame1;
    JTextField nameTxt;
    JComboBox<String> locTxt, seatsTxt, feeTxt, gradTxt, expTxt, cutoffTxt;
    private JTable table;
    DefaultTableModel tableModel;
    int startexp, endexp, startcutoff, endcutoff, startseats, endseats, startfees, endfees, startgrad, endgrad;

    showcollege() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();

        frame.setSize(1550, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        panel.setLayout(null);

        JLabel i2 = new JLabel("");
        i2.setBounds(0, 0, 1000, 900);
        panel.add(i2);

        JLabel l1 = new JLabel("ENTER DETAILS OF COLLEGE");
        l1.setBounds(550, 20, 600, 50);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        l1.setForeground(Color.black);
        i2.add(l1);

        JLabel l2 = new JLabel("Search By");
        l2.setBounds(500, 150, 100, 25);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setForeground(Color.WHITE);
        l2.setOpaque(true);
        l2.setBackground(Color.BLUE);
        i2.add(l2);

        JLabel l3 = new JLabel("Location");
        l3.setBounds(500, 200, 100, 25);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setForeground(Color.black);
        i2.add(l3);
        String[] locOptions = {"USA", "UK", "Germany", "Canada"};
        locTxt = new JComboBox<>(locOptions);
        locTxt.setBounds(700, 200, 250, 25);
        i2.add(locTxt);

        JLabel l5 = new JLabel("Filter By");
        l5.setBounds(500, 250, 100, 25);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setForeground(Color.WHITE);
        l5.setOpaque(true);
        l5.setBackground(Color.BLUE);
        i2.add(l5);

        JLabel l6 = new JLabel("Seats");
        l6.setBounds(500, 300, 100, 25);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l6.setForeground(Color.black);
        i2.add(l6);
        String[] seatsOptions = {"Choose","1 - 5,000", "5,000 - 10,000", "10,000 - 15,000"};
        seatsTxt = new JComboBox<>(seatsOptions);
        seatsTxt.setBounds(700, 300, 250, 25);
        i2.add(seatsTxt);

        JLabel l7 = new JLabel("Fees");
        l7.setBounds(500, 350, 100, 25);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l7.setForeground(Color.black);
        i2.add(l7);
        String[] feeOptions = {"Choose","1 - 3,000", "3,000 - 6,000", "6,000 - 9,000"};
        feeTxt = new JComboBox<>(feeOptions);
        feeTxt.setBounds(700, 350, 250, 25);
        i2.add(feeTxt);

        JLabel l8 = new JLabel("Grad Rate");
        l8.setBounds(500, 400, 100, 25);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l8.setForeground(Color.black);
        i2.add(l8);
        String[] gradOptions = {"Choose","40 - 60", "60 - 80", "80 - 100"};
        gradTxt = new JComboBox<>(gradOptions);
        gradTxt.setBounds(700, 400, 250, 25);
        i2.add(gradTxt);

        JLabel l9 = new JLabel("Expenditure");
        l9.setBounds(500, 450, 100, 25);
        l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l9.setForeground(Color.black);
        i2.add(l9);
        String[] expOptions = {"Choose","1 - 10,000", "10,000 - 20,000", "20,000 - 30,000"};
        expTxt = new JComboBox<>(expOptions);
        expTxt.setBounds(700, 450, 250, 25);
        i2.add(expTxt);

        JLabel l10 = new JLabel("Cutoff");
        l10.setBounds(500, 500, 100, 25);
        l10.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l10.setForeground(Color.black);
        i2.add(l10);
        String[] cutoffOptions = {"Choose","7 - 8", "8 - 9", "9 - 10"};
        cutoffTxt = new JComboBox<>(cutoffOptions);
        cutoffTxt.setBounds(700, 500, 250, 25);
        i2.add(cutoffTxt);

        lb = new JButton("SUBMIT");
        lb.setBounds(550, 600, 100, 40);
        lb.addActionListener(this);
        i2.add(lb);

        back = new JButton("BACK");
        back.setBounds(800, 600, 100, 40);
        back.addActionListener(this);
        i2.add(back);

        frame.setVisible(true);
        setLocationRelativeTo(null);
    }

    private void populateTable() {
        conn c = new conn();
        try {
            String selectedloc = (String) locTxt.getSelectedItem();
            //Seats
            if (seatsTxt.getSelectedItem().equals("Choose")){
                startseats = 1;
                endseats = 15000;
            }
            else if (seatsTxt.getSelectedItem().equals("1 - 5,000")){
                startseats = 1;
                endseats = 5000;
            }
            else if (seatsTxt.getSelectedItem().equals("5,000 - 10,000")){
                startseats = 5000;
                endseats = 10000;
            }
            else if (seatsTxt.getSelectedItem().equals("10,000 - 15,000")){
                startseats = 10000;
                endseats = 15000;
            }
            //Fees
            if (feeTxt.getSelectedItem().equals("Choose")){
                startfees = 1;
                endfees = 9000;
            }
            else if (feeTxt.getSelectedItem().equals("1 - 3,000")){
                startfees = 1;
                endfees = 3000;
            }
            else if (feeTxt.getSelectedItem().equals("3,000 - 6,000")){
                startfees = 3000;
                endfees = 6000;
            }
            else if (feeTxt.getSelectedItem().equals("6,000 - 9,000")){
                startfees = 6000;
                endfees = 9000;
            }
            //Grad Rate
            if (gradTxt.getSelectedItem().equals("Choose")){
                startgrad = 40;
                endgrad = 100;
            }
            else if (gradTxt.getSelectedItem().equals("40 - 60")){
                startgrad = 40;
                endgrad = 60;
            }
            else if (gradTxt.getSelectedItem().equals("60 - 80")){
                startgrad = 60;
                endgrad = 80;
            }
            else if (gradTxt.getSelectedItem().equals("80 - 100")){
                startgrad = 80;
                endgrad = 100;
            }

            //Expenditure
            if (expTxt.getSelectedItem().equals("Choose")){
                startexp = 1;
                endexp = 30000;
            }
            else if (expTxt.getSelectedItem().equals("1 - 10,000")){
                startexp = 1;
                endexp = 10000;
            }
            else if (expTxt.getSelectedItem().equals("10,000 - 20,000")){
                startexp = 10000;
                endexp = 20000;
            }
            else if (expTxt.getSelectedItem().equals("20,000 - 30,000")){
                startexp = 20000;
                endexp = 30000;
            }
            //Cutoff
            if (cutoffTxt.getSelectedItem().equals("Choose")){
                startcutoff = 7;
                endcutoff = 10;
            }
            else if (cutoffTxt.getSelectedItem().equals("7 - 8")){
                startcutoff = 7;
                endcutoff = 8;
            }
            else if (cutoffTxt.getSelectedItem().equals("8 - 9")){
                startcutoff = 8;
                endcutoff = 9;
            }
            else if (cutoffTxt.getSelectedItem().equals("9 - 10")){
                startcutoff = 9;
                endcutoff = 10;
            }


            String str1 = "select cname,location,seats,studenroll,fees,expenditure,gradrate,ranking, scholarship,grade from college where location = '" + selectedloc + "' AND expenditure between '"+startexp+"' and '"+endexp+"' AND grade between '"+startcutoff+"' and '"+endcutoff+"' AND seats between '"+startseats+"' and '"+endseats+"' AND fees between '"+startfees+"' and '"+endfees+"' AND gradrate between '"+startgrad+"' and '"+endgrad+"'     ;";
            ResultSet rs = c.s.executeQuery(str1);

            // Create a DefaultTableModel to hold the data
            tableModel = new DefaultTableModel();

            // Get the metadata for the result set (for column names)
            int columnCount = rs.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(rs.getMetaData().getColumnName(i));
            }

            // Populate the table model with data from the result set
            while (rs.next()) {
                Object[] row = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                tableModel.addRow(row);
            }

            // Create the JTable with the table model
            table = new JTable(tableModel);

            // Create a JScrollPane to add the table to
            JScrollPane tableScrollPane = new JScrollPane(table);
            tableScrollPane.setBounds(700, 150, 800, 300);
            
            frame1 = new JFrame();
            //frame1.setLocation(100, 200);
            //frame1.setSize(1000, 700);
            frame1.setBounds(100, 100, 1000, 700);
            frame1.add(tableScrollPane);
            frame1.setLocationRelativeTo(null);
            frame1.setVisible(true);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == lb) {
            populateTable();
        }

        if (ae.getSource() == back) {
            this.setVisible(false);
            new home();
        }
        frame.setVisible(false);
    }

    public static void main(String[] args) {
        new showcollege();
    }
}
