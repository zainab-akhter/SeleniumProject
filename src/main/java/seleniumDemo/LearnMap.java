//Name:Zainab Akhter
//class:practice MAP

package seleniumDemo;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class LearnMap {

	public static void main(String[] args) {
		//Map<String,Integer> mp = new HashMap<String,Integer>();
		Map<String,Integer> mp = new TreeMap<String,Integer>();
		//Map<String,Integer> mp = new LinkedHashMap<String,Integer>();
		
		mp.put("Shohel", 122);
		mp.put("Selim", 233);
		mp.put("Shahin", 344);
		mp.put("Shanta", 455);
		mp.put("Nira", 566);
		mp.put("Abc",677);
		mp.put("Nira", 877);
		mp.put("Shohel", 123);
		mp.put("Minu",788);
		mp.put("Shima", 432);
		mp.put("Alam", 987);
		
		//System.out.println("*******************Random Order Maintain In HashMap*******************");
		System.out.println("*******************Ascending Order Maintain In TreeMap*******************");
		//System.out.println("****************** Inserting Order Maintain in LinkedHashMap********************");
		
		for	(Entry <String, Integer> eachMp:mp.entrySet()) {
			System.out.println(eachMp.getKey() +"   "+ eachMp.getValue());
		}
			
			System.out.println("**************************************");
			System.out.println(mp.size());
			System.out.println("**************************************");
			//get count of Map entry size()
			System.out.println(mp.size());
			System.out.println(mp.get("Minu"));
			//remove () key
		
			System.out.println(mp.remove("Selim"));
			System.out.println("*********");
			System.out.println(mp.size());
			//mp.containsKey("Selim");
			System.out.println(mp.containsKey("Selim"));
			//mp.containsValue(877);
			System.out.println(mp.containsValue(877));
		
			System.out.println("*******");
			System.out.println(mp.size());
			System.out.println(mp.isEmpty());
			System.out.println("*****");
			
			
			
		
		}
		}

		
		
	


