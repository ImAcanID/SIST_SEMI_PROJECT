import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//������ġ, ������, ���̵�޴� class���� ����ϴ� ���� Ŭ����.
class SuperMenu
{
	String[] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��귡��"};
	String[] veArray = {"�丶��","�����","����","����","�ø���"};
	String[] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
	String[] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
	String[] sideArray = {"�ݶ�","Ŀ��","��Ű","����","����"};

	int[] bdArray = {0, 0, 0}; // ��
	int[] cCategory = {0, 0, 1}; // ġ�� ī�װ�
	int[] vbArray = {1, 1, 1, 1, 1}; // ��ä 
	int[] scArray = {0, 0, 0, 0, 0}; // �ҽ�
	
	int count = 1;
	int cusKey;
	String strTemp;

	/* �߰�
	String vegetable[];   // ��ä�� ��� 
	String sauce;         // �ҽ� ��� 
	String cheeze;        // ġ�� ���
	*/
	
	void bdCustom() throws IOException // �� Ŀ����()----------------------------------------------------------------------
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// String[] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��극��"};
		while (true)
		{
			System.out.println("�� ����: ȭ��Ʈ, ��Ͽ�Ʈ, �÷��극��");
			System.out.print("�� ����� : ");
			strTemp = br.readLine();

			if (strTemp.equals(breArray[0]))
			{
				System.out.println("ȭ��Ʈ ����"); // �׽�Ʈ ���
				bdArray[0] = 1;
				break;
			}
			else if (strTemp.equals(breArray[1]))
			{
				System.out.println("��Ͽ�Ʈ ����"); // �׽�Ʈ ���
				bdArray[1] = 1;
				break;
			}
			else if (strTemp.equals(breArray[2]))
			{
				System.out.println("�÷��귡�� ����"); // �׽�Ʈ ���
				bdArray[2] = 1;
				break;
			}
			else
				System.out.println("�� �̸��� �ٽ� Ȯ����");
		}
	}// end bdCustom()

	void ccSelect() throws IOException // ġ�� �����ϱ�() -----------------------------------------
	{
		// String [] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
		// int[] cCategory = {0, 0, 0, 0, 1} // ġ�� ī�װ�
		//n = 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//System.out.println("ġ�� �޴�: �Ƹ޸�ĭ ġ��, ������ ġ��, ġ������");
		String con = "Y";
		String strtmp;
		System.out.print("ġ�� ���� �ž�? Y or N : ");
		con = br.readLine();

		if (con.equals("Y") || con.equals("y"))
		{	
			while (true)
			{
				System.out.println("ġ�� �޴�: �Ƹ޸�ĭ ġ��, ������ ġ��");
				System.out.print("� ġ�� ���� �ž�? : ");
				strtmp = br.readLine();

				if (strtmp.equals(chArray[0]))
				{
					System.out.println("�Ƹ޸�ĭ ġ�� ����"); // �׽�Ʈ ���

					cCategory[0] = 1;
					cCategory[2] = 0;
				
					break;
				}
				else if (strtmp.equals(chArray[1]))
				{
					System.out.println("������ ġ�� ����"); // �׽�Ʈ ���

					cCategory[1] = 1;
					cCategory[2] = 0;

					break;
				}
				else
					System.out.println("ġ�� �̸��� �ٽ� Ȯ����");
			} // end while
		}// end if
		// ġ�� �迭 �� �׽�Ʈ
		/*
		for (int i=0; i<cCategory.length; i++)
		{
			System.out.print(cCategory[i]);
		}
		System.out.println();
		*/
	}// end ccSelect() 

	// ��ä Ŀ����()-------------------------------------------------------------------------------
	void vdCustom() throws IOException
	{
		cusKey = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (String s: veArray ) //�� ���Ŭ���� ����
		{
			System.out.print(s + " "); 
		}
		System.out.println();
		System.out.print("�����ϰ� ���� ��ä ������ (�޸�����):"); 
		strTemp = br.readLine();
		String [] strArr = strTemp.split(","); // �丶��, �����, ����

		for (int i = 0;i <strArr.length ;i++ )	
		{
			for (int j =0;j<veArray.length ;j++ )//�丶�� ����� ���� ���� �ø���
			{
				if (strArr[i].equals(veArray[j]))
				{
					vbArray[j] =0; // 0�� �߰�����.
				}
			}
		}
	}//end vdCustom()

	void scCustom() throws IOException // �ҽ� Ŀ����()--------------------------------------------
	{
		//int [] scArray = {0, 0, 0, 0, 0}; 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (String s: sauArray ) //�� ���Ŭ���� ����
		{
			System.out.print(s + " "); // ���� ��Ͼ�,���� ĥ��,��ġ �巹��,�ҽ�����
		}
		System.out.println();
		
		System.out.print("�߰��ϰ� ���� �ҽ� ������ (�޸�����):"); 
		strTemp = br.readLine();
		
		String [] strArr = strTemp.split(","); // ���� ��Ͼ�,���� ĥ��
		
		for (int i = 0; i<strArr.length; i++ )  
		{
			for (int j =0; j<sauArray.length ; j++)
			{
				if (strArr[i].equals(sauArray[j]))
				{
					scArray[j] = 1; // �߰�
				}
			}
		}
	}// end scCustom()

	// void addCount() // ���� �߰� �޼ҵ�(); // �Ű����� �����غ���-------------------------------
	{
		/* ������ ���� ���� ���� �� ��!
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		if (������ != 0)
		{	
			System.out.printf("\n���� :%d�� �ֽ��ϴ�\n", count); 
			System.out.print("���� � �߰���ų�ǰ���? : ");
			int num = Integer.parseInt(br.readLine());
			if (num < ������)
			{
				count += num;
				System.out.println("Ŀ���� �� ���� :" + count);
			}
		}
		else // �ٵ� �̰͵� ���� ��ü ������ ������ ������� ��... 
		{
			System.out.println("��ᰡ ǰ���Ǿ� �߰��� �� �����ϴ�.");
		}
		*/
	}// end addCount()
	
	void decrease() throws IOException // ���Ҹ޼ҵ� ----------------------------------------------
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (count > 0)
		{	
			System.out.printf("\n���� :%d�� �ֽ��ϴ�\n", count); 
			System.out.print("���� � ���ҽ�ų�ǰ���? : ");
			int num = Integer.parseInt(br.readLine());

			if (count-num >= 0)
			{   
				count -= num;
				System.out.println("���簳�� :" + count);
			}
			else
			{
				System.out.println("���Ҽ����� �ʰ��Ͽ����ϴ�.");
			}
		}
		else 
		{
			System.out.println("������ ������ �����ϴ�.");
		}
	}//end decrease()
	
	void checkCustom(int n)//----------------------------------------------------------------------
	{

	}//end checkCustom()

	void addMenu() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�߰� �޴��� �����Ͻðڽ��ϱ�? Y/N : ");
		strTemp = br.readLine();

		if (strTemp.equals("Y") || strTemp.equals("y"))
		{
			DefaultMenu dm = new DefaultMenu();
			dm.dmSelect();
		}
		else
		{
			//���� Ŭ���� ob = new ����Ŭ����();
			//ob.�����޼ҵ�();
		}
	}
}