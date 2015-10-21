import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class TimeTableSql {
	private static String dbURL="jdbc:derby:C:/Users/timog/MyDB;create=true";
	
	private static String tablename = "timetable.vorlesung";
	
	private static Connection conn = null;

	private static Statement stmt = null;

public static void CreateConnection() {
	try {
		Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
		
		conn = DriverManager.getConnection(dbURL);
	}
	
	catch (Exception e) {
		e.printStackTrace();
	}
	
	
}

public Vorlesungsliste SelectVorlesungen(){
	try{
		CreateConnection();
		stmt=conn.createStatement();
		ResultSet results = stmt.executeQuery("SELECT * FROM "+tablename);
		ResultSetMetaData rsmd = results.getMetaData();
		Vorlesungsliste resultlist = new Vorlesungsliste();
		while (results.next()) {
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(results.getDate("tag"));
			cal.set(Calendar.HOUR_OF_DAY, results.getTime("Zeit").getHours());
			cal.set(Calendar.MINUTE, results.getTime("Zeit").getMinutes());
			int dauer = results.getInt("Dauer");
			String fach = results.getString("Fach");
			String raum = results.getString("Raum");
			resultlist.add(new Vorlesung(cal, dauer, fach, raum));
		}
			Shutdown();
			return resultlist;
		
	} catch (Exception e) {
		e.printStackTrace();
}
	return null;
}
private static void Shutdown()
{
    try
    {
        if (stmt != null)
        {
            stmt.close();
        }
        if (conn != null)
        {
            DriverManager.getConnection(dbURL + ";shutdown=true");
            conn.close();
        }           
    }
    catch (SQLException sqlExcept)
    {    
    }
}

}
