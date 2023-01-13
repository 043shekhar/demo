package test;

import java.security.acl.Group;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Raught {

	public static void main(String[] args) {
	
		Activity obj = new Activity();
		obj.setActivityId(000000000001);
		obj.setLinkId(0000000000011);
		obj.setType("click");
		
		Activity obj1 = new Activity();
		obj1.setActivityId(000000000002);
		obj1.setLinkId(0000000000011);
		obj1.setType("click");
		
		Activity obj4 = new Activity();
		obj4.setActivityId(000000000003);
		obj4.setLinkId(0000000000011);
		obj4.setType("click");
		//obj4.setBot("Y");
		
		
		Activity obj2 = new Activity();
		obj2.setActivityId(000000000003);
		obj2.setLinkId(0000000000012);
		obj2.setType("open");
		
		
		Activity obj3 = new Activity();
		obj3.setActivityId(000000000004);
		obj3.setLinkId(0000000000012);
		obj3.setType("open");
		
		List<Activity> a= new ArrayList<>();
		a.add(obj);
		a.add(obj1);
		a.add(obj2);
		a.add(obj3);
		a.add(obj4);
		
		Bean b= new Bean();
		b.setCamapignId(001);
		b.setProgramId(00001);
		b.setActivityList(a);
		
		/*
		System.out.print(
				a.stream()
				.filter(act -> act.getBot()==null || act.getBot().equalsIgnoreCase("N"))
			   // .filter(act -> act.getType().equalsIgnoreCase("Y"))
				.collect(Collectors.toList())
						);
						*/
		/*
		System.out.print(
		a.stream()
		.filter(act -> act.getBot()==null || act.getBot().equalsIgnoreCase("N"))
		.collect(Collectors.toList())
		.stream()
		.filter(distinctByKey(Activity::getLinkId))
		.collect(Collectors.groupingBy(Activity::getType, Collectors.counting()))
				);
		*/
		
		System.out.print(
			a.stream().collect(Collectors.groupingBy(Activity::getLinkId))
				);
		
	}
	
	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
	    Set<Object> seen = ConcurrentHashMap.newKeySet();
	    return t -> seen.add(keyExtractor.apply(t));
	}

}
