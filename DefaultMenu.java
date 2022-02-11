// 문정 수정 중

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

class DefaultMenu
{
	int dmCategory;       //defaultMenuCategory 
	int dmOption;         //defaultMenuOption   

	void dmSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

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
			else if (strtmp.equals("bmt"))
			{
				System.out.println("bmt 선택");
				Bread bread1 = new Bread(); // 빵 객체 생성
				break;
			}
			else
				System.out.println("메뉴 이름을 다시 확인해 주세요");
		}
		
		// 빵, 샐러드, 사이드 선택
		char chtmp;
		boolean isnum = true;

		while (true)
		{
			System.out.print("종류를 선택해 주세요(빵, 샐러드, 사이드 메뉴, 현재 주문 옵션) : ");
			String strtmp = br.readLine();

			if (strtmp.equals("빵"))
			{
				System.out.println("빵 선택");
				ArrayList<Bread> breadArrayList = new ArrayList<Bread>();  // 빵만 담는 ArrayList
				breadArrayList.add(bread1);   // 추가 주문 적용되는지 확인
				break;
			}
			else if (strtmp.equals("샐러드"))
			{
				System.out.println("샐러드 선택");
				Salad salad1 = new Salad(); // 샐러드 객체 생성
				ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static 보류 // 샐러드만 담는 ArrayList
				saladArrayList.add(salad1);
				break;
			}
			else if (strtmp.equals("사이드 메뉴"))
			{
				SideMenu sidemenu1 = new sidemenu();

				ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 
				sideMenuArrayList.add(sidemenu1);
			}
			else if (strtmp.equals("현재 주문 옵션"))
			{
				nowOrderOption(); // nowOrderOption() 호출
			}
			else
				System.out.println("다시 확인해 주세요.");
		}
	}
}