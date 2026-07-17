package bank.management.system;

import javax.swing.*;
import java.awt.*;

public class Login extends JFrame {
    JLabel label1,label2,label3;

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


        label3=new JLabel("PIN");
        label3.setFont(new Font("rohit",Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);


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




    static void main() {
        new Login();

    }

}
