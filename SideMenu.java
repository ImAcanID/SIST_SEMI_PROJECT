import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


import java.util.Calendar;



class SideMenu //extends SuperMenu → 할 필요 없을듯?
{
	String smCategory; //-- 사용자가 선택한 사이드 메뉴.
	int smPrice; //-- 해당 사이드 메뉴의 가격.
	int smCount=1;// 사이드메뉴 수량.
	int totsmPrice;// 수량 * 가격
	//countSalad =1;
	/*
	카운트증가() → 재료클래서
	{
		빵 - 에그마요 - 토마토제외 - 똑같은걸
		객체 생성 하는 ... 해야할지
		count + +;
	}
	*/
	/*
	Countadd()→ 재료클래스 .. 
	{
		몇개 증가할래? 증가안해, 2개증가해
		증가안해 → return;
		2개증가 → count샐러드 +=2;
		
		빵개수 +=3; 
		전체재료들이 소비한 재료들이
		_ _ _ _ 
		샐러드 (샐러드 - 에그마요 - 소스없음, 개수=1)
		샐러드 (샐러드 - 에그마요 - 소스없음, 개수 ++)
		//재료클래스 재료 뺄때 슈레드 * 개수; 

	ig.Countadd();

	}
	*/

	//IngredientManagement ig = new IngredientManagement(); // 재료 인스턴스 생성.

	//String[] sideArray = {"콜라","커피","쿠키","스프","맥주"};
	IngredientManagement ig = new IngredientManagement();
	//String[] sideArray2 = ig.munuPan(sideArray[]);
	//--==>> 

	
	//생성자
	SideMenu() throws IOException
	{
		sideSelect();
	}
	
	//사이드 메뉴 고르기
	void sideSelect() throws IOException
	{
		boolean xAu = false; // -- 미성년자면 맥주 사는거 불가.
		/*
		System.out.print("\n선택 가능한 사이드메뉴 [");
		for (String s : sideArray)
		{
			System.out.print(s + " ");
		}
		System.out.println("]");
		*/
		
		System.out.print("\n선택 가능한 사이드 메뉴 [");
		for (int i=0; i< ig.sideArray.length; i++)
		{
			System.out.print( ig.sideArray[i]);
			if (i+1 !=  ig.sideArray.length) // 젤 마지막 거 아닐 때만 콤마 붙임
			{
				System.out.print(", ");
			}
			else
				System.out.println("]");
		}
		


		System.out.println(" ※ 맥주는 20살 이상만 가능합니다."); 


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("\n사이드 메뉴를 입력해 주세요 : " );
			smCategory = br.readLine();
		}
		while (!(smCategory.equals("콜라")||smCategory.equals("커피")||smCategory.equals("쿠키")||smCategory.equals("스프")||smCategory.equals("맥주")));
		
		if (smCategory.equals("맥주")) 
		{
			xAu = adultCertification();
			if (xAu == true)
			{
				System.out.println("미성년자에게는 맥주를 판매하지 않습니다.");
				return;
			}
		}
			System.out.print("수량을 입력해 주세요 : " );
			smCount = Integer.parseInt(br.readLine());

			//smCategory = ig.decreaseSideMenu(smCategory,smCount);

		switch (smCategory)
		{
		case "콜라": smPrice = 1000; break;
		case "커피": smPrice = 1000; break;
		case "쿠키": smPrice = 1000; break;
		case "스프": smPrice = 2900; break;
		case "맥주": smPrice = 4000; break;
		}

		totsmPrice = smCount * smPrice;
		

	}//end sideSelect()


	boolean adultCertification() throws IOException
	{
		int userAge;//--유효한 주민번호 → 해당 주민번호의 현재 날짜의 나이 계산.
		// 입력받는 주민번호(문자열 형태)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// 캘린더 인스턴스 생성.
		Calendar now = Calendar.getInstance();
		int yy = now.get(Calendar.YEAR);
		boolean trueJoo = false; // 명확한 주민번호는 true반환.
		boolean trueAd = false; //성인입니다. 반환할거임.

		// 입력받는 주민번호 (문자열 형태)
		String str;
		
		// 주민번호의 각 자릿수에 곱하게 될 수 → 배열 형태로 구성    
		int [] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};

		// 곱셈 연산 후 누적합 ( 각 곱셈의 결과를 더해 나가라...)

		int tot = 0; //7*2 + 5*3 + .. + 3 * 5 그래서 초기화 0으로
		
		System.out.println("\n성인인증을 위한 주민번호를 입력해 주세요."); 

		do
		{
			System.out.print("주민번호 입력(XXXXXX-XXXXXXX) : ");
			str = br.readLine();
			if (str.length() != 14)
			{
			System.out.println("주민번호를 다시 한번 확인해 주세요.");
			}
		}
		while (str.length() != 14);
		
		
		for (int i =0;i<13 ;i++ )//0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			if (i ==6)
			{
				continue; // -- 뒷부분 무시하고 계속해라.
			}
			tot+= chk[i] * Integer.parseInt(str.substring(i,i+1)); //문자열의 인덱스 마지막 값이 13이라 i+1가능.
			// 여기가 뒷부분임!

		}
		                                   
											 

		int su = 11 - tot % 11;

		su = su % 10;	// su를 %= 10;
		
		if (su == Integer.parseInt(str.substring(13)))
		{
			trueJoo = true;
		}
		else 
		{
			System.out.println("주민번호가 유효하지 않습니다.");
			sideSelect();
		}
			
		if (trueJoo == true) //유효한 주민번호에서
		{
			userAge = yy - Integer.parseInt(str.substring(0,3)) - 1900+1; // 현재나이 계산해서 
			if (userAge>=20)//20살이상이면.
				trueAd = true;
			else if (userAge<20)
				trueAd= false;
		}

		return trueAd;	
	}
}
		


	



