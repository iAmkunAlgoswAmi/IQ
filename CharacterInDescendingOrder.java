import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Comparator;

class CharacterInDescendingOrder{
	public static void main(String... A){
		String str = "abaacdc";
		Map<Character, Integer> characterMap = new HashMap<Character, Integer>();
		for(int i = 0; i<str.length(); i++){
			char ch = str.charAt(i);
			Integer value = characterMap.get(ch);
			if (value!=null){
				characterMap.put(ch,new Integer(value+1));
			}
			else{
				characterMap.put(ch,1);
			}
		}
			
			Set<Map.Entry<Character, Integer>> characterSet = characterMap.entrySet();
			List<Map.Entry<Character, Integer>> listSet = new ArrayList<Map.Entry<Character, Integer>>(characterSet);
			Collections.sort(listSet, new Comparator<Map.Entry<Character, Integer>>(){
				@Override
				public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2){
					return o2.getValue().compareTo(o1.getValue());
				}
			});
		for(Map.Entry<Character, Integer> list : listSet){
			System.out.println(list.getKey() + "  " + list.getValue());
		}
	}
}
