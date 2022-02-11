import java.util.Scanner;//--나중에 삭제하셈.

import java.util.ArrayList;

class SideMenu 
{
//=================================================================
	/*
	//String str = "안녕하세요";
	//생성자
	SideMenu()
	{
		this.str = "건태야 사랑해";
		System.out.println("사이드메뉴 생성자 실행 ... ! " );
	}
	*/

//=================================================================	
/*
	//smCategory; //-- 전역변수
	int smPrice;    //-- 전역변수

	//생성자
	SideMenu()
	{
		this.select();//-- 대충 이런 메소드가 있다고 생각하면!
	}

	public void select()
	{
		System.out.println("사이드메뉴 - 생성자 - select() 실행 완료.");
		smPrice = 5500;
	}
	
*/
	int smPrice = 0; // -- 사이드메뉴 가격
	int xx; 
	//DafaultMenu.x; //-- 상속받는 관계는 아니고 저 변수를 
				   //   여기 속성에서 쓸거라 이렇게 전역변수로 선언.

	//생성자
	SideMenu(int x) //--에그마요 BMT 이런거
	{
		this.xx = x; //-- 그래서 나중에 이객체.xx 하면 이객체의 에그마요인지 B
					//BMT 인지 알수잇음
		smSelect();// -- 사이드메뉴종류선택하기 메소드 호출
		addMenu();// -- 추가메뉴메소드 호출 → 다시 DefaultMenu호출하도록
	}

	public void smSelect()
	{
		System.out.println("사이드메뉴종류선택하기 메소드 호출 완료");
		smPrice = 500;
	}

	public void addMenu() //--SuperMenu에 정의되어있음!
						  //--근데 테스트하기 위해서 여기서 만듬.
	{
		DefaultMenu2 dm = new DefaultMenu2();
		dm.dmSelect();

	}
}


class DefaultMenu2
{
	static int x; //-- 전역변수, 에그마요, BMT, 써브웨이 클럽
	static ArrayList<SideMenu> alist = new ArrayList<SideMenu>();
	void dmSelect()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("DafaultMenu2 클래스의 dmSelect() 호출..");
		System.out.println("1,2,3중에 입력 :(에그마요 BMT 이런거)");
		x = sc.nextInt();
		if (x == 1)
		{
			System.out.println("에그마요");
		}
		else if (x == 2)
		{
			System.out.println("BMT");
		}
		else if (x == 3)
		{
			System.out.println("써브웨이 클럽");
		}
		System.out.println("if문 왜 안나옴 ㅠ?");
		SideMenu sd = new SideMenu(x); //--일단 무조건 사이드메뉴 생성
		alist.add(sd);
		System.out.println(alist.get(0));
		
	}
}