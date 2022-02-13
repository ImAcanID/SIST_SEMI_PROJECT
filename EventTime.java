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
		Calendar date = new GregorianCalendar();

		year = date.get(Calendar.YEAR);		// 연도. 올해로 고정
		month = rad.nextInt(12)+1;			// 무작위 월
		day = randomMonthDay(date);			// 무작위 일, 요일 생성
		oClock = rad.nextInt(24);
		minute = rad.nextInt(60);
		eventAge = rad.nextInt(10);
	}

	private int randomMonthDay(Calendar date)	// 무작위 일, 요일 생성
	{
		int mth = month;	// 월 저장
		
		if(mth == 2)		// 2월이면 윤년인지 확인
		{
			if(((GregorianCalendar)date).isLeapYear(year))
				monthDay = rad.nextInt(29)+1;		// 윤년 이면 1~29일 중 무작위 선택
			else
				monthDay = rad.nextInt(28)+1;		// 윤년 아니면 1~28일 중 무작위 선택
		}
		else if(mth == 4 || mth == 6 || mth == 9 || mth == 11)	
		{
			monthDay = rad.nextInt(30)+1;			// 4, 6, 9, 11월이면 1~30일 중 무작위 선택
		}
		else
		{
			monthDay = rad.nextInt(31)+1;			// 나머지 1~31일 중 무작위 선택
		}
		date.set(year, month, monthDay);			// Calendar 객체에 날짜 설정
		return date.get(Calendar.DAY_OF_WEEK)-1;	// 요일 번호 받음
	}
	
	// 이런 식으로 받아서 쓰세요.
	// main.time.getDate()[3] (요일번호 받기)
	public int[] getDate()
	{
		int[] tmp = {year, month, monthDay, day};
		return tmp;
	}
	public int[] getTime()
	{
		int[] tmp = {oClock, minute};
		return tmp;
	}
	public int getEventAge()
	{
		return eventAge;
	}
	
	public void print()		// 테스트용. 시간 출력용.
	{
		System.out.println(year  +" " + month + " " + monthDay + " ");
		
		System.out.println(day+"요일");
		System.out.println(oClock+ "시 " + minute + "분");
		System.out.println("이벤트 해당 나이 끝 자리 : "+eventAge);
	}
}