import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//샌드위치, 샐러드, 사이드메뉴 class에서 상속하는 슈퍼 클래스.
public class SuperMenu
{
	/*
	// 재료클래스 변수로 바꿀 예정.
	String[] breArray = {"화이트","허니오트","플랫브레드"};
	String[] veArray = {"토마토","양상추","오이","양파","올리브"};
	String[] sauArray = {"스윗 어니언","스윗 칠리","렌치 드레싱","소스제외"};
	String[] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
	String[] sideArray = {"콜라","커피","쿠키","스프","맥주"};

	String removeV;//-- 제거할 야채 담는 변수. "토마토 오이"


	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("토마토, 양상추, 오이, 양파, 올리브");
	System.out.println("제거할 야채를 말해주세요. (콤마 구분)");
	remoeV = br.readLine();

	String [] removeVarr = removeV.split();
	

}
*/
//==================================================================================================================================================

	// 재료 클래스에서 받아올 변수.
	/*
	String[] breArray = {"화이트","허니오트","플랫브레드"};
	String[] veArray = {"토마토","양상추","오이","양파","올리브"};
	String[] sauArray = {"스윗 어니언","스윗 칠리","렌치 드레싱","소스제외"};
	String[] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
	String[] sideArray = {"콜라","커피","쿠키","스프","맥주"};
	*/

	//IngredientManagement ig = new IngredientManagement();

	// ig.input2(); // 여기서 호출 안 돼
	
	// 재료수량을 변경하기 위해 배열로 만듬.
	int[] bdArray = {0, 0, 0}; // 빵
	int[] cCategory = {0, 0, 1}; // 치즈 카테고리
	int[] vbArray = {1, 1, 1, 1, 1}; // 야채 
	int[] scArray = {0, 0, 0, 0, 0}; // 소스
	
	int count = 1;
	int cusKey; //-- 나중에 현재옵션진행되는거 확인할 때 사용.
	String strTemp; 
	
	//static 없어도 된다고 생각함.
	String breadkind;     // 빵 종류 담기
	String cheese;        // 치즈 담기
	String[] vegetable;   // 야채들 담기 
	String[] sauce;         // 소스 담기 

	int moon = 0;
	
	void bdCustom() throws IOException // 빵 커스텀()----------------------------------------------------------------------
	{
		
		
		moon = 1; // 빵이라는 뜻.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true)
		{
			System.out.print("\n선택 가능한 빵 종류 [");
			for (int i=0; i<main.iim.breArray.length; i++)
			{
				System.out.print(main.iim.breArray[i]);
				if (i+1 != main.iim.breArray.length) // 젤 마지막 거 아닐 때만 콤마 붙임
				{
					System.out.print(", ");
				}
				else
					System.out.println("]");
			}
			
			System.out.print("빵 종류를 입력해 주세요 : ");
			
			strTemp = br.readLine();

			if (strTemp.equals(main.iim.breArray[0]))
			{
				//System.out.println("화이트 선택"); // 테스트 출력
				bdArray[0] = 1;
				breadkind = "화이트";
				break;
			}
			else if (strTemp.equals(main.iim.breArray[1]))
			{
				//System.out.println("허니오트 선택"); // 테스트 출력
				bdArray[1] = 1;
				breadkind = "허니오트";
				break;
			}
			else if (strTemp.equals(main.iim.breArray[2]))
			{
				//System.out.println("플랫 브레드 선택"); // 테스트 출력
				bdArray[2] = 1;
				breadkind = "플랫 브레드";
				break;
			}
			else
				System.out.println("빵 종류를 다시 확인해 주세요");
		}
		System.out.println("\n[현재 선택 옵션]");
		cusKey = 1;
		checkCustom();
		//breadkind = ig.decreaseBread(breadkind, bCount);
		//decrease();
		
		
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
		System.out.print("\n치즈를 추가 하시겠습니까?(Y/N) : ");
		con = br.readLine();

		if (con.equals("Y") || con.equals("y"))
		{	
			while (true)
			{
				System.out.print("\n선택 가능한 치즈 종류 [");
				for (int i=0; i<main.iim.chArray.length-1; i++)
				{
					System.out.print(main.iim.chArray[i]);
					if (i+1 != main.iim.chArray.length-1) // 젤 마지막 거 아닐 때만 콤마 붙임
					{
						System.out.print(", ");
					}
					else
						System.out.println("]");
				}
				System.out.print("치즈 종류를 입력해 주세요 : ");
				strtmp = br.readLine();

				if (strtmp.equals(main.iim.chArray[0]))
				{
					//System.out.println("아메리칸 치즈 선택"); // 테스트 출력

					cCategory[0] = 1;
					cCategory[2] = 0;
					cheese = "아메리칸 치즈";
				
					break;
				}
				else if (strtmp.equals(main.iim.chArray[1]))
				{
					//System.out.println("슈레드 치즈 선택"); // 테스트 출력

					cCategory[1] = 1;
					cCategory[2] = 0;
					cheese = "슈레드 치즈";

					break;
				}
				else
					System.out.println("치즈 종류를 다시 확인해 주세요");
			} // end while
		}
		else 
		{
			cheese = "치즈 선택 안 함";
		}// end if
		System.out.println("\n[현재 선택 옵션]");
		cusKey = 1;
		checkCustom();
		cusKey = 2;
		checkCustom();
		/*
		if (moon == 1)
		{
			cheese = ig.decreaseBread(cheese, Bread.bCount);
		}
		else if (moon == 0)
		{
			cheese = ig.decreaseBread(cheese, Salad.sCount);
		}
		*/
		
		
	}
		// 치즈 배열 값 테스트
		/*
		for (int i=0; i<cCategory.length; i++)
		{
			System.out.print(cCategory[i]);
		}
		System.out.println();
		*/
	//}// end ccSelect() 

