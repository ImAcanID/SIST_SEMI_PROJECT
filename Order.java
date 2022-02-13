import java.util.ArrayList;

// �ֹ� ���� Ŭ����.
class Order
{
	final int[] breadPrice = {4300, 5400, 5900};
	final int[] saladPrice = {6000, 7100, 7000};
	final int[] sidePrice = {1000,1000,1000,2900,4000};

	boolean ageDiscount;  // ���� ���� ���� ����
	
	int beforePoint;	// ���� ���� �ݾ� (����Ʈ ������)
	int beforeTotal;	// ���� ������ �ݾ�
	int total;			// ���� ���� �ݾ� ( ����Ʈ ����)
	int usedPoint;		// ����� ����Ʈ 

	int waitingTime;	// ���� ��� �ð�

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
	// 0: ����Ʈ�޴� ���� �� 0: ���׸��� / 1: ��Ż���� ��Ƽ / 2: �������Ŭ��
	// 1: ���� �� ����
	// 2: ����* ���� �� { ����-(500*(�ð� ���� ���� 0 or 1)) + ���� �߰� ��� } * ����
	// 3: �ð� ���� ���� �� 0: ������ / 1: ����
	// 4: ���� �߰� ���� �� 0: 15cm / 1: 30cm
	void recordOrder(Bread b, boolean timeDiscount)
	{
		Integer[] temp = new Integer[5];
		
		// ����Ʈ �޴� ����
		if (b.bCategory.equals("���׸���"))
			temp[0] = 0;
		else if (b.bCategory.equals("��Ż���� ��Ƽ"))
			temp[0] = 1;
		else
			temp[0] = 2;
		
		// �� ���� �߰� ����
		if (b.bLength == 30)
			temp[4] = 1;
		
		// �ð� ���� ���� ����
		if(timeDiscount)
			temp[3] = 1;

		// ����
		temp[1] = b.bCount;
						
		// ����*����
		temp[2] = ( breadPrice[temp[0]] - (main.TIME_DISCOUNT_MONEY*temp[3]) + main.LONG_BREAD_MONEY*temp[4] ) * temp[1];

		// ���� ���� �� ���� ���ϱ�
		beforeTotal += ((breadPrice[temp[0]] + main.LONG_BREAD_MONEY*temp[4]) * temp[1]);

		// ���� ���� �� ���� ���ϱ�
		total += temp[2];

		// ���
		breadOrder.add(temp);
	}
	
	// { ����Ʈ�޴� ����, ����, ����*����, �ð� ���� ����, ���� �߰� ���� }
	// 0: ����Ʈ�޴� ���� �� 0: ���׸��� / 1: ��Ż���� ��Ƽ / 2: �������Ŭ��
	// 1: ���� �� ����
	// 2: ����* ���� �� { ����-(500*(�ð� ���� ���� 0 or 1)) + ���� �߰� ��� } * ����
	// 3: �ð� ���� ���� �� 0: ������ / 1: ����
	void recordOrder(Salad s, boolean timeDiscount)
	{
		Integer[] temp = new Integer[4];
		
		// ����Ʈ �޴� ����
		if (s.sCategory.equals("���׸���"))
			temp[0] = 0;
		else if (s.sCategory.equals("��Ż���� ��Ƽ"))
			temp[0] = 1;
		else
			temp[0] = 2;
						
		// �ð� ���� ���� ����
		if(timeDiscount)
			temp[3] = 1;

		// ����
		temp[1] = s.sCount;
						
		// ����*����
		temp[2] = ( saladPrice[temp[0]] - (main.TIME_DISCOUNT_MONEY*temp[3]) ) * temp[1];

		// ���� ���� �� ���� ���ϱ�
		beforeTotal += ( (saladPrice[temp[0]]) * temp[1]);

		// ���� ���� �� ���� ���ϱ�
		total += temp[2];

		// ���
		saladOrder.add(temp);
	}
	
	// { ����Ʈ�޴� ����, ����, ����*����, �ð� ���� ����, ���� �߰� ���� }
	// 0: ����Ʈ�޴� ���� �� 0: �ݶ� / 1: Ŀ�� / 2: ��Ű / 3: ���� / 4: ���� 
	// 1: ���� �� ����
	// 2: ����* ���� ��  ����* ����
	
	void recordOrder(SideMenu s)
	{
		Integer[] temp = new Integer[3];
		
		// ����Ʈ �޴� ����
		if (s.smCategory.equals("�ݶ�"))
			temp[0] = 0;
		else if (s.smCategory.equals("Ŀ��"))
			temp[0] = 1;
		else if (s.smCategory.equals("��Ű"))
			temp[0] = 2;
		else if (s.smCategory.equals("����"))
			temp[0] = 3;
		else
			temp[0] = 4;
		
		// ����
		temp[1] = s.smCount;
						
		// ����*����
		temp[2] = sidePrice[temp[0]] * temp[1];

		// ���� ���� �� ���� ���ϱ�		// ���̵�� ���� ������ ����.
		beforeTotal += temp[2];

		// ���� ���� �� ���� ���ϱ�
		total += temp[2];

		// ���
		sideOrder.add(temp);
	}

	void recordAgeDiscount(boolean ageDiscount)
	{
		ageDiscount = true;
		total -= main.AGE_DISCOUNT_MONEY;
	}

	void recordPoint(int point)
	{
		usedPoint = point;
		beforePoint = total;
		total -= point;
	}
}