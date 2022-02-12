import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//������ġ, ������, ���̵�޴� class���� ����ϴ� ���� Ŭ����.
public class SuperMenu
{
	/*
	// ���Ŭ���� ������ �ٲ� ����.
	String[] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��극��"};
	String[] veArray = {"�丶��","�����","����","����","�ø���"};
	String[] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
	String[] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
	String[] sideArray = {"�ݶ�","Ŀ��","��Ű","����","����"};

	String removeV;//-- ������ ��ä ��� ����. "�丶�� ����"


	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("�丶��, �����, ����, ����, �ø���");
	System.out.println("������ ��ä�� �����ּ���. (�޸� ����)");
	remoeV = br.readLine();

	String [] removeVarr = removeV.split();
	

}
*/
//==================================================================================================================================================

	// ��� Ŭ�������� �޾ƿ� ����.
	String[] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��극��"};
	String[] veArray = {"�丶��","�����","����","����","�ø���"};
	String[] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
	String[] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
	String[] sideArray = {"�ݶ�","Ŀ��","��Ű","����","����"};

	// �������� �����ϱ� ���� �迭�� ����.
	int[] bdArray = {0, 0, 0}; // ��
	int[] cCategory = {0, 0, 1}; // ġ�� ī�װ�
	int[] vbArray = {1, 1, 1, 1, 1}; // ��ä 
	int[] scArray = {0, 0, 0, 0, 0}; // �ҽ�

	
	int count = 1;
	int cusKey; //-- ���߿� ����ɼ�����Ǵ°� Ȯ���� �� ���.
	String strTemp; 
	
	static String breadkind;     // �� ���� ���
	static String cheese;        // ġ�� ���
	static String[] vegetable;   // ��ä�� ��� 
	static String[] sauce;         // �ҽ� ��� 
	
