/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tourniquet;

import java.util.Scanner;

/**
 *
 * @author EL
 */
public class Tourniquet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int A;
        int B;
        int C;
        int D;
        
        Scanner clavier = new Scanner(System.in);
        System.out.println("DEBUT DES PROCESSUS");
        System.out.println("===================");
        System.out.println("FONCTIONNEMENT CIRCULAIRE: TOURNIQUET");
        System.out.println("Entrez la valeur du processus A: ");
        A = Integer.parseInt(clavier.nextLine());
        System.out.println("Entrez la valeur du processus B: ");
        B = Integer.parseInt(clavier.nextLine());
        System.out.println("Entrez la valeur du processus C: ");
        C = Integer.parseInt(clavier.nextLine());
        System.out.println("Entrez la valeur du processus D: ");
        D = Integer.parseInt(clavier.nextLine());
        System.out.println("Entrez la valeur du Quantum: ");
        int Quantium = Integer.parseInt(clavier.nextLine());
        /*int[] tab = new int[Quantium];*/
        
        for(int i=A; i<=A; i++)
        {
            for(int j=Quantium; j<=A; j++)
            {
                int rep=(i-j);
                if(rep%20==0){
            {System.out.println("Il reste "+(rep)+"ms pour le processus A");}
                }
            /*{System.out.println("Il reste "+(B-Quantium)+"ms pour le processus B");}
            {System.out.println("Il reste "+(C-Quantium)+"ms pour le processus C");}
            {System.out.println("Il reste "+(D-Quantium)+"ms pour le processus D");}*/
            }
        }
        
        for(int i=B; i<=B; i++)
        {
            for(int j=Quantium; j<=B; j++)
            {
                int rep=(i-j);
                if(rep%30==0){
            {System.out.println("Il reste "+(rep)+"ms pour le processus B");}
                }
            }
        }
        /*if(Quantium <= A || Quantium <= B || Quantium <= C || Quantium <= D)
        {
            int resteA = A-Quantium;
            int resteB = B-Quantium;
            int resteC = C-Quantium;
            int resteD = D-Quantium;
            
            System.out.println("PREMIER TOUR");
            System.out.println("============");
            
            if(Quantium < resteA || Quantium < resteB || Quantium < resteC || Quantium < resteD){
            System.out.println("Processus A:"+(A-Quantium)+" temps restant");
            System.out.println("Processus B:"+(B-Quantium)+" temps restant");
            System.out.println("Processus C:"+(C-Quantium)+" temps restant");
            System.out.println("Processus D:"+(D-Quantium)+" temps restant");
            }
        }
        
            int resteA = A-Quantium;
            int resteB = B-Quantium;
            int resteC = C-Quantium;
            int resteD = D-Quantium;
        
        System.out.println("DEUXIEME TOUR");
        System.out.println("=============");
                if(resteA>Quantium){System.out.println("Processus A:"+(resteA-Quantium)+" temps restant");}
                    else
                        System.out.println("Processus A:"+(resteA-resteA)+" temps restant");
                if(resteB>Quantium){System.out.println("Processus B:"+(resteB-Quantium)+" temps restant");}
                    else
                        System.out.println("Processus B:"+(resteB-resteB)+" temps restant");
                if(resteC>Quantium){System.out.println("Processus C:"+(resteC-Quantium)+" temps restant");}
                    else
                        System.out.println("Processus C:"+(resteC-resteC)+" temps restant");
                if(resteD>Quantium){System.out.println("Processus D:"+(resteD-Quantium)+" temps restant");}
                    else
                        System.out.println("Processus D:"+(resteD-resteD)+" temps restant");
        System.out.println("TROISIEME TOUR");
        System.out.println("=============");
        int reste = resteD-Quantium;
                if(resteA>Quantium){System.out.println("Processus A:"+(resteA-Quantium)+" temps restant");}
                    else
                        System.out.println("Processus A:"+(resteA-resteA)+" temps restant");
                if(resteB>Quantium){System.out.println("Processus B:"+(resteB-Quantium)+" temps restant");}
                    else
                        System.out.println("Processus B:"+(resteB-resteB)+" temps restant");
                if(resteC>Quantium){System.out.println("Processus C:"+(resteC-Quantium)+" temps restant");}
                    else
                        System.out.println("Processus C:"+(resteC-resteC)+" temps restant");
                if(reste>Quantium){System.out.println("Processus D:"+(resteD-Quantium)+" temps restant");}
                    else
                        System.out.println("Processus D:"+(resteD-resteD)+" temps restant");
                
            System.out.println("FIN DES PROCESSUS");*/
    }
    
}
