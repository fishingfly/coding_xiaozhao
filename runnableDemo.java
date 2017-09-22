import java.util.*;

public class runnableDemo{
    public static void main(String[] args){
	Thread speakElephant;
	Thread speakCar;
	SpeakerElephant elephant;
	SpeakerCar car;
	elephant = new SpeakerElephant();
	car = new SpeakerCar();
	speakElephant = new Thread(elephant);
	speakCar = new Thread(car);
	speakCar.start();
	speakElephant.start();
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