	void bdCustom() throws IOException // �� Ŀ����()----------------------------------------------------------------------
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true)
		{
			System.out.println("���� ������ �� ����[ȭ��Ʈ, ��Ͽ�Ʈ, �÷��극��]");
			System.out.println("=================================================");
			System.out.print("�� ������ ������ �ּ���. : ");
			strTemp = br.readLine();

			if (strTemp.equals(breArray[0]))
			{
				//System.out.println("ȭ��Ʈ ����"); // �׽�Ʈ ���
				bdArray[0] = 1;
				breadkind = "ȭ��Ʈ";
				break;
			}
			else if (strTemp.equals(breArray[1]))
			{
				System.out.println("��Ͽ�Ʈ ����"); // �׽�Ʈ ���
				bdArray[1] = 1;
				breadkind = "��Ͽ�Ʈ";
				break;
			}
			else if (strTemp.equals(breArray[2]))
			{
				System.out.println("�÷��극�� ����"); // �׽�Ʈ ���
				bdArray[2] = 1;
				breadkind = "�÷��극��";
				break;
			}
			else
				System.out.println("�� �̸��� �ٽ� Ȯ���� �ּ���!");
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
		System.out.print("ġ�� �߰� �Ͻðڽ��ϱ�? Y or N : ");
		con = br.readLine();

		if (con.equals("Y") || con.equals("y"))
		{	
			while (true)
			{
				System.out.println("���� ������ ġ�� ����[�Ƹ޸�ĭ ġ��,������ ġ��]");
				System.out.println("=================================================");
				System.out.print("ġ�� ������ ������ �ּ���. : ");
				strtmp = br.readLine();

				if (strtmp.equals(chArray[0]))
				{
					//System.out.println("�Ƹ޸�ĭ ġ�� ����"); // �׽�Ʈ ���

					cCategory[0] = 1;
					cCategory[2] = 0;
					cheese = "�Ƹ޸�ĭ ġ��";
				
					break;
				}
				else if (strtmp.equals(chArray[1]))
				{
					//System.out.println("������ ġ�� ����"); // �׽�Ʈ ���

					cCategory[1] = 1;
					cCategory[2] = 0;
					cheese = "������ ġ��";

					break;
				}
				else
					System.out.println("ġ�� �̸��� �ٽ� Ȯ���� Ȯ���� �ּ���!");
			} // end while
		}// end if
	}
		// ġ�� �迭 �� �׽�Ʈ
		/*
		for (int i=0; i<cCategory.length; i++)
		{
			System.out.print(cCategory[i]);
		}
		System.out.println();
		*/
	//}// end ccSelect() 

	// ��ä Ŀ����()-------------------------------------------------------------------------------
	void vdCustom() throws IOException
	{
		//cusKey = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("���� ������ ��ä ���� [");
		for (String s : veArray) //�� ���Ŭ���� ����
		{
			
			System.out.print(s + ", "); 
		}
		System.out.println("]");
		System.out.println("==========================================");

		System.out.println();
		System.out.print("���� ���� ��ä ������ �������ּ���.(���� ���� ����,�޸���,������) : "); 
		strTemp = br.readLine();
		String[] strArr = strTemp.split(","); // �丶��, �����, ����

		for (int i=0; i<strArr.length; i++)	//      0      1      2
		{                                        // 01234  
			for (int j=0; j<veArray.length; j++) // �丶�� ����� ���� ���� �ø���
			{
				if (strArr[i].equals(veArray[j]))
				{
					vbArray[j] = 0; // 0�� �߰�����.
				}
				//else 
				//vegetable[i] = veArray[j]; 
			}
		}
		vegetable = new String [strArr.length];
		//����ڰ� ������ ��ä ���ڿ��� �ֱ�.
		for (int i=0 ;i<strArr.length ;i++ )
		{
			vegetable[i] = strArr[i];
		}
		
		System.out.print("����ڰ� ���ż����� ��ä : ");
		//����ڰ� ������ ��ä ����ϱ�
		for (String s:vegetable)
		{
			System.out.print(s+", ");
		}
		System.out.println();


	}//end vdCustom()

	void scCustom() throws IOException // �ҽ� Ŀ����()--------------------------------------------
	{
		//int[] scArray = {0, 0, 0, 0, 0}; 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� ������ �ҽ� ���� [");
		for (String s: sauArray ) //�� ���Ŭ���� ����
		{
			System.out.print(s + ", "); // ���� ��Ͼ�,���� ĥ��,��ġ �巹��,�ҽ�����
		}
		System.out.println("]");
		System.out.println("=====================================================");
		
		System.out.print("�߰��ϰ� ���� �ҽ� �������ּ���.(���� ���� ����,�޸���,������) : "); 
		strTemp = br.readLine();
		
		String[] strArr = strTemp.split(", "); // ���� ��Ͼ�,���� ĥ��
		//sauce = strArr;
		
		for (int i=0; i<strArr.length; i++)  
		{
			for (int j=0; j<sauArray.length; j++)
			{
				if (strArr[i].equals(sauArray[j]))
				{
					scArray[j] = 1; // �߰�
				}
			}
		}
		sauce = new String [strArr.length];
		for (int i = 0;i<sauce.length;i++)
		{
			sauce[i] = strArr[i];
		}
		System.out.print("����ڰ� ������ �ҽ� : ");
		//����ڰ� ������ ��ä ����ϱ�
		for (String s:sauce)
		{
			System.out.print(s+", ");
		}
		System.out.println();

	}// end scCustom()


//////////////////////////////////////////////////////////////////////////////////////////////////1
	// void addCount() // ���� �߰� �޼ҵ�(); // �Ű����� �����غ���-------------------------------
	//{
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
//	}// end addCount()
	/*
	void decrease() throws IOException // ���Ҹ޼ҵ� ----------------------------------------------
	{	
		/*
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
		*/
//	}//end decrease()
	/*
	void checkCustom(int n)//----------------------------------------------------------------------
	{

	}//end checkCustom()
	
	/*
	static void addMenu() throws IOException
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
	*/////////////////////

	/*
	void endMenu() // DefaultMenu�� ���ư��� �޼ҵ�
	{
		DefaultMenu dm = new DefaultMenu();
		dm.dmSelect();
	}
	*/

//}
	
}