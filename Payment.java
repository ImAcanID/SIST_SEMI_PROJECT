import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;
import java.util.Random;

import java.util.ArrayList;


class Payment
{
	int change;			// �Ž�����
	int cash;			// ���� ���� �ݾ�
	boolean cashOrCard; // ������������ ī���������� ī��� true
	boolean timeDiscount; // �ð� ���� ���� ����
	boolean ageDiscount;  // ���� ���� ���� ����
	int waitingTime;		// ��� �ð�
	
	int totalPoint = 0;		// ������ ����Ʈ
	int usedPoint = 0;		// ����� ����Ʈ
	boolean useMembership;	// ����Ʈ ��� ����
	boolean saveMembership;	// ����Ʈ ���� ����
	int customerNumber; // ���� ���� �� �ε���


	String[] promotionSandwich = { "���׸���", "��Ż���� ��Ƽ", "������� Ŭ��",
		"���׸���", "��Ż���� ��Ƽ", "������� Ŭ��", "���׸���"}; // ���Ͽ� ���� ���θ�� ������ �޴� �޴� ���
	
	ArrayList<Bread> breadArray;  // �� ��ü 
	ArrayList<Salad> saladArray;  // ������ ��ü
	ArrayList<SideMenu> sideArray;  // ���̵�޴� ��ü
	
	Order order;	// �ֹ�����
	
	Payment(ArrayList<Bread> breadArray, ArrayList<Salad> saladArray, ArrayList<SideMenu> sideArray) throws IOException
	{
		timeDiscount = false;
		ageDiscount = false;

		this.breadArray = breadArray;
		this.saladArray = saladArray;
		this.sideArray = sideArray;
		order = new Order();

		print();
	}
	public void print()	throws IOException	// **** ���� ȭ�� ����
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���ι����Ƿ���?(Y/N) : ");
		String yesDiscount = br.readLine().toUpperCase(); 
		
		if (yesDiscount.equals("Y"))
		{
			discount();
		}
		System.out.println();

		System.out.print("����Ʈ ����ϽǷ���?(Y/N) : ");
		String yesPoint = br.readLine().toUpperCase();
		
		if (yesPoint.equals("Y"))	// ����Ʈ ��� ����
		{
			usePoint();
		}
		System.out.println();

		calTotal();	// ���� ���

		savePoint();	// ����Ʈ ����
		System.out.println();

		System.out.print("���� �������� ���\n");

		choosePayment();	// ���� ���� ���� �� ����

		main.sales.recordSales(order);	// �Ǹ� ���� ���

		printBill();	// ������ ���
	}

	public void printBill()	// ������ ��� �޼ҵ�
	{	
		Bill bill = new Bill(order, change, cash, cashOrCard, waitingTime, totalPoint, usedPoint, useMembership, saveMembership);
		
		bill.print();
	}

	public void choosePayment() throws IOException	// ���� ���� ����
	{
		int tot = order.total; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		System.out.printf("�����ؾ��Ͻ� �ݾ��� %d�Դϴ�.\n", tot);
		
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
		System.out.println();
	}
	
	public void discount() throws IOException //  ���ι����� ���� �˻�
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int randomTime = main.time.getTime()[0];	// ���� '��' �̾ƿ�
		int eventAge = main.time.getEventAge();

		//�ð� ��ȿ���˻�
		if (12<=randomTime && randomTime<=14)
		{
			timeDiscount = true;
			return; // if �� ����Ǹ� return���� �Ʒ� ���� ���ϰ� �ҷ��Դ� ������ �ٽ� ���ư�
			        // �ߺ����� �ȵǰ�..
		}

		System.out.print("������ ���� �� �ڸ��� " + eventAge +"�� �� ��� ���� ����. ������ �����ðڽ��ϱ�?(Y/N) : ");
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

			int point = main.ct[customerNumber].point;
			
			System.out.println("����Ʈ�� 1000�� �̻���� ��� �����մϴ�.");
			System.out.println("������ �ܿ� ����Ʈ�� \"" + point + "\" �Դϴ�"); // point(�ܿ�����Ʈ).. ���� �ܿ�����Ʈ�� �󸶳� ���Ҵ��� ������
			
			if(point > 1000)   
			{
				int wantToPoint;
				do
				{
					System.out.print("����Ʈ�� �󸶳� ����Ͻðڽ��ϱ�? : ");
					wantToPoint = Integer.parseInt(br.readLine());
				}
				while (wantToPoint>point);
								
				usedPoint = wantToPoint;
			
				main.ct[customerNumber].point -= usedPoint;
				totalPoint -= usedPoint;

				useMembership = true;
			}
			else
			{
				System.out.println("����Ʈ 1000�� ���϶� ��� �Ұ�");
				return;
			}
		}
	}

	boolean checkMembership() throws IOException
	{
		boolean isMembership = false;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//����� ��ȣ�� �Է¹ް��� �ִ��� ������ �˻�
		//(main�� �ִ� ���� �̿�)
		
		System.out.print("����� ��ȣ�� �Է��ϼ��� : ");
		int memberNum = Integer.parseInt(br.readLine());
		
		//����ʹ�ȣ �Է� >>> 4���� ����� ��ȣ�� �� ��ġ�ϴ��� �˻�.
		for (int i=0; i<main.ct.length; i++ ) // main�ȿ� Customer ct�� �ϳ��� �ҷ����鼭 �˻�
		{
			isMembership = (memberNum == main.ct[i].memberNumber); // �Է¹��� ����� ��ȣ�� ���̵������� �������ȣ�� ��ġ�ϴ��� Ȯ��.
																   // ��ġ�ϸ� isMembership = true
			if(isMembership) 
			{
				System.out.println("������� Ȯ�εǾ����ϴ�\n");
				customerNumber = i;
				totalPoint = main.ct[i].point;
				return true;
			}
		}
		
		String temp;
		
		
		do
		{
			System.out.println();
			System.out.print("����� ��ȣ�� �ٽ� �Է��Ϸ��� Y�� �Է��ϼ���. : ");
			temp = br.readLine().toUpperCase();
		
			if(!temp.equals("Y"))
				return false;

			System.out.print("����� ��ȣ�� �Է��ϼ��� : ");
			memberNum = Integer.parseInt(br.readLine());
			for (int i=0; i<main.ct.length; i++ ) // main�ȿ� Customer ct�� �ϳ��� �ҷ����鼭 �˻�
			{
				isMembership = (memberNum == main.ct[i].memberNumber); // �Է¹��� ����� ��ȣ�� ���̵������� �������ȣ�� ��ġ�ϴ��� Ȯ��.
																	   // ��ġ�ϸ� isMembership = true
				if(isMembership) 
				{
					System.out.println("������� Ȯ�εǾ����ϴ�");
					customerNumber = i;
					return true;
				}
			}
		}
		while (!isMembership);
		return false; // �� �� ������ ���� ��
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

		for (SideMenu sd: sideArray)
		{
			order.recordOrder(sd);
		}

		order.recordAgeDiscount(ageDiscount);

		if (useMembership)
			order.recordPoint(usedPoint);
		
		
		order.waitingTime = waitingTime;
		
	}

	
	public void calWatingTime(Object s)	// ���ð� ���
	{
		int earlyTime = 0; // �ʱ� ���ð��� 0���� �ʱ�ȭ


		if(s.getClass().getName().equals("Bread"))//���̸�
		{
			earlyTime = 3;
			
			switch (((Bread)s).bCategory) //�ٿ�ĳ���� ���ؼ� .. ����.. 
			{
				case "���׸���": earlyTime +=5; break;
				case "��Ż���� ��Ƽ" : earlyTime +=2; break;
				case "������� Ŭ��":earlyTime +=10; break;
			}
		}
		else
		{
			earlyTime = 4;
			switch (((Salad)s).sCategory)
			{
				case "���׸���": earlyTime +=15; break;
				case "��Ż���� ��Ƽ" : earlyTime +=12; break;
				case "������� Ŭ��":earlyTime +=20; break;
			}
		}
	
		earlyTime = earlyTime *  1; 

		
		waitingTime += earlyTime;	
	}
	
	

	public void savePoint() throws IOException // ����Ʈ ���� �޼ҵ�
	{
		String promotionMenu = "����"; // ���θ�� ������� �޴�
		int randomDay = main.time.getDate()[3];

		if(1 <= randomDay && randomDay <= 5) //main.time.day
		{
			
			switch (randomDay)
			{
				case 1: promotionMenu = promotionSandwich[randomDay]; break; 
				case 2:	promotionMenu = promotionSandwich[randomDay]; break;
				case 3: promotionMenu = promotionSandwich[randomDay]; break;
				case 4: promotionMenu = promotionSandwich[randomDay]; break;
				case 5: promotionMenu = promotionSandwich[randomDay]; break;
				default: promotionMenu = "����";
			}
		}
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("����Ʈ �����ϽǷ���?(Y/N) : ");
		String yesOrNo = br.readLine().toUpperCase();
		
		if (yesOrNo.equals("Y"))	// ����Ʈ ���� ����
		{
			if (useMembership)
			{
				for(Bread b : breadArray) // �� ��ü�� �ϳ��� �޾ƿͼ�..
				{
					boolean cond = b.bCategory.equals(promotionMenu); // ������ ���θ�� �޴��� �ֹ��� ����Ʈ �޴��� ������� true.
					if(cond)
					{
						main.ct[customerNumber].point += (int)(b.bPrice * b.bCount * 0.05); // �ش� �޴� ������ 5�ۼ�Ʈ ����Ʈ ����
						totalPoint = main.ct[customerNumber].point;
						
						saveMembership = true;
					}
				}
			}
			else
			{
				if(checkMembership()) // checkMembership �޼ҵ� ȣ���Ͽ� true / false �Ǻ�
				{
					for(Bread b : breadArray) // �� ��ü�� �ϳ��� �޾ƿͼ�..
					{
						boolean cond = b.bCategory.equals(promotionMenu); // ������ ���θ�� �޴��� �ֹ��� ����Ʈ �޴��� ������� true.
						if(cond)
						{
							main.ct[customerNumber].point += (int)(b.bPrice * b.bCount * 0.05); // �ش� �޴� ������ 5�ۼ�Ʈ ����Ʈ ����
							totalPoint = main.ct[customerNumber].point;

							saveMembership = true;
						}
					}					
				}
				else
				{
					return;
				}
			}
			if(saveMembership)
					System.out.printf("���� �� ���� ����Ʈ�� %d�Դϴ�.\n", totalPoint);
			else
				System.out.println("���� ������ �޴��� �����ϴ�.");
		}
	}
	
	public void birth() throws IOException // ���� ��ȿ�� �˻� 
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rd = new Random();
		int birthNum;  // �¾ �⵵ �Է¹޴� ���� 
		int randomAge = main.time.getEventAge(); // 0 ~ 9 ������ ������ ���� �߻�. �̺�Ʈ�� ����� ���� ��  �ڸ�.		

		System.out.print("�¾ �⵵�� �Է��ϼ���(����:1993) : ");
		birthNum = Integer.parseInt(br.readLine());
	
		//���� ���� �޾ƿ���
		int y = main.time.getDate()[0]; // ���� ���� �޾ƿ���

		int userAge = y - birthNum; // ������� �� ���� �˾Ƴ�
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

