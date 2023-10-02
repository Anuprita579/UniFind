

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class home extends JFrame implements ActionListener {
    JButton bt1;
    JButton bt2;
    JButton bt3;
    JFrame frame;
    Font font1 = new Font("Tahoma", Font.BOLD, 40);
    Font fLabel = new Font("Lucida Sans", 0, 40);
    Font fLabel1 = new Font("Lucida Sans", Font.CENTER_BASELINE, 120);
    home() {
        frame = new JFrame();
        frame.setSize(1600, 900);
        this.setDefaultCloseOperation(3);
        this.setLayout((LayoutManager)null);
        //frame.getContentPane().setBackground(new Color(0x123456));
        
        /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("collegeicon.png"));
        Image i3  = i1.getImage().getScaledInstance(1600,900,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);*/
        JLabel i2 = new JLabel("");
        i2.setBounds(0,0,1600,900);
        frame.add(i2);

        JLabel usersec = new JLabel("USER");
        usersec.setBounds(430, 250, 800, 60);
        usersec.setFont(this.font1);
        usersec.setForeground(Color.BLACK);
        i2.add(usersec);

        JLabel adminsec = new JLabel("ADMIN");
        adminsec.setBounds(1000, 250, 800, 60);
        adminsec.setFont(this.font1);
        adminsec.setForeground(Color.BLACK);
        i2.add(adminsec);

        this.bt1 = new JButton("LOGIN");
        this.bt1.setBounds(400, 400, 150, 50);
        bt1.addActionListener(this);
        i2.add(this.bt1);

        this.bt3 = new JButton("LOGIN");
        this.bt3.setBounds(1000, 425, 150, 50);
        bt3.addActionListener(this);
        i2.add(this.bt3);

        this.bt2 = new JButton("REGISTRATION");
        this.bt2.setBounds(400, 500, 150, 50);
        bt2.addActionListener(this);
        i2.add(this.bt2);

        JLabel wel = new JLabel("WELCOME");
        wel.setBounds(700, 730, 800, 60);
        wel.setFont(this.fLabel);
        wel.setForeground(Color.GRAY);
        i2.add(wel);

        JLabel name = new JLabel("UNIFIND");
        name.setBounds(550, 30, 800, 130);
        name.setFont(this.fLabel1);
        name.setForeground(Color.BLUE);
        i2.add(name);

        JLabel details = new JLabel("");
        details.setBounds(720, 560, 800, 100);
        frame.add(details);
        frame.setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if (ae.getSource() ==bt1)
        {
            frame.setVisible(false);
            new userlogin();
        }
        else if (ae.getSource() == bt2)
        {
            frame.setVisible(false);
            new registration();
        }
        else if (ae.getSource() == bt3)
        {
            frame.setVisible(false);
            new adminlogin();
        }
    }

    public static void main(String[] args)
    {
        new home();
    }
}
