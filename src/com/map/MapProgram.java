package com.map;

import java.util.HashMap;
import java.util.Map;

class Key{
	String key;
	Key(String i){
		key=i;
	}
	
}
public class MapProgram {

	public static void main(String... arr){
		
		String s = "abc";
		Key k=new Key(s);
		Key k2=new Key(s);
		Map<Key,Integer> m= new HashMap<Key,Integer>();
		m.put(k,1);
		System.out.println(k+" "+k2);
		System.out.println(m.get(k2));
	}
}