	// 야채 커스텀()-------------------------------------------------------------------------------
	void vdCustom() throws IOException
	{
		String con = "Y";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		for (String s : veArray) //→ 재료클래스 변수
		{
			System.out.print(s + ", "); 
		}
		System.out.println("]");
		*/
		//System.out.println("==========================================");
		System.out.print("\n야채를 빼시겠습니까?(Y/N) : ");
		con = br.readLine();
		if (con.equals("Y") || con.equals("y"))
		{
			System.out.print("\n선택 가능한 야채 종류 [");
			for (int i=0; i<main.iim.veArray.length; i++)
			{
				System.out.print(main.iim.veArray[i]);
				if (i+1 != main.iim.veArray.length) // 젤 마지막 거 아닐 때만 콤마 붙임
				{
					System.out.print(", ");
				}
				else
					System.out.println("]");
			}
			System.out.print("빼고 싶은 야채 종류를 선택해주세요(다중 선택 가능, 콤마『,』구분) : "); 
			strTemp = br.readLine();
			String[] strArr = strTemp.split(", "); // 토마토, 양상추, 양파

			for (int i=0; i<strArr.length; i++)	//      0      1      2
			{                                        // 01234  
				for (int j=0; j<main.iim.veArray.length; j++) // 토마토 양상추 오이 양파 올리브
				{
					if (strArr[i].equals(main.iim.veArray[j]))
					{
						vbArray[j] = 0; // 0면 추가안해.
					}
					//else 
					//vegetable[i] = veArray[j]; 
				}
			}
			vegetable = new String [strArr.length];
			//사용자가 선택한 야채 문자열에 넣기.
			for (int i=0; i<strArr.length ;i++ )
			{
				vegetable[i] = strArr[i];
			}
		}// end if
		else 
		{
			vegetable = new String[1];
			vegetable[0] = "야채 제거하지 않음";
		}

		System.out.println("\n[현재 선택 옵션]");
		cusKey = 1;
		checkCustom();
		cusKey = 2;
		checkCustom();
		cusKey = 3;
		checkCustom();
		/*
		for (int i = 0 ;i<vegetable.length ;i++ )
		{
			vegetable[i] = ig.decreaseBread(vegetable, Bread.bCount); //여기 확인!!!
		}
		*/
		
	}//end vdCustom()

