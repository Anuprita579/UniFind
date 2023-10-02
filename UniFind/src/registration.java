import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class registration extends JFrame implements ActionListener {
    JButton lb;
    JButton back,submit;
    JFrame frame = new JFrame();
    JTextField  nameTxt,emailTxt,dobTxt,genderTxt,contTxt,username;
    JPasswordField txtpass;

    registration() {
        // JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        frame.setSize(1000, 900);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        panel.setLayout(null);

        /*ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Img25.jpg"));
        Image i3  = i1.getImage().getScaledInstance(1000,900,Image.SCALE_SMOOTH);
        ImageIcon i4 = new ImageIcon(i3);*/
        JLabel i2 = new JLabel("");
        i2.setBounds(0,0,1000,900);
        panel.add(i2);

        JLabel l1 = new JLabel("ENTER  DETAILS");
        l1.setBounds(370, 20, 300, 50);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        l1.setForeground(Color.black);
        i2.add(l1);

        JLabel l2 = new JLabel("Name");
        l2.setBounds(250, 100, 100, 25);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setForeground(Color.black);
        i2.add(l2);
        nameTxt = new JTextField();
        nameTxt.setBounds(500, 100, 250, 25);
        i2.add(nameTxt);

        JLabel l4 = new JLabel("E-mail");
        l4.setBounds(250, 150, 100, 25);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l4.setForeground(Color.black);
        i2.add(l4);
        emailTxt=new JTextField();
        emailTxt.setBounds(500,150,250,25);
        i2.add(emailTxt);

        JLabel l5 = new JLabel("Date of Birth");
        l5.setBounds(250, 200, 100, 25);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setForeground(Color.black);
        i2.add(l5);
        dobTxt=new JTextField();
        dobTxt.setBounds(500,200,250,25);
        i2.add(dobTxt);

        JLabel l7 = new JLabel("Gender");
        l7.setBounds(250, 250, 100, 25);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l7.setForeground(Color.black);
        i2.add(l7);
        genderTxt=new JTextField();
        genderTxt.setBounds(500,250,250,25);
        i2.add(genderTxt);

        JLabel l3 = new JLabel("Contact");
        l3.setBounds(250, 300, 100, 25);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setForeground(Color.black);
        i2.add(l3);
        contTxt=new JTextField();
        contTxt.setBounds(500,300,250,25);
        i2.add(contTxt);

        JLabel l9 = new JLabel("Username");
        l9.setBounds(250, 350, 100, 25);
        l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l9.setForeground(Color.black);
        i2.add(l9);
        username=new JTextField();
        username.setBounds(500,350,250,25);
        i2.add(username);

        JLabel lable2 = new JLabel("Set Password");
        lable2.setBounds(250, 400, 100, 25);
        lable2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lable2.setForeground(Color.black);
        i2.add(lable2);
        txtpass = new JPasswordField();
        txtpass.setBounds(500, 400, 250, 25);
        i2.add(txtpass);

        setLocationRelativeTo(null);
        frame.setVisible(true);

        lb=new JButton("SUBMIT");
        lb.setBounds(250,500,100,40);
        lb.addActionListener(this);

        i2.add(lb);

        back =new JButton("BACK");
        back.setBounds(650,500,100,40);
        back.addActionListener(this);
        i2.add(back);

        frame.setVisible(true);
        setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==lb){
            String nameTxt = this.nameTxt.getText();
            String emailTxt = this.emailTxt.getText();
            String dobTxt = this.dobTxt.getText();
            String genderTxt = this.genderTxt.getText();
            String contTxt = this.contTxt.getText();
            String username = this.username.getText();
            String txtpass = this.txtpass.getText();
            conn c = new conn();
            try {
                String str = "INSERT INTO users(FULLNAME,EMAIL,DOB,GENDER,CONTACT,USNAME,USPASSWORD) VALUES('"+nameTxt+"','"+emailTxt+"','"+dobTxt+"','"+genderTxt+"','"+contTxt+"','"+username+"','"+txtpass+"');";
                c.s.execute(str);
                JOptionPane.showMessageDialog(null,"Data is Successfully entered!!");
            }
            catch(Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Registration Unsuccessful");
            }

        }
        if (ae.getSource()== lb)
        {
            this.setVisible(false);
            new userlogin();
        }
        if (ae.getSource()==back)
        {
            this.setVisible(false);
            new home();
        }
        frame.setVisible(false);
    }


    public static void main(String[] args) {
        new registration();
    }
}

