import java.util.LinkedList;

public class Vorlesungsliste extends LinkedList<Vorlesung>{
	
	
	public Vorlesungsliste getWeekdayvorlesungen(int d) {
		Vorlesungsliste resultlist = new Vorlesungsliste();
		for (Vorlesung vorlesung : this) {
			if (vorlesung.getWeekday()==d) {
				resultlist.add(vorlesung);
			}
		}
		return resultlist;
	}
}