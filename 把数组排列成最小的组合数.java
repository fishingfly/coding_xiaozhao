import java.util.*;
import java.math.BigInteger;
public class Solution {
   		 public int[] data;
	    public int len;
	    public ArrayList<BigInteger> list = new ArrayList<BigInteger>();
	    public String PrintMinNumber(int [] numbers) {
	        this.data = numbers;
	        this.len = numbers.length;
            if (len == 0) return "";
	        startArrange(0);
	        Collections.sort(list);
	        System.out.println(list.get(0));
	        return String.valueOf(list.get(0));
	    }
	    
	    public void startArrange(int startIndex) {
	        if (startIndex == len-1) {
	            String temp = new String("");
	            for (int i = 0; i < len; i++) {
	                temp += String.valueOf(data[i]);
	            }
	            BigInteger b = new BigInteger(temp);
	            list.add(b);
	            return;
	        }
	        for (int i = startIndex; i < len; i++) {
	            swap(i,startIndex);
	            startArrange(startIndex+1);
	            swap(i,startIndex);
	        }
	        
	    }
	    
	    public void swap(int n1, int n2) {
	        int temp = data[n2];
	        data[n2] = data[n1];
	        data[n1] = temp;
	    }
}