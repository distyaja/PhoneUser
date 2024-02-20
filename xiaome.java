
package com.mycompany.phone;

public class xiaome implements Phone{
          
    private int volume;
    private boolean isPowerOn;

    public xiaome() {
        // set volume awal
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Handphone menyala...");
        System.out.println("Selamat datang di XIAOMI");
        System.out.println("Android version 29");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }
    
    @Override
    public void volumeUp(){
        if (isPowerOn){
           if (this.volume == MAX_VOLUME){
               System.out.println("Volume FULL!");
               System.out.println("Sudah "+ this.getVolume()+ "%");
        }else{
        this.volume += 10;
               System.out.println("Volume sekarang: "+ this.getVolume());
           }
        }else{
            System.out.println("Nyalakan dulu lah hpnya!!");
        }
    }  
        
    @Override
    public void volumeDown(){
        if (isPowerOn){
            if (this.volume == MIN_VOLUME){
                System.out.println("Volume = 0%");
            }else{
                this.volume -= 10;
                System.out.println("Volume sekarang: "+ this.getVolume());
            }
        }
        else{
            System.out.println("Nyalakan dulu hpnya!!");
            }
    }

    public int getVolume(){
        return this.volume;
    }
}
