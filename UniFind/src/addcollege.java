
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  class addcollege extends JFrame implements ActionListener {
    JButton lb;
    JButton back,submit;
    JFrame frame = new JFrame();
    JTextField  nameTxt,seatsTxt,enrollTxt,feeTxt,scholarTxt,gradTxt,expTxt,cutoffTxt,con1Txt,con2Txt;
    JPasswordField txtpass;

    addcollege() {
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

        JLabel l1 = new JLabel("ENTER  DETAILS OF COLLEGE");
        l1.setBounds(280, 20, 600, 50);
        l1.setFont(new Font("Tahoma", Font.BOLD, 30));
        l1.setForeground(Color.black);
        i2.add(l1);

        JLabel l2 = new JLabel("College Name");
        l2.setBounds(250, 100, 100, 25);
        l2.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l2.setForeground(Color.black);
        i2.add(l2);
        nameTxt = new JTextField();
        nameTxt.setBounds(500, 100, 250, 25);
        i2.add(nameTxt);

        JLabel l3 = new JLabel("Seats");
        l3.setBounds(250, 150, 100, 25);
        l3.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l3.setForeground(Color.black);
        i2.add(l3);
        seatsTxt=new JTextField();
        seatsTxt.setBounds(500,150,250,25);
        i2.add(seatsTxt);

        JLabel l4 = new JLabel("Enroll");
        l4.setBounds(250, 200, 100, 25);
        l4.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l4.setForeground(Color.black);
        i2.add(l4);
        enrollTxt=new JTextField();
        enrollTxt.setBounds(500,200,250,25);
        i2.add(enrollTxt);

        JLabel l5 = new JLabel("Fees");
        l5.setBounds(250, 250, 100, 25);
        l5.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l5.setForeground(Color.black);
        i2.add(l5);
        feeTxt=new JTextField();
        feeTxt.setBounds(500,250,250,25);
        i2.add(feeTxt);

        JLabel l6 = new JLabel("Scholarship");
        l6.setBounds(250, 300, 100, 25);
        l6.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l6.setForeground(Color.black);
        i2.add(l6);
        scholarTxt=new JTextField();
        scholarTxt.setBounds(500,300,250,25);
        i2.add(scholarTxt);

        JLabel l7 = new JLabel("Grad Rate");
        l7.setBounds(250, 350, 100, 25);
        l7.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l7.setForeground(Color.black);
        i2.add(l7);
        gradTxt=new JTextField();
        gradTxt.setBounds(500,350,250,25);
        i2.add(gradTxt);

        JLabel l8 = new JLabel("Expenditure");
        l8.setBounds(250, 400, 100, 25);
        l8.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l8.setForeground(Color.black);
        i2.add(l8);
        expTxt=new JTextField();
        expTxt.setBounds(500,400,250,25);
        i2.add(expTxt);

        JLabel l9 = new JLabel("Cutoff");
        l9.setBounds(250, 450, 100, 25);
        l9.setFont(new Font("Tahoma", Font.PLAIN, 16));
        l9.setForeground(Color.black);
        i2.add(l9);
        cutoffTxt=new JTextField();
        cutoffTxt.setBounds(500,450,250,25);
        i2.add(cutoffTxt);

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
            String seatsTxt = this.seatsTxt.getText();
            String enrollTxt = this.enrollTxt.getText();
            String feeTxt = this.feeTxt.getText();
            String scholarTxt = this.scholarTxt.getText();
            String gradTxt = this.gradTxt.getText();
            String expTxt = this.expTxt.getText();
            String cutoffTxt = this.cutoffTxt.getText();
            conn c = new conn();
            try {
                String str = "INSERT INTO COLLEGE(cname,seats,enroll,fees,scholarship,gradrate,expenditure,grade) VALUES('"+nameTxt+"','"+seatsTxt+"','"+enrollTxt+"','"+feeTxt+"','"+scholarTxt+"','"+gradTxt+"','"+expTxt+"','"+cutoffTxt+");";
                c.s.execute(str);
                JOptionPane.showMessageDialog(null,"Data is Successfully entered!!");
            }
            catch(Exception e){
                System.out.println(e);
                JOptionPane.showMessageDialog(null,"Unsuccessful !!");
            }
            this.setVisible(false);
            new addcollege();
        }
        if (ae.getSource()==back)
        {
            this.setVisible(false);
            new home();
        }
        frame.setVisible(false);
    }


    public static void main(String[] args) {
        new addcollege();
    }
}


