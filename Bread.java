import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Bread extends SuperMenu
{
	String bCategory; // 빵 종류; 빵.bCategory == "에그마요" 수 ++;
    int bPrice;       // 빵 가격;
	int bLength;      // 빵 길이;
	static int bCount;       // 같은 옵션의 빵 개수 추가
	//String cheeseBread;
	
	/* 상속해옴.
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
	
	String breadkind;     // 빵 종류 담기
	String cheese;        // 치즈 담기
	String[] vegetable;   // 야채들 담기 
	String[] sauce;         // 소스 담기 
	*/

	//생성자.
	Bread() throws IOException //-- 생성자 매개변수로 에그마요 담아옴.
	{

		//현재 변수의 값을 확인하자.
		//this.bCategory = strTemp;
		
		//System.out.println("Bread의 생성자 입니다 : "+ bCategory);
		//String cheese;
		
		//String breadkind;     // 빵 종류 담기
		//String cheese;        // 치즈 담기
		///String[] vegetable;   // 야채들 담기 
		//String[] sauce;         // 소스 담기 
		
		
		bcSelect();   // 빵 종류, 가격 // 에그마요 
		bdCustom();     // 빵 커스텀() // 화이트, 허니오트, 플랫브래드 (상속)
		blSelect();     // 빵길이()
		ccSelect();     // 치즈 커스텀() (상속)
		vdCustom();     // 야채 커스텀() (상속)
		scCustom();     // 소스 커스텀() (상속)
		ig.addCount();
		
		//addCount();     // 증가 메소드() (상속)
		//decrease();     // 감소 메소드() (상속)
		//addMenu();      // 추가 메뉴 메소드() (상속) → 이게 여기 있어서 객체 생성이 덜 된 상태로 add 가 되니까
						  //                              Bread() 생성자 안에있는 변수들이 마지막에 정한걸로 덮어쓰여지는듯하다!
	}
	
	void bcSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //--문자열 담는 용도. 
		do //→ 얘 나중에 Bread,Salad클래스에만 따로 빼든가.
		{
			System.out.println("\n선택 가능한 메뉴 [에그마요, 이탈리안 비엠티, 서브웨이 클럽]");
			System.out.print("메뉴를 입력해 주세요 : ");
			bCategory = br.readLine();

		}
		while (!bCategory.equals("에그마요")&&!bCategory.equals("이탈리안 비엠티")&&!bCategory.equals("서브웨이 클럽"));

		if (bCategory.equals("에그마요"))
		{
			this.bPrice = 4300; //에그마요 가격 변경 예정(샐러드는 여기에 + 1700원)
			//System.out.println("여기 실행되낭. 에그마요 가격 4500원");
		}
		else if (bCategory.equals("이탈리안 비엠티"))
		{
			this.bPrice = 5400;
			//System.out.println("여기 실행되낭. 이탈리안 비엠티 가격 70000원");
		}
		else if (bCategory.equals("서브웨이 클럽"))
		{
			this.bPrice = 5900;
		}
		
	} //end bcSelect()
		
	void blSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
		System.out.println("\n선택 가능한 빵 길이 [15cm, 30cm]");
		System.out.println(" ※ 30cm 선택 시 5000원이 추가 됩니다.");
		System.out.print("빵의 길이를 입력해 주세요(15, 30) : ");

		bLength = Integer.parseInt(br.readLine());

		if (bLength == 30)
		{
			bPrice += 5000; // 30cm는 5,000원추가.
		}
	}
	
}