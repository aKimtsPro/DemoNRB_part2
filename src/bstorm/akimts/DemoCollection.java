package bstorm.akimts;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoCollection {
	
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		
		list.add("element 1");
		list.add("element 1");
		
		list.get(0);
		
		list.remove(0);
		list.remove("element 1");
		list.clear();
		
		list.set(0, "element 3");
		
		if(list.contains("element 3")) {
			System.out.println("element 3 trouvé");
		}
		else {
			System.out.println("element 3 absent");
		}
		
		int index = list.indexOf("element 4");
		
		
		ArrayList<Integer> listInt = new ArrayList<>();
		listInt.add(1);
		listInt.add(2);
		listInt.add(3);
		listInt.add(4);
		listInt.add(5);
		

		List<Integer> listRemove = new ArrayList<>();
		listRemove.add(2);
		listRemove.add(3);
		listRemove.add(4);
		
		listInt.removeAll(listRemove);
		
		Map<String, String> map = new HashMap<>();
		
		map.put("ma clef", "2020-10-10");
		map.put("ma clef", "2020-10-12");
		
		map.get("ma clef");
		
		map.remove("ma clef");
		
		boolean keyContained = map.containsKey("ma clef");
		boolean valueContained = map.containsValue("2020-10-10");
		
	}

}
