import java.util.Calendar;
import java.util.LinkedList;

public class HelloWorld {

	
	public static void main(String[] args) {
		TimeTableSql sql = new TimeTableSql();
		
		Vorlesungsliste liste = sql.SelectVorlesungen();
		
		System.out.println(liste.getWeekdayvorlesungen(Calendar.WEDNESDAY));
	}
}
