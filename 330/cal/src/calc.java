
import javax.swing.*;
import java.io.*;
import java.util.*;

public class calc {

    /**
     * @param args
     */
   
    public static void main(String[] args) {
        // TODO Auto-generated method stub
       
        JFrame jf=new JFrame();
        JTextField jt=new JTextField("Result");
        jt.setBounds(50,80,260,40);
        jf.add(jt);
       
        int width=45, height=45;
       
        JButton jb7=new JButton("7");
        jb7.setBounds(50, 150, width, height);
        jf.add(jb7);
       
        JButton jb8=new JButton("8");
        jb8.setBounds(120, 150, width, height);
        jf.add(jb8);
       
        JButton jb9=new JButton("9");
        jb9.setBounds(190, 150, width, height);
        jf.add(jb9);
       
        JButton jb6=new JButton("6");
        jb6.setBounds(50, 210, width, height);
        jf.add(jb6);
       
        JButton jb5=new JButton("5");
        jb5.setBounds(120, 210, width, height);
        jf.add(jb5);
       
        JButton jb4=new JButton("4");
        jb4.setBounds(190, 210, width, height);
        jf.add(jb4);
       
        JButton jb3=new JButton("3");
        jb3.setBounds(50, 270, width, height);
        jf.add(jb3);
       
        JButton jb2=new JButton("2");
        jb2.setBounds(120, 270, width, height);
        jf.add(jb2);
       
        JButton jb1=new JButton("1");
        jb1.setBounds(190, 270, width, height);
        jf.add(jb1);
       
        JButton jb=new JButton(".");
        jb.setBounds(50, 330, width, height);
        jf.add(jb);
       
        JButton jb0=new JButton("0");
        jb0.setBounds(120, 330, width, height);
        jf.add(jb0);
       
        JButton jbans=new JButton("=");
        jbans.setBounds(190, 330, width, height);
        jf.add(jbans);
       
        JButton jbadd=new JButton("+");
        jbadd.setBounds(260, 150, width, height);
        jf.add(jbadd);
       
        JButton jbsub=new JButton("-");
        jbsub.setBounds(260, 210, width, height);
        jf.add(jbsub);
       
        JButton jbdiv=new JButton("/");
        jbdiv.setBounds(260, 270, width, height);
        jf.add(jbdiv);
       
        JButton jbmul=new JButton("*");
        jbmul.setBounds(260, 330, width, height);
        jf.add(jbmul);
       
        jf.setLayout(null);
        jf.setSize(400,450);
        jf.setVisible(true);

    }

}
