import java.util.*;

public class threadDemo{
    public static void main(String[] args){
	SpeakerElephant speakerElephant;
	SpeakerCar speakerCar;
	speakerElephant = new SpeakerElephant();
        speakerCar = new SpeakerCar();
        speakerElephant.start();
	speakerCar.start();
	for(int i = 0; i <= 15; i++) {
		System.out.println("主人"+i+" ");	
	}
    }
}

class SpeakerCar extends Thread {
    public void run() {
	for(int i = 0; i <= 20; i++){
	   System.out.println("轿车"+i+" ");
	}
    }
}

class SpeakerElephant extends Thread {
   public void run(){
       for(int i = 0; i <= 20; i++){
          System.out.println("大象"+i+" ");
       }
   }
}
