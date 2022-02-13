import java.util.ArrayList;

class Sales		// �Ǹ� ������ ����ϴ� Ŭ����
{
	final int[] breadPrice = {4300, 5400, 5900};		// �޴� ����: ���׸���/��Ż���� ��Ƽ/�������Ŭ��
	final int[] saladPrice = {6000, 7100, 7000};		// �޴� ����: ���׸���/��Ż���� ��Ƽ/�������Ŭ��
	final int[] sidePrice = {1000,1000,1000,2900,4000}; // �޴� ����: �ݶ�/Ŀ��/����/����/����

	int numOfAgeDiscount;	// ���� ���� ���� Ƚ��	
	int usedPoint;			// ������� ����� ����Ʈ
													
	ArrayList<Integer[]> breadSales; // 0: ���׸��� / 1: ��Ż���� ��Ƽ / 2: �������Ŭ�� ������ ��� ����.
	ArrayList<Integer[]> saladSales; // 0: ���׸��� / 1: ��Ż���� ��Ƽ / 2: �������Ŭ�� ������ ��� ����.
	ArrayList<Integer[]> sideSales;	 //	0: �ݶ� / 1: Ŀ�� / 2: ��Ű / 3.����  /4.���� ������ ��� ����.

	int total;	// �� ����
	int[] breadList;	// �� ������ ����		(0: ���׸��� / 1: ��Ż���� ��Ƽ / 2: �������Ŭ�� / 3: �� ��ģ ��) 
	int[] saladList;	// ������ ������ ����	(0: ���׸��� / 1: ��Ż���� ��Ƽ / 2: �������Ŭ�� / 3: �� ��ģ ��)
	int[] sideList;		// ���̵� ������ ����	(0: �ݶ� / 1: Ŀ�� / 2: ��Ű / 3.����  /4.���� /5: �� ��ģ ��)

	//Integer[] temp1;
	//Integer[] temp2;
	//Integer[] temp3;

		
	Sales () //������.
	{
		breadList = new int [4]; //-- �� ������ ��� �� �迭�� ũ��� ��ȭx 
		saladList = new int [4];
		sideList = new int [6]; 
		breadSales = new ArrayList<>();
		saladSales = new ArrayList<>();
		sideSales = new ArrayList<>();

		for(int i=0; i<3; i++)
		{
			Integer[] temp1 = {breadPrice[i], 0, 0, 0};// { ���� ����, �Ǹ� ����, �ð� ���� Ƚ��, ���� �߰� Ƚ�� }
			Integer[] temp2 = {saladPrice[i], 0, 0};// { ���� ����, �Ǹ� ����, �ð� ���� Ƚ�� }

			breadSales.add(temp1);  //breadSales.get(1)[1]breadSales = new ArrayList<>();
			saladSales.add(temp2);
		}

		for (int i = 0;i<5 ;i++ )
		{
			Integer[] temp3 = {sidePrice[i], 0}; // { ���� ����, �Ǹ� ���� }

			sideSales.add(temp3);
		}
	}

	public void recordSales(Order order)
	{
		recordBread(order.breadOrder);
		recordSalad(order.saladOrder);
		recordSide(order.sideOrder);
		recordAgeDiscount(order.ageDiscount);
		recordUsedPoint(order.usedPoint);

		calculateTotal();
	}
				
	// breadSales �� 0: ���׸��� / 1: ��Ż���� ��Ƽ / 2: �������Ŭ��   // ����Ʈ �޴�
	// breadSales ���� Integer[] ����
	// { ���� ����, �Ǹ� ����, �ð� ���� Ƚ��, ���� �߰� Ƚ�� }

	void recordBread(ArrayList<Integer []> arr)
	{
		for(Integer[] custom : arr)
		{
			Integer[] bread = breadSales.get(custom[0]);
			
			// �Ǹ� ���� ������Ű�� ��
			bread[1] += custom[1];

			// �ð� ���� ���� Ƚ��
			bread[2] += (custom[3]*custom[1]);

			// ���� �߰� Ƚ��
			bread[3] += (custom[4]*custom[1]);
		}
	}

	// saladSales �� 0: ���׸��� / 1: ��Ż���� ��Ƽ / 2: �������Ŭ��   // ����Ʈ �޴�
	// saladSales ���� Integer[] ����
	// { ���� ����, �Ǹ� ����, �ð� ���� Ƚ�� }
	void recordSalad(ArrayList<Integer[]> arr)
	{
		for(Integer[] custom : arr)
		{
			Integer[] salad = saladSales.get(custom[0]);
			
			// �Ǹ� ���� ������Ű�� ��
			salad[1] += custom[1];

			// �ð� ���� ���� Ƚ��
			salad[2] += (custom[3]*custom[1]);
		}
	}

	// sideSales ��0: �ݶ� / 1: Ŀ�� / 2: ��Ű / 3.����  / 4.���� 
	// sideSales ���� Integer[] ����
	// { ���� ����, �Ǹ� ���� }
	void recordSide(ArrayList<Integer[]> arr)
	{
		for(Integer[] custom : arr)
		{
			Integer[] side = sideSales.get(custom[0]);
			
			// �Ǹ� ���� ������Ű�� ��
			side[1] += custom[1];
		}
	}
	
