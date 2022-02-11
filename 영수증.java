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
	People customer; // 현재 키오스크 이용 중인 고객에 대한 정보. 안 쓸 수도 있음.
	Calendar time = 프로그램 시작 때 시간 정해서 넣어놓은거; // 미정
	
	Bill()
	{
	}
	setterTotal(n) { this.total = n };
	setterCashOrCard(b) {this.cashOrCard = b};
	....
	

	print()
	{
		판매내역 setter();
		setBread();
		setSalad();

		(대충 영수증 양식따라서 출력함. 저거 위에 변수 다 출력)
		System.out.println()		
		........
	}
}