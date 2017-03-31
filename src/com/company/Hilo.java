package com.company;

/**
 * Created by carlosjoseanguiano on 30/03/17.
 */
public class Hilo implements Runnable {
    Thread thread;
    String nombre;

    public Hilo() {
        thread = new Thread(this, "Hilo1");
        thread.start();
    }

    public Hilo(String nombre) {
        this.nombre = nombre;
        thread = new Thread(this, "Hilo1");
        thread.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 200; i++) {
                System.out.println(nombre + " Valor: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }


}
