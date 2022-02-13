import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 문정 구현 부분 Food3
public class Food3
{
	public static void main(String[] args) throws IOException
	{
		// ●DefaultMenu 클래스●
		int dmCategory;       //defaultMenuCategory 
		int dmOption;         //defaultMenuOption   

		//dmSelect()
		//{
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			
			// 디폴트 메뉴 선택
			
			while (true)
			{
			System.out.print("메뉴를 선택해 주세요(에그마요, bmt, 서브웨이클럽) : ");
			String strtmp = br1.readLine();

			if (strtmp.equals("에그마요"))
			{
				System.out.println("에그마요 선택");
				Bread bread1 = new Bread(); // 빵 객체 생성
				break;
			}
			else if (strtmp.equals("bmt"))
			{
				System.out.println("bmt 선택");
				System.out.println("bmt");
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


		//메뉴판 static final로 선언.
		String[] breArray = {"화이트","허니오트","플랫브래드"};
		String[] veArray = {"토마토","양상추","오이","양파","올리브"};
		String[] sauArray = {"스윗 어니언","스윗 칠리","렌치 드레싱","소스제외"};
		String[] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
		String[] sideArray = {"콜라","커피","쿠키","스프","맥주"};
		
		// ●SuperMenu 클래스●
		//사용자가 입력한 커스텀 수량.
		int[] vbArray = {1, 1, 1, 1, 1}; // 야채 
		int[] scArray = {0, 0, 0, 0, 0}; // 소스
		int[] bdArray = {0, 0, 0}; // 빵
		int[] cCategory = {0, 0, 1}; // 치즈 카테고리
		int count = 1;
		int cusKey;
		String strTemp;
		
		ccSelect()//치즈여부선택하기();
		{
			// String [] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
			// int[] cCategory = {0, 0, 0, 0, 1} // 치즈 카테고리
			//n = 2
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//System.out.println("치즈 메뉴: 아메리칸 치즈, 슈레드 치즈, 치즈제외");
			String con = "Y";
			String strtmp;
			System.out.print("치즈 넣을 거야? Y or N : ");
			con = br.readLine();

			if (con.equals("Y") || con.equals("y"))
			{	
				while (true)
				{
					System.out.println("치즈 메뉴: 아메리칸 치즈, 슈레드 치즈");
					System.out.print("어떤 치즈 넣을 거야? : ");
					strtmp = br.readLine();

					if (strtmp.equals(chArray[0]))
					{
						System.out.println("아메리칸 치즈 선택");

						cCategory[0] = 1;
						cCategory[2] = 0;
					
						break;
					}
					else if (strtmp.equals(chArray[1]))
					{
						System.out.println("슈레드 치즈 선택");

					    cCategory[1] = 1;
						cCategory[2] = 0;

						break;
					}
					else
						System.out.println("치즈 이름을 다시 확인해");
				}
			}
			// 치즈 배열 값 테스트
			/*
			for (int i=0; i<cCategory.length; i++)
			{
				System.out.print(cCategory[i]);
			}
			System.out.println();
			*/
			
			// bdCustom() // 빵 커스텀 메소드
			// String[] breArray = {"화이트","허니오트","플랫브레드"};
			while (true)
			{
				System.out.println("빵 종류: 화이트, 허니오트, 플랫브레드");
				System.out.print("빵 골라줘 : ");
				strtmp = br.readLine();

				if (strtmp.equals(breArray[0]))
				{
					System.out.println("화이트 선택");
					break;
				}
				else if (strtmp.equals(breArray[1]))
				{
					System.out.println("허니오트 선택");
					break;
				}
				else if (strtmp.equals(breArray[2]))
				{
					System.out.println("플랫브래드 선택");
					break;
				}
				else
					System.out.println("빵 이름을 다시 확인해");
			}
		
		//=========================================================================================
		// 야채,소스,치즈,빵,사이드메뉴 수량 담을 자료구조 생성
		Map<String, Integer> bread = new HashMap<String, Integer>();
		Map<String, Integer> vegetable = new HashMap<String, Integer>();
		Map<String, Integer> sauce = new HashMap<String, Integer>();
		Map<String, Integer> cheese = new HashMap<String, Integer>();
		Map<String, Integer> sidemenu = new HashMap<String, Integer>();
		
		//각 자료구조에 메뉴 요소와 수량 담기.

		//빵종류
		for (String s :  breArray)
		{
			bread.put(s, 100);
		}

		//야채종류
		for (String s :veArray)
		{
			vegetable.put(s, 100);
		}

		//시연용. 토마토 재료 수량 0 → 관리자모드에서 수량 증가 보여주기.
		vegetable.put("토마토",0);
		
		//소스종류
		for (String s : sauArray)
		{
			sauce.put(s, 100);
		}

		
		//치즈종류
		for (String s : chArray)
		{
			cheese.put(s, 100);
		}

		//사이드메뉴종류	
		for (String s : sideArray)
		{
			sidemenu.put(s, 100);
		}
	
		//ingPut() // 재료 넣기 메소드
		//{
			Scanner sc = new Scanner(System.in);
			System.out.print("어떤 종류의 수량 관리 할래? : "); // 빵 야채 소스
			String kinds = sc.next();
			
			System.out.print(kinds + " 종류 입력해줘 : "); // 화이트
			String ingre = sc.next(); 
			
			int tmp = 0; // 재료 수량 기록할 임시 변수
			switch (kinds) // 현재 재료 수량을 tmp에 담기
			{
				case "빵" : tmp = bread.get(ingre); break;
				case "야채" : tmp = vegetable.get(ingre); break;
				case "소스" : tmp = sauce.get(ingre); break;
				case "치즈" : tmp = cheese.get(ingre); break;
				case "사이드 메뉴" : tmp = sidemenu.get(ingre); break;
			}
			System.out.printf("%s의 현재 수량은 %d이야.%n", ingre, tmp);
			System.out.print("얼마나 늘릴래? : ");
			int su = sc.nextInt();
			
			tmp += su;
			
			switch (kinds) // 기존 수량 + 사용자가 입력한 수량을 put하기 (덮어쓰기)
			{
				case "빵" : bread.put(ingre,tmp); break;
				case "야채" : vegetable.put(ingre,tmp); break;
				case "소스" : sauce.put(ingre,tmp); break;
				case "치즈" : cheese.put(ingre,tmp); break;
				case "사이드 메뉴" : sidemenu.put(ingre,tmp); break;
			}

			switch (kinds) // 반영 후 현재 수량 출력 
			{
				case "빵" : tmp = bread.get(ingre); break;
				case "야채" : tmp = vegetable.get(ingre); break;
				case "소스" : tmp = sauce.get(ingre); break;
				case "치즈" : tmp = cheese.get(ingre); break;
				case "사이드 메뉴" : tmp = sidemenu.get(ingre); break;
			}
			System.out.printf("%s의 증가 후 수량은 %d이야.%n", ingre, tmp);	
		//}

	}
}