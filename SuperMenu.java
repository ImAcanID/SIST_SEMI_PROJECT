import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//샌드위치, 샐러드, 사이드메뉴 class에서 상속하는 슈퍼 클래스.
class SuperMenu
{
	String[] breArray = {"화이트","허니오트","플랫브래드"};
	String[] veArray = {"토마토","양상추","오이","양파","올리브"};
	String[] sauArray = {"스윗 어니언","스윗 칠리","렌치 드레싱","소스제외"};
	String[] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
	String[] sideArray = {"콜라","커피","쿠키","스프","맥주"};

	int[] bdArray = {0, 0, 0}; // 빵
	int[] cCategory = {0, 0, 1}; // 치즈 카테고리
	int[] vbArray = {1, 1, 1, 1, 1}; // 야채 
	int[] scArray = {0, 0, 0, 0, 0}; // 소스
	
	int count = 1;
	int cusKey;
	String strTemp;

	/* 추가
	String vegetable[];   // 야채들 담기 
	String sauce;         // 소스 담기 
	String cheeze;        // 치즈 담기
	*/
	
	void bdCustom() throws IOException // 빵 커스텀()----------------------------------------------------------------------
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String[] breArray = {"화이트","허니오트","플랫브레드"};
		while (true)
		{
			System.out.println("빵 종류: 화이트, 허니오트, 플랫브레드");
			System.out.print("빵 골라줘 : ");
			strTemp = br.readLine();

			if (strTemp.equals(breArray[0]))
			{
				System.out.println("화이트 선택"); // 테스트 출력
				bdArray[0] = 1;
				break;
			}
			else if (strTemp.equals(breArray[1]))
			{
				System.out.println("허니오트 선택"); // 테스트 출력
				bdArray[1] = 1;
				break;
			}
			else if (strTemp.equals(breArray[2]))
			{
				System.out.println("플랫브래드 선택"); // 테스트 출력
				bdArray[2] = 1;
				break;
			}
			else
				System.out.println("빵 이름을 다시 확인해");
		}
	}// end bdCustom()

	void ccSelect() throws IOException // 치즈 선택하기() -----------------------------------------
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
					System.out.println("아메리칸 치즈 선택"); // 테스트 출력

					cCategory[0] = 1;
					cCategory[2] = 0;
				
					break;
				}
				else if (strtmp.equals(chArray[1]))
				{
					System.out.println("슈레드 치즈 선택"); // 테스트 출력

					cCategory[1] = 1;
					cCategory[2] = 0;

					break;
				}
				else
					System.out.println("치즈 이름을 다시 확인해");
			} // end while
		}// end if
		// 치즈 배열 값 테스트
		/*
		for (int i=0; i<cCategory.length; i++)
		{
			System.out.print(cCategory[i]);
		}
		System.out.println();
		*/
	}// end ccSelect() 

	// 야채 커스텀()-------------------------------------------------------------------------------
	void vdCustom() throws IOException
	{
		cusKey = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (String s: veArray ) //→ 재료클래스 변수
		{
			System.out.print(s + " "); 
		}
		System.out.println();
		System.out.print("제거하고 싶은 야채 말해줘 (콤마구분):"); 
		strTemp = br.readLine();
		String [] strArr = strTemp.split(","); // 토마토, 양상추, 양파

		for (int i = 0;i <strArr.length ;i++ )	
		{
			for (int j =0;j<veArray.length ;j++ )//토마토 양상추 오이 양파 올리브
			{
				if (strArr[i].equals(veArray[j]))
				{
					vbArray[j] =0; // 0면 추가안해.
				}
			}
		}
	}//end vdCustom()

	void scCustom() throws IOException // 소스 커스텀()--------------------------------------------
	{
		//int [] scArray = {0, 0, 0, 0, 0}; 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (String s: sauArray ) //→ 재료클래스 변수
		{
			System.out.print(s + " "); // 스윗 어니언,스윗 칠리,렌치 드레싱,소스제외
		}
		System.out.println();
		
		System.out.print("추가하고 싶은 소스 말해줘 (콤마구분):"); 
		strTemp = br.readLine();
		
		String [] strArr = strTemp.split(","); // 스윗 어니언,스윗 칠리
		
		for (int i = 0; i<strArr.length; i++ )  
		{
			for (int j =0; j<sauArray.length ; j++)
			{
				if (strArr[i].equals(sauArray[j]))
				{
					scArray[j] = 1; // 추가
				}
			}
		}
	}// end scCustom()

	// void addCount() // 개수 추가 메소드(); // 매개변수 생각해보기-------------------------------
	{
		/* 재고수량 변수 아직 정의 안 됨!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if (재고수량 != 0)
		{	
			System.out.printf("\n현재 :%d개 있습니다\n", count); 
			System.out.print("개수 몇개 추가시킬건가요? : ");
			int num = Integer.parseInt(br.readLine());
			if (num < 재고수량)
			{
				count += num;
				System.out.println("커스텀 총 개수 :" + count);
			}
		}
		else // 근데 이것도 문제 객체 생성될 때부터 말해줘야 함... 
		{
			System.out.println("재료가 품절되어 추가할 수 없습니다.");
		}
		*/
	}// end addCount()
	
	void decrease() throws IOException // 감소메소드 ----------------------------------------------
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (count > 0)
		{	
			System.out.printf("\n현재 :%d개 있습니다\n", count); 
			System.out.print("개수 몇개 감소시킬건가요? : ");
			int num = Integer.parseInt(br.readLine());

			if (count-num >= 0)
			{   
				count -= num;
				System.out.println("현재개수 :" + count);
			}
			else
			{
				System.out.println("감소수량을 초과하였습니다.");
			}
		}
		else 
		{
			System.out.println("감소할 수량이 없습니다.");
		}
	}//end decrease()
	
	void checkCustom(int n)//----------------------------------------------------------------------
	{

	}//end checkCustom()

	void addMenu() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("추가 메뉴를 선택하시겠습니까? Y/N : ");
		strTemp = br.readLine();

		if (strTemp.equals("Y") || strTemp.equals("y"))
		{
			DefaultMenu dm = new DefaultMenu();
			dm.dmSelect();
		}
		else
		{
			//결제 클래스 ob = new 결제클래스();
			//ob.결제메소드();
		}
	}
}