import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Payment
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
	String promotionSandwich = { bmt, ���׸���, Ŭ��, bmt, ���׸��� } // ���Ͽ� ���� ���θ�� ������ �޴� �޴� ���
	People customer; // ���� Ű����ũ �̿� ���� ���� ���� ����. �� �� ���� ����.
	Calendar time = ���α׷� ���� �� �ð� ���ؼ� �־������; // ����
	
		
	Payment()
	{
		timeDiscount = false;
		ageDiscount = false;

		print();
	}
	print()		// **** ���� ȭ�� ����
	{
		System.out.println("���ι����Ƿ���?(Y/N) : ");
		String yesDiscount = br.readLine();.toUpperCase(); 
		
		if (yesDiscount.equals("Y"))
		{
			discount();
		}

		System.out.println("����Ʈ ����ϽǷ���?(Y/N) : ");
		String yesPoint = br.readLine();.toUpperCase();
		
		if (yesPoint.equals("Y"))	// ����Ʈ ���� ����
		{
			usePoint();
		}

		calTotal();	// ���� ���

		savePoint();	// ����Ʈ ����

		System.out.print("���� �������� ���");

		choosePayment(); 
		printBill();
	}
	printBill()
	{
		Bill abc = new Bill();
		abc.setter(����, ����orī��, �Ž�����, ����Ÿ������, ��������, ������ ����Ʈ, ������ð�);
		abc.print();
	}

	choosePayment()	// ���� ���� ����
	{
		int tot = total; 

		System.out.printf("�����ؾ��Ͻ� �ݾ��� %d�Դϴ�.", tot);

		int n;
		do
		{
			System.out.printf("����? ī��? 0�Ǵ� 1: ");
			n = �Է°�
		}
		while (n�� 0�� �ƴϰų� 1�� �ƴ� ��);

		if(n == 1)
		{
			cashOrCard = true;(ī���� ��)
		}
		else
		{
			cashOrCard = false;(�����̶�� ��)
		}
		
		if(cashOrCard)
		{
			�Է����� 111������ ī�� ���ٰ� �ν�.
		}
		else
		{
			do
			{
				System.out.printf("���� �־��ּ���: ");
				cash = �Է°�;
			}
			while (cash<tot);
			
			change = cash - tot;
		}

	}
	
	discount() // ���ι����� ���� �˻�
	{
		//�ð� ��ȿ���˻�
		if (12<=time && time<=14)
		{
			timeDiscount = true;
			return; // if �� ����Ǹ� return���� �Ʒ� ���� ���ϰ� �ҷ��Դ� ������ �ٽ� ���ư�
			        // �ߺ����� �ȵǰ�..
		}

		System.out.println("������ �� �ڸ� �� ���� ��� ���� ����. ���ι�������?(Y/N) : ");
		String yesAgeDiscount = br.readLine();.toUpperCase();
		//char discountObject? = y or n;
		if (yesAgeDiscount.equals("Y"))
		{
			�ֹι�ȣ �Է¹ް� �ֹι�ȣ ��ȿ�� �˻�(�ߴ��� �ۿ;���) // TODO ���� �ʿ�.
			if(��ȿ�� �˻� true��)
				ageDiscount = true;
		}
		
	}

	usePoint()	// ����Ʈ ����� ���� �޼ҵ�
	{
		if (checkMembership())	// ����� �޼ҵ� ȣ��. (����� �ֳ� ���� üũ)
		{
			System.out.println("����Ʈ�� 1000�� �̻���� ��� �����մϴ�.");
			System.out.println("������ �ܿ� ����Ʈ�� : " + Customer.restPoint + " �Դϴ�"); // restPoint(�ܿ�����Ʈ) ���� �ܿ�����Ʈ�� �󸶳� ���Ҵ��� ������
			
			if(restPoint > 1000)
			{
				System.out.print("����Ʈ�� �󸶳� ����Ͻðڽ��ϱ�? : ");
				int wantToPoint = Integer.parseInt(br.readLine());
				//int n = �� ����Ʈ�� ���� (1000 < n < restPoint); //input �޾ƾ���
				uesdPoint = wantToPoint;
			}
			else
			{
				System.out.println("����Ʈ�� �����մϴ�.");
				return;
			}
		}
		
	}

	boolean checkMembership()
	{
		while(true)
		{
			
			//����� ��ȣ�� �Է¹ް��� �ִ��� ������ �˻�
			//(main�� ���� ���̵����� �̿�)
			System.out.print("����� ��ȣ�� �Է��ϼ��� : ");
			int memberNum = Integer.parseInt(br.readLine());

			// memberNum�� Customer�� ������,
			boolean isMembership;
			
			//����ʹ�ȣ �Է� >>> 4���� ����� ��ȣ�� �� ��ġ�ϴ��� �˻�.
			for(People p :���s ��ü)
			{
				isMembership = memberNum == p.����ʹ�ȣ;
				if(isMembership) �� = p;	//
			}

			if(!isMembership)
			{
				// return;

				�ٽ� �Է����ּ���. ������Է�
			}
			
			����� �ֵ� ���� �ϴ� ���;ߵǴµ�
			break;
		}
		return ������������� true, ������ false;
	}
	
	calTotal()	// ���� ���
	{		
		
		int tmpTotal = 0;			// ���� �ӽú���tmpTotal.       ��������� ����
		int tmpBeforeTotal = 0;		// ���� �ӽú���tmpBeforeTotal. ���� ���� �� ����

		for (�� s(*n) : �� ��ü)  
		{
			int tmp = 0;
			tmp += s.����Ʈ �޴���;
			if(������ == 30)
				tmp += s.�����̰�;
			
			calWatingTime(�� s);

						  //���� 1������  * n��
			tmpBeforeTotal += (tmp  * s.����);

			if(timeDiscount)
			{
				tmp -= 500;	
			}
			tmpTotal += (tmp * s.����)		
		}

		for (������ s(*n) : ������ ��ü )  
		{
			int tmp = 0;
			tmp += s.����Ʈ �޴���;
			
			tmpBeforeTotal += (tmp * s.����);
			
			calWatingTime(������ s);
			
			if(timeDiscount)
			{
				tmp -= 500;	
			}
			
			tmpTotal += (tmp*s.����)
		}

		for (���̵� s(*n) : ���̵� ��ü )
		{
			int tmp  = 0;
			tmp += s.���̵� ����;
			
			tmpBeforeTotal += (tmp*s.����);
			tmpTotal += (tmp*s.����);
		}

		if(ageDiscount)
		{
			tmpTotal - 500;
		}

		total = tmpTotal(���⼭ ����Ѱ�);
		beforeTotal = tmpBeforeTotal(���⼭ ����Ѱ�);
		
	}
	
	void calWatingTime(���� s)	// ���ð� ���
	{
		int time = 0; // �ʱ� ���ð� 0 �ʱ�ȭ
		if(������ ���������� �Ǻ�)
			//���̸�
			time = 3;
		else
			time = 4;

		switch (����Ʈ �޴�����..)
		{
			case bmt : time++;
					break;
			case ���׸���: time+=2;
					break
			default: break;
		} 

		time = time * s.����;

		
		waitingTime += time;	
	}
	
	

	savePoint() // ����Ʈ ���� �޼ҵ�
	{
		// ����. �Ƹ� main�� static ������? 0~6 
		if(���Ϲ�ȣ 1<= <=5)
		{
			String promotionMenu; // ���θ�� ������� �޴�
			switch (���Ϲ�ȣ)
			{
				case 1: promotionMenu = promotionSandwich[���Ϲ�ȣ-1]; break; 
				case 2:	promotionMenu = promotionSandwich[���Ϲ�ȣ-1]); break;
				...
			}
		}
		
		System.out.println("������� �ֳ�?");
		if(checkMembership()) // checkMembership �޼ҵ� ȣ���Ͽ� true / false �Ǻ�
		{
			for(�� s : �� ��ü) 
			{
				boolean cond = s.����Ʈ�޴�.equals(promotionMenu) // ������ ���θ�� �޴��� �ֹ��� ����Ʈ �޴��� ������� true.
				if(cond)
				{
					Customer.restPoint += (int)(s.���� * s.���� * 0.05); // ��.�ܿ�����Ʈ�� �ֹ��� (����*����*5%) ����
					System.out.printf("���� �� ���� ����Ʈ�� %d�Դϴ�.", Customer.restPoint);
				}
				else
				{
					System.out.println("���� ������ �޴��� �ƴմϴ�.");
				}
			}		
			
		}
		else
		{
			return;
		}
	}

}