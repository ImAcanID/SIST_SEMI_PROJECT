class Bill
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
	//People customer; // 현재 키오스크 이용 중인 고객에 대한 정보. 안 쓸 수도 있음.
	//Calendar time = 프로그램 시작 때 시간 정해서 넣어놓은거; // 미정

	Order order;
	
	Bill(Order order, int change, int cash, boolean cashOrCard, boolean timeDiscount, boolean ageDiscount, int watingTime, int totalPoint, int usedPoint)
	{
		this.order = order;
		this.change = change;
		this.cash = cash;
		this.cashOrCard = cashOrCard;
		this.timeDiscount = timeDiscount;
		this.ageDiscount = ageDiscount;
		this.watingTime = watingTime;
		this.totalPoint = totalPoint;
		this.usedPoint = usedPoint;
	}	

	print()
	{
		
		//(대충 영수증 양식따라서 출력함. 저거 위에 변수 다 출력)
		System.out.println("영수증 출력");
		
		System.out.println("주문 내역");
		for(int i=0; i<order.breadOrder.size(); i++)
		{
			System.out.print
		}

		
		ArrayList<Integer[]> breadOrder;
	ArrayList<Integer[]> saladOrder;
	ArrayList<Integer[]> sideOrder;

	Order()
	{
		breadOrder = new ArrayList<>();
		saladOrder = new ArrayList<>();
		sideOrder = new ArrayList<>();
	}
	
	// { 디폴트메뉴 종류, 갯수, 가격*갯수, 시간 할인 적용, 길이 추가 여부 }
	// 0: 디폴트메뉴 종류 → 0: BMT / 1: 에그마요 / 2: 클럽
	// 1: 갯수 → 갯수
	// 2: 가격* 갯수 → { 가격-(500*(시간 할인 적용 0 or 1)) + 길이 추가 요금 } * 갯수
	// 3: 시간 할인 적용 → 0: 미적용 / 1: 적용
	// 4: 길이 추가 여부 → 0: 15cm / 1: 30cm

	}
}