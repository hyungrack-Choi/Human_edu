package human08;
import java.util.Map;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapExam {
	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(new Integer(80), "human1");
		tm.put(new Integer(70), "human2");
		tm.put(new Integer(99), "human3");
		tm.put(new Integer(90), "human4");
		//{70,human2), (80,human1),(90,human4),(99,human3)}
		System.out.println("firstEntry() : " + tm.firstEntry().getKey());
		System.out.println("firstEntry() : " + tm.firstEntry().getValue());
		System.out.println("--------------------------");
		System.out.println("lastEntry() : " + tm.lastEntry().getKey());
		System.out.println("lastEntry() : " + tm.lastEntry().getValue());
		System.out.println("--------------------------");
		System.out.println("lowerEntry() : " + tm.lowerEntry(80).getKey());
		//주어진 값을 포함하지 않는 작은 key의 값
		System.out.println("lowerEntry() : " + tm.lowerEntry(80).getValue());
		System.out.println("--------------------------");
		System.out.println("higherEntry() : " + tm.higherEntry(80).getKey());
		//주어진 값을 포함하지 않는 큰 key의 값
		System.out.println("higherEntry() : " + tm.higherEntry(80).getValue());
		System.out.println("--------------------------");
		System.out.println("floorEntry() : " + tm.floorEntry(77).getKey());
		//주어진 key와 동일 map.entry 만약 없으면 아래 리턴
		System.out.println("floorEntry() : " + tm.floorEntry(77).getValue());
		System.out.println("--------------------------");
		System.out.println("ceilingEntry() : " + tm.ceilingEntry(77).getKey());
		//주어진 key와 동일 map.entry 만약 없으면 위 리턴
		System.out.println("ceilingEntry() : " + tm.ceilingEntry(77).getValue());
		System.out.println("--------------------------");
		Map.Entry<Integer, String> me = null;
		NavigableMap<Integer, String>  descMap = tm.descendingMap();
		//descMap은 key 기준으로 정렬이 됨.
		Set <Map.Entry<Integer, String>> descEntrySet = descMap.entrySet();
		//descEntrySet에는 map의 값을 key 기준으로 내림차순으로 정렬하되. 결과는 set으로 처리함.
		System.out.println("descEntrySet : " + descEntrySet);
		NavigableMap<Integer, String>  ascMap = descMap.descendingMap();
		Set <Map.Entry<Integer, String>> ascEntrySet = ascMap.entrySet();
		System.out.println("ascEntrySet : "+ ascEntrySet);
		NavigableMap<Integer, String>  rangMap = tm.subMap(80,true,90,true);
		System.out.println("rangMap : "+ rangMap);
	}
}