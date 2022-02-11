import java.io.IOException;

class Salad extends SuperMenu 
{
	String sCategory;     // 디폴트 메뉴 담기
	int sPrice;           // 샐러드가격 담기;

	
	/* 담기
	String vegetable[];   // 야채들 담기 
	//String sauce;         // 소스 담기 
	String cheeze;        // 치즈 담기
	*/

	//int count = 1;            // 개수 담기
	
	
	Salad() throws IOException //-- 생성자.
	{
		scSelect();          //SaladCategory샐러드종류 select(디폴트 n)
		ccSelect();          //치즈여부선택하기();
		vdCustom();          //야채 커스텀();
		scCustom();          //소스 커스텀();
		//addCount();          //개수추가메소드();
		addMenu();           //추가메뉴메소드();
	}

	void scSelect() 
	{
		if (DefaultMenu.dmCategory == 1)
		{
			this.sCategory = "에그마요";
			this.sPrice = 4300;
		}
		else if (DefaultMenu.dmCategory == 2)
		{
			this.sCategory = "이탈리안 비엠티";
			this.sPrice  = 5400;
		}
		else if (DefaultMenu.dmCategory == 3)
		{
			this.sCategory = "서브웨이클럽";
			this.sPrice  = 5900;
		}
	}
}