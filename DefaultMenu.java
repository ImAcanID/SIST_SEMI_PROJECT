// 문정 수정 중
class DefaultMenu
{
	int dmCategory;       //defaultMenuCategory 
	int dmOption;         //defaultMenuOption   

	dmSelect()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		// 디폴트 메뉴 선택
		
		while (true)
		{
			System.out.print("메뉴를 선택해 주세요(에그마요, bmt, 서브웨이클럽) : ");
			String strtmp = br.readLine();

			if (strtmp.equals("에그마요"))
			{
				System.out.println("에그마요 선택");
				Bread bread1 = new Bread(); // 빵 객체 생성
				break;
			}
			else if (strtmp.equals(chArray[1]))
			{
				System.out.println("bmt 선택");
				System.out.println("bmt");
				Bread bread1 = new Bread(); // 빵 객체 생성
				break;
			}
			else
				System.out.println("메뉴 이름을 다시 확인해 주세요");
		}

		/*
		do 
		( 
			System.out.print("빵은 1 샐러드는 2 : ");
			dmOption = System.in.read();
		}
		while(dmCategory != 숫자) // dmCategory != 숫자
		
		
		ArrayList<Bread> breadArrayList = new ArrayList<Bread>();  // 빵만 담는 ArrayList
		breadArrayList.add(bread1);   // 추가 주문 적용되는지 확인★

		else if dmOption == 2

		Salad salad1 = new Salad(); // 샐러드 객체 생성

		ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static 보류 // 샐러드만 담는 ArrayList
		saladArrayList.add(salad1);

		else if dmOption == 3 //-- 사이드메뉴
		{
			SideMenu sidemenu1 = new sidemenu();

			ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 
			sideMenuArrayList.add(sidemenu1);
		}
		else if dmOption == 4;
		{
			nowOrderOption();
		}
		*/
	}
}