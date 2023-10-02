import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class resultcollege extends JFrame {
    private JTable table;
    private JScrollPane scrollPane;

    resultcollege() {
        setTitle("Database Table Example");

        conn c = new conn();

        try {
            // Create a SQL query
            String sqlQuery = "SELECT * FROM college where location='USA' ;";

            ResultSet rs = c.s.executeQuery(sqlQuery);

            // Create a DefaultTableModel to hold the data
            DefaultTableModel tableModel = new DefaultTableModel();

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
            scrollPane = new JScrollPane(table);

            // Create a JPanel to hold the showcollege content
            JPanel showCollegePanel = createShowCollegePanel();

            // Set the layout for the JFrame
            setLayout(new BorderLayout());

            // Create a JSplitPane to split the content
            JSplitPane splitPane = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, showCollegePanel, scrollPane);
            splitPane.setOneTouchExpandable(true);
            splitPane.setDividerLocation(200); // Set the initial divider location

            // Add the JSplitPane to the JFrame
            add(splitPane);

            // Set JFrame properties
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pack();
            setLocationRelativeTo(null);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private JPanel createShowCollegePanel() {
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        JComboBox<String> locTxt, seatsTxt, feeTxt, gradTxt, expTxt, cutoffTxt;

        // Add your showcollege content to the panel here
        panel.setLayout(null);
        panel.setSize(1550, 900);

        JLabel i2 = new JLabel("");
        i2.setBounds(0, 0, 1000, 900);
        panel.add(i2);

        JLabel l1 = new JLabel("ENTER DETAILS OF COLLEGE");
        l1.setBounds(280, 20, 600, 50);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        l1.setForeground(Color.black);
        i2.add(l1);

        JLabel l2 = new JLabel("Search By");
        l2.setBounds(150, 150, 100, 25);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setForeground(Color.WHITE);
        l2.setOpaque(true);
        l2.setBackground(Color.BLUE);
        i2.add(l2);


        JLabel l3 = new JLabel("Location");
        l3.setBounds(150, 200, 100, 25);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setForeground(Color.black);
        i2.add(l3);
        String[] locOptions = {"USA", "UK", "Germany", "Canada"};
        locTxt = new JComboBox<>(locOptions);
        locTxt.setBounds(400, 200, 250, 25);
        i2.add(locTxt);

        JLabel l5 = new JLabel("Filter By");
        l5.setBounds(150, 250, 100, 25);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setForeground(Color.WHITE);
        l5.setOpaque(true);
        l5.setBackground(Color.BLUE);
        i2.add(l5);

        JLabel l6 = new JLabel("Seats");
        l6.setBounds(150, 300, 100, 25);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l6.setForeground(Color.black);
        i2.add(l6);
        String[] seatsOptions = {"1 - 5,000", "5,000 - 10,000", "10,000 - 15,000"};
        seatsTxt = new JComboBox<>(seatsOptions);
        seatsTxt.setBounds(400, 300, 250, 25);
        i2.add(seatsTxt);

        JLabel l7 = new JLabel("Fees");
        l7.setBounds(150, 350, 100, 25);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l7.setForeground(Color.black);
        i2.add(l7);
        String[] feeOptions = {"1 - 3,000", "3,000 - 6,000", "6,000 - 9,000"};
        feeTxt = new JComboBox<>(feeOptions);
        feeTxt.setBounds(400, 350, 250, 25);
        i2.add(feeTxt);

        JLabel l8 = new JLabel("Grad Rate");
        l8.setBounds(150, 400, 100, 25);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l8.setForeground(Color.black);
        i2.add(l8);
        String[] gradOptions = {"40 - 60", "60 - 80", "80 - 90", "90 - 100"};
        gradTxt = new JComboBox<>(gradOptions);
        gradTxt.setBounds(400, 400, 250, 25);
        i2.add(gradTxt);

        JLabel l9 = new JLabel("Expenditure");
        l9.setBounds(150, 450, 100, 25);
        l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l9.setForeground(Color.black);
        i2.add(l9);
        String[] expOptions = {"1 - 10,000", "10,000 - 20,000", "20,000 - 30,000", "30,000 - 40,000"};
        expTxt = new JComboBox<>(expOptions);
        expTxt.setBounds(400, 450, 250, 25);
        i2.add(expTxt);

        JLabel l10 = new JLabel("Cutoff");
        l10.setBounds(150, 500, 100, 25);
        l10.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l10.setForeground(Color.black);
        i2.add(l10);
        String[] cutoffOptions = {"7 - 8", "8 - 9", "9 - 10"};
        cutoffTxt = new JComboBox<>(cutoffOptions);
        cutoffTxt.setBounds(400, 500, 250, 25);
        i2.add(cutoffTxt);

        JButton lb = new JButton("SUBMIT");
        lb.setBounds(250, 600, 100, 40);
        lb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              SwingUtilities.invokeLater(() -> {
              resultcollege example = new resultcollege();
              example.setVisible(true);
        });
            }
        });
        i2.add(lb);

        JButton back = new JButton("BACK");
        back.setBounds(650, 600, 100, 40);
        back.addActionListener(new ActionListener() {
          @Override
            public void actionPerformed(ActionEvent e) {
            this.setVisible(false);
            new home();
            frame.setVisible(false);
        }

            private void setVisible(boolean b) {
            }
        });
        i2.add(back);

        return panel;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            resultcollege example = new resultcollege();
            example.setVisible(true);
        });
    }
}