	void scCustom() throws IOException // 소스 커스텀()--------------------------------------------
	{
		//int[] scArray = {0, 0, 0, 0, 0}; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String con = "Y";
		String strtmp;
		String[] strArr2;
		
		System.out.print("\n소스를 추가 하시겠습니까?(Y/N) : ");
		con = br.readLine();
		if (con.equals("Y") || con.equals("y"))
		{
			System.out.print("\n선택 가능한 소스 종류 [");
			for (int i=0; i<main.iim.sauArray.length-1; i++)
			{
				System.out.print(main.iim.sauArray[i]);
				if (i+1 != main.iim.sauArray.length-1) // 젤 마지막 거 아닐 때만 콤마 붙임
				{
					System.out.print(", ");
				}
				else
					System.out.println("]");
			}
			System.out.print("소스 종류를 선택해주세요(다중 선택 가능, 콤마『,』구분) : "); 
			strtmp = br.readLine();
			strArr2 = strtmp.split(", "); 

			for (int i=0; i<strArr2.length; i++)
			{                                        
				for (int j=0; j<scArray.length; j++) 
				{
					if (strArr2[i].equals(scArray[j]))
					{
						scArray[j] = 1; 
					}
				}
			}
			sauce = new String[strArr2.length];
			//사용자가 선택한 소스 문자열에 넣기.
			for (int i=0; i<strArr2.length ;i++ )
			{
				sauce[i] = strArr2[i];
			}
		}
		else 
		{
			sauce = new String[1];
			sauce[0] = "소스 선택 안 함";
		}// end if
		
		System.out.println("\n[현재 선택 옵션]");
		cusKey = 1;
		checkCustom();
		cusKey = 2;
		checkCustom();
		cusKey = 3;
		checkCustom();
		cusKey = 4;
		checkCustom();
		//sauce[i] = ig.decreaseBread(sauce, Bread.bCount);
		/*
		for (int i = 0 ;i<sauce.length ;i++ )
		{
			sauce[i] = ig.decreaseBread(sauce, Bread.bCount); //여기 확인!!!
		}
		*/
	}

	void checkCustom() // 여기 샐러드일 때는 case1 돌면 안 돼 .. 어카지? 
	{                  // --> switch문 안에 if 중첩 가능. 
		//System.out.println("\n[현재 선택 옵션]"); // 이거 여러 번 돌아서 메소드 호출 전에 각각 해놨음
		switch (cusKey)
		{	
			case 1: 
				if (breadkind!=null) // breadkind에 값 있을 때만.
				{
					System.out.println("빵 종류 : " + breadkind);break;
				}
				else // breadkind 값 없으면 salad.
					break;
			case 2: System.out.println("치즈 종류 : " + cheese);break;
			case 3: checkVg();break;
			case 4: checkSc();break;
		}

	}
	void checkVg()// 제거 선택한 야채 종류 출력
	{
		System.out.print("제거 선택한 야채 종류 : ");
		for (String s:vegetable)
		{
			System.out.print(s + " ");
		}
		System.out.println();
	}
	void checkSc()// 선택한 소스 종류 출력
	{
		System.out.print("선택한 소스 종류 : ");
		for (String s:sauce)
		{
			System.out.print(s + " ");
		}
		System.out.println();
	}
	/*-- 문정 하다 말았음ㅋㅋㅋㅋㅋ
	void decrease()
	{
		IngredientManagement im = new IngredientManagement();

		if (breadkind!=null) // breadkind에 값 있을 때 (빵 선택했고, 빵 종류 선택하면)
		{
			if (bread.get(breadkind)==0) // 선택한 (ex.허니오트)의 수량
			{
				System.out.println(breadkind + "가 현재 품절되어 선택할 수 없습니다.");
				bdCustom(); // 빵 종류 다시 선택할 수 있도록. 
			}
		}
	}
	*/
}

	//void addCount() // 개수 추가 메소드(); // 매개변수 생각해보기-------------------------------
	//{
		// 재고수량 변수 아직 정의 안 됨!
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
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
		
  //  }// end addCount()
	//void decrease() throws IOException // 감소메소드 ----------------------------------------------
	//{
		/*
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
		*/		
	//}//end decrease()
	/*
	void checkCustom(int n)//----------------------------------------------------------------------
	{

	}//end checkCustom()
	
	/*
	static void addMenu() throws IOException
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
	*/////////////////////

	/*
	void endMenu() // DefaultMenu로 돌아가는 메소드
	{
		DefaultMenu dm = new DefaultMenu();
		dm.dmSelect();
	}
	*/

//}
	
//}