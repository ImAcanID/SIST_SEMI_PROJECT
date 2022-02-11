
		//재료 관리 클래스
//class IngManagement 
//{		
	/*
		// 야채,소스,치즈,빵,사이드메뉴 수량 담을 자료구조 생성
		Map<String, int> bread = new HashMap<String, int>();
		Map<String, int> vegetable = new HashMap<String, int>();
		Map<String, int> sauce = new HashMap<String, int>();
		Map<String, int> cheese = new HashMap<String, int>();
		Map<String, int> sidemenu = new HashMap<String, int>();
		
		String [] breArray= {"화이트","허니오트","플랫브래드"};
		String [] vaArray = {"토마토","양상추","오이","양파","올리브"};
		String [] sauArray = {"스윗 어니언","스윗 칠리","렌치 드레싱","소스제외"};
		String [] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
		String [] sidArray = {"콜라","커피","쿠키","스프","맥주"};

		for (String s : breArray)
		{
			bread.put(s, 0);
		}


		for (String s : vaAray)
		{
			vegetable.put(s, 100);
		}

		vegetable.put("토마토",0);

		for (String s : sauArray)
		{
			sauce.put(s, 0);
		}

		
		for (String s : chArray)
		{
			cheese.put(s, 0);
		}

			
		for (String s : sidArray)
		{
			sidemenu.put(s, 0);
		}
	
		void 
		System.out.println(vegetable.get("토마토") + "토마토 수량");
		
		*/
		/*
		ingPut() 
		{
			do
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("사용자한테 무슨 종류 수량 늘래?");
				que = sc.next();
			}
			while ();
			~~ n 
				~~n1
				put(n,n1);
			
		}
		*/
//}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Food2
{

	public static void main(String[] args)
	{
		// 야채,소스,치즈,빵,사이드메뉴 수량 담을 자료구조 생성
		Map<String, Integer> bread = new HashMap<String, Integer>();
		Map<String, Integer> vegetable = new HashMap<String, Integer>();
		Map<String, Integer> sauce = new HashMap<String, Integer>();
		Map<String, Integer> cheese = new HashMap<String, Integer>();
		Map<String, Integer> sidemenu = new HashMap<String, Integer>();
		
		//메뉴판
		String [] breArray= {"화이트","허니오트","플랫브래드"};
		String [] veArray = {"토마토","양상추","오이","양파","올리브"};
		String [] sauArray = {"스윗 어니언","스윗 칠리","렌치 드레싱","소스제외"};
		String [] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
		String [] sidArray = {"콜라","커피","쿠키","스프","맥주"};


		//각 자료구조에 메뉴 요소와 수량 담기.

		//빵종류
		for (String s : breArray)
		{
			bread.put(s, 100);
		}

		//야채종류
		for (String s : veArray)
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
		for (String s : sidArray)
		{
			sidemenu.put(s, 100);
		}
	
		//테스트
		//System.out.println(sauce.get("스윗 어니언") + "스윗 어니언 수량");
		//--==>>100스윗 어니언 수량

		//ingPut() 
		//{
			Scanner sc = new Scanner(System.in);
			String ingre = "";
			System.out.print("어떤 종류의 수량 관리 할래? : "); // 빵 야채 소스
			String kinds = " ";
			kinds = sc.next();
			
			System.out.print(kinds + " 종류 입력해줘 : "); // 화이트
			ingre = sc.next(); 
			
			/*
			switch (kinds)
			{
				case "빵" : System.out.println(ingre + "의 수량은 " + bread.get(ingre) + "이야."); break;
				case "야채" : System.out.println(ingre + "의 수량은 " + vegetable.get(ingre) + "이야."); break;
				case "소스" : System.out.println(ingre + "의 수량은 " + sauce.get(ingre) + "이야."); break;
				case "치즈" : System.out.println(ingre + "의 수량은 " + cheese.get(ingre) + "이야."); break;
				case "사이드 메뉴" : System.out.println(ingre + "의 수량은 " + sidemenu.get(ingre) + "이야."); break;
			}
			*/
			int tmp = 0;
			switch (kinds)
			{
				case "빵" : tmp = bread.get(ingre); break;
				case "야채" : tmp = vegetable.get(ingre); break;
				case "소스" : tmp = sauce.get(ingre); break;
				case "치즈" : tmp = cheese.get(ingre); break;
				case "사이드 메뉴" : tmp = sidemenu.get(ingre); break;
			}
			System.out.printf("%s의 수량은 %d이야.%n", ingre, tmp);
			System.out.print("얼마나 늘릴래?: ");
			int su = sc.nextInt();
			
			tmp += su;
			/*
			if (kinds == "빵")
			{
				bread.put(ingre,tmp);
			}
			else if (kinds == "야채")
			{
				vegetable.put(ingre,tmp);
				System.out.println("까꿍");
			}
			else if (kinds == "소스")
			{
				sauce.put(ingre,tmp);
			}
			else if (kinds == "치즈")
			{
				cheese.put(ingre,tmp);
			}
			else if (kinds == "사이드 메뉴")
			{
				sidemenu.put(ingre,tmp);
			}
			*/

			switch (kinds)
			{
				case "빵" : bread.put(ingre,tmp); break;
				case "야채" : vegetable.put(ingre,tmp); break;
				case "소스" : sauce.put(ingre,tmp); break;
				case "치즈" : cheese.put(ingre,tmp); break;
				case "사이드 메뉴" : sidemenu.put(ingre,tmp); break;
			}
			System.out.println(ingre + "의 수량은 " + vegetable.get(ingre) + "이야.");

			
			


		//}

	}
}