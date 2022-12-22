package human18;

import java.util.TimeZone;

public class TimeZoneExam {

	public static void main(String[] args) {

		String[] availableIds = TimeZone.getAvailableIDs();
		
		for (String a : availableIds) {
			System.out.println(a);
		}
	}

}
