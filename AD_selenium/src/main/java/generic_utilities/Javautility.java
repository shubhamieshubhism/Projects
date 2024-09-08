package generic_utilities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Javautility {
	/**
	 * This method will genrate ramdom number 
	 * @return
	 */
	public int getRandomNumber() {
		Random ran = new Random();
		int r= ran.nextInt(10000);
		return r;
	}
	
	/**
	 * This method will capture the system date
	 * @return
	 */
	public String getSystemDate() {
		Date d = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat();
		String date= formatter.format(d);
		return date;
	}

}
