class Bill
{
	int total;			// ���� ���� �ݾ�
	int beforeTotal;	// ���� ������ �ݾ�
	int change;			// �Ž�����
	int cash;			// ���� ���� �ݾ�
	boolean cashOrCard; // ������������ ī���������� ī��� true
	boolean timeDiscount; // �ð� ���� ���� ����
	boolean ageDiscount;  // ���� ���� ���� ����
	int watingTime;		// ��� �ð�
	int totalPoint;		// ������ ����Ʈ
	int usedPoint;		// ����� ����Ʈ 
	//People customer; // ���� Ű����ũ �̿� ���� ������ ���� ����. �� �� ���� ����.
	//Calendar time = ���α׷� ���� �� �ð� ���ؼ� �־������; // ����

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
		
		//(���� ������ ��ĵ��� �����. ���� ���� ���� �� ���)
		System.out.println("������ ���");
		
		System.out.println("�ֹ� ����");
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
	
	// { ����Ʈ�޴� ����, ����, ����*����, �ð� ���� ����, ���� �߰� ���� }
	// 0: ����Ʈ�޴� ���� �� 0: BMT / 1: ���׸��� / 2: Ŭ��
	// 1: ���� �� ����
	// 2: ����* ���� �� { ����-(500*(�ð� ���� ���� 0 or 1)) + ���� �߰� ��� } * ����
	// 3: �ð� ���� ���� �� 0: ������ / 1: ����
	// 4: ���� �߰� ���� �� 0: 15cm / 1: 30cm

	}
}