class Bill
{	
	int beforeTotal;	// 할인 미적용 금액
	int beforePoint;	// 할인 적용 금액 (포인트 미적용)
	int total;			// 할인 적용 금액 (포인트 적용)
	int change;			// 거스름돈
	int cash;			// 현금 지불 금액
	boolean cashOrCard; // 현금지불할지 카드지불할지 카드면 true
	boolean ageDiscount;  // 나이 할인 적용 여부
	int watingTime;		// 대기 시간
	int totalPoint;		// 적립된 포인트
	int usedPoint;		// 사용한 포인트 
	boolean useMembership; // 포인트 사용 여부
	boolean saveMembership; // 포인트 적립 여부

	
	EventTime time;		// 미리 생성해놓은 시간 객체

	Order order;		// 주문내역

	final String[] defaultName = {"에그마요", "이탈리안 비엠티", "서브웨이클럽"};		
	final String[] sideName = {"콜라", "커피", "쿠키", "스프", "맥주"};
	final String[] days = {"일", "월", "화", "수", "목", "금", "토"};
	
	Bill(Order order, int change, int cash, boolean cashOrCard, int watingTime, int totalPoint, int usedPoint, boolean useMembership, boolean saveMembership)
	{
		this.order = order;
		this.change = change;
		this.cash = cash;
		this.cashOrCard = cashOrCard;
		this.watingTime = watingTime;

		if(useMembership)
		{
			this.useMembership = useMembership;
			this.totalPoint = totalPoint;
			this.usedPoint = usedPoint;

		}
		if(saveMembership)
		{
			this.saveMembership = saveMembership;
			this.totalPoint = totalPoint;
		}
			


		this.ageDiscount = this.order.ageDiscount;
		this.beforeTotal = this.order.beforeTotal;
		this.total = this.order.total;
		this.beforePoint = this.order.beforePoint;
		
		this.time = main.time;
	}	

	void print()
	{
		
		// 대충 영수증 양식따라서 출력함. 저거 위에 변수 다 출력
		System.out.println("              영수증 출력");
		System.out.println("===============주문 내역===============\n");
		
		if(order.breadOrder.size() != 0)
		{
			System.out.println("================샌드위치===============");
			for(int i=0; i<order.breadOrder.size(); i++)
			{
				Integer[] temp = order.breadOrder.get(i);
				System.out.printf("%s - %d개\t\t- %8d원\n", defaultName[temp[0]], temp[1], temp[2]);
				if(temp[3] == 1)
					System.out.println("  런치 할인 적용");
				if(temp[4] == 1)
					System.out.println("  빵 길이 추가 적용");
			}
			System.out.println();
		}
		
		if(order.saladOrder.size() != 0)
		{
			System.out.println("================샐러드=================");
			for(int i=0; i<order.saladOrder.size(); i++)
			{
				Integer[] temp = order.saladOrder.get(i);
				System.out.printf("%s - %d개\t\t- %8d원\n", defaultName[temp[0]], temp[1], temp[2]);
				if(temp[3] == 1)
					System.out.println("  런치 할인 적용");
			}
			System.out.println();
		}
		
		if(order.sideOrder.size() != 0)
		{
			System.out.println("==============사이드 메뉴==============");
			for(int i=0; i<order.sideOrder.size(); i++)
			{
				Integer[] temp = order.sideOrder.get(i);
				System.out.printf("%s: %d개\t\t- %8d원\n", sideName[temp[0]], temp[1], temp[2]);
			}
		}
		System.out.println();		

		System.out.printf("할인 전 금액\t\t- %8d원\n", beforeTotal);
		if(ageDiscount)
			System.out.printf("나이 할인 적용\t\t -%8d원\n", main.AGE_DISCOUNT_MONEY);
		if(useMembership)
		{
			System.out.printf("포인트 사용\t\t- %8d점\n", usedPoint);
			System.out.printf("누적 포인트\t\t- %8d점\n", totalPoint);
		}
		System.out.printf("지불수단\t\t- %8s\n", cashOrCard ? "카드" : "현금");
		if(!cashOrCard)
		{
			System.out.printf("지불 금액\t\t- %8d원\n", cash);
			System.out.printf("거스름돈\t\t- %8d원\n", change);
		}
		System.out.printf("총 금액\t\t\t- %8d원\n", total);
		System.out.println();
		System.out.printf("예상 대기 시간 - %d분\n", watingTime);
		System.out.printf("%d-%d-%d-%s요일 %d시 %d분\n\n", time.getDate()[0], time.getDate()[1], time.getDate()[2], days[time.getDate()[3]],
			time.getTime()[0], time.getTime()[1]);
	}

}