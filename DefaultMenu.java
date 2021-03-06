import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator; 



import java.util.InputMismatchException;



public class DefaultMenu
{
//=====================================================================================================================
	String strTemp;  //-- 문자열 타입의 빈 그릇.(에그마요,BMT...)
	String strTemp2; //-- 빵, 샐러드, 사이드메뉴, 현재주문확인하기..
	int nTemp;       //-- int타입의 빈 그릇

	int inTemp; //-- 추가메뉴 그릇
	
	ArrayList<Bread> breadArrayList = new ArrayList<Bread>(); // 빵객체가 하나씩 담기는 ArrayList
	ArrayList<Salad> saladArrayList = new ArrayList<Salad>();
	ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 

	// 생성자.
	DefaultMenu() throws IOException
	{
		dmSelect();
		addMenu();
		dmPrint();
		IngredientManagement ig = new IngredientManagement();
	}

	void dmSelect() throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //-- 문자열 담는 용도. 
		Scanner sc = new Scanner(System.in);
		int testKey = 1111;
		//System.out.print("원하시는 종류의 번호를 선택해 주세요.\n①빵 ②샐러드 ③사이드 메뉴 ④현재 주문 옵션 : ");
		
		//System.out.println("테) 빵객체 생성 → 1번");
		//System.out.println("테) 사이드메뉴객체 생성 → 3번");
		//System.out.println("안녕하세요. SUBWAY입니다.\n"); // 추가 주문할 때는 얘 나오면 안 되는데 걍 메인에서 ㄱ?
		while (testKey == 1111)
		{
			
			try
			{
				System.out.print("원하시는 종류의 번호를 선택해 주세요.\n①빵 ②샐러드 ③사이드 메뉴 ④현재 주문 옵션 : ");
				//strTemp2 = br.readLine();
				nTemp = sc.nextInt();
				if (nTemp == 1)
				{
					breadArrayList.add(new Bread()); // 빵객체를 하나 생성해서 자료구조에 담는다.
					/*
					if (!breadArrayList.isEmpty())
					{
						addCount();

						for (int i = 0;i<breadArrayList.size() ;i++ )
						{
							breadArrayList.get(i).bCount += inTemp;
							System.out.println("여기가 돌아가?빵");
						}
					}
					*/
				}

				else if (nTemp == 2)
				{
					saladArrayList.add(new Salad());
					/*
					if (!saladArrayList.isEmpty())
					{
						addCount();
						for (int i = 0;i<saladArrayList.size() ;i++ )
						{
							saladArrayList.get(i).sCount += inTemp;
							System.out.println("여기가 돌아가?샐러드");
						}
					}
					*/
				}
				else if (nTemp == 3)
				{
					sidemenuArrayList.add(new SideMenu());
					/*
					if (!sidemenuArrayList.isEmpty())
					{
						addCount();
						for (int i = 0;i<sidemenuArrayList.size() ;i++ )
						{
							sidemenuArrayList.get(i).smCount += inTemp;
						}
					}
					*/
					
				}
				else if (nTemp == 4)
				{
					dmPrint();
				}

				testKey = 2222;

				/*
				do //→ 얘 나중에 Bread,Salad클래스에만 따로 빼든가.
				{
					System.out.print("메뉴를 선택해 주세요(에그마요, 이탈리안 비엠티, 서브웨이클럽) : ");
					strTemp = br.readLine();

				}
				while (!strTemp.equals("에그마요")&&!strTemp.equals("이탈리안 비엠티")&&!strTemp.equals("서브웨이클럽"));
				*/
			}
			catch (InputMismatchException im)
			{
				sc = new Scanner(System.in);
				System.out.println("※숫자로 입력해 주세요.\n\n");
				
			}
			//break;
			/*
			if (testKey == 1111)
			{
				break;
			}
			*/



		}
		
		
		


		
	}

	public void addMenu() throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userInput1;
		do
		{
			System.out.print("\n추가 주문 하시겠습니까?(Y/N) : " );
			userInput1= br.readLine();
			if (userInput1.equals("Y") ||userInput1.equals("y"))
			{
				System.out.println();
				this.dmSelect();
			}
				
		}
		while (userInput1.equals("Y") ||userInput1.equals("y"));
		return;
		
	}

	public void dmPrint()  //정보출력하기 , 여기서 선언하는 이유 : 객체 담는 ArrayList가 이곳에서 선언되었기 때문!
	{
		System.out.println("\n[최종 주문 정보 출력]");

		//ListIterator<String> li = breadArrayList.listIterator();
		//for (int i = 0;i<breadArrayList.size();i++)
		/*
		while (li.hasNext())
		{
			for (int i = 0;i<breadArrayList.size();i++ )
			{
				Bread br1 = (Bread)li.next();// --bread객체 한개 가져옴.
				System.out.print("           메뉴 :  " +br1.bCategory);
				System.out.println();
			}
		}
	}
}
*/
		if (!breadArrayList.isEmpty())
		{
			for (int i = 0;i<breadArrayList.size();i++)
			{
				/*
				System.out.print("           메뉴 : " + breadArrayList.get(i).bCategory);
				System.out.println();
				System.out.print("           가격 : " + breadArrayList.get(i).bPrice);
				System.out.println();
				System.out.print("        빵 길이 : " + breadArrayList.get(i).bLength);
				System.out.println();
				System.out.print("        빵 종류 : " + breadArrayList.get(i).breadkind);
				System.out.println();
				System.out.print("      선택 치즈 : " + breadArrayList.get(i).cheese);
				System.out.println();
				*/
				System.out.println("종류            : 빵");
				System.out.print("메뉴            : " + breadArrayList.get(i).bCategory);
				System.out.println();
				System.out.print("빵 길이         : " + breadArrayList.get(i).bLength);
				System.out.println();
				System.out.print("빵 종류         : " + breadArrayList.get(i).breadkind);
				System.out.println();
				System.out.print("선택 치즈       : " + breadArrayList.get(i).cheese);
				System.out.println();
				


				//제거선택한 야채 불러오기
				String strTempx; // 그릇 하나 주세요.
				System.out.print("제거 선택 야채  : ");
				for (String s :breadArrayList.get(i).vegetable)
				{
					strTempx = s;
					System.out.print(s + " ");
				}
				System.out.println();
			
				//System.out.println();

				//선택한 소스 불러오기
				
				String strTempy; // 그릇 하나 주세요.
				System.out.print("선택 소스       : ");
				for (String s :breadArrayList.get(i).sauce)
				{
					strTempy = s;
					System.out.print(s + " ");
				}
				System.out.println();
				if (breadArrayList.get(i).bLength == 30)
				{
					int tempPrice = breadArrayList.get(i).bPrice + 4900;
					System.out.print("개당 가격       : "+tempPrice);
				}
				else 
					System.out.print("개당 가격       : " + breadArrayList.get(i).bPrice);
				System.out.println();
				System.out.print("총 개수         : " + breadArrayList.get(i).bCount);
				System.out.println();
				//System.out.print("총 가격         : " + breadArrayList.get(i).bCount*breadArrayList.get(i).bPrice+"\n");
				///System.out.println();
			}
			System.out.println();
			System.out.println();
		}
		//System.out.println();

		if (!saladArrayList.isEmpty())
		{
			for (int i = 0;i<saladArrayList.size();i++)
			{
				System.out.println("종류            : 샐러드");
				System.out.print("메뉴            : " + saladArrayList.get(i).sCategory);
				System.out.println();
				System.out.print("선택 치즈       : " + saladArrayList.get(i).cheese);
				System.out.println();


				//제거선택한 야채 불러오기
				String strTempx; // 그릇 하나 주세요.
				System.out.print("제거 선택 야채  : ");
				for (String s :saladArrayList.get(i).vegetable)
				{
					strTempx = s;
					System.out.print(s + " ");
				}
				System.out.println();
			
				//System.out.println();

				//선택한 소스 불러오기
				
				String strTempy; // 그릇 하나 주세요.
				System.out.print("선택 소스       : ");
				for (String s :saladArrayList.get(i).sauce)
				{
					strTempy = s;
					System.out.print(s + " ");
				}
				System.out.println();
				System.out.print("가격            : " + saladArrayList.get(i).sPrice);
				System.out.println();
				System.out.print("총 개수         : " + saladArrayList.get(i).sCount);
				System.out.println();
				//System.out.print("총 가격         : " + saladArrayList.get(i).sCount*saladArrayList.get(i).sPrice+"\n");
				//System.out.println();
			}
			System.out.println();
			System.out.println();
		}
		//System.out.println();

		if (!sidemenuArrayList.isEmpty()) //-- 사이드메뉴가 하나라도 선택이 됐다면...
		{
			for (int i = 0;i<sidemenuArrayList.size();i++)
			{
				System.out.println("종류            : 사이드 메뉴");
				System.out.print("메뉴            : " + sidemenuArrayList.get(i).smCategory);
				System.out.println();
				System.out.print("개당 가격       : " + sidemenuArrayList.get(i).smPrice);
				System.out.println();
				System.out.print("수량            : " + sidemenuArrayList.get(i).smCount);
				System.out.println();
				//System.out.print("총 가격         : " + sidemenuArrayList.get(i).totsmPrice+"\n");
				//System.out.println();
			}
			System.out.println();
			System.out.println();
		}
		//System.out.println();	
	}

