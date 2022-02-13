class Bill
{
	int beforeTotal;	// 할인 미적용 금액
	int total;			// 할인 적용 금액 (포인트 미적용)
	int totalMinusPoint;// 할인 적용 금액 (포인트 적용)
	int change;			// 거스름돈
	int cash;			// 현금 지불 금액
	boolean cashOrCard; // 현금지불할지 카드지불할지 카드면 true
	boolean ageDiscount;  // 나이 할인 적용 여부
	int watingTime;		// 대기 시간
	int totalPoint;		// 적립된 포인트
	int usedPoint;		// 사용한 포인트 
	
	EventTime time;

	Order order;
	
	Bill(Order order, int change, int cash, boolean cashOrCard, int watingTime, int totalPoint, int usedPoint)
	{
		this.order = order;
		this.change = change;
		this.cash = cash;
		this.cashOrCard = cashOrCard;
		this.watingTime = watingTime;
		this.totalPoint = totalPoint;
		this.usedPoint = usedPoint;
		
		this.beforeTotal = this.order.beforeTotal;
		this.total = this.order.total;
		this.totalMinusPoint = this.order.totalMinusPoint;
		
		this.time = main.time;
	}	

	void print()
	{
		
		// 대충 영수증 양식따라서 출력함. 저거 위에 변수 다 출력
		System.out.println("영수증 출력");
		
		System.out.println("주문 내역");
		for(int i=0; i<order.breadOrder.size(); i++)
		{
			System.out.print
		}

	}
	
	// { 디폴트메뉴 종류, 갯수, 가격*갯수, 시간 할인 적용, 길이 추가 여부 }
	// 0: 디폴트메뉴 종류 → 0: BMT / 1: 에그마요 / 2: 클럽
	// 1: 갯수 → 갯수
	// 2: 가격* 갯수 → { 가격-(500*(시간 할인 적용 0 or 1)) + 길이 추가 요금 } * 갯수
	// 3: 시간 할인 적용 → 0: 미적용 / 1: 적용
	// 4: 길이 추가 여부 → 0: 15cm / 1: 30cm

}