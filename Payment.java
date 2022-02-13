import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Random;

import java.util.HashMap;
import java.util.Map;


class Payment
{
	int total;			// 할인 적용 금액
	int beforeTotal;	// 할인 미적용 금액
	int change;			// 거스름돈
	int cash;			// 현금 지불 금액
	boolean cashOrCard; // 현금지불할지 카드지불할지 카드면 true
	boolean timeDiscount; // 시간 할인 적용 여부
	boolean ageDiscount;  // 나이 할인 적용 여부
	int waitingTime;		// 대기 시간
	int totalPoint;		// 적립된 포인트
	int usedPoint;		// 사용한 포인트 
	String[] promotionSandwich = { "bmt", "에그마요", "서브웨이클럽", "bmt", "에그마요", " 서브웨이클럽", "폴드포크 바비큐"}; // 요일에 따라 프로모션 할인을 받는 메뉴 목록
	
	
	ArrayList<Bread> breadArray;  // 빵 객체 
	// ArrayList<Salad> saladArray;  // 샐러드 객체
	// ArrayList<Side> sideArray;  // 사이드메뉴 객체
	
	Order order;

	
	public void payment(ArrayList<Bread> breadArray/*ArrayList<Salad> saladArrayList, ArrayList<Side> sideArrayList*/)
	{
		timeDiscount = false;
		ageDiscount = false;

		this.breadArray = breadArrayList;
		//this.salasArray = saladArrayList;
		//this.sideArray = sideArrayList;
		order = new Order();

		print();
	}
	public void print()	throws IOException	// **** 결제 화면 절차
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("할인받으실래요?(Y/N) : ");
		String yesDiscount = br.readLine().toUpperCase(); 
		
		if (yesDiscount.equals("Y"))
		{
			discount();
		}

		System.out.println("포인트 사용하실래요?(Y/N) : ");
		String yesPoint = br.readLine().toUpperCase();
		
		if (yesPoint.equals("Y"))	// 포인트 사용 여부
		{
			usePoint();
		}

		calTotal();	// 총합 계산

		savePoint();	// 포인트 적립

		System.out.print("현재 가격정보 출력");

		choosePayment();	// 결제 수단 선택 및 결제

		sales.recordSales(order);	// 판매 내역 기록

		printBill();	// 영수증 출력
	}
	public void printBill()
	{
		Bill abc = new Bill(total, beforeTotal, change, cash, cashOrCard, timeDiscount, ageDiscount, waitingTime, totalPoint, usedPoint);
		//abc.setter(total, beforeTotal, change, cash, cashOrCard, timeDiscount, ageDiscount, watingTime, totalPoint, usedPoint); //setter는 넘기는거
		abc.print();
	}

	public void choosePayment() throws IOException	// 결제 수단 선택
	{
		int tot = order.total; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.printf("지불해야하실 금액은 %d입니다.", tot);
		
		int n;
		do
		{
			System.out.printf("현금이면 0, 카드면 1을 입력해주세요. : ");
			n = Integer.parseInt(br.readLine()); // 현금인지 카드인지 저장하는 변수
		}
		while (n<0 || n>1);

		if(n == 1)
		{						// cashOfCard는 현금이나 카드냐를 정하는 변수. 
			cashOrCard = true;  // 카드라는 뜻
		}
		else
		{
			cashOrCard = false;  // 현금이라는 뜻
		}
		
		if(cashOrCard)
		{
			//입력으로 123넣으면 카드 들어갔다고 인식.
			System.out.print("신용카드를 투입구에 넣어주세요. : ");
			int in = Integer.parseInt(br.readLine());
			if (in == 123)
			{
				System.out.println("결제가 완료되었습니다.");
			}
		}
		else
		{
			do
			{
				System.out.printf("현금을 넣어주세요: ");
				int inCash = Integer.parseInt(br.readLine());
				cash = inCash;
			}
			while (cash<tot);    
			
			change = cash - tot; // change는 거스름돈
			System.out.println("거스름돈은 " + change + "원 입니다.");
		}
	}
	
	public void discount() throws IOException //  할인받을지 말지 검사
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int randomTime = main.time.oClock;

		//시간 유효성검사
		if (12<=randomTime && randomTime<=14)
		{
			timeDiscount = true;
			return; // if 문 실행되면 return으로 아래 실행 안하고 불러왔던 곳으로 다시 돌아감
			        // 중복할인 안되게..
		}

		System.out.println("오늘은 나이 끝 자리가 " + randomTime +"살 인 사람 할인 가능. 할인을 받으시겠습니까?(Y/N) : ");
		String yesAgeDiscount = br.readLine().toUpperCase();
		//char discountObject? = y or n;
		if (yesAgeDiscount.equals("Y"))
		{
			birth();  // 나이 유효성검사 클래스 birth()메소드 호출. 
		}
		
	}

	public void usePoint() throws IOException	// 포인트 사용을 묻는 메소드
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (checkMembership())	// 멤버쉽 메소드 호출. (멤버쉽 있나 없나 체크)
		{
			System.out.println("포인트는 1000원 이상부터 사용 가능합니다.");
			System.out.println("고객님의 잔여 포인트는 : " + main.ct.point + " 입니다"); // point(잔여포인트).. 고객의 잔여포인트가 얼마나 남았는지 보여줌
			
			if(main.ct.point > 1000)
			{
				System.out.print("포인트를 얼마나 사용하시겠습니까? : ");
				int wantToPoint = Integer.parseInt(br.readLine());				
				usedPoint = wantToPoint;
			}
			else
			{
				System.out.println("포인트가 부족합니다.");
				return;
			}
		}
	}

	boolean checkMembership() throws IOException
	{
		while(true)
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//멤버십 번호를 입력받고나서 있는지 없는지 검사
			//(main에 있을 더미데이터 이용)
			System.out.print("멤버쉽 번호를 입력하세요 : ");
			int memberNum = Integer.parseInt(br.readLine());

			// memberNum이 Customer에 있으면,
			boolean isMembership;
			
			//멤버십번호 입력 >>> 4명의 멤버십 번호와 다 일치하는지 검사.
			for(Customer c : main.ct) // main.ct → main안에 ct를 하나씩 불러오면서 검사
			{
				isMembership = memberNum == main.ct.memberNumber; // 입력받은 멤버쉽 번호와 더미데이터의 멤버쉽번호가 일치하는지 확인.
				                                             // 일치하면 isMembership = true
				if(isMembership)
				{
					System.out.println("멤버쉽이 확인되었습니다");
				}
			}

			if(!isMembership)
			{
				return;
			}
			// while true기 때문에 멤버십 있든 없든 일단 나와야해서 break;
			break;
		}
		return isMembership;
	}
	
	public void calTotal()	// 총합 계산
	{	
		for (Bread b: breadArray)
		{
			order.recordOrder(b, timeDiscount);
			calWatingTime(b);	// 샌드위치 제작 대기 시간 계산
		}

		for (Salad s: saladArray)
		{
			order.recordOrder(s, timeDiscount);
			calWatingTime(s);	// 샐러드 제작 대기 시간 계산
		}

		for (Side sd: sideArray)
		{
			order.recordOrder(sd);
		}

		order.recordAgeDiscount(ageDiscount);
		order.recordPoint(usedPoint);
		
		order.waitingTime = waitingTime;

		/*
		int tmpTotal = 0;			// 계산용 임시변수tmpTotal.       할인적용된 총합
		int tmpBeforeTotal = 0;		// 계산용 임시변수tmpBeforeTotal. 할인 적용 전 총합

		

		for (Bread b : breadArray)  // 빵1 불러옴
		{
					
			int tmp = 0;			// 계산용 임시 변수
			tmp += b.bPrice;
			
			if(b.bLength == 30)
				tmp += b.bLength;
			
			calWatingTime(b);  // 빵 b

						  //현재 1개가격  * n개
			tmpBeforeTotal += (tmp  *  s.갯수 );
			
			if(timeDiscount)
			{
				tmp -= 500;	
			}
			tmpTotal += (tmp * s.갯수)		
		}

		for (Salad s : SaladArray)  
		{
			int tmp = 0;
			tmp += s.bPrice;
			
			tmpBeforeTotal += (tmp * s.갯수);
			
			calWatingTime(s); // 샐러드 s
			
			if(timeDiscount)
			{
				tmp -= 500;	
			}
			
			tmpTotal += (tmp*s.갯수)
		}

		for (Side sd : SideArray)
		{
			int tmp  = 0;
			tmp += sd.bPrice;
			
			tmpBeforeTotal += (tmp*s.갯수);
			tmpTotal += (tmp*s.갯수);
		}

		if(ageDiscount)     //ageDiscount
		{
			tmpTotal - 500;
		}

		total = tmpTotal//(여기서 계산한거);
		beforeTotal = tmpBeforeTotal//(여기서 계산한거);
		*/
		
	}

	
	public void calWatingTime(음식 s)	// 대기시간 계산
	{
		int earlyTime = 0; // 초기 대기시간을 0으로 초기화
		if(빵인지 샐러드인지 판별)
			//빵이면
			earlyTime = 3;
		else
			earlyTime = 4;

		switch (디폴트 메뉴가 뭔지)
		{
			case bmt : earlyTime++;
					break;
			case 에그마요: earlyTime+=2;
					break;
			default: break;
		} 

		earlyTime = earlyTime *  1/*s.갯수*/;

		
		waitingTime += earlyTime;	
	}
	
	

	public void savePoint() // 포인트 적립 메소드
	{
		int randomDay = main.time.getDate[3];

		if(1 <= randomDay && randomDay <= 5) //main.time.day
		{
			String promotionMenu; // 프로모션 적용받을 메뉴
			switch (randomDay)
			{
				case 1: promotionMenu = promotionSandwich[randomDay-1]; break; 
				case 2:	promotionMenu = promotionSandwich[randomDay-2]; break;
				case 3: promotionMenu = promotionSandwich[randomDay-3]; break;
				case 4: promotionMenu = promotionSandwich[randomDay-4]; break;
				case 5: promotionMenu = promotionSandwich[randomDay-5]; break;
			}
		}
		
		System.out.println("멤버십이 있나?");
		if(checkMembership()) // checkMembership 메소드 호출하여 true / false 판별
		{
			for(Bread b : breadArray) // 빵 객체를 하나씩 받아와서..
			{
				boolean cond = b.bCategory.equals(promotionMenu); // 오늘의 프로모션 메뉴와 주문한 디폴트 메뉴가 같을경우 true.
				if(cond)
				{
					main.ct.point += (int)(b.bPrice * b.갯수 * 0.05); // 고객.잔여포인트ㅇ 주문한 (개ㅇ*가격*5%ㅇ 적립
					System.out.printf("적립 후 현재 포인트는 %d입니다.", main.ct.point);
				}
				else
				{
					System.out.println("적립 가능한 메뉴가 아닙니다.");
				}
			}		
			
		}
		else
		{
			return;
		}
	}
	
	public void birth() throws IOException // 나이 유효성 검사 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rd = new Random();
		int birthNum;  // 태어난 년도 입력받는 변수 
		int randomAge = rd.nextInt(10); // 0 ~ 9 까지의 무작위 난수 발생
		//randomAge <<<-- 나이 마지막자리 랜덤으로 가져온것
		


		System.out.print("태어난 년도를 입력하세요(예시:1993) : ");
		birthNum = Integer.parseInt(br.readLine());
	
		//올해 연도 받아오기
		Calendar cal = Calendar.getInstance(); //캘린더 객체 인스턴스생성

		int y = cal.get(Calendar.YEAR); // 올해 연도 받아왔음

		int userAge = y - brithNum; // 사용자의 만 나이 알아냄
		userAge += 1; // 사용자의 한국식 나이..
		int lastAge = userAge % 10; // 나이 뒷자리 숫자 구하기

		if (randomAge == lastAge) // 
		{
			ageDiscount = true;
			
			order.ageDiscount = true; // 주문 내역에도 저장
		}
		else
			System.out.println("할인 대상이 아닙니다");
	}
}

