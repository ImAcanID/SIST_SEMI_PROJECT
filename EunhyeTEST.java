

class EunhyeTEST
{
	public static void main(String[] args)
	{
		/*
		ArrayList<SideMenu> alist = new ArrayList<SideMenu>();
		int n = 0; //-- 1이면 SideMenu생성자 실행.
		while (n<3)
		{	
			n++;
			SideMenu sd = new SideMenu();
			alist.add(sd); //① 생성하고 추가하기를 반복하면 기존의 요소가 두번째 요소로 바뀌나?
			System.out.println("반복문 안에 ArrayList 확인 : " +alist);
		}
		System.out.println("반복문 밖에서 ArrayList 확인 : " +alist);
		*/
		
		/*
		SideMenu sd = new SideMenu();
		//--==>>사이드메뉴 생성자 실행 ... !
		ArrayList<SideMenu> alist = new ArrayList<SideMenu>();
		alist.add(sd);
		System.out.println("ArrayList 더미 데이터 출력 : " + alist.get(0).smPrice);
		*/
		/*
		사이드메뉴 - 생성자 - select() 실행 완료.
		ArrayList 더미 데이터 출력 : 5500
		계속하려면 아무 키나 누르십시오 . . .
		*/
		//-->> 객체안에 변수 (사이드메뉴 종류 ~ 가격 ~ 개수 등등 이런거 가져오는 법은 알았어.)
		//	   문제는 객체가 계속 덮어쓰여진다는 것!


		DefaultMenu2 dm = new DefaultMenu2();
		dm.dmSelect();

	}
}