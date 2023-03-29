package com.client;

import com.grid.JMain;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.*;

public class Client extends JFrame implements ActionListener {
    JButton connexion = new JButton("connexion");
    JPanel Pane = new JPanel();
    Label l1 = new Label("connexion au serveur");
    Label l2 = new Label("entrez le port du destinataire");
    Label l3 = new Label("entrez le nom de la machine serveur");
    JTextField txtlogin = new JTextField();
    JTextField txtpassword = new JTextField();


    public Client(){
        this.setVisible(true);
        this.setTitle("connexion au serveur");
        this.setSize(400,400);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1.setFont(new Font("Serif", Font.BOLD, 30));
        l2.setFont(new Font("Serif", Font.BOLD, 20));
        l3.setFont(new Font("Serif", Font.BOLD, 20));
        Dimension d = new Dimension(250, 25);
        txtlogin.setPreferredSize(d);
        txtpassword.setPreferredSize(d);


        Pane.add(l1);
        Pane.add(l2);
        Pane.add(txtlogin);
        Pane.add(l3);
        Pane.add(txtpassword);
        Pane.add(connexion);


        this.add(Pane);

        connexion.addActionListener(this);
    }
    public static void main(String[] agrs) {

        Client j =new Client();

    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==connexion){
            final Socket clientSocket;
            final BufferedReader in;
            final PrintWriter out;
            final Scanner sc = new Scanner(System.in);//pour lire à partir du clavier

            try {
                clientSocket = new Socket(127.0.0.1,txtlogin);
            }


            JMain j =new JMain();
        }
    }
}
