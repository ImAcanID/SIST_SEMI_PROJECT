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

		year = date.get(Calendar.YEAR);		// ����. ���ط� ����
		month = rad.nextInt(12)+1;			// ������ ��
		day = randomMonthDay(date);			// ������ ��, ���� ����
		oClock = rad.nextInt(24);
		minute = rad.nextInt(60);
		eventAge = rad.nextInt(10);
	}

	private int randomMonthDay(Calendar date)	// ������ ��, ���� ����
	{
		int mth = month;	// �� ����
		
		if(mth == 2)		// 2���̸� �������� Ȯ��
		{
			if(((GregorianCalendar)date).isLeapYear(year))
				monthDay = rad.nextInt(29)+1;		// ���� �̸� 1~29�� �� ������ ����
			else
				monthDay = rad.nextInt(28)+1;		// ���� �ƴϸ� 1~28�� �� ������ ����
		}
		else if(mth == 4 || mth == 6 || mth == 9 || mth == 11)	
		{
			monthDay = rad.nextInt(30)+1;			// 4, 6, 9, 11���̸� 1~30�� �� ������ ����
		}
		else
		{
			monthDay = rad.nextInt(31)+1;			// ������ 1~31�� �� ������ ����
		}
		date.set(year, month, monthDay);			// Calendar ��ü�� ��¥ ����
		return date.get(Calendar.DAY_OF_WEEK)-1;	// ���� ��ȣ ����
	}
	
	// �̷� ������ �޾Ƽ� ������.
	// main.time.getDate()[3] (���Ϲ�ȣ �ޱ�)
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
	
	public void print()		// �׽�Ʈ��. �ð� ��¿�.
	{
		System.out.println(year  +" " + month + " " + monthDay + " ");
		
		System.out.println(day+"����");
		System.out.println(oClock+ "�� " + minute + "��");
		System.out.println("�̺�Ʈ �ش� ���� �� �ڸ� : "+eventAge);
	}
}