	// ���� ���� ����� Ƚ���� ������Ű�� �޼ҵ�
	void recordAgeDiscount(boolean ageDiscount)
	{
		if(ageDiscount)
			numOfAgeDiscount++;
	}

	// �մԵ��� ����� ����Ʈ�� ������Ű�� �޼ҵ�
	void recordUsedPoint(int point)
	{
		usedPoint += point;
	}
	
	// �Ǹ� ���� ������Ʈ. �󸶳� �ȷȳ� ����ϴ� �޼ҵ�
	void calculateTotal()
	{
		int breadTotal = 0;	// �� ����Ʈ �޴� �� ������ �� ��ģ ���� ��� ����
		int saladTotal = 0;	// ������ ����Ʈ �޴� �� ������ �� ��ģ ���� ��� ����
		int sideTotal = 0;	// ���̵� �޴� �� ������ �� ��ģ ���� ��� ����

		// �� ���
		for(int i=0; i<3; i++)
		{
			Integer[] temp = breadSales.get(i);	//breadSales �� 0: ���׸��� / 1: ��Ż���� ��Ƽ / 2: �������Ŭ��
			//temp = {����, ����, �ð�����.. }
			int sum = temp[0] * temp[1] - (main.TIME_DISCOUNT_MONEY)*temp[2] + (main.LONG_BREAD_MONEY)*temp[3];
						
			// breadSales ���� Integer[] ����
			// { ���� ����, �Ǹ� ����, �ð� ���� Ƚ��, ���� �߰� Ƚ�� }

			breadList[i] += sum;
			breadTotal += sum;
		}

		// ������ ���
		for(int i=0; i<3; i++)
		{
			Integer [] temp = saladSales.get(i); //saladSales �� 0: ���׸��� / 1: ��Ż���� ��Ƽ / 2: �������Ŭ��
			int sum = temp[0] * temp[1] - (main.TIME_DISCOUNT_MONEY)*temp[2];
						
			saladList[i] += sum;
			saladTotal += sum;
		}

		// ���̵� ���
		for(int i=0; i<5; i++)
		{
			Integer [] temp = sideSales.get(i); // //{1000,0} ,{1000,0} , {1000,0} , {2900,0}, {4000,0}
			int sum = temp[0] * temp[1];
						
			sideList[i] += sum;
			sideTotal += sum;
		}

		breadList[breadList.length-1] += breadTotal;		// ������ġ �� �Ǹŷ�
		saladList[saladList.length-1] += saladTotal;		// ������ �� �Ǹŷ�
		sideList[sideList.length-1] += sideTotal;			// ���̵�޴� �� �Ǹŷ�

		total = breadList[breadList.length-1] + saladList[saladList.length-1] + sideList[sideList.length-1]
			- (main.AGE_DISCOUNT_MONEY)*numOfAgeDiscount - usedPoint;	
		// �� �Ǹŷ� - �������� ���� ���� - ����� ����Ʈ
	}
	


	void print()
	{
		int totBread =0;
		int totSalad=0;//saladSales;
		int totSide=0;//sideSales;
		int sum = totBread + totSalad + totSide;
		for (int i = 0 ;i<3 ;i++ )
		{
			totBread += breadSales.get(i)[1];
		}
		for (int i = 0 ;i<3 ;i++ )
		{
			 totSalad += saladSales.get(i)[1];
		}
		for (int i = 0 ;i<5 ;i++ )
		{
			totSide +=sideSales.get(i)[1];
		}

		
		//breadSales.get(0).temp[1]
		System.out.printf("%5s\t%8s\t%8s\t%8s\t%5s\n","��","���׸���","��Ż���� ��Ƽ", "�������Ŭ��", "��");
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%5d\n", "����",breadSales.get(0)[1], breadSales.get(1)[1], breadSales.get(2)[1],totBread);
		System.out.println();
		System.out.printf("%5s%8s\t%8s\t%8s\t%5s\n","������","���׸���","��Ż���� ��Ƽ", "�������Ŭ��", "��");
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%5d\n", "����",saladSales.get(0)[1],saladSales.get(1)[1],saladSales.get(2)[1],totSalad);
		System.out.println();
		//�ݶ�/Ŀ��/����/����/����
		System.out.printf("%5s%7s\t%7s\t%8s\t%8s\t%8s\t%5s\n","���̵�޴�","�ݶ�","Ŀ��","��Ű","����","����", "��");
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%8d\t%8d\t%5d\n", "����",sideSales.get(0)[1],sideSales.get(1)[1],sideSales.get(2)[1],sideSales.get(3)[1],
			sideSales.get(4)[1],totSide);
		System.out.println();
		System.out.printf("%5s\t%8s\t%8s\t%8s\t%5s\n", " ", "��","������", "���̵�޴�", "��");
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%5d\n", "����",totBread,totSalad,totSide,sum);

	}	
	
}