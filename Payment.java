import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;
import java.util.Random;


class Payment
{
	int total;			// ���� ���� �ݾ�
	int beforeTotal;	// ���� ������ �ݾ�
	int change;			// �Ž�����
	int cash;			// ���� ���� �ݾ�
	boolean cashOrCard; // ������������ ī���������� ī��� true
	boolean timeDiscount; // �ð� ���� ���� ����
	boolean ageDiscount;  // ���� ���� ���� ����
	int waitingTime;		// ��� �ð�
	int totalPoint;		// ������ ����Ʈ
	int usedPoint;		// ����� ����Ʈ 

	int customerNumber;

	String[] promotionSandwich = { "���׸���", "��Ż���� ��Ƽ", "�������Ŭ��",
		"���׸���", "��Ż���� ��Ƽ", "�������Ŭ��", "���׸���"}; // ���Ͽ� ���� ���θ�� ������ �޴� �޴� ���
	
	ArrayList<Bread> breadArray;  // �� ��ü 
	ArrayList<Salad> saladArray;  // ������ ��ü
	ArrayList<SideMenu> sideArray;  // ���̵�޴� ��ü
	
	Order order;	// �ֹ�����
	
	public void payment(ArrayList<Bread> breadArray, ArrayList<Salad> saladArray, ArrayList<SideMenu> sideArray)
	{
		timeDiscount = false;
		ageDiscount = false;

		this.breadArray = breadArray;
		this.salasArray = saladArray;
		this.sideArray = sideArray;
		order = new Order();

		print();
	}
	public void print()	throws IOException	// **** ���� ȭ�� ����
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���ι����Ƿ���?(Y/N) : ");
		String yesDiscount = br.readLine().toUpperCase(); 
		
		if (yesDiscount.equals("Y"))
		{
			discount();
		}

		System.out.println("����Ʈ ����ϽǷ���?(Y/N) : ");
		String yesPoint = br.readLine().toUpperCase();
		
		if (yesPoint.equals("Y"))	// ����Ʈ ��� ����
		{
			usePoint();
		}

		calTotal();	// ���� ���

		savePoint();	// ����Ʈ ����

		System.out.print("���� �������� ���");

		choosePayment();	// ���� ���� ���� �� ����

		sales.recordSales(order);	// �Ǹ� ���� ���

