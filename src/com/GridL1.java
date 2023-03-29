package com;

import com.sun.xml.internal.bind.v2.runtime.Name;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.FieldAccessor_Double;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class GridL1 implements ActionListener {

    public static void main(String[] args) {
	    /* Layout Manager = Defines the natural layout for components
         within a container
        // GridLayout = places components in a grid of cells.
                frame.setLayout(new GridLayout(3, 2));
            Chaque composant prend tout l'espace de la cellule
         */

        JFrame frame = new JFrame();
        frame.setTitle("Grille de jeu personnalisée");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 600);
        ImageIcon image =new ImageIcon("C:\\Users\\tekeu\\Documents\\java\\GridGame\\src\\image.jpg");
        //frame.setBackground(Color.ORANGE);
        frame.setLayout(new GridLayout(2, 1));

        JButton btnShow = new JButton("Afficher");
        JLabel labRow = new JLabel("Nb de lignes");
        JLabel labCol = new JLabel("Nb de colonnes");
        JTextField txtRow = new JTextField();
        JTextField txtCol = new JTextField();

        //JButton button1 = new JButton("1");
        JPanel pan = new JPanel();
        pan.setSize(100, 50);
        pan.setBackground(Color.PINK);
        frame.add(pan);
        pan.setLayout(new GridLayout(3, 2, 3, 3));
        pan.add(labRow);
        pan.add(txtRow);
        pan.add(labCol);
        pan.add(txtCol);
        pan.add(new Label(""));
        JSeparator separator = new JSeparator();
        Panel panS = new Panel();
        panS.add(separator);
        panS.setSize(100, 50);
        panS.add(btnShow);
        pan.add(panS);
        Panel pan2 = new Panel();
        pan2.setSize(300, 700);

        //frame.add(separator);
        frame.add(pan2);
        pan2.add(new JButton("1"));
        pan2.add(new JButton("2"));
        pan2.add(new JButton("3"));
        pan2.add(new JButton("4"));
        pan2.add(new JButton("5"));
        pan2.add(new JButton("6"));

        frame.setVisible(true);
        btnShow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String a = txtRow.getText();
                String b = txtCol.getText();
                int lig = Integer.parseInt(a);
                int col = Integer.parseInt(b);
                System.out.println(col + lig);
                //frame.dispose(); //pourquoi la fenetre disparait ?
                pan2.removeAll();
                pan2.hide();
                pan2.setLayout(new GridLayout(lig, col, 4,3));
                for (int i=0; i<lig; i++) {
                    for (int j = 0; j <col; j++) {
                        JButton appelT[][] = new JButton[lig][col];
                        appelT[i][j] = new JButton();
                        appelT[i][j].setName(""+ i+""+j);
                        pan2.add(appelT[i][j]);
                        int finalI = i;
                        int finalJ = j;
                        //int nullA=i, nullB=j;
                        //appelT[finalI][finalJ].setIcon(null);

                        appelT[i][j].addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                //int btnName = Integer.parseInt(appelT[finalI][finalJ].getName());
                                int nullA=finalI;
                                int nullB=finalJ;
                                appelT[finalI][finalJ].setIcon(null);
                                //btnName.setIcon(image);
                                if(e.getSource()==appelT[finalI][finalJ]) {
                                    appelT[finalI][finalJ].setIcon(image);

                                }
                                //appelT[finalI][finalJ].setIcon(image);
                            }
                        });
                        //pan2.add(new JButton("test"));
                    }
                    System.out.println("|" + i);
                }
                pan2.revalidate();
                pan2.setVisible(true);
            }
        });

    }
}
