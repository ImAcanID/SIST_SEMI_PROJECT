import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


import java.util.Calendar;



class SideMenu //extends SuperMenu �� �� �ʿ� ������?
{
	String smCategory; //-- ����ڰ� ������ ���̵� �޴�.
	int smPrice; //-- �ش� ���̵� �޴��� ����.
	int smCount=1;// ���̵�޴� ����.
	int totsmPrice;// ���� * ����
	//countSalad =1;
	/*
	ī��Ʈ����() �� ���Ŭ����
	{
		�� - ���׸��� - �丶������ - �Ȱ�����
		��ü ���� �ϴ� ... �ؾ�����
		count + +;
	}
	*/
	/*
	Countadd()�� ���Ŭ���� .. 
	{
		� �����ҷ�? ��������, 2��������
		�������� �� return;
		2������ �� count������ +=2;
		
		������ +=3; 
		��ü������ �Һ��� ������
		_ _ _ _ 
		������ (������ - ���׸��� - �ҽ�����, ����=1)
		������ (������ - ���׸��� - �ҽ�����, ���� ++)
		//���Ŭ���� ��� ���� ������ * ����; 

	ig.Countadd();

	}
	*/

	//IngredientManagement ig = new IngredientManagement(); // ��� �ν��Ͻ� ����.

	//String[] sideArray = {"�ݶ�","Ŀ��","��Ű","����","����"};
	IngredientManagement ig = new IngredientManagement();
	//String[] sideArray2 = ig.munuPan(sideArray[]);
	//--==>> 

	
	//������
	SideMenu() throws IOException
	{
		sideSelect();
	}
	
	//���̵� �޴� ����
	void sideSelect() throws IOException
	{
		boolean xAu = false; // -- �̼����ڸ� ���� ��°� �Ұ�.
		/*
		System.out.print("\n���� ������ ���̵�޴� [");
		for (String s : sideArray)
		{
			System.out.print(s + " ");
		}
		System.out.println("]");
		*/
		
		System.out.print("\n���� ������ ���̵� �޴� [");
		for (int i=0; i< ig.sideArray.length; i++)
		{
			System.out.print( ig.sideArray[i]);
			if (i+1 !=  ig.sideArray.length) // �� ������ �� �ƴ� ���� �޸� ����
			{
				System.out.print(", ");
			}
			else
				System.out.println("]");
		}
		


		System.out.println(" �� ���ִ� 20�� �̻� �����մϴ�."); 


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("\n���̵� �޴��� �Է��� �ּ��� : " );
			smCategory = br.readLine();
		}
		while (!(smCategory.equals("�ݶ�")||smCategory.equals("Ŀ��")||smCategory.equals("��Ű")||smCategory.equals("����")||smCategory.equals("����")));
		
		if (smCategory.equals("����")) 
		{
			xAu = adultCertification();
			if (xAu == true)
			{
				System.out.println("�̼����ڿ��Դ� ���ָ� �Ǹ����� �ʽ��ϴ�.");
				return;
			}
		}
			System.out.print("������ �Է��� �ּ��� : " );
			smCount = Integer.parseInt(br.readLine());

			//smCategory = ig.decreaseSideMenu(smCategory,smCount);

		switch (smCategory)
		{
		case "�ݶ�": smPrice = 1000; break;
		case "Ŀ��": smPrice = 1000; break;
		case "��Ű": smPrice = 1000; break;
		case "����": smPrice = 2900; break;
		case "����": smPrice = 4000; break;
		}

		totsmPrice = smCount * smPrice;
		

	}//end sideSelect()


	boolean adultCertification() throws IOException
	{
		int userAge;//--��ȿ�� �ֹι�ȣ �� �ش� �ֹι�ȣ�� ���� ��¥�� ���� ���.
		// �Է¹޴� �ֹι�ȣ(���ڿ� ����)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// Ķ���� �ν��Ͻ� ����.
		Calendar now = Calendar.getInstance();
		int yy = now.get(Calendar.YEAR);
		boolean trueJoo = false; // ��Ȯ�� �ֹι�ȣ�� true��ȯ.
		boolean trueAd = false; //�����Դϴ�. ��ȯ�Ұ���.

		// �Է¹޴� �ֹι�ȣ (���ڿ� ����)
		String str;
		
		// �ֹι�ȣ�� �� �ڸ����� ���ϰ� �� �� �� �迭 ���·� ����    
		int [] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};

		// ���� ���� �� ������ ( �� ������ ����� ���� ������...)

		int tot = 0; //7*2 + 5*3 + .. + 3 * 5 �׷��� �ʱ�ȭ 0����
		
		System.out.println("\n���������� ���� �ֹι�ȣ�� �Է��� �ּ���."); 

		do
		{
			System.out.print("�ֹι�ȣ �Է�(XXXXXX-XXXXXXX) : ");
			str = br.readLine();
			if (str.length() != 14)
			{
			System.out.println("�ֹι�ȣ�� �ٽ� �ѹ� Ȯ���� �ּ���.");
			}
		}
		while (str.length() != 14);
		
		
		for (int i =0;i<13 ;i++ )//0 1 2 3 4 5 6 7 8 9 10 11 12
		{
			if (i ==6)
			{
				continue; // -- �޺κ� �����ϰ� ����ض�.
			}
			tot+= chk[i] * Integer.parseInt(str.substring(i,i+1)); //���ڿ��� �ε��� ������ ���� 13�̶� i+1����.
			// ���Ⱑ �޺κ���!

		}
		                                   
											 

		int su = 11 - tot % 11;

		su = su % 10;	// su�� %= 10;
		
		if (su == Integer.parseInt(str.substring(13)))
		{
			trueJoo = true;
		}
		else 
		{
			System.out.println("�ֹι�ȣ�� ��ȿ���� �ʽ��ϴ�.");
			sideSelect();
		}
			
		if (trueJoo == true) //��ȿ�� �ֹι�ȣ����
		{
			userAge = yy - Integer.parseInt(str.substring(0,3)) - 1900+1; // ���糪�� ����ؼ� 
			if (userAge>=20)//20���̻��̸�.
				trueAd = true;
			else if (userAge<20)
				trueAd= false;
		}

		return trueAd;	
	}
}
		


	



