package com;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;


/**
 * TODO: Description of the class.
 *
 * @author tekeu
 *
 * @since TODO: version number
 *
 */
public class TabButton extends JFrame {

    public JPanel panel = new JPanel();

    public TabButton() {
        creerButton();
        this.setSize(300, 200);
        this.getContentPane().add(panel);
        this.setVisible(true);
    }

    /**
     *
     */
    public void creerButton() {
        int nT = 4;

        JButton appelT[] = new JButton[nT];

        for (int i = 0; i < nT; i++) {

            appelT[i] = new JButton();
            appelT[i].setText("Transformation" + i);
            appelT[i].setName(""+ i);
            panel.add(appelT[i]);
        }

    }


//      et ensuite tu n'a plus qu'a récupéré ton 'i'
//    public void actionPerformed (ActionEvent ev) {
//        Object o = ev.getSource();
//        if (o instanceof JButton) {
//            JButton button = (JButton) o;
//            int i = Integer.parseInt(button.getName());
//            TransfoDP[i].setVisible(true);
//        }
//    }

    public static void main(String[] args) {
        //TabButton tab = new TabButton();
        //tab.show();
        JFrame t = new JFrame();
        t.setVisible(true);

//        public void actionPerformed (ActionEvent ev) {
//         
//            if (ev.getSource() == (JButton)appelT[i]) {
//                TransfoDP[i].setVisible(true);
//            } }
    }
}
