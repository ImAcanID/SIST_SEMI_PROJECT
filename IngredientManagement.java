import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class IngredientManagement
{
	public static void main(String[] args) //--→ 이부분 삭제하고 
										   //ingPut()메소드랑 변수들한테
										   //타입과 static, 접근제어지시자 달면 여기 클래스는 끝!
	{

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
					

		//각 자료구조에 메뉴 요소와 수량 담기.

		//빵종류
		
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
		

		//테스트
		//System.out.println(sauce.get("스윗 어니언") + "스윗 어니언 수량");
		//--==>>100스윗 어니언 수량

		// 재료 넣기 메소드
		//void ingPut()
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
	}
}

