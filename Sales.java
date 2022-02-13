import java.util.ArrayList;

class Sales		// 판매 내역을 기록하는 클래스
{
	final int[] breadPrice = {4300, 5400, 5900};		// 메뉴 가격: 에그마요/이탈리안 비엠티/서브웨이클럽
	final int[] saladPrice = {6000, 7100, 7000};		// 메뉴 가격: 에그마요/이탈리안 비엠티/서브웨이클럽
	final int[] sidePrice = {1000,1000,1000,2900,4000}; // 메뉴 가격: 콜라/커피/쿠피/스프/맥주

	int numOfAgeDiscount;	// 나이 할인 적용 횟수	
	int usedPoint;			// 사람들이 사용한 포인트
													
	ArrayList<Integer[]> breadSales; // 0: 에그마요 / 1: 이탈리안 비엠티 / 2: 서브웨이클럽 정보를 담고 있음.
	ArrayList<Integer[]> saladSales; // 0: 에그마요 / 1: 이탈리안 비엠티 / 2: 서브웨이클럽 정보를 담고 있음.
	ArrayList<Integer[]> sideSales;	 //	0: 콜라 / 1: 커피 / 2: 쿠키 / 3.스프  /4.맥주 정보를 담고 있음.

	int total;	// 총 매출
	int[] breadList;	// 빵 종류별 매출		(0: 에그마요 / 1: 이탈리안 비엠티 / 2: 서브웨이클럽 / 3: 다 합친 것) 
	int[] saladList;	// 샐러드 종류별 매출	(0: 에그마요 / 1: 이탈리안 비엠티 / 2: 서브웨이클럽 / 3: 다 합친 것)
	int[] sideList;		// 사이드 종류별 매출	(0: 콜라 / 1: 커피 / 2: 쿠키 / 3.스프  /4.맥주 /5: 다 합친 것)

		
	Sales () //생성자.
	{
		breadList = new int [4]; //-- 빵 종류별 담고 이 배열의 크기는 변화x 
		saladList = new int [4];
		sideList = new int [6]; 
		
		for(int i=0; i<3; i++)
		{
			Integer[] temp1 = {breadPrice[i], 0, 0, 0};// { 개당 가격, 판매 갯수, 시간 할인 횟수, 길이 추가 횟수 }
			Integer[] temp2 = {saladPrice[i], 0, 0};// { 개당 가격, 판매 갯수, 시간 할인 횟수 }

			breadSales.add(temp1);
			saladSales.add(temp2);
		}

		for (int i = 0;i<5 ;i++ )
		{
			Integer[] temp3 = {sidePrice[i], 0}; // { 개당 가격, 판매 갯수 }

			sideSales.add(temp3);
		}
	}

	void recordSales(Order order)
	{
		recordBread(order.breadOrder);
		recordSalad(order.saladOrder);
		recordSide(order.sideOrder);
		recordAgeDiscount(order.ageDiscount);
		recordUsedPoint(order.usedPoint);

		calculateTotal();
	}
				
	// breadSales → 0: 에그마요 / 1: 이탈리안 비엠티 / 2: 서브웨이클럽   // 디폴트 메뉴
	// breadSales 내부 Integer[] 정보
	// { 개당 가격, 판매 갯수, 시간 할인 횟수, 길이 추가 횟수 }

	void recordBread(ArrayList<Integer []> arr)
	{
		for(Integer[] custom : arr)
		{
			Integer[] bread = breadSales.get(custom[0]);
			
			// 판매 갯수 누적시키는 것
			bread[1] += custom[1];

			// 시간 할인 적용 횟수
			bread[2] += (custom[3]*custom[1]);

			// 길이 추가 횟수
			bread[3] += (custom[4]*custom[1]);
		}
	}

	// saladSales → 0: 에그마요 / 1: 이탈리안 비엠티 / 2: 서브웨이클럽   // 디폴트 메뉴
	// saladSales 내부 Integer[] 정보
	// { 개당 가격, 판매 갯수, 시간 할인 횟수 }
	void recordSalad(ArrayList<Integer[]> arr)
	{
		for(Integer[] custom : arr)
		{
			Integer[] salad = saladSales.get(custom[0]);
			
			// 판매 갯수 누적시키는 것
			salad[1] += custom[1];

			// 시간 할인 적용 횟수
			salad[2] += (custom[3]*custom[1]);
		}
	}

	// sideSales →0: 콜라 / 1: 커피 / 2: 쿠키 / 3.스프  / 4.맥주 
	// sideSales 내부 Integer[] 정보
	// { 개당 가격, 판매 갯수 }
	void recordSide(ArrayList<Integer[]> arr)
	{
		for(Integer[] custom : arr)
		{
			Integer[] side = sideSales.get(custom[0]);
			
			// 판매 갯수 누적시키는 것
			side[1] += custom[1];
		}
	}
	
	// 나이 할인 적용된 횟수를 누적시키는 메소드
	void recordAgeDiscount(boolean ageDiscount)
	{
		if(ageDiscount)
			numOfAgeDiscount++;
	}

