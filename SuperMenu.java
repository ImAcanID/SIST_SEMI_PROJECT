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
	String[] breArray = {"화이트","허니오트","플랫브레드"};
	String[] veArray = {"토마토","양상추","오이","양파","올리브"};
	String[] sauArray = {"스윗 어니언","스윗 칠리","렌치 드레싱","소스제외"};
	String[] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
	String[] sideArray = {"콜라","커피","쿠키","스프","맥주"};

	// 재료수량을 변경하기 위해 배열로 만듬.
	int[] bdArray = {0, 0, 0}; // 빵
	int[] cCategory = {0, 0, 1}; // 치즈 카테고리
	int[] vbArray = {1, 1, 1, 1, 1}; // 야채 
	int[] scArray = {0, 0, 0, 0, 0}; // 소스

	
	int count = 1;
	int cusKey; //-- 나중에 현재옵션진행되는거 확인할 때 사용.
	String strTemp; 
	
	static String breadkind;     // 빵 종류 담기
	static String cheese;        // 치즈 담기
	static String[] vegetable;   // 야채들 담기 
	static String[] sauce;         // 소스 담기 
	
	void bdCustom() throws IOException // 빵 커스텀()----------------------------------------------------------------------
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true)
		{
			System.out.println("선택 가능한 빵 종류[화이트, 허니오트, 플랫브레드]");
			System.out.println("=================================================");
			System.out.print("빵 종류를 선택해 주세요. : ");
			strTemp = br.readLine();

			if (strTemp.equals(breArray[0]))
			{
				//System.out.println("화이트 선택"); // 테스트 출력
				bdArray[0] = 1;
				breadkind = "화이트";
				break;
			}
			else if (strTemp.equals(breArray[1]))
			{
				System.out.println("허니오트 선택"); // 테스트 출력
				bdArray[1] = 1;
				breadkind = "허니오트";
				break;
			}
			else if (strTemp.equals(breArray[2]))
			{
				System.out.println("플랫브레드 선택"); // 테스트 출력
				bdArray[2] = 1;
				breadkind = "플랫브레드";
				break;
			}
			else
				System.out.println("빵 이름을 다시 확인해 주세요!");
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
		System.out.print("치즈 추가 하시겠습니까? Y or N : ");
		con = br.readLine();

		if (con.equals("Y") || con.equals("y"))
		{	
			while (true)
			{
				System.out.println("선택 가능한 치즈 종류[아메리칸 치즈,슈레드 치즈]");
				System.out.println("=================================================");
				System.out.print("치즈 종류를 선택해 주세요. : ");
				strtmp = br.readLine();

				if (strtmp.equals(chArray[0]))
				{
					//System.out.println("아메리칸 치즈 선택"); // 테스트 출력

					cCategory[0] = 1;
					cCategory[2] = 0;
					cheese = "아메리칸 치즈";
				
					break;
				}
				else if (strtmp.equals(chArray[1]))
				{
					//System.out.println("슈레드 치즈 선택"); // 테스트 출력

					cCategory[1] = 1;
					cCategory[2] = 0;
					cheese = "슈레드 치즈";

					break;
				}
				else
					System.out.println("치즈 이름을 다시 확인해 확인해 주세요!");
			} // end while
		}// end if
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
		//cusKey = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("선택 가능한 야채 종류 [");
		for (String s : veArray) //→ 재료클래스 변수
		{
			
			System.out.print(s + ", "); 
		}
		System.out.println("]");
		System.out.println("==========================================");

		System.out.println();
		System.out.print("빼고 싶은 야채 종류를 선택해주세요.(다중 선택 가능,콤마『,』구분) : "); 
		strTemp = br.readLine();
		String[] strArr = strTemp.split(","); // 토마토, 양상추, 양파

		for (int i=0; i<strArr.length; i++)	//      0      1      2
		{                                        // 01234  
			for (int j=0; j<veArray.length; j++) // 토마토 양상추 오이 양파 올리브
			{
				if (strArr[i].equals(veArray[j]))
				{
					vbArray[j] = 0; // 0면 추가안해.
				}
				//else 
				//vegetable[i] = veArray[j]; 
			}
		}
		vegetable = new String [strArr.length];
		//사용자가 선택한 야채 문자열에 넣기.
		for (int i=0 ;i<strArr.length ;i++ )
		{
			vegetable[i] = strArr[i];
		}
		
		System.out.print("사용자가 제거선택한 야채 : ");
		//사용자가 제거한 야채 출력하기
		for (String s:vegetable)
		{
			System.out.print(s+", ");
		}
		System.out.println();


	}//end vdCustom()

	void scCustom() throws IOException // 소스 커스텀()--------------------------------------------
	{
		//int[] scArray = {0, 0, 0, 0, 0}; 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("선택 가능한 소스 종류 [");
		for (String s: sauArray ) //→ 재료클래스 변수
		{
			System.out.print(s + ", "); // 스윗 어니언,스윗 칠리,렌치 드레싱,소스제외
		}
		System.out.println("]");
		System.out.println("=====================================================");
		
		System.out.print("추가하고 싶은 소스 선택해주세요.(다중 선택 가능,콤마『,』구분) : "); 
		strTemp = br.readLine();
		
		String[] strArr = strTemp.split(", "); // 스윗 어니언,스윗 칠리
		//sauce = strArr;
		
		for (int i=0; i<strArr.length; i++)  
		{
			for (int j=0; j<sauArray.length; j++)
			{
				if (strArr[i].equals(sauArray[j]))
				{
					scArray[j] = 1; // 추가
				}
			}
		}
		sauce = new String [strArr.length];
		for (int i = 0;i<sauce.length;i++)
		{
			sauce[i] = strArr[i];
		}
		System.out.print("사용자가 선택한 소스 : ");
		//사용자가 제거한 야채 출력하기
		for (String s:sauce)
		{
			System.out.print(s+", ");
		}
		System.out.println();

	}// end scCustom()


//////////////////////////////////////////////////////////////////////////////////////////////////1
	// void addCount() // 개수 추가 메소드(); // 매개변수 생각해보기-------------------------------
	//{
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
//	}// end addCount()
	/*
	void decrease() throws IOException // 감소메소드 ----------------------------------------------
	{	
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
//	}//end decrease()
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
	
}