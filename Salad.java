import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Salad extends SuperMenu 
{
	String sCategory;     // 디폴트 메뉴 담기
	int sPrice;           // 샐러드가격 담기;
	int sCount = 1;
	static int cccc = 2; ///cccc → bbbb 로 변경 payment.java에서 활용.

	
	/* 담기
	String vegetable[];   // 야채들 담기 
	//String sauce;         // 소스 담기 
	String cheeze;        // 치즈 담기
	*/

	//int count = 1;            // 개수 담기
	
	
	Salad() throws IOException //-- 생성자.
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //--문자열 담는 용도. 
		scSelect();          //SaladCategory샐러드종류 select(디폴트 n)
		ccSelect();          //치즈여부선택하기();
		vdCustom();          //야채 커스텀();
		scCustom();          //소스 커스텀();
		//ig.addCount();          //개수추가메소드();
		//addMenu();           //추가메뉴메소드();
		addCount();
	}

	void scSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //--문자열 담는 용도. 
		do //→ 얘 나중에 Bread,Salad클래스에만 따로 빼든가.
		{
			System.out.println(" ");
			System.out.println("    [오늘의 메뉴]");
			System.out.println(" 월 : 이탈리안 비엠티");
			System.out.println(" 화 : 서브웨이 클럽");
			System.out.println(" 수 : 에그마요");
			System.out.println(" 목 : 이탈리안 비엠티");
			System.out.println(" 금 : 서브웨이 클럽");

			System.out.println("\n선택 가능한 메뉴 [에그마요, 이탈리안 비엠티, 서브웨이 클럽]");
			System.out.print("메뉴를 입력해 주세요 : ");
			sCategory = br.readLine();
		}
		while (!sCategory.equals("에그마요")&&!sCategory.equals("이탈리안 비엠티")&&!sCategory.equals("서브웨이 클럽"));

		if (sCategory.equals("에그마요"))
		{
			this.sCategory = "에그마요";
			this.sPrice = 6000;
		}
		else if (sCategory.equals("이탈리안 비엠티"))
		{
			this.sCategory = "이탈리안 비엠티";
			this.sPrice  = 7100;
		}
		else if (sCategory.equals("서브웨이 클럽"))
		{
			this.sCategory = "서브웨이 클럽";
			this.sPrice  = 7000;
		}
	}
	void addCount() throws IOException//객체 수량 늘리기
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strTemp;
		int intTemp=0;
		
		//DefaultMenu dm = new DefaultMenu(); // 이러면 디폴트메뉴 생성자 때문에 안 됨

		System.out.print("\n현재 옵션과 같은 메뉴를 추가하시겠습니까? (Y/N): ");
		strTemp = br.readLine();
		
		if(strTemp.equals("Y") || strTemp.equals("y"))
		{
			System.out.print("몇 개 추가하시겠습니까? :  \n (ex. 100개 추가 → 총 개수: 101 개)");
			intTemp = Integer.parseInt(br.readLine());
		}
		sCount += intTemp;
	}

}