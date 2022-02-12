import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


import java.util.Calendar;



class SideMenu //extends SuperMenu �� �� �ʿ� ������?
{
	String smCategory; //-- ����ڰ� ������ ���̵� �޴�.
	int smPrice; //-- �ش� ���̵� �޴��� ����.
	int smCount;// ���̵�޴� ����.
	int totsmPrice;// ���� * ����

	//IngredientManagement ig = new IngredientManagement(); // ��� �ν��Ͻ� ����.
	String[] sideArray = {"�ݶ�","Ŀ��","��Ű","����","����"};
	
	//������
	SideMenu() throws IOException
	{
		
		sideSelect();
	}
	
	//���̵� �޴� ����
	void sideSelect() throws IOException
	{
		boolean xAu = false; // -- �̼����ڸ� ���� ��°� �Ұ�.
		
		System.out.print("���� ������ ���̵�޴� [");
		for (String s : sideArray)
		{
			System.out.print(s + " ");
		}
		System.out.println("]");
		System.out.println("�� ���ִ� 20�� �̻� �����մϴ�.");


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do
		{
			System.out.print("���̵� �޴��� ������ �ּ��� : " );
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
			System.out.print("������ �Է��ϼ��� : " );
			smCount = Integer.parseInt(br.readLine());

		switch (smCategory)
		{
		case "�ݶ�": smPrice = 1500; break;
		case "Ŀ��": smPrice = 4500; break;
		case "��Ű": smPrice = 6000; break;
		case "����": smPrice = 500; break;
		case "����": smPrice = 5555; break;
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

		// �Է¹޴� �ֹι�ȣ (���ڿ� ����)
		String str;
		
		// �ֹι�ȣ�� �� �ڸ����� ���ϰ� �� �� �� �迭 ���·� ����    
		int [] chk = {2, 3, 4, 5, 6, 7, 0, 8, 9, 2, 3, 4, 5};

		// ���� ���� �� ������ ( �� ������ ����� ���� ������...)

		int tot = 0; //7*2 + 5*3 + .. + 3 * 5 �׷��� �ʱ�ȭ 0����
		
		do
		{
			System.out.print("�ֹι�ȣ�Է�(XXXXXX - XXXXXXX) : ");
			str = br.readLine();
			if (str.length() != 14)
			{
			System.out.println("�ٽ� �ѹ� �Է��� Ȯ���� �ּ���.");
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
			System.out.println("�ֹι�ȣ�� ��ȿ���� �ʽ��ϴ�.");
			
		
		if (trueJoo == true) //��ȿ�� �ֹι�ȣ����
		{
			userAge = yy - Integer.parseInt(str.substring(0,3)) - 1900+1; // ���糪�� ����ؼ� 
			if (userAge>=20)//20���̻��̸�.
				return true;
			else if (userAge<20)
				return false;
		}
		
			
	}
}
		


	



