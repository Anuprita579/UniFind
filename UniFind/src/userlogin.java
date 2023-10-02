import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class userlogin extends JFrame implements ActionListener {
    JButton lb;
    JTextField txtUser;
    JButton bk;
    JLabel l1;
    JPasswordField txtpass;
    JFrame frame;

    Font font = new Font("Times New Roman", Font.PLAIN, 15);
    Font font1 = new Font("Tahoma", Font.BOLD, 40);
    Font fLabel = new Font("Times New Roman",0,18);
    Font fLabel1 = new Font("Times New Roman",0,18);

    userlogin() {
        JPanel panel = new JPanel();
        frame = new JFrame();
        JLabel lable=new JLabel();


        frame.setSize(700, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("login2.png"));
        Image i3  = i1.getImage().getScaledInstance(900,600,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);*/
        JLabel i2 = new JLabel("");
        i2.setBounds(0,0,900,600);
        frame.add(i2);

        JLabel admin = new JLabel("USER LOGIN");
        admin.setForeground(Color.black);
        admin.setBounds(210, 30, 500, 100);
        admin.setFont(font1);
        i2.add(admin);


        panel.add(lable);
        panel.setLayout(null);

        JLabel lable1 = new JLabel("USERNAME :");
        lable1.setForeground(Color.black);
        lable1.setBounds(180, 220, 120, 50);
        lable1.setFont(fLabel1);
        i2.add(lable1);

//        l1 = new JLabel("User Login");
//        l1.setBounds(350,40,200,40);
//        l1.setFont(new Font("Tahoma",Font.BOLD,16));
//        panel.add(l1);

        txtUser = new JTextField(20);
        txtUser.setBounds(380, 220, 150, 50);
        i2.add(txtUser);


        JLabel lable2 = new JLabel("PASSWORD :");
        lable2.setForeground(Color.black);
        lable2.setBounds(180, 300, 120, 50);
        lable2.setFont(fLabel1);
        i2.add(lable2);

        txtpass = new JPasswordField();
        txtpass.setBounds(380, 300, 150, 50);
        i2.add(txtpass);

        this.lb = new JButton("LOGIN");
        lb.setBounds(150, 450, 120, 50);
        lb.setFont(fLabel);
        this.lb.addActionListener(this);
        i2.add(lb);

        this.bk= new JButton("BACK");
        bk.setBounds(450, 450, 120, 50);
        bk.setFont(fLabel);
        this.bk.addActionListener(this);
        i2.add(bk);
        i2.add(lable);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        lable.setVisible(true);

    }

    public void actionPerformed (ActionEvent ae) {
        if (ae.getSource() == lb) {
            String un = this.txtUser.getText();
            String password = String.valueOf(this.txtpass.getPassword());
            conn c = new conn();
            try{
                String str1 = "select * from users where usname = '"+un+"' and uspassword = '"+password+"';";
                ResultSet rs = c.s.executeQuery(str1);
                if(rs.next())
                {
                    JOptionPane.showMessageDialog(null,"Login Successful!");
                    frame.setVisible(false);
                    this.setVisible(false);
                    new showcollege();
                }
                else {
                    JOptionPane.showMessageDialog(null,"Invalid Credentials!");
                }
            }
            catch (Exception e) {

                System.out.println(e);
            }
        }
        if(ae.getSource()==bk)
        {
            frame.setVisible(false);
            this.setVisible(false);
            new home();
        }
    }


    public static void main(String[] args)
    {
        new userlogin();
    }
}
