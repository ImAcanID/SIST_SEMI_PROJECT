import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main
{
	static Customer[] ct;		// 손님 정보 더미
	static boolean isTakeOut;	// 테이크아웃 여부
	// static Sales sales;
	//static Ingredient ingred;
	static EventTime time;		// 시간 정보, 이벤트 대상 나이, 이벤트 대상 요일 담고 있음.
	
	public static void main(String[] args) throws IOException
	{
		boolean checkManager;	// 관리자인지 체크하는 용도
		
		time = new EventTime();	// 시간, 이벤트 관련 시간 객체 생성
				
		ct = new Customer[4]; // 사람 더미 데이터.
		ct[0] = new Customer("김영빈", 12234, 1500);  // 이름, 멤버쉽번호, 잔여포인트
		ct[1] = new Customer("유미란", 12352, 1000);
		ct[2] = new Customer("최서준", 15773, 500);
		ct[3] = new Customer("소인수", 33214, 200);
		
	
		//System.out.println(a);
		//sales = new Sales();

		while(true)
		{
			checkManager = printFirst();	// 테이크아웃할지 안 할지
			
			if(checkManager)				// 관리자모드에 갔다왔을 경우 다시 초기화
			{	
				ManagerMode();
				continue;
			}
			
			// 음식선택();
			DefaultMenu dm = new DefaultMenu();
			//Payment payment = new Payment(dm.breadArrayList);	//  구현 필요
			
			
			//System.out.println("첫번째 breadArrayList의 요소 : " + dm.breadArrayList.get(0));
			//System.out.println("두번째 breadArrayList의 요소 : " + dm.breadArrayList.size()); // 3개까진 선택해야 출력해보겠네.
			/*
			//dm 검사용
			System.out.println("지금까지의 정보를 출력해 보자면...");
			for (int i = 0;i<dm.breadArrayList.size();i++)
			{
				System.out.println("======================================================");
				System.out.print("           메뉴 :  " +dm.breadArrayList.get(i).bCategory);
				System.out.println();
				System.out.print("           가격 : " + dm.breadArrayList.get(i).bPrice);
				System.out.println();
				System.out.print("        빵 길이 : " + dm.breadArrayList.get(i).bLength);
				System.out.println();
				System.out.print("        빵 종류 : " + dm.breadArrayList.get(i).breadkind);
				System.out.println();
				System.out.print("      선택 치즈 : " + dm.breadArrayList.get(i).cheese);
			}
			System.out.println();
			*/
			
		}
	}
	
	static void ManagerMode()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = 0;
		
		
		while (input!= 1 && input!= 2)
		{
			try
			{
				System.out.println("① 수량 변경");
				System.out.println("② 판매 내역 출력");
				System.out.print("할 일 입력(1~2): ");
				input = Integer.parseInt(br.readLine());
				System.out.println();
			}
			catch (NumberFormatException e)
			{
				continue;
			}
			catch (IOException e1)
			{
				continue;
			}
		}	
		/*
		if(input == 1)
			ingred.수량변경();
		else
			sales.print();
		*/
	}

	static boolean printFirst()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = -1;
		
		do
		{
			try
			{
				System.out.printf("매장에서 드실 거면  \"0\"\n테이크아웃 하실거면 \"1\" 입력: ");
				choice = Integer.parseInt(br.readLine());
				System.out.println();
			}
			catch (NumberFormatException e)
			{
				continue;
			}
			catch (IOException e1)
			{
				continue;
			}
		}
		while (choice != 1 && choice != 0 && choice != 1234);	
		

		if (choice == 1234)
		{
			return true;
		}
		
		if (choice == 1)
			isTakeOut = true;
		else
			isTakeOut = false;
		return false;
	}
}