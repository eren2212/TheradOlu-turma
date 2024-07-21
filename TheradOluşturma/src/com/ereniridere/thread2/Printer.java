
package com.ereniridere.thread2;

//bu şekildede thread oluşturabiliyoruz runnable interface implement edersek
//Ama çalışması değişicek bunların
public class Printer implements Runnable{
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
