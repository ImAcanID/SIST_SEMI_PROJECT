class Bill
{
	int beforeTotal;	// ���� ������ �ݾ�
	int total;			// ���� ���� �ݾ� (����Ʈ ������)
	int totalMinusPoint;// ���� ���� �ݾ� (����Ʈ ����)
	int change;			// �Ž�����
	int cash;			// ���� ���� �ݾ�
	boolean cashOrCard; // ������������ ī���������� ī��� true
	boolean ageDiscount;  // ���� ���� ���� ����
	int watingTime;		// ��� �ð�
	int totalPoint;		// ������ ����Ʈ
	int usedPoint;		// ����� ����Ʈ 
	
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
		
		// ���� ������ ��ĵ��� �����. ���� ���� ���� �� ���
		System.out.println("������ ���");
		
		System.out.println("�ֹ� ����");
		for(int i=0; i<order.breadOrder.size(); i++)
		{
			System.out.print
		}

	}
	
	// { ����Ʈ�޴� ����, ����, ����*����, �ð� ���� ����, ���� �߰� ���� }
	// 0: ����Ʈ�޴� ���� �� 0: BMT / 1: ���׸��� / 2: Ŭ��
	// 1: ���� �� ����
	// 2: ����* ���� �� { ����-(500*(�ð� ���� ���� 0 or 1)) + ���� �߰� ��� } * ����
	// 3: �ð� ���� ���� �� 0: ������ / 1: ����
	// 4: ���� �߰� ���� �� 0: 15cm / 1: 30cm

}