import java.io.IOException;

class Bread extends SuperMenu
{
	String bCategory; // 빵 종류; 빵.bCategory == "에그마요" 수 ++;
    int bPrice;       // 빵 가격;
	int bLength;      // 빵 길이;

	Bread() throws IOException //-- 생성자
	{
		//bcSelect();   // 빵 종류, 가격 // 에그마요 
		bdCustom();     // 빵 커스텀() // 화이트, 허니오트, 플랫브래드
		ccSelect();     // 치즈 커스텀()
		vdCustom();     // 야채 커스텀()
		scCustom();     // 소스 커스텀()
	
		//addCount();     // 증가 메소드()
		decrease();     // 감소 메소드()
		addMenu();

		//blSelect();     // 빵길이()
	}
	/*
	bcSelect()(int DefaultMenu.dmOption) // 1 -> 빵
	{
		if (DefaultMenu.dmCategory == 1)
		{
			bCategory = "에그마요";
			bprice = 4300;
		}
		else if (DefaultMenu.dmCategory == 2)
		{
			bCategory = "이탈리안 비엠티";
			bprice = 5400;
		}
		else if (DefaultMenu.dmCategory == 3)
		{
			bCategory = "서브웨이클럽";
			bprice = 5900;
		}
	}
	*/
	
	/*
	blSelect()
	{
		bLength 15? 30? 
		this.bLength = 사용자 입력값;
	}
	*/
}