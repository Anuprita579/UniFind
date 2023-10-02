import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MainFrame extends JFrame {
    final private Font mainFont = new Font("Segoe print", Font.BOLD, 18);
        JTextField tfcollegename;
        JLabel lbWelcome;

    public void initialize(){
        /**********Form Panel*******/
        JLabel lbcollegename = new JLabel("College Name");
        lbcollegename.setFont(mainFont);
        
        tfcollegename = new JTextField();
        tfcollegename.setFont(mainFont);
        
        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4,1,5,5 ));
        formPanel.setOpaque(false);
        formPanel.add(lbcollegename);
        formPanel.add(tfcollegename);

        /**********Welcome Label*******/
        lbWelcome = new JLabel();
        lbWelcome.setFont(mainFont);

        /**********Buttons Label*******/
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e){
            String collegename = tfcollegename.getText();
            lbWelcome.setText("Hello " + collegename); 
           } 
        });

        JButton btnClear = new JButton("Clear", null);
        btnClear.setFont(mainFont);
        btnClear.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                tfcollegename.setText("");
                lbWelcome.setText("");
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
            
        });

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new GridLayout(1, 2, 10, 5));
        buttonsPanel.setOpaque(false);
        buttonsPanel.add(btnOK);
        buttonsPanel.add(btnClear);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(0xFFFFFF));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(lbWelcome, BorderLayout.CENTER);
        mainPanel.add(buttonsPanel, BorderLayout.SOUTH);

        add(mainPanel);
        setTitle("UniFind");
        setSize(500, 600);
        ImageIcon image = new ImageIcon("collegeicon.png");
        setIconImage(image.getImage());
        setResizable(false);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main (String [] args){
        MainFrame m = new MainFrame();
        m.initialize();
    }
}
