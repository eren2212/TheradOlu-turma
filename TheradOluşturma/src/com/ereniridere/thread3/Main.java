
package com.ereniridere.thread3;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    //burada da anonim class olarak thread oluşturduk.
    public static void main(String[] args) {
        
        Thread printer1 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Therad ÇAlışıyor");
                for(int i=0; i<=10 ; i++){
                    System.out.println("Yazıyor : "+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        });
        
        printer1.start();
    }
}
