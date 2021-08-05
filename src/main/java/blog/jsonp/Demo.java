package blog.jsonp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerator;

public class Demo {
	
	public static void main(String[] args) {
		
	Map<String, Map<String,Object>> mp=new HashMap<>();
	//mp.put("Math",null);
	//mp.put("Core java", null);
	List<String> ll1 = new ArrayList<String>();
	ll1.add("Rahul");
	 List<String> ll = new ArrayList<String>();
	 ll.add("math");
	 ll.add("English");
	Map<String,Object> map = new HashMap<String,Object>();
	map.put("name","Rahul");
	map.put("age", "22");
//	map.put("group","Rcp");
//	map.put("scl", "RGPV");
	Map<String,Object> mp1 = new HashMap<String,Object>();
	mp1.put("SChool", ll1);
	mp1.put("Unive","RGPV");
	 
	
	
	
	//map.putAll((Map<? extends String, ? extends Map<String, Object>>) mp);
	map.put("Subject",ll);
	map.put("Group", mp1);
	System.out.println(map);
	}
	

}