		printBill();	// ������ ���
	}
	public void printBill()
	{
		Bill abc = new Bill(total, beforeTotal, change, cash, cashOrCard, timeDiscount, ageDiscount, waitingTime, totalPoint, usedPoint);
		//abc.setter(total, beforeTotal, change, cash, cashOrCard, timeDiscount, ageDiscount, watingTime, totalPoint, usedPoint); //setter�� �ѱ�°�
		abc.print();
	}

	public void choosePayment() throws IOException	// ���� ���� ����
	{
		int tot = order.total; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.printf("�����ؾ��Ͻ� �ݾ��� %d�Դϴ�.", tot);
		
		int n;
		do
		{
			System.out.printf("�����̸� 0, ī��� 1�� �Է����ּ���. : ");
			n = Integer.parseInt(br.readLine()); // �������� ī������ �����ϴ� ����
		}
		while (n<0 || n>1);

		if(n == 1)
		{						// cashOfCard�� �����̳� ī��ĸ� ���ϴ� ����. 
			cashOrCard = true;  // ī���� ��
		}
		else
		{
			cashOrCard = false;  // �����̶�� ��
		}
		
		if(cashOrCard)
		{
			//�Է����� 123������ ī�� ���ٰ� �ν�.
			System.out.print("�ſ�ī�带 ���Ա��� �־��ּ���. : ");
			int in = Integer.parseInt(br.readLine());
			if (in == 123)
			{
				System.out.println("������ �Ϸ�Ǿ����ϴ�.");
			}
		}
		else
		{
			do
			{
				System.out.printf("������ �־��ּ���: ");
				int inCash = Integer.parseInt(br.readLine());
				cash = inCash;
			}
			while (cash<tot);    
			
			change = cash - tot; // change�� �Ž�����
			System.out.println("�Ž������� " + change + "�� �Դϴ�.");
		}
	}
	
	public void discount() throws IOException //  ���ι����� ���� �˻�
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int randomTime = time.getTime()[0];	// ���� '��' �̾ƿ�

		//�ð� ��ȿ���˻�
		if (12<=randomTime && randomTime<=14)
		{
			timeDiscount = true;
			return; // if �� ����Ǹ� return���� �Ʒ� ���� ���ϰ� �ҷ��Դ� ������ �ٽ� ���ư�
			        // �ߺ����� �ȵǰ�..
		}

		System.out.println("������ ���� �� �ڸ��� " + randomTime +"�� �� ��� ���� ����. ������ �����ðڽ��ϱ�?(Y/N) : ");
		String yesAgeDiscount = br.readLine().toUpperCase();
		//char discountObject? = y or n;
		if (yesAgeDiscount.equals("Y"))
		{
			birth();  // ���� ��ȿ���˻� Ŭ���� birth()�޼ҵ� ȣ��. 
		}
		
	}

	public void usePoint() throws IOException	// ����Ʈ ����� ���� �޼ҵ�
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (checkMembership())	// ����� �޼ҵ� ȣ��. (����� �ֳ� ���� üũ)
		{
			System.out.println("����Ʈ�� 1000�� �̻���� ��� �����մϴ�.");
			System.out.println("������ �ܿ� ����Ʈ�� : " + ct.point + " �Դϴ�"); // point(�ܿ�����Ʈ).. ���� �ܿ�����Ʈ�� �󸶳� ���Ҵ��� ������
			
			if(main.ct.point > 1000)
			{
				System.out.print("����Ʈ�� �󸶳� ����Ͻðڽ��ϱ�? : ");
				int wantToPoint = Integer.parseInt(br.readLine());				
				usedPoint = wantToPoint;
			}
			else
			{
				System.out.println("����Ʈ�� �����մϴ�.");
				return;
			}
		}
	}

	boolean checkMembership() throws IOException
	{
		while(true)
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			//����� ��ȣ�� �Է¹ް��� �ִ��� ������ �˻�
			//(main�� ���� ���̵����� �̿�)
			System.out.print("����� ��ȣ�� �Է��ϼ��� : ");
			int memberNum = Integer.parseInt(br.readLine());

			// memberNum�� Customer�� ������,
			boolean isMembership;
			
			//����ʹ�ȣ �Է� >>> 4���� ����� ��ȣ�� �� ��ġ�ϴ��� �˻�.
			for(Customer c : ct) // main.ct �� main�ȿ� Customer ct�� �ϳ��� �ҷ����鼭 �˻�
			{
				isMembership = (memberNum == ct.memberNumber); // �Է¹��� ����� ��ȣ�� ���̵������� �������ȣ�� ��ġ�ϴ��� Ȯ��.
				                                             // ��ġ�ϸ� isMembership = true
				if(isMembership)
					System.out.println("������� Ȯ�εǾ����ϴ�");
			}

			if(!isMembership)
			{
				return false;
			}
			// while true�� ������ ����� �ֵ� ���� �ϴ� ���;��ؼ� break;
			break;
		}
		return isMembership;
	}
	
	public void calTotal()	// ���� ���
	{	
		for (Bread b: breadArray)
		{
			order.recordOrder(b, timeDiscount);
			calWatingTime(b);	// ������ġ ���� ��� �ð� ���
		}

		for (Salad s: saladArray)
		{
			order.recordOrder(s, timeDiscount);
			calWatingTime(s);	// ������ ���� ��� �ð� ���
		}

		for (Side sd: sideArray)
		{
			order.recordOrder(sd);
		}

		order.recordAgeDiscount(ageDiscount);
		order.recordPoint(usedPoint);
		
		order.waitingTime = waitingTime;

		/*
		int tmpTotal = 0;			// ���� �ӽú���tmpTotal.       ��������� ����
		int tmpBeforeTotal = 0;		// ���� �ӽú���tmpBeforeTotal. ���� ���� �� ����

		

		for (Bread b : breadArray)  // ��1 �ҷ���
		{
					
			int tmp = 0;			// ���� �ӽ� ����
			tmp += b.bPrice;
			
			if(b.bLength == 30)
				tmp += b.bLength;
			
			calWatingTime(b);  // �� b

						  //���� 1������  * n��
			tmpBeforeTotal += (tmp  *  s.���� );
			
			if(timeDiscount)
			{
				tmp -= 500;	
			}
			tmpTotal += (tmp * s.����)		
		}

		for (Salad s : SaladArray)  
		{
			int tmp = 0;
			tmp += s.bPrice;
			
			tmpBeforeTotal += (tmp * s.����);
			
			calWatingTime(s); // ������ s
			
			if(timeDiscount)
			{
				tmp -= 500;	
			}
			
			tmpTotal += (tmp*s.����)
		}

		for (Side sd : SideArray)
		{
			int tmp  = 0;
			tmp += sd.bPrice;
			
			tmpBeforeTotal += (tmp*s.����);
			tmpTotal += (tmp*s.����);
		}

		if(ageDiscount)     //ageDiscount
		{
			tmpTotal - 500;
		}

		total = tmpTotal//(���⼭ ����Ѱ�);
		beforeTotal = tmpBeforeTotal//(���⼭ ����Ѱ�);
		*/
		
	}

	
	public void calWatingTime(���� s)	// ���ð� ���
	{
		int earlyTime = 0; // �ʱ� ���ð��� 0���� �ʱ�ȭ
		if(������ ���������� �Ǻ�)
			//���̸�
			earlyTime = 3;
		else
			earlyTime = 4;

		switch (����Ʈ �޴��� ����)
		{
			case bmt : earlyTime++;
					break;
			case ���׸���: earlyTime+=2;
					break;
			default: break;
		} 

		earlyTime = earlyTime *  1/*s.����*/;

		
		waitingTime += earlyTime;	
	}
	
	

	public void savePoint() // ����Ʈ ���� �޼ҵ�
	{
		int randomDay = main.time.getDate[3];

		if(1 <= randomDay && randomDay <= 5) //main.time.day
		{
			String promotionMenu; // ���θ�� ������� �޴�
			switch (randomDay)
			{
				case 1: promotionMenu = promotionSandwich[randomDay-1]; break; 
				case 2:	promotionMenu = promotionSandwich[randomDay-2]; break;
				case 3: promotionMenu = promotionSandwich[randomDay-3]; break;
				case 4: promotionMenu = promotionSandwich[randomDay-4]; break;
				case 5: promotionMenu = promotionSandwich[randomDay-5]; break;
			}
		}
		
		System.out.println("������� �ֳ�?");
		if(checkMembership()) // checkMembership �޼ҵ� ȣ���Ͽ� true / false �Ǻ�
		{
			for(Bread b : breadArray) // �� ��ü�� �ϳ��� �޾ƿͼ�..
			{
				boolean cond = b.bCategory.equals(promotionMenu); // ������ ���θ�� �޴��� �ֹ��� ����Ʈ �޴��� ������� true.
				if(cond)
				{
					main.ct.point += (int)(b.bPrice * b.���� * 0.05); // ��.�ܿ�����Ʈ�� �ֹ��� (����*����*5%�� ����
					System.out.printf("���� �� ���� ����Ʈ�� %d�Դϴ�.", main.ct.point);
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
	
	public void birth() throws IOException // ���� ��ȿ�� �˻� 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rd = new Random();
		int birthNum;  // �¾ �⵵ �Է¹޴� ���� 
		int randomAge = time.getEventAge(); // 0 ~ 9 ������ ������ ���� �߻�. �̺�Ʈ�� ����� ���� ��  �ڸ�.		

		System.out.print("�¾ �⵵�� �Է��ϼ���(����:1993) : ");
		birthNum = Integer.parseInt(br.readLine());
	
		//���� ���� �޾ƿ���
		int y = time.getDate()[0]; // ���� ���� �޾ƿ���

		int userAge = y - brithNum; // ������� �� ���� �˾Ƴ�
		userAge += 1; // ������� �ѱ��� ����..
		int lastAge = userAge % 10; // ���� ���ڸ� ���� ���ϱ�

		if (randomAge == lastAge) // 
		{
			ageDiscount = true;
			order.ageDiscount = true; // �ֹ� �������� ����
		}
		else
			System.out.println("���� ����� �ƴմϴ�");
	}
}

