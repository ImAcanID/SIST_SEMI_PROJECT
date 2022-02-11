// 문정 수정 중

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator; 

public class DefaultMenu
{
	// ※ 변수들 접근제어자 확인 필요
	static int dmCategory;       //defaultMenuCategory 
	static int dmOption;         //defaultMenuOption   

	void dmSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		// 디폴트 메뉴 선택
		while (true)
		{
			System.out.print("메뉴를 선택해 주세요(에그마요, 이탈리안 비엠티, 서브웨이클럽) : ");
			String strtmp = br.readLine();

			if (strtmp.equals("에그마요"))
			{
				System.out.println("에그마요 선택"); // 테스트 출력
				dmCategory = 1;
				break;
			}
			else if (strtmp.equals("이탈리안 비엠티"))
			{
				System.out.println("이탈리안 비엠티 선택"); // 테스트 출력
				dmCategory = 2;
				break;
			}
			else if (strtmp.equals("서브웨이클럽"))
			{
				System.out.println("서브웨이클럽 선택"); // 테스트 출력
				dmCategory = 3;
				break;
			}
			else
				System.out.println("메뉴 이름을 다시 확인해 주세요");
		}
		
		// 빵, 샐러드, 사이드 선택
		char chtmp;
		boolean isnum = true;
		SuperMenu sm = new SuperMenu();
		ArrayList<Bread> breadArrayList = new ArrayList<Bread>();  // 빵만 담는 ArrayList
		ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static 보류 // 샐러드만 담는 ArrayList
		ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 

		while (true)
		{
			System.out.print("종류를 선택해 주세요(빵, 샐러드, 사이드 메뉴, 현재 주문 옵션) : ");
			String strtmp = br.readLine();

			if (strtmp.equals("빵"))
			{
				System.out.println("빵 선택"); // 테스트 출력
				dmOption = 1;
				breadArrayList.add(new Bread());   // 추가 주문 적용되는지 확인
				break;
			}
			else if (strtmp.equals("샐러드"))
			{
				System.out.println("샐러드 선택"); // 테스트 출력
				dmOption = 2;
				Salad salad1 = new Salad(); // 샐러드 객체 생성
				saladArrayList.add(salad1);
				break;
			}
			else if (strtmp.equals("사이드 메뉴"))
			{
				dmOption = 3;
				//SideMenu sidemenu1 = new sidemenu();
				//sideMenuArrayList.add(sidemenu1);
			}
			else if (strtmp.equals("현재 주문 옵션"))
			{
				dmOption = 4;

				//nowOrderOption(); // nowOrderOption() 호출
			}
			else
				System.out.println("다시 확인해 주세요.");
		}// end while
		
		
		ListIterator<Bread> li = breadArrayList.listIterator();
		//while (li.hasNext())
		//{
			System.out.print(Bread.breadkind);
			System.out.print(Bread.cheese);
			//System.out.print(Bread.vegetable);
			//System.out.print(Bread.sauce);
		//}
		System.out.println();
		
		
		//System.out.println(breadArrayList.get(0));
		
		//Bread bd = new Bread();

		for (int i=0; i<breadArrayList.size(); i++)
		{
			System.out.println(breadArrayList.get(i));
			//System.out.println(breadArrayList.get(1));
			//System.out.println(breadArrayList.get(i).breadkind);
			//System.out.println(bd.breadkind);
			//System.out.println(bd.cheese);
		}
	}
}