/*
	void addCount() throws IOException//객체 수량 늘리기
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strTemp;
		int intTemp=0;
		
		//DefaultMenu dm = new DefaultMenu(); // 이러면 디폴트메뉴 생성자 때문에 안 됨

		System.out.print("\n현재 옵션과 같은 메뉴를 추가하시겠습니까? (Y/N) : ");
		strTemp = br.readLine();
		
		if(strTemp.equals("Y") || strTemp.equals("y"))
		{
			System.out.print("몇 개 추가하시겠습니까? : ");
			intTemp = Integer.parseInt(br.readLine());
		}
	}
		/*
		if (!breadArrayList.isEnpty())
		{
			for (int i = 0;i<breadArrayList.size() ;i++ )
			{
				breadArrayList.get(i).bCount += inTemp;
			}
		}
		if (!saladArrayList.isEnpty())
		{
			for (int i = 0;i<saladArrayList.size() ;i++ )
			{
				saladArrayList.get(i).bCount += inTemp;
			}
		}
		if (!sidemenuArrayList.isEnpty())
		{
			for (int i = 0;i<sidemenuArrayList.size() ;i++ )
			{
				sidemenuArrayList.get(i).bCount += inTemp;
			}
		}
		*/
}
	
	//System.out.println();
	
//}
	

	/*
	void addMenu()
	{
	}
	*/
//=====================================================================================================================
	// ※ 변수들 접근제어자 확인 필요
/*
	static int dmCategory;       //defaultMenuCategory //공통된 변수를 쓰니까 값이 덮어써진다..
	static int dmOption;         //defaultMenuOption 
	static String strtmp;
	ArrayList<Bread> breadArrayList = new ArrayList<Bread>();  // 빵만 담는 ArrayList
	ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static 보류 // 샐러드만 담는 ArrayList
	ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 

	void dmSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		// 디폴트 메뉴 선택
		while (true)
		{
			System.out.print("메뉴를 선택해 주세요(에그마요, 이탈리안 비엠티, 서브웨이클럽) : ");
			//String strtmp = br.readLine();
			strtmp = br.readLine();

			if (strtmp.equals("에그마요"))
			{
				System.out.println("에그마요 선택"); // 테스트 출력
				dmCategory = 1;
				System.out.println("현재 dmCategoty는 ? : " + dmCategory);
				break;
			}
			else if (strtmp.equals("이탈리안 비엠티"))
			{
				System.out.println("이탈리안 비엠티 선택"); // 테스트 출력
				dmCategory = 2;
				System.out.println("현재 dmCategoty는 ? : " + dmCategory);
				break;
			}
			else if (strtmp.equals("서브웨이클럽"))
			{
				System.out.println("서브웨이클럽 선택"); // 테스트 출력
				dmCategory = 3;
				System.out.println("현재 dmCategoty는 ? : " + dmCategory);
				break;
			}
			else
				System.out.println("메뉴 이름을 다시 확인해 주세요");
		}
		
		// 빵, 샐러드, 사이드 선택
		char chtmp;
		boolean isnum = true;
		SuperMenu sm = new SuperMenu();
		
		//ArrayList<Bread> breadArrayList = new ArrayList<Bread>();  // 빵만 담는 ArrayList
		//ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static 보류 // 샐러드만 담는 ArrayList
		//ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 
		

		while (true)
		{
			System.out.print("종류를 선택해 주세요(빵, 샐러드, 사이드 메뉴, 현재 주문 옵션 입력) : ");
			//public String strtmp = br.readLine();
			strtmp = br.readLine();

			

			if (strtmp.equals("빵"))
			{
				System.out.println("빵 선택"); // 테스트 출력
				dmOption = 1;
				breadArrayList.add(new Bread());   // 추가 주문 적용되는지 확인
				System.out.println("빵하나 완성하고 다시 돌아왔어요 ~ " ); //-- 생성이 안됐나? 이 문구가 안뜸!
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
		
		
		//ListIterator<Bread> li = breadArrayList.listIterator();
		//while (li.hasNext())
		//{
			//System.out.print(Bread.breadkind);
			//System.out.print(Bread.cheese);
			//System.out.print(Bread.vegetable);
			//System.out.print(Bread.sauce);
		//}
		//System.out.println();
		
		
		//System.out.println(breadArrayList.get(0));
		
		//Bread bd = new Bread();

		for (int i=0; i<breadArrayList.size(); i++)
		{
			System.out.println("ArrayList 길이 : " + breadArrayList.size());
			System.out.println(breadArrayList.get(i).breadkind);
			//System.out.println(breadArrayList.get(i).cheese);

			//System.out.println("breadArrayList의 사이즈 : " + breadArrayList.size());
			//System.out.println("첫번째 breadArrayList의 요소 : " + breadArrayList.get(0));
			//System.out.println("두번째 breadArrayList의 요소 : " + breadArrayList.get(breadArrayList.size()));

			//System.out.println(breadArrayList.get(1));
			//System.out.println(breadArrayList.get(i).breadkind);
			//System.out.println(bd.breadkind);
			//System.out.println(bd.cheese);

			//addMenu();
		}
	}

	public void addMenu() throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.print("추가 주문 할거니? (Y/N) 일단 1입력 아니면2 : " );
		n = sc.nextInt();
		if (n == 1)
		{
			this.dmSelect();
		}
		else
		System.out.println("이제 결제 창으로 넘어가세요 ! ");
*/
		
	//}
