package com;

public class Grille {
    //Attributs
    int nbLig;
    int nbCol;
    char [][] grille;

    //Constructeur
    public Grille(int lig, int col){
        nbLig = lig;
        nbCol = col;
        grille = new char[nbLig][nbCol];

        for (int i=0; i<nbLig; i++){
            for(int j=0; j<nbCol; j++){

                grille[i][j] ='y';
            }
        }
    }

    //Accesseurs


    //Methodes

    public void afficher(){
        System.out.println();
        for (int i=0; i<nbLig; i++){
            for(int j=0; j<nbCol; j++){

                //grille[i][j] ='y';
                System.out.print("|" + grille[i][j]);
            }
            System.out.println("| ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Grille g1 = new Grille(5,7);
        g1.afficher();
        System.out.println("--------------------------------------------------------------------------");
        Grille g2 = new Grille(2,4);
        g2.afficher();
    }
}
