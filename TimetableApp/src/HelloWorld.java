import java.util.Calendar;

import database.TimeTableSql;
import database.Vorlesungsliste;

public class HelloWorld {

	
	public static void main(String[] args) {
		Vorlesungsliste liste = new Vorlesungsliste();
		liste = new TimeTableSql().SelectVorlesungen();
		System.out.println(liste.getWeekdayvorlesungen(Calendar.FRIDAY));
	}
}
