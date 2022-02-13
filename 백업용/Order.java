import java.util.ArrayList;

// �ֹ� ���� Ŭ����.
class Order
{
	final int[] breadPrice = {4500, 5500, 6000};
	final int[] saladPrice = {5500, 6500, 7000};
	final int[] sidePrice = {1000, 2000, 2500};

	boolean ageDiscount;  // ���� ���� ���� ����
	
	int total;			// ���� ���� �ݾ� (����Ʈ ������)
	int beforeTotal;	// ���� ������ �ݾ�
	int totalMinusPoint;// ���� ���� �ݾ� ( ����Ʈ ����)
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
	// 0: ����Ʈ�޴� ���� �� 0: BMT / 1: ���׸��� / 2: Ŭ��
	// 1: ���� �� ����
	// 2: ����* ���� �� { ����-(500*(�ð� ���� ���� 0 or 1)) + ���� �߰� ��� } * ����
	// 3: �ð� ���� ���� �� 0: ������ / 1: ����
	// 4: ���� �߰� ���� �� 0: 15cm / 1: 30cm
	void recordOrder(Bread b, boolean timeDiscount)
	{
		Integer[] temp = new Integer[5];
		
		// ����Ʈ �޴� ����
		if (b.bCategory.equals("BMT"))
			temp[0] = 0;
		else if (b.bCategory.equals("���׸���"))
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
		temp[1] = b.count;
						
		// ����*����
		temp[2] = ( breadPrice[temp[0]] - (500*temp[3]) + 500*temp[4] ) * temp[1];

		// ���� ���� �� ���� ���ϱ�
		beforeTotal += ((breadPrice[temp[0]] + 500*temp[4]) * temp[1]);

		// ���� ���� �� ���� ���ϱ�
		total += temp[2];

		// ���
		breadOrder.add(temp);
	}
	
	// { ����Ʈ�޴� ����, ����, ����*����, �ð� ���� ����, ���� �߰� ���� }
	// 0: ����Ʈ�޴� ���� �� 0: BMT / 1: ���׸��� / 2: Ŭ��
	// 1: ���� �� ����
	// 2: ����* ���� �� { ����-(500*(�ð� ���� ���� 0 or 1)) + ���� �߰� ��� } * ����
	// 3: �ð� ���� ���� �� 0: ������ / 1: ����
	void recordOrder(Salad s, boolean timeDiscount)
	{
		Integer[] temp = new Integer[4];
		
		// ����Ʈ �޴� ����
		if (s.sCategory.equals("BMT"))
			temp[0] = 0;
		else if (s.sCategory.equals("���׸���"))
			temp[0] = 1;
		else
			temp[0] = 2;
						
		// �ð� ���� ���� ����
		if(timeDiscount)
			temp[3] = 1;

		// ����
		temp[1] = s.count;
						
		// ����*����
		temp[2] = ( saladPrice[temp[0]] - (500*temp[3]) ) * temp[1];

		// ���� ���� �� ���� ���ϱ�
		beforeTotal += ( (saladPrice[temp[0]]) * temp[1]);

		// ���� ���� �� ���� ���ϱ�
		total += temp[2];

		// ���
		saladOrder.add(temp);
	}
	
	// { ����Ʈ�޴� ����, ����, ����*����, �ð� ���� ����, ���� �߰� ���� }
	// 0: ����Ʈ�޴� ���� �� 0: �ݶ� / 1: ���� / 2: ��Ű
	// 1: ���� �� ����
	// 2: ����* ���� ��  ����* ����
	
	void recordOrder(Side s)
	{
		Integer[] temp = new Integer[3];
		
		// ����Ʈ �޴� ����
		if (s.sCategory.equals("�ݶ�"))
			temp[0] = 0;
		else if (s.sCategory.equals("����"))
			temp[0] = 1;
		else
			temp[0] = 2;
		
		// ����
		temp[1] = s.count;
						
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
		total -= 500;
	}

	void recordPoint(int point)
	{
		usedPoint = point;
		totalMinusPoint = total - point;
	}
}