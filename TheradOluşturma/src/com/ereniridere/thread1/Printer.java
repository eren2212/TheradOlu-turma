
package com.ereniridere.thread1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Printer extends Thread{
    //printerdan obje oluşturtuğumuzda run metodu direkt çalışıyor
    //bu metodu ovveride ettik Thread sınıfından.
    
    private String isim;

    @Override
    public void run() {
        for(int i =0; i<=10; i++){
            System.out.println(isim +" yazıyor :"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("Thread çalıştırılamadı");
            }
        }
    }
    
    public Printer(String isim){
        this.isim= isim;
    }
}
