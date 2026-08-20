
package A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class mapmines {
	public static void main(String[] args) {
		  int[] arr = {4,3,1,1,3,3,2};
	        int k = 3;
	       HashMap<Integer ,Integer>map=new HashMap<>();
	       for(int i=0;i<arr.length;i++) {
	       if(map.containsKey(arr[i])) {
	    	   map.put(arr[i],map.get(arr[i])+1);
	       }else
	    	   map.put(arr[i], 1);
	    	   
	       }
	       
	       ArrayList<Integer> list = new ArrayList<>();

	        for (int value : map.values()) {
	            list.add(value);
	        }
	        Collections.sort(list);
	        int unique = map.size();
	        for(int i=0;i<list.size();i++) {
	        	if (k >= list.get(i)) {
	                k = k - list.get(i);
	                unique--;
	        }
	     
	}
	        System.out.println( unique);

}
}
