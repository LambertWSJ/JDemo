package Geometry;

/**
 * Created by styleine9527 on 2017/12/5.
 */
public class TV {


    public int channel = 1;
    public int volume = 1;
    public boolean on = false;


    public TV(){}

    public void turnOn(){
        on = true;
    }
    public void turnOff(){
        on = false;
    }

    public void setChannel(int newchn){
        if(on && newchn >=1 && newchn <= 120){
            channel = newchn;
        }
    }

    public void setVolume(int vol){
        if(on && vol>=1 && vol<=7){
            volume = vol;
        }
    }

    public void channelUp(){
        if(on && channel<120){
            channel++;
        }
    }

    public void channelDown(){
        if(on && channel>1){
            channel--;
        }
    }

    public void volumeUp(){
        if(on && volume<7){
            volume++;
        }
    }

    public void volumeDown(){
        if(on && volume>1){
            volume--;
        }
    }

}
