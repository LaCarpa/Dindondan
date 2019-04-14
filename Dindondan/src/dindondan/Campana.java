/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

/**
 * La classe Campana è una classe di supporto che serve per definire il suono che la 
 * campana deve emettere e il numero di volte che deve emetterlo.
 * 
 * @author 73734062
 */

public class Campana implements Runnable{
    /**
    * Fase di inizializzazione della classe campana (che 
    * implementa la classe Runnable) definendo i suoi attributi
    */
    String suono;
    int volte;
    /**
     * definizione del costruttore che assegna alle variabili suono e volte
     * il valore che vogliamo noi
     * @param suono il suono che vogliamo la campana emetta
     * @param volte il numero di volte che la campana emette il suono
     */
    public Campana(String suono, int volte){
        this.suono = suono;
        this.volte = volte;
    }
    /**
    * Riscrittura del metodo run implementato dalla classe Runnable
    * facendo si che il nuovo metodo run stampi un intero (da 1 a 5)
    * seguito dal suono della campana   
    */
    @Override
    public void run(){
        for(int k = 0; k < volte; k++){
            System.out.print ((k + 1) + suono + " ");
        }
    }
}
