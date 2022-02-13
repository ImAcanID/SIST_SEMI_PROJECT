import java.util.ArrayList;

// 주문 내역 클래스.
class Order
{
	final int[] breadPrice = {4300, 5400, 5900};
	final int[] saladPrice = {6000, 7100, 7000};
	final int[] sidePrice = {1000,1000,1000,2900,4000};

	boolean ageDiscount;  // 나이 할인 적용 여부
	
	int total;			// 할인 적용 금액 (포인트 미적용)
	int beforeTotal;	// 할인 미적용 금액
	int totalMinusPoint;// 할인 적용 금액 ( 포인트 적용)
	int usedPoint;		// 사용한 포인트 

	int waitingTime;	// 예상 대기 시간

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
	// 0: 디폴트메뉴 종류 → 0: 에그마요 / 1: 이탈리아 비엠티 / 2: 서브웨이클럽
	// 1: 갯수 → 갯수
	// 2: 가격* 갯수 → { 가격-(500*(시간 할인 적용 0 or 1)) + 길이 추가 요금 } * 갯수
	// 3: 시간 할인 적용 → 0: 미적용 / 1: 적용
	// 4: 길이 추가 여부 → 0: 15cm / 1: 30cm
	void recordOrder(Bread b, boolean timeDiscount)
	{
		Integer[] temp = new Integer[5];
		
		// 디폴트 메뉴 설정
		if (b.bCategory.equals("에그마요"))
			temp[0] = 0;
		else if (b.bCategory.equals("이탈리아 비엠티"))
			temp[0] = 1;
		else
			temp[0] = 2;
		
		// 빵 길이 추가 여부
		if (b.bLength == 30)
			temp[4] = 1;
		
		// 시간 할인 적용 여부
		if(timeDiscount)
			temp[3] = 1;

		// 갯수
		temp[1] = b.bCount;
						
		// 가격*갯수
		temp[2] = ( breadPrice[temp[0]] - (500*temp[3]) + 500*temp[4] ) * temp[1];

		// 할인 적용 전 가격 더하기
		beforeTotal += ((breadPrice[temp[0]] + 500*temp[4]) * temp[1]);

		// 할인 적용 후 가격 더하기
		total += temp[2];

		// 기록
		breadOrder.add(temp);
	}
	
	// { 디폴트메뉴 종류, 갯수, 가격*갯수, 시간 할인 적용, 길이 추가 여부 }
	// 0: 디폴트메뉴 종류 → 0: 에그마요 / 1: 이탈리아 비엠티 / 2: 서브웨이클럽
	// 1: 갯수 → 갯수
	// 2: 가격* 갯수 → { 가격-(500*(시간 할인 적용 0 or 1)) + 길이 추가 요금 } * 갯수
	// 3: 시간 할인 적용 → 0: 미적용 / 1: 적용
	void recordOrder(Salad s, boolean timeDiscount)
	{
		Integer[] temp = new Integer[4];
		
		// 디폴트 메뉴 설정
		if (s.sCategory.equals("에그마요"))
			temp[0] = 0;
		else if (s.sCategory.equals("이탈리아 비엠티"))
			temp[0] = 1;
		else
			temp[0] = 2;
						
		// 시간 할인 적용 여부
		if(timeDiscount)
			temp[3] = 1;

		// 갯수
		temp[1] = s.sCount;
						
		// 가격*갯수
		temp[2] = ( saladPrice[temp[0]] - (500*temp[3]) ) * temp[1];

		// 할인 적용 전 가격 더하기
		beforeTotal += ( (saladPrice[temp[0]]) * temp[1]);

		// 할인 적용 후 가격 더하기
		total += temp[2];

		// 기록
		saladOrder.add(temp);
	}
	
	// { 디폴트메뉴 종류, 갯수, 가격*갯수, 시간 할인 적용, 길이 추가 여부 }
	// 0: 디폴트메뉴 종류 → 0: 콜라 / 1: 커피 / 2: 쿠키 / 3: 스프 / 4: 맥주 
	// 1: 갯수 → 갯수
	// 2: 가격* 갯수 →  가격* 갯수
	
	void recordOrder(Side s)
	{
		Integer[] temp = new Integer[3];
		
		// 디폴트 메뉴 설정
		if (s.smCategory.equals("콜라"))
			temp[0] = 0;
		else if (s.smCategory.equals("커피"))
			temp[0] = 1;
		else if (s.smCategory.equals("쿠키"))
			temp[0] = 2;
		else if (s.smCategory.equals("스프"))
			temp[0] = 3;
		else
			temp[0] = 4;
		
		// 갯수
		temp[1] = s.count;
						
		// 가격*갯수
		temp[2] = sidePrice[temp[0]] * temp[1];

		// 할인 적용 전 가격 더하기		// 사이드는 할인 적용이 없다.
		beforeTotal += temp[2];

		// 할인 적용 후 가격 더하기
		total += temp[2];

		// 기록
		sideOrder.add(temp);
	}

	void recordAgeDiscount(boolean ageDiscount)
	{
		ageDiscount = true;
		total -= 500;
	}

	void recordPoint(int point)
	{
		usedPoint = point;
		totalMinusPoint = total - point;
	}
}