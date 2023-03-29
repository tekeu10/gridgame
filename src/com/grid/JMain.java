package com.grid;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JMain extends JFrame implements ActionListener{

    JPanel pan =new JPanel();

    JButton b1=new JButton();
    JButton b2=new JButton();
    JButton b3=new JButton();
    JButton b4=new JButton();
    JButton b5=new JButton();
    JButton b6=new JButton();

    ImageIcon i =new ImageIcon("image.jpg");

    public JMain() {

        this.setVisible(true);
        this.setTitle("test image");
        this.setSize(600,600);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //b1.setIcon(i);


        pan.add(b1);
        pan.add(b2);
        pan.add(b3);
        pan.add(b4);
        pan.add(b5);
        pan.add(b6);

        pan.setLayout(new GridLayout(3,2));

        this.add(pan);


        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
    }



    public static void main(String[] agrs) {

        JMain j =new JMain();

    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==b1) {
            b1.setIcon(i); b2.setIcon(null); b3.setIcon(null); b4.setIcon(null); b5.setIcon(null); b6.setIcon(null);

        }

        if(e.getSource()==b2) {
            b1.setIcon(null); b2.setIcon(i); b3.setIcon(null); b4.setIcon(null); b5.setIcon(null); b6.setIcon(null);
        }

        if(e.getSource()==b3) {
            b1.setIcon(null); b2.setIcon(null); b3.setIcon(i); b4.setIcon(null); b5.setIcon(null); b6.setIcon(null);
        }

        if(e.getSource()==b4) {
            b1.setIcon(null); b2.setIcon(null); b3.setIcon(null); b4.setIcon(i); b5.setIcon(null); b6.setIcon(null);
        }

        if(e.getSource()==b5) {
            b1.setIcon(null); b2.setIcon(null); b3.setIcon(null); b4.setIcon(null); b5.setIcon(i); b6.setIcon(null);
        }

        if(e.getSource()==b6) {
            b1.setIcon(null); b2.setIcon(null); b3.setIcon(null); b4.setIcon(null); b5.setIcon(null); b6.setIcon(i);
        }

        // TODO Auto-generated method stub

    }

}
