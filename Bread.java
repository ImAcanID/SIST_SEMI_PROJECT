import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Bread extends SuperMenu
{

	String bCategory; // 빵 종류; 빵.bCategory == "에그마요" 수 ++;
    int bPrice;       // 빵 가격;
	int bLength;      // 빵 길이;
	//String cheeseBread;
	
	/* 
	// 상속
	String breadkind;     // 빵 종류 담기
	String cheese;        // 치즈 담기
	String vegetable[];   // 야채들 담기 
	String sauce[];         // 소스 담기
	*/


	//생성자.
	Bread(String strTemp) throws IOException //-- 생성자 매개변수로 에그마요 담아옴.
	{

		//현재 변수의 값을 확인하자.
		this.bCategory = strTemp;
		
		System.out.println("Bread의 생성자 입니다 : "+ bCategory);
		//String cheese;
		
		//String breadkind;     // 빵 종류 담기
		//String cheese;        // 치즈 담기
		///String[] vegetable;   // 야채들 담기 
		//String[] sauce;         // 소스 담기 
		

		bcSelect();   // 빵 종류, 가격 // 에그마요 
		//bdCustom();     // 빵 커스텀() // 화이트, 허니오트, 플랫브래드 (상속)
		//blSelect();     // 빵길이()
		//ccSelect();     // 치즈 커스텀() (상속)
		//vdCustom();     // 야채 커스텀() (상속)
		//scCustom();     // 소스 커스텀() (상속)
		
		//addCount();     // 증가 메소드() (상속)
		//decrease();     // 감소 메소드() (상속)
		//addMenu();      // 추가 메뉴 메소드() (상속) → 이게 여기 있어서 객체 생성이 덜 된 상태로 add 가 되니까
						  //                              Bread() 생성자 안에있는 변수들이 마지막에 정한걸로 덮어쓰여지는듯하다!
			
	}
	void bcSelect()
	{
		if (bCategory.equals("에그마요"))
		{
			this.bPrice = 4500;
			System.out.println("여기 실행되낭. 에그마요 가격 4500원");
		}
		else if (bCategory.equals("이탈리안 비엠티"))
		{
			this.bPrice = 70000;
			System.out.println("여기 실행되낭. 이탈리안 비엠티 가격 70000원");
		}
		
			
		
	}
	
	/*
	void bcSelect() // 1 -> 빵
	{
		if (DefaultMenu.dmCategory == 1)
		{
			this.bCategory = "에그마요";
			this.bPrice = 4300;
		}
		else if (DefaultMenu.dmCategory == 2)
		{
			this.bCategory = "이탈리안 비엠티";
			this.bPrice = 5400;
		}
		else if (DefaultMenu.dmCategory == 3)
		{
			this.bCategory = "서브웨이클럽";
			this.bPrice = 5900;
		}
	}
	*/
	
	
	/*
	void blSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("빵 길이 선택해줘 15야 30이야? : ");
		bLength = Integer.parseInt(br.readLine());
	}
	*/
}