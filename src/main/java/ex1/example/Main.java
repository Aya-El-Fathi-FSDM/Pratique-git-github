package ex1.example;
import java.util.Random;
import java.util.Scanner;

class Joueur{

    public int getNbr () {

        Scanner sc = new Scanner(System.in) ;
        System.out.print("Donner le nombre ");
        return sc.nextInt() ;
    }
}
class Jeu {

    private int devine ;

    public void deviner () {
       devine =  (int) (9 * Math.random()) ;
    }

    public int getDevine () {
        return devine;
    }

    public void start( ) {

        System.out.println("Le jeu commence!");

        deviner();

        Joueur j1 = new Joueur () ;
        Joueur j2 = new Joueur () ;
        Joueur j3 = new Joueur () ;

        boolean resultJ1 = false;
        boolean resultJ2 = false;
        boolean resultJ3 = false;


            if(j1.getNbr() == devine ){
                resultJ1 = true;
            }
            if(j2.getNbr() == devine ){
                resultJ2 = true;
            }
            if(j3.getNbr() == devine ){
                resultJ3 = true;
            }

                if(resultJ1){
                    System.out.println("Le joueur numero 1 a trouver le nombre cibler");
                } else
                    System.out.println("Le joueur numero 1 n'a pas trouve le nbr cible ");
                if(resultJ2){
                    System.out.println("Le joueur numero 2 a trouver le nombre cibler");
                } else
                    System.out.println("Le joueur numero 2 n'a pas trouve le nbr cible ");
                if(resultJ3){
                    System.out.println("Le joueur numero 3 a trouver le nombre cibler");
                }  else
                    System.out.println("Le joueur numero 3 n'a pas trouve le nbr cible ");

        System.out.println("Le nombre cible est "+devine);
    }
}
public class Main {
    public static void main(String[] args) {
        Jeu jeu = new Jeu() ;
        jeu.start() ;
    }
  }