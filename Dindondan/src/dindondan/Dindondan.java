/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dindondan;

/**
 * La classe Dindondan serve per creare e gestire i thread che
 * stamperanno il suono delle campane con un numero (da 1 a 5)
 * prima del loro suono
 * 
 * @author 73734062
 */
public class Dindondan {

    /**
     * Inizializza, crea e gestisce i thread che successivamente stamperanno
     * il suono delle campane.
     * In questo caso i thread sono sincronizzati, difatti il
     * thread non parte finchè il suo precedente non ha finito,
     * ad eccezione del primo che partirà all'avvio del programma
     */
    public static void main(String[] args) throws InterruptedException {
        /**
         * Ci sono 3 diversi modi di scrivere lo stesso programma,
         * difatti il codice è suddiviso in 3 parti che fanno esattamente
         * la stessa cosa e si diversificano soltanto dal suono che la campana emette
         */
        
        /** Prima modalità di definizione*/
        Runnable cam1 = new Campana("din" ,5);
        Thread thr1 = new Thread(cam1);
        thr1.start();
        Thread.sleep(1000);
        /** Seconda modalità di definizione*/
        Thread thr2 = new Thread(new Campana("don" , 5));
        thr2.start();
        Thread.sleep(1000);
        /** Terza modalità di definizione*/
        new Thread(new Campana("dan" , 5)).start();
    }
}
