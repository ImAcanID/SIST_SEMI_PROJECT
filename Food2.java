
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Food2
{

	public static void main(String[] args) throws IOException
	{
		//메뉴판 static final로 선언.
		String [] breArray = {"화이트","허니오트","플랫브래드"};
		String [] veArray = {"토마토","양상추","오이","양파","올리브"};
		String [] sauArray = {"스윗 어니언","스윗 칠리","렌치 드레싱","소스제외"};
		String [] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
		String [] sideArray = {"콜라","커피","쿠키","스프","맥주"};

		//사용자가 입력한 커스텀 수량.
		int [] vbArray = {1, 1, 1, 1, 1};
		int [] scArray = {0, 0, 0, 0, 0}; 
		int cCategory; 
		int count = 1;
		int cusKey;
		String strTemp;
		/*
		vdArray [] = {1,1,1};        //vegetableArray야채커스텀 []  //-- 야채는 뺄거니까 1로 미리 초기화
		scArray [] ={0, 0, 0, 0};    //souceArray 소스커스텀    // --소스추가하면 1로 초기화
		cCategory;                   //cheeseCategory 1 2 3 int 
		count = 1;                   //개수
		*/
		/*
		???addMenu(???)
		{
			Yes → 
				DefaultMenu  dm = new DefaultMenu () // 인스턴스 생성 클래스명세서에 나중에 필요하면 써라.
				dm.dmMenuselect();
			No  → new 결제 클래스(); // 이렇게 옮기는게 맞나 싶다 ! 
		}
		*/
//===============================================================================================================
		//void vdCustom(???)//야채 커스텀();
		//{
			cusKey = 1;
			//숫자 공백 구분
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for (String s: veArray ) //→ 재료클래스 변수
			{
				System.out.print(s + " "); // 토마토 양상추 오이 양파 올리브 출력.
			}
			System.out.println();
			System.out.print("제거하고 싶은 야채 말해줘 (콤마구분):"); 

			strTemp = br.readLine();
			String [] strArr = strTemp.split(","); // 토마토, 양상추, 양파


			//테스트! strArr 내용 확인하기.
			/*
			for (String n: strArr)
			{
	
				System.out.printf("%s ",n);
			}
			System.out.println();
			*/
			/*
			토마토 양상추 오이 양파 올리브
			제거하고 싶은 야채 말해줘 (콤마구분):오이,양파,토마토,올리브
			오이 양파 토마토 올리브
			*/
			/*
			//메뉴판 static final로 선언.
			static final String [] breArray = {"화이트","허니오트","플랫브래드"};
			static final String [] veArray = {"토마토","양상추","오이","양파","올리브"};
			static final String [] sauArray = {"스윗 어니언","스윗 칠리","렌치 드레싱","소스제외"};
			static final String [] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
			static final String [] sideArray = {"콜라","커피","쿠키","스프","맥주"};
			*/

			for (int i = 0;i <strArr.length ;i++ )//오이								양파	토마토		올리브
			{
				for (int j =0;j<veArray.length ;j++ )//토마토 양상추 오이 양파 올리브
				{
					if (strArr[i].equals(veArray[j]))
					{
						vbArray[j] =0; // 0면 추가안해.
					}
				}
			}
			
			
			//야채커스텀 배열 출력 테스트
			System.out.println("토마토 양상추 오이 양파 올리브");
			for (int n : vbArray)
			{
				System.out.printf("%6d",n);
			}
			System.out.println();

//===============================================================================================================
			
			// strTemp = 토마토;
/*
			vdArray = 
			커스텀옵션확인()
			pritn(야채)
		}
		scCustom()//소스 커스텀();		★수민
		{
				커스텀옵션확인(n)
				print(야채,소스)
				decrease()
		}
		ccSelect()//치즈여부선택하기();	★문정
		{ 
			n = 2

				커스텀옵션확인()
				decrease()
		}
		----------------------------------
		샌드위치 - 에그마요 - 15cm
		토마토 o
		양상추 o
		양파   x
		치즈   슈레드
			

		
		addCount();//개수추가메소드();	★
		{
				개수 몇개 추가할래? : 3개
				n = 3;
				count += n;
				야채 
				소스
				치즈
				
				커스텀옵션확인(
				~~~~~ , 에그마요빵 4개)
				decrease()
		}

		decrease() //감소메소드	★
		{
			재료 변수 - 커스텀변수 <0 // 재료가 없음
			→ 구매불가. 재료품절.
				매번 커스텀을 할 때마다 감소메소드() 호출
		}

		checkCustom(int n)	★

		{
*/
//==============================================================================================================
/*
									if (vdArray[i] == 1)//선택을 했다면
									{
										veArray[i]

									}
									vdArray[0] == 1; → veArray[0]을 출력해라!
									vdArray[1] == 0; → veArray[0]을 출력해라!
									// 이부분은 메소드로 바꾸자.
									//void checkCustom(int cusKey) → 출력만
									//cusKey == 1 이면
									//야채추가 : 야채[0] 야채[1] ... 여기서 break쓰면 안대 왜냐면
									// cusKey ==2 이면 이게 치즈인가 하는데 그러면 위에서 이미 야채추가에 대한
									// 정보를 누적해서 보여줘야해서!
									
*/
			System.out.println("==========================================");
			System.out.println("		[현재주문옵션]");
			for (int n = 0; n<vbArray.length;n++)
			{
				if (vbArray[n] == 1)// 1이면 사용자가 해당 야채를 선택한 것!
				{
					System.out.print(veArray[n]+" ");
				}
			}
			System.out.println();
			System.out.println("==========================================");
//==============================================================================================================
			/*
			int [] customArray= { 디폴트메뉴,빵길이,야채[0], 야채[1], 야채[2], 소스[0], ~~~ };
			for (int ;i <cusKey ;i++ )
			{	
				야채 [2] 까지 출력 ~ 이런식.
				print(커스텀용[i]);
				커스텀옵션 정보 담기 배열 ? 
			}
			*/

			//디폴트메뉴, 종류 → 디폴트 메뉴 변수들!!!!!
			//그러면 우선 이 파일에서 출력할 수 있는 야채, 치즈, 소스만 가져오세요.
			/*
			
			==========================================
						[현재주문옵션]
			메뉴 : 에그마요							샌드위치, 샐러드만 출력
			종류 : 샌드위치							샌드위치, 샐러드만 출력
			길이 : 15cm								샌드위치만 출력
			선택 빵종류: 화이트						샌드위치만 출력
			선택 야채  : 토마토, 올리브				샌드위치, 샐러드만 출력
			선택 치즈  : 슈레드 치즈				샌드위치, 샐러드만 출력
			선택 소스  : 소스제외					샌드위치, 샐러드만 출력
			==========================================
			→ 사이드메뉴 class에서는 이걸 상속받아도 사용하지 않음.
			→ 샌드위치에만 출력되야하는 옵션이 있음.
			→ 그러므로 샐러드용으로 출력을 하고
			   샌드위치에서는 Overriding 해서 사용.

			*/
		//}





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
	
		//테스트
		//System.out.println(sauce.get("스윗 어니언") + "스윗 어니언 수량");
		//--==>>100스윗 어니언 수량

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