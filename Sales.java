import java.util.ArrayList;

class Sales
{
	final int[] breadPrice = {4300, 5400, 5900};
	final int[] saladPrice = {6000, 7100, 7000};
	final int[] sidePrice = {1000,1000,1000,2900,4000};

	int numOfAgeDiscount;
	int usedPoint;
													
	ArrayList<Integer[]> breadSales;    
	ArrayList<Integer[]> saladSales;
	ArrayList<Integer[]> sideSales;		

	int total;	// �� ����
	int[] breadList;	// �� ������ ����		(0: BMT / 1: ���׸��� / 2: Ŭ�� / 3: �� ��ģ ��) 
	int[] saladList;	// ������ ������ ����	(0: BMT / 1: ���׸��� / 2: Ŭ�� / 3: �� ��ģ ��)
	int[] sideList;		// ���̵� ������ ����	(0: �ݶ� / 1: ���� / 2: ��Ű / 3: �� ��ģ ��)
	
		
	Sales ()
	{
		for(int i=0; i<3; i++)
		{
			Integer[] temp1 = {breadPrice[i], 0, 0, 0};
			Integer[] temp2 = {saladPrice[i], 0, 0};
			Integer[] temp3 = {sidePrice[i], 0};

			breadSales.add(temp1);
			saladSales.add(temp2);
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
				
	// breadSales ��0: BMT / 1: ���׸��� / 2: Ŭ��   // ����Ʈ �޴�
	// breadSales ���� Integer[] ����
	// { ���� ����, �Ǹ� ����, �ð� ���� Ƚ��, ���� �߰� Ƚ�� }

	
	void recordBread(ArrayList<Integer> arr)
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

	// saladSales ��0: BMT / 1: ���׸��� / 2: Ŭ��   // ����Ʈ �޴�
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

	// sideSales ��0: �ݶ� / 1: ���� / 2: ��Ű  
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
		int breadTotal = 0;	// ����Ʈ�޴��� ������ �� ��ģ ���� ��� ����
		int saladTotal = 0;
		int sideTotal = 0;

		// �� ���
		for(int i=0; i<3; i++)
		{
			Integer[] temp = breadSales.get(i);	// breadSales ��0: BMT / 1: ���׸��� / 2: �������Ŭ��   // ����Ʈ �޴�
			int sum = temp[0] * temp[1] - (TIME_DISCOUNT_MONEY)*temp[2] + (LONG_BREAD_MONEY)*temp[3];
						
			// breadSales ���� Integer[] ����
			// { ���� ����, �Ǹ� ����, �ð� ���� Ƚ��, ���� �߰� Ƚ�� }

			breadList[i] += sum;
			breadTotal += sum;
		}

		// ������ ���
		for(int i=0; i<3; i++)
		{
			Integer temp = saladSales.get(i);
			int sum = temp[0] * temp[1] - (TIME_DISCOUNT_MONEY)*temp[2];
						
			saladList[i] += sum;
			saladTotal += sum;
		}

		// ���̵� ���
		for(int i=0; i<3; i++)
		{
			Integer temp = sideSales.get(i);
			int sum = temp[0] * temp[1];
						
			sideList[i] += sum;
			sideTotal += sum;
		}

		breadList[breadList.length-1] += breadTotal;		// ������ġ �� �Ǹŷ�
		saladList[saladList.length-1] += saladTotal;		// ������ �� �Ǹŷ�
		sideList[sideList.length-1] += sideTotal;			// ���̵�޴� �� �Ǹŷ�

		total = breadList[breadList.length-1] + saladList[saladList.length-1] + sideList[sideList.length-1]
			- (AGE_DISCOUNT_MONEY)*numOfAgeDiscount - usedPoint;
	}
	


	void print()
	{
		System.out.printf("%5s\t%8s\t%8s\t%8s\t%5s\n","��","���׸���","��Ż����BMT", "�������Ŭ��", "��");
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%5d\n", "����", 1, 2, 3, 6);
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%5d\n", "����", 1, 2, 3, 6);
		System.out.println();
		System.out.printf("%5s\t%8s\t%8s\t%8s\t%5s\n","������","���׸���","��Ż����BMT", "�������Ŭ��", "��");
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%5d\n", "����", 3, 2, 1, 6);
		System.out.println();
		System.out.printf("%5s\t%8s\t%8s\t%8s\t%5s\n","���̵�޴�","�ݶ�","����", "��Ű", "��");
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%5d\n", "����", 2, 2, 2, 6);
		System.out.println();

		System.out.printf("%5s\t%8s\t%8s\t%8s\t%5s\n"," ","��","������", "���̵�޴�", "��");
		System.out.printf("%5s\t%8d\t%8d\t%8d\t%5d\n", "����", 3, 2, 1, 6);

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
			else if(b.dmCategory.equals("���׸���"))
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
			else if(s.dmCategory.equals("���׸���"))
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
			if( s.dmCategory.equals("����"))
			{
				sides[0] += s.count;
			}
			else if(s.dmCategory.equals("�ݶ�"))
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