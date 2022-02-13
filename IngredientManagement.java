import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IngredientManagement
{
	//public static void main(String [] args)
	//{
	
	// 메뉴판
	String[] breArray = {"화이트","허니오트","플랫브래드"};
	String[] veArray = {"토마토","양상추","오이","양파","올리브"};
	String[] sauArray = {"스윗 어니언","스윗 칠리","렌치 드레싱","소스제외"};
	String[] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
	String[] sideArray = {"콜라","커피","쿠키","스프","맥주"};


	// 야채,소스,치즈,빵,사이드메뉴 수량 담을 자료구조 생성
	Map<String, Integer> bread = new HashMap<String, Integer>();
	Map<String, Integer> vegetable = new HashMap<String, Integer>();
	Map<String, Integer> sauce = new HashMap<String, Integer>();
	Map<String, Integer> cheese = new HashMap<String, Integer>();
	Map<String, Integer> sidemenu = new HashMap<String, Integer>();
				
	
	//생성자
	IngredientManagement()
	{
		input2();
	}
	//각 자료구조에 메뉴 요소와 수량 담기.
	
	//빵종류
	void input2() //초기 재고 수량.
	{
		for(String s:breArray)
		{
			bread.put(s, 100);
		}

		//야채종류
		for(String s:veArray)
		{
			vegetable.put(s, 100);
		}

		//시연용. 토마토 재료 수량 0 → 관리자모드에서 수량 증가 보여주기.
		vegetable.put("토마토",0);
		
		//소스종류
		for(String s:sauArray)
		{
			sauce.put(s, 100);
		}
		
		//치즈종류
		for(String s:chArray)
		{
			cheese.put(s, 100);
		}

		//사이드메뉴종류	
		for(String s:sideArray)
		{
			sidemenu.put(s, 100);
		}
	}
		

		//테스트
		//System.out.println(sauce.get("스윗 어니언") + "스윗 어니언 수량");
		//--==>>100스윗 어니언 수량

		// 재료 넣기 메소드 → 프로그램 main() 에서 관리자 모드에서 실행.
	void ingPut()
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[빵, 치즈, 야채, 소스, 사이드]");
		System.out.print("어떤 항목의 재료를 관리하시겠습니까? : "); // 빵 야채 소스
		String kinds = sc.next();
		System.out.print(kinds + " 재료의 이름을 입력해 주세요 : "); // 화이트
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
		System.out.printf("%s의 현재 수량은 %d입니다.%n", ingre, tmp);
		System.out.print("증가시킬 수량을 입력해 주세요 : ");
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
		System.out.printf("%s의 증가 후 수량은 %d입니다.%n", ingre, tmp);
	}

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
		
		if(!DefaultMenu.breadArrayList.isEmpty()) // 빵 객체 생성한 거면
		{
			Bread.bCount = intTemp; 
		}
		else if (!DefaultMenu.saladArrayList.isEmpty())
		{	
			Salad.sCount = intTemp;
		}
		
	}

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
	/*
	void decrease() //재고 수량 줄이기
	{
	}
	*/

		
	

}

