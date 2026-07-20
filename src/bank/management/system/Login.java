package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame  implements ActionListener {
    JLabel label1,label2,label3;

    JTextField textField2;

    JPasswordField passwordField3;

    JButton button1,button2,button3;

    Login(){
        super("Bank Management System");



        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2=i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);//for visible on the frame
        JLabel image=new JLabel(i3);//
        image.setBounds(350,10,100,100);
        add(image);


        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);


        textField2 =new JTextField( 15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);


        label3=new JLabel("PIN");
        label3.setFont(new Font("rohit",Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField3=new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial",Font.BOLD,15));
        add(passwordField3);

        button1=new JButton("Sign in");
        button1.setFont(new Font("Arial",Font.BOLD,15));
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);


        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,15));
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);


        button3=new JButton("SING UP");
        button3.setFont(new Font("Arial",Font.BOLD,15));
        button3.setForeground(Color.WHITE);
        button3.setBackground(Color.BLACK);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);



        ImageIcon ii1=new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));//hamne system se nikal ke store kara di ii1 me
        Image ii2=ii1.getImage().getScaledInstance(100,100,Image.SCALE_FAST);//It takes an image and creates a 100×100 pixel resized version of it.
        ImageIcon ii3=new ImageIcon(ii2);//for visible on the frame
        JLabel image1=new JLabel(ii3);//image ke width heigth ko set karne ke liye hota hai
        image1.setBounds(630,350,100,100);
        add(image1);//image add ho gaya


        ImageIcon iii1=new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2=iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3=new ImageIcon(iii2);
        JLabel image2=new JLabel(iii3);
        image2.setBounds(0,0,850,480);
        add(image2);


        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);//jo bhi chiz hame visible karani hai use ham set visiblity ke upar hi rakhege hamesa


    }


    @Override
    public void actionPerformed(ActionEvent e) {//actionListener batayega ActionEvent ko ki kis button pe click hua hai or e ke andar aa ke button ka command store ho jayega
        try{
            if(e.getSource()==button1){

            } else if (e.getSource()==button2) {
                textField2.setText("");
                passwordField3.setText("");

            } else if (e.getSource()==button3) {

            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    static void main() {
        new Login();

    }

}
