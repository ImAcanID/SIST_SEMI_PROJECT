import java.util.Random;
import java.util.Calendar;
import java.util.GregorianCalendar;


class EventTime
{
	private int year, month, monthDay;
	private int day;
	private int oClock;
	private int minute;
	private int eventAge;
	Random rad;

	EventTime()
	{
		rad = new Random();
		while(year<2010)
		{
			year = rad.nextInt(2031);	
		}
		month = rad.nextInt(12)+1;
		day = randomMonthDay();
		oClock = rad.nextInt(24);
		minute = rad.nextInt(60);
		eventAge = rad.nextInt(10);
	}

	private int randomMonthDay()
	{
		int mth = month;
		Calendar date = new GregorianCalendar();
		if(mth == 2)
		{
			if(((GregorianCalendar)date).isLeapYear(year))
				monthDay = rad.nextInt(29)+1;
		}
		else if(mth == 4 || mth == 6 || mth == 9 || mth == 11)
		{
			monthDay = rad.nextInt(30)+1;
		}
		else
		{
			monthDay = rad.nextInt(31)+1;
		}
		date.set(year, month, monthDay);
		return date.get(Calendar.DAY_OF_WEEK)-1;
	}
	
	public int[] getDate()
	{
		return {year, month, monthDay, day};
	}
	public int[] getTime()
	{
		return {oClock, minute};
	}
	public int getEventAge()
	{
		return eventAge;
	}

	public void print()
	{
		System.out.println(year  +" " + month + " " + monthDay + " ");
		
		System.out.println(day+"요일");
		System.out.println(oClock+ "시 " + minute + "분");
		System.out.println("끝짜리 : "+eventAge);
	}
}