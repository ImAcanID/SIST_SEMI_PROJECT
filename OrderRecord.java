class OrderRecord
{
	// 주문 정보
	String def;   // 디폴트 메뉴 정보
	String kinds; // 빵인지 샐러드인지
	String cos;   // 커스텀 정보 (치즈, 야채, 소스) + 길이
	String side;  // 사이드 정보
	int getsu;    // 갯수
	int add;      // 추가 주문 정보
	
	void setDefault(int DefaultMenu.dmCategory)
	{
		int n = DefaultMenu.dmCategory;

		switch (n)
		{
			case 1 : this.def = "에그마요"; break;
			case 2 : this.def = "이탈리안 비엠티"; break;
			default : this.def = "서브웨이클럽"; break;
		}
	}

	
}