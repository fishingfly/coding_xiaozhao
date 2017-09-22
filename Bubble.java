import java.util.*;

public class Bubble{
	public static void bubble(int[] data){
	int len = data.length;
	int end = len - 1;
	while(end > 0) {
	int pos = 0;
        for(int i = 0; i < end; i++){
	if(data[i]>data[i+1]){
	int temp = data[i+1];
        data[i+1] = data[i];
	data[i] = temp;
	}
	pos = i;
	}
	end = pos;        
	}
        print(data);
	}
        public static void print(int[] data){
            for(int i = 0; i<data.length; i++){
	    	System.out.print(data[i]+",");
	    }
        }

	public static void main(String[] args){
		int[] a = {1,2,4,3,5,10,8};
        	bubble(a);
  	}

};