	// 손님들이 사용한 포인트를 누적시키는 메소드
	void recordUsedPoint(int point)
	{
		usedPoint += point;
	}
	
	// 판매 내역 업데이트. 얼마나 팔렸나 계산하는 메소드
	void calculateTotal()
	{
		int breadTotal = 0;	// 빵 디폴트 메뉴 별 매출을 다 합친 것을 담는 변수
		int saladTotal = 0;	// 샐러드 디폴트 메뉴 별 매출을 다 합친 것을 담는 변수
		int sideTotal = 0;	// 사이드 메뉴 별 매출을 다 합친 것을 담는 변수

		// 빵 계산
		for(int i=0; i<3; i++)
		{
			Integer[] temp = breadSales.get(i);	//breadSales → 0: 에그마요 / 1: 이탈리안 비엠티 / 2: 서브웨이클럽
			int sum = temp[0] * temp[1] - (main.TIME_DISCOUNT_MONEY)*temp[2] + (main.LONG_BREAD_MONEY)*temp[3];
						
			// breadSales 내부 Integer[] 정보
			// { 개당 가격, 판매 갯수, 시간 할인 횟수, 길이 추가 횟수 }

			breadList[i] += sum;
			breadTotal += sum;
		}

		// 샐러드 계산
		for(int i=0; i<3; i++)
		{
			Integer [] temp = saladSales.get(i); //saladSales → 0: 에그마요 / 1: 이탈리안 비엠티 / 2: 서브웨이클럽
			int sum = temp[0] * temp[1] - (main.TIME_DISCOUNT_MONEY)*temp[2];
						
			saladList[i] += sum;
			saladTotal += sum;
		}

		// 사이드 계산
		for(int i=0; i<5; i++)
		{
			Integer [] temp = sideSales.get(i); // //{1000,0} ,{1000,0} , {1000,0} , {2900,0}, {4000,0}
			int sum = temp[0] * temp[1];
						
			sideList[i] += sum;
			sideTotal += sum;
		}

		breadList[breadList.length-1] += breadTotal;		// 샌드위치 총 판매량
		saladList[saladList.length-1] += saladTotal;		// 샐러드 총 판매량
		sideList[sideList.length-1] += sideTotal;			// 사이드메뉴 총 판매량

		total = breadList[breadList.length-1] + saladList[saladList.length-1] + sideList[sideList.length-1]
			- (main.AGE_DISCOUNT_MONEY)*numOfAgeDiscount - usedPoint;	
		// 총 판매량 - 나이할인 적용 빼기 - 사용한 포인트
	}
	


	void print()
	{
		System.out.printf("%5s\t%8s\t%8s\t%8s\t%5s\n","빵","에그마요","이탈리아BMT", "서브웨이클럽", "총");
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%5d\n", "개수", 1, 2, 3, 6);
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%5d\n", "개수", 1, 2, 3, 6);
		System.out.println();
		System.out.printf("%5s\t%8s\t%8s\t%8s\t%5s\n","샐러드","에그마요","이탈리아BMT", "서브웨이클럽", "총");
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%5d\n", "개수", 3, 2, 1, 6);
		System.out.println();
		System.out.printf("%5s\t%8s\t%8s\t%8s\t%5s\n","사이드메뉴","콜라","맥주", "쿠키", "총");
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%5d\n", "개수", 2, 2, 2, 6);
		System.out.println();

		System.out.printf("%5s\t%8s\t%8s\t%8s\t%5s\n"," ","빵","샐러드", "사이드메뉴", "총");
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%5d\n", "매출", 3, 2, 1, 6);

	}

	/*
	int[] loavesOfBread = new int[3];
	int[] addLength = new int[3];
	int[] salads = new int[3];
	int[] sides = new int[3];
	
	void setBread(ArrayList<Bread> bread)
	{
		for(b : bread)
		{
			if( b.dmCategory.equals("bmt"))
			{
				loavesOfBread[0] += b.count;
				if(bLength == 30)
					addLength[0]++;
			}
			else if(b.dmCategory.equals("에그마요"))
			{
				loavesOfBread[1] += b.count;
				if(bLength == 30)
					addLength[1]++;
			}
			else
			{
				loavesOfBread[2] += b.count;
				if(bLength == 30)
					addLength[2]++;
			}
		}
	}
	void setSalad(ArrayList<Salad> salad)
	{
		for(s : salad)
		{
			if( s.dmCategory.equals("bmt") )
			{
				salads[0] += s.count;
			}
			else if(s.dmCategory.equals("에그마요"))
			{
				salads[1] += s.count;
			}
			else
			{
				salads[2] += s.count;
			}
		}
	}
	void setSide(ArrayList<Side> side)
	{
		for(s : side)
		{
			if( s.dmCategory.equals("맥주"))
			{
				sides[0] += s.count;
			}
			else if(s.dmCategory.equals("콜라"))
			{
				sides[1] += s.count;
			}
			else
			{
				sides[2] += s.count;
			}
		}
	}
	*/

	
	
}