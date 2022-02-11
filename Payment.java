import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Payment
{
	int total;			// 할인 적용 금액
	int beforeTotal;	// 할인 미적용 금액
	int change;			// 거스름돈
	int cash;			// 현금 지불 금액
	boolean cashOrCard; // 현금지불할지 카드지불할지 카드면 true
	boolean timeDiscount; // 시간 할인 적용 여부
	boolean ageDiscount;  // 나이 할인 적용 여부
	int watingTime;		// 대기 시간
	int totalPoint;		// 적립된 포인트
	int usedPoint;		// 사용한 포인트 
	String promotionSandwich = { bmt, 에그마요, 클럽, bmt, 에그마요 } // 요일에 따라 프로모션 할인을 받는 메뉴 목록
	People customer; // 현재 키오스크 이용 중인 고객에 대한 정보. 안 쓸 수도 있음.
	Calendar time = 프로그램 시작 때 시간 정해서 넣어놓은거; // 미정
	
		
	Payment()
	{
		timeDiscount = false;
		ageDiscount = false;

		print();
	}
	print()		// **** 결제 화면 절차
	{
		System.out.println("할인받으실래요?(Y/N) : ");
		String yesDiscount = br.readLine();.toUpperCase(); 
		
		if (yesDiscount.equals("Y"))
		{
			discount();
		}

		System.out.println("포인트 사용하실래요?(Y/N) : ");
		String yesPoint = br.readLine();.toUpperCase();
		
		if (yesPoint.equals("Y"))	// 포인트 적립 여부
		{
			usePoint();
		}

		calTotal();	// 총합 계산

		savePoint();	// 포인트 적립

		System.out.print("현재 가격정보 출력");

		choosePayment(); 
		printBill();
	}
	printBill()
	{
		Bill abc = new Bill();
		abc.setter(총합, 현금or카드, 거스름돈, 변수타임할인, 나이할인, 적립된 포인트, 예상대기시간);
		abc.print();
	}

	choosePayment()	// 결제 수단 선택
	{
		int tot = total; 

		System.out.printf("지불해야하실 금액은 %d입니다.", tot);

		int n;
		do
		{
			System.out.printf("현금? 카드? 0또는 1: ");
			n = 입력값
		}
		while (n이 0이 아니거나 1도 아닐 때);

		if(n == 1)
		{
			cashOrCard = true;(카드라는 뜻)
		}
		else
		{
			cashOrCard = false;(현금이라는 뜻)
		}
		
		if(cashOrCard)
		{
			입력으로 111넣으면 카드 들어갔다고 인식.
		}
		else
		{
			do
			{
				System.out.printf("현금 넣어주세요: ");
				cash = 입력값;
			}
			while (cash<tot);
			
			change = cash - tot;
		}

	}
	
	discount() // 할인받을지 말지 검사
	{
		//시간 유효성검사
		if (12<=time && time<=14)
		{
			timeDiscount = true;
			return; // if 문 실행되면 return으로 아래 실행 안하고 불러왔던 곳으로 다시 돌아감
			        // 중복할인 안되게..
		}

		System.out.println("오늘은 끝 자리 몇 살인 사람 할인 가능. 할인받을래요?(Y/N) : ");
		String yesAgeDiscount = br.readLine();.toUpperCase();
		//char discountObject? = y or n;
		if (yesAgeDiscount.equals("Y"))
		{
			주민번호 입력받고 주민번호 유효성 검사(했던거 퍼와야함) // TODO 구현 필요.
			if(유효성 검사 true면)
				ageDiscount = true;
		}
		
	}

	usePoint()	// 포인트 사용을 묻는 메소드
	{
		if (checkMembership())	// 멤버쉽 메소드 호출. (멤버쉽 있나 없나 체크)
		{
			System.out.println("포인트는 1000원 이상부터 사용 가능합니다.");
			System.out.println("고객님의 잔여 포인트는 : " + Customer.restPoint + " 입니다"); // restPoint(잔여포인트) 고객의 잔여포인트가 얼마나 남았는지 보여줌
			
			if(restPoint > 1000)
			{
				System.out.print("포인트를 얼마나 사용하시겠습니까? : ");
				int wantToPoint = Integer.parseInt(br.readLine());
				//int n = 몇 포인트나 쓸래 (1000 < n < restPoint); //input 받아야함
				uesdPoint = wantToPoint;
			}
			else
			{
				System.out.println("포인트가 부족합니다.");
				return;
			}
		}
		
	}

	boolean checkMembership()
	{
		while(true)
		{
			
			//멤버십 번호를 입력받고나서 있는지 없는지 검사
			//(main에 있을 더미데이터 이용)
			System.out.print("멤버쉽 번호를 입력하세요 : ");
			int memberNum = Integer.parseInt(br.readLine());

			// memberNum이 Customer에 있으면,
			boolean isMembership;
			
			//멤버십번호 입력 >>> 4명의 멤버십 번호와 다 일치하는지 검사.
			for(People p :사람s 객체)
			{
				isMembership = memberNum == p.멤버십번호;
				if(isMembership) 고객 = p;	//
			}

			if(!isMembership)
			{
				// return;

				다시 입력해주세요. 멤버십입력
			}
			
			멤버십 있든 없든 일단 나와야되는데
			break;
		}
		return 멤버십이있으면 true, 없으면 false;
	}
	
	calTotal()	// 총합 계산
	{		
		
		int tmpTotal = 0;			// 계산용 임시변수tmpTotal.       할인적용된 총합
		int tmpBeforeTotal = 0;		// 계산용 임시변수tmpBeforeTotal. 할인 적용 전 총합

		for (빵 s(*n) : 빵 객체)  
		{
			int tmp = 0;
			tmp += s.디폴트 메뉴값;
			if(빵길이 == 30)
				tmp += s.빵길이값;
			
			calWatingTime(빵 s);

						  //현재 1개가격  * n개
			tmpBeforeTotal += (tmp  * s.갯수);

			if(timeDiscount)
			{
				tmp -= 500;	
			}
			tmpTotal += (tmp * s.갯수)		
		}

		for (샐러드 s(*n) : 샐러드 객체 )  
		{
			int tmp = 0;
			tmp += s.디폴트 메뉴값;
			
			tmpBeforeTotal += (tmp * s.갯수);
			
			calWatingTime(샐러드 s);
			
			if(timeDiscount)
			{
				tmp -= 500;	
			}
			
			tmpTotal += (tmp*s.갯수)
		}

		for (사이드 s(*n) : 사이드 객체 )
		{
			int tmp  = 0;
			tmp += s.사이드 가격;
			
			tmpBeforeTotal += (tmp*s.갯수);
			tmpTotal += (tmp*s.갯수);
		}

		if(ageDiscount)
		{
			tmpTotal - 500;
		}

		total = tmpTotal(여기서 계산한거);
		beforeTotal = tmpBeforeTotal(여기서 계산한거);
		
	}
	
	void calWatingTime(음식 s)	// 대기시간 계산
	{
		int time = 0; // 초기 대기시간 0 초기화
		if(빵인지 샐러드인지 판별)
			//빵이면
			time = 3;
		else
			time = 4;

		switch (디폴트 메뉴뭔지..)
		{
			case bmt : time++;
					break;
			case 에그마요: time+=2;
					break
			default: break;
		} 

		time = time * s.갯수;

		
		waitingTime += time;	
	}
	
	

	savePoint() // 포인트 적립 메소드
	{
		// 요일. 아마 main에 static 있을듯? 0~6 
		if(요일번호 1<= <=5)
		{
			String promotionMenu; // 프로모션 적용받을 메뉴
			switch (요일번호)
			{
				case 1: promotionMenu = promotionSandwich[요일번호-1]; break; 
				case 2:	promotionMenu = promotionSandwich[요일번호-1]); break;
				...
			}
		}
		
		System.out.println("멤버십이 있나?");
		if(checkMembership()) // checkMembership 메소드 호출하여 true / false 판별
		{
			for(빵 s : 빵 객체) 
			{
				boolean cond = s.디폴트메뉴.equals(promotionMenu) // 오늘의 프로모션 메뉴와 주문한 디폴트 메뉴가 같을경우 true.
				if(cond)
				{
					Customer.restPoint += (int)(s.가격 * s.갯수 * 0.05); // 고객.잔여포인트에 주문한 (개수*가격*5%) 적립
					System.out.printf("적립 후 현재 포인트는 %d입니다.", Customer.restPoint);
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

}