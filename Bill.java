class Bill
{	
	int beforeTotal;	// ���� ������ �ݾ�
	int beforePoint;	// ���� ���� �ݾ� (����Ʈ ������)
	int total;			// ���� ���� �ݾ� (����Ʈ ����)
	int change;			// �Ž�����
	int cash;			// ���� ���� �ݾ�
	boolean cashOrCard; // ������������ ī���������� ī��� true
	boolean ageDiscount;  // ���� ���� ���� ����
	int watingTime;		// ��� �ð�
	int totalPoint;		// ������ ����Ʈ
	int usedPoint;		// ����� ����Ʈ 
	boolean useMembership; // ����Ʈ ��� ����
	boolean saveMembership; // ����Ʈ ���� ����

	
	EventTime time;		// �̸� �����س��� �ð� ��ü

	Order order;		// �ֹ�����

	final String[] defaultName = {"���׸���", "��Ż���� ��Ƽ", "�������Ŭ��"};		
	final String[] sideName = {"�ݶ�", "Ŀ��", "��Ű", "����", "����"};
	final String[] days = {"��", "��", "ȭ", "��", "��", "��", "��"};
	
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
		
		// ���� ������ ��ĵ��� �����. ���� ���� ���� �� ���
		System.out.println("              ������ ���");
		System.out.println("===============�ֹ� ����===============\n");
		
		if(order.breadOrder.size() != 0)
		{
			System.out.println("================������ġ===============");
			for(int i=0; i<order.breadOrder.size(); i++)
			{
				Integer[] temp = order.breadOrder.get(i);
				System.out.printf("%s - %d��\t\t- %8d��\n", defaultName[temp[0]], temp[1], temp[2]);
				if(temp[3] == 1)
					System.out.println("  ��ġ ���� ����");
				if(temp[4] == 1)
					System.out.println("  �� ���� �߰� ����");
			}
			System.out.println();
		}
		
		if(order.saladOrder.size() != 0)
		{
			System.out.println("================������=================");
			for(int i=0; i<order.saladOrder.size(); i++)
			{
				Integer[] temp = order.saladOrder.get(i);
				System.out.printf("%s - %d��\t\t- %8d��\n", defaultName[temp[0]], temp[1], temp[2]);
				if(temp[3] == 1)
					System.out.println("  ��ġ ���� ����");
			}
			System.out.println();
		}
		
		if(order.sideOrder.size() != 0)
		{
			System.out.println("==============���̵� �޴�==============");
			for(int i=0; i<order.sideOrder.size(); i++)
			{
				Integer[] temp = order.sideOrder.get(i);
				System.out.printf("%s: %d��\t\t- %8d��\n", sideName[temp[0]], temp[1], temp[2]);
			}
		}
		System.out.println();		

		System.out.printf("���� �� �ݾ�\t\t- %8d��\n", beforeTotal);
		if(ageDiscount)
			System.out.printf("���� ���� ����\t\t -%8d��\n", main.AGE_DISCOUNT_MONEY);
		if(useMembership)
		{
			System.out.printf("����Ʈ ���\t\t- %8d��\n", usedPoint);
			System.out.printf("���� ����Ʈ\t\t- %8d��\n", totalPoint);
		}
		System.out.printf("���Ҽ���\t\t- %8s\n", cashOrCard ? "ī��" : "����");
		if(!cashOrCard)
		{
			System.out.printf("���� �ݾ�\t\t- %8d��\n", cash);
			System.out.printf("�Ž�����\t\t- %8d��\n", change);
		}
		System.out.printf("�� �ݾ�\t\t\t- %8d��\n", total);
		System.out.println();
		System.out.printf("���� ��� �ð� - %d��\n", watingTime);
		System.out.printf("%d-%d-%d-%s���� %d�� %d��\n\n", time.getDate()[0], time.getDate()[1], time.getDate()[2], days[time.getDate()[3]],
			time.getTime()[0], time.getTime()[1]);
	}

}