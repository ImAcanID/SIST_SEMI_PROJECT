
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

			System.out.print("어떤 종류의 수량 관리 할래?: "); // 야채 
			String kinds = sc.next();

			System.out.print("종류 입력해줘");
			String ingre = sc.next();

			//System.out.println("현재" + ingre + "수량은" + kinds.values(ingre) + "얼마나 늘릴래?");
			//int quant = sc.nextInt();

			System.out.println(bread.values());
		//}

	}
}