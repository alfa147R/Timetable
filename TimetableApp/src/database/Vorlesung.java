package database;
import java.util.Calendar;
import java.util.GregorianCalendar;



public class Vorlesung {
	private int id, duration;
	private String fach;
	private String raum;
	private GregorianCalendar cal;	
		
	public Vorlesung(GregorianCalendar cal, int duration, String fach, String raum, int id){
		this.cal = cal;
		this.duration=duration;
		this.fach=fach;
		this.raum=raum;
		this.id=id;
	}
	
	public Vorlesung(int year, int month, int day, int hour, int minute, int duration, String fach, String raum){
		cal = new GregorianCalendar(year, month-1, day, hour, minute);
		this.duration=duration;
		this.fach=fach;
		this.raum=raum;
	}
	
	public int getWeekday() {
		return cal.get(Calendar.DAY_OF_WEEK);
	}
	public String getStartTime() {
		return cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE);
	}
	
	public String toString() {
		return id+": "+fach+"\nDatum: "+cal.getTime()+"\nWochentag: "+getWeekday()+"\n"+"Start: "+getStartTime();
		
	}
}
