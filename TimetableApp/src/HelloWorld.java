import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class HelloWorld {
	public static void main(String[] args) {	
		Calendar kalender = new Calendar() {
			
			@Override
			public void roll(int field, boolean up) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public int getMinimum(int field) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getMaximum(int field) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getLeastMaximum(int field) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			public int getGreatestMinimum(int field) {
				// TODO Auto-generated method stub
				return 0;
			}
			
			@Override
			protected void computeTime() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			protected void computeFields() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void add(int field, int amount) {
				// TODO Auto-generated method stub
				
			}
		};

		kalender.setTime(new Date(2015, 10, 21, 23, 30, 00));
		System.out.println(kalender.get(Calendar.DAY_OF_WEEK));
	}
}
