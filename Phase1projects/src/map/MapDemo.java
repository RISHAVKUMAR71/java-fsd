package map;
import java.util.*;
public class MapDemo {
		public static void main(String[] args) {
			// map
			
			//Hashmap is implemented
			HashMap<Integer,String> HashM=new HashMap<Integer,String>();      
			HashM.put(1,"Aa");    
			HashM.put(2,"Bb");    
			HashM.put(3,"Cc");   
		       
		      System.out.println("\n Hashmap elements are ");  
		      for(Map.Entry p:HashM.entrySet()){    
		       System.out.println(p.getKey()+" "+p.getValue());    
		      }
		      
		     //HashTable is implemented
		       
		      Hashtable<Integer,String> HashT=new Hashtable<Integer,String>();  
		      
		      HashT.put(4,"Dd");  
		      HashT.put(5,"Ee");  
		      HashT.put(6,"Ff");  
		      HashT.put(7,"Gg");  

		      System.out.println("\nHashTable elements are ");  
		      for(Map.Entry q:HashT.entrySet()){    
		       System.out.println(q.getKey()+" "+q.getValue());    
		      }
		      
		      
		      //TreeMap is implemented
		      
		      TreeMap<Integer,String> TreeMap=new TreeMap<Integer,String>();    
		      TreeMap.put(8,"Hh");    
		      TreeMap.put(9,"Ii");    
		      TreeMap.put(10,"Jj");       
		      
		      System.out.println("\nTreeMap elements are ");  
		      for(Map.Entry r:TreeMap.entrySet()){    
		       System.out.println(r.getKey()+" "+r.getValue());    
		      }    
		      
		   }  
}
