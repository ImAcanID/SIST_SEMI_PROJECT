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
	/*
	String[] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��극��"};
	String[] veArray = {"�丶��","�����","����","����","�ø���"};
	String[] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
	String[] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
	String[] sideArray = {"�ݶ�","Ŀ��","��Ű","����","����"};
	*/

	//IngredientManagement ig = new IngredientManagement();

	// ig.input2(); // ���⼭ ȣ�� �� ��
	
	// �������� �����ϱ� ���� �迭�� ����.
	int[] bdArray = {0, 0, 0}; // ��
	int[] cCategory = {0, 0, 1}; // ġ�� ī�װ�
	int[] vbArray = {1, 1, 1, 1, 1}; // ��ä 
	int[] scArray = {0, 0, 0, 0, 0}; // �ҽ�
	
	int count = 1;
	int cusKey; //-- ���߿� ����ɼ�����Ǵ°� Ȯ���� �� ���.
	String strTemp; 
	
	//static ��� �ȴٰ� ������.
	String breadkind;     // �� ���� ���
	String cheese;        // ġ�� ���
	String[] vegetable;   // ��ä�� ��� 
	String[] sauce;         // �ҽ� ��� 

	int moon = 0;
	
	void bdCustom() throws IOException // �� Ŀ����()----------------------------------------------------------------------
	{
		
		
		moon = 1; // ���̶�� ��.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true)
		{
			System.out.print("\n���� ������ �� ���� [");
			for (int i=0; i<main.iim.breArray.length; i++)
			{
				System.out.print(main.iim.breArray[i]);
				if (i+1 != main.iim.breArray.length) // �� ������ �� �ƴ� ���� �޸� ����
				{
					System.out.print(", ");
				}
				else
					System.out.println("]");
			}
			
			System.out.print("�� ������ �Է��� �ּ��� : ");
			
			strTemp = br.readLine();

			if (strTemp.equals(main.iim.breArray[0]))
			{
				//System.out.println("ȭ��Ʈ ����"); // �׽�Ʈ ���
				bdArray[0] = 1;
				breadkind = "ȭ��Ʈ";
				break;
			}
			else if (strTemp.equals(main.iim.breArray[1]))
			{
				//System.out.println("��Ͽ�Ʈ ����"); // �׽�Ʈ ���
				bdArray[1] = 1;
				breadkind = "��Ͽ�Ʈ";
				break;
			}
			else if (strTemp.equals(main.iim.breArray[2]))
			{
				//System.out.println("�÷� �극�� ����"); // �׽�Ʈ ���
				bdArray[2] = 1;
				breadkind = "�÷� �극��";
				break;
			}
			else
				System.out.println("�� ������ �ٽ� Ȯ���� �ּ���");
		}
		System.out.println("\n[���� ���� �ɼ�]");
		cusKey = 1;
		checkCustom();
		//breadkind = ig.decreaseBread(breadkind, bCount);
		//decrease();
		
		
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
		System.out.print("\nġ� �߰� �Ͻðڽ��ϱ�?(Y/N) : ");
		con = br.readLine();

		if (con.equals("Y") || con.equals("y"))
		{	
			while (true)
			{
				System.out.print("\n���� ������ ġ�� ���� [");
				for (int i=0; i<main.iim.chArray.length-1; i++)
				{
					System.out.print(main.iim.chArray[i]);
					if (i+1 != main.iim.chArray.length-1) // �� ������ �� �ƴ� ���� �޸� ����
					{
						System.out.print(", ");
					}
					else
						System.out.println("]");
				}
				System.out.print("ġ�� ������ �Է��� �ּ��� : ");
				strtmp = br.readLine();

				if (strtmp.equals(main.iim.chArray[0]))
				{
					//System.out.println("�Ƹ޸�ĭ ġ�� ����"); // �׽�Ʈ ���

					cCategory[0] = 1;
					cCategory[2] = 0;
					cheese = "�Ƹ޸�ĭ ġ��";
				
					break;
				}
				else if (strtmp.equals(main.iim.chArray[1]))
				{
					//System.out.println("������ ġ�� ����"); // �׽�Ʈ ���

					cCategory[1] = 1;
					cCategory[2] = 0;
					cheese = "������ ġ��";

					break;
				}
				else
					System.out.println("ġ�� ������ �ٽ� Ȯ���� �ּ���");
			} // end while
		}
		else 
		{
			cheese = "ġ�� ���� �� ��";
		}// end if
		System.out.println("\n[���� ���� �ɼ�]");
		cusKey = 1;
		checkCustom();
		cusKey = 2;
		checkCustom();
		/*
		if (moon == 1)
		{
			cheese = ig.decreaseBread(cheese, Bread.bCount);
		}
		else if (moon == 0)
		{
			cheese = ig.decreaseBread(cheese, Salad.sCount);
		}
		*/
		
		
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
		String con = "Y";

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		/*
		for (String s : veArray) //�� ���Ŭ���� ����
		{
			System.out.print(s + ", "); 
		}
		System.out.println("]");
		*/
		//System.out.println("==========================================");
		System.out.print("\n��ä�� ���ðڽ��ϱ�?(Y/N) : ");
		con = br.readLine();
		if (con.equals("Y") || con.equals("y"))
		{
			System.out.print("\n���� ������ ��ä ���� [");
			for (int i=0; i<main.iim.veArray.length; i++)
			{
				System.out.print(main.iim.veArray[i]);
				if (i+1 != main.iim.veArray.length) // �� ������ �� �ƴ� ���� �޸� ����
				{
					System.out.print(", ");
				}
				else
					System.out.println("]");
			}
			System.out.print("���� ���� ��ä ������ �������ּ���(���� ���� ����, �޸���,������) : "); 
			strTemp = br.readLine();
			String[] strArr = strTemp.split(", "); // �丶��, �����, ����

			for (int i=0; i<strArr.length; i++)	//      0      1      2
			{                                        // 01234  
				for (int j=0; j<main.iim.veArray.length; j++) // �丶�� ����� ���� ���� �ø���
				{
					if (strArr[i].equals(main.iim.veArray[j]))
					{
						vbArray[j] = 0; // 0�� �߰�����.
					}
					//else 
					//vegetable[i] = veArray[j]; 
				}
			}
			vegetable = new String [strArr.length];
			//����ڰ� ������ ��ä ���ڿ��� �ֱ�.
			for (int i=0; i<strArr.length ;i++ )
			{
				vegetable[i] = strArr[i];
			}
		}// end if
		else 
		{
			vegetable = new String[1];
			vegetable[0] = "��ä �������� ����";
		}

		System.out.println("\n[���� ���� �ɼ�]");
		cusKey = 1;
		checkCustom();
		cusKey = 2;
		checkCustom();
		cusKey = 3;
		checkCustom();
		/*
		for (int i = 0 ;i<vegetable.length ;i++ )
		{
			vegetable[i] = ig.decreaseBread(vegetable, Bread.bCount); //���� Ȯ��!!!
		}
		*/
		
	}//end vdCustom()

	void scCustom() throws IOException // �ҽ� Ŀ����()--------------------------------------------
	{
		//int[] scArray = {0, 0, 0, 0, 0}; 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String con = "Y";
		String strtmp;
		String[] strArr2;
		
		System.out.print("\n�ҽ��� �߰� �Ͻðڽ��ϱ�?(Y/N) : ");
		con = br.readLine();
		if (con.equals("Y") || con.equals("y"))
		{
			System.out.print("\n���� ������ �ҽ� ���� [");
			for (int i=0; i<main.iim.sauArray.length-1; i++)
			{
				System.out.print(main.iim.sauArray[i]);
				if (i+1 != main.iim.sauArray.length-1) // �� ������ �� �ƴ� ���� �޸� ����
				{
					System.out.print(", ");
				}
				else
					System.out.println("]");
			}
			System.out.print("�ҽ� ������ �������ּ���(���� ���� ����, �޸���,������) : "); 
			strtmp = br.readLine();
			strArr2 = strtmp.split(", "); 

			for (int i=0; i<strArr2.length; i++)
			{                                        
				for (int j=0; j<scArray.length; j++) 
				{
					if (strArr2[i].equals(scArray[j]))
					{
						scArray[j] = 1; 
					}
				}
			}
			sauce = new String[strArr2.length];
			//����ڰ� ������ �ҽ� ���ڿ��� �ֱ�.
			for (int i=0; i<strArr2.length ;i++ )
			{
				sauce[i] = strArr2[i];
			}
		}
		else 
		{
			sauce = new String[1];
			sauce[0] = "�ҽ� ���� �� ��";
		}// end if
		
		System.out.println("\n[���� ���� �ɼ�]");
		cusKey = 1;
		checkCustom();
		cusKey = 2;
		checkCustom();
		cusKey = 3;
		checkCustom();
		cusKey = 4;
		checkCustom();
		//sauce[i] = ig.decreaseBread(sauce, Bread.bCount);
		/*
		for (int i = 0 ;i<sauce.length ;i++ )
		{
			sauce[i] = ig.decreaseBread(sauce, Bread.bCount); //���� Ȯ��!!!
		}
		*/
	}

	void checkCustom() // ���� �������� ���� case1 ���� �� �� .. ��ī��? 
	{                  // --> switch�� �ȿ� if ��ø ����. 
		//System.out.println("\n[���� ���� �ɼ�]"); // �̰� ���� �� ���Ƽ� �޼ҵ� ȣ�� ���� ���� �س���
		switch (cusKey)
		{	
			case 1: 
				if (breadkind!=null) // breadkind�� �� ���� ����.
				{
					System.out.println("�� ���� : " + breadkind);break;
				}
				else // breadkind �� ������ salad.
					break;
			case 2: System.out.println("ġ�� ���� : " + cheese);break;
			case 3: checkVg();break;
			case 4: checkSc();break;
		}

	}
	void checkVg()// ���� ������ ��ä ���� ���
	{
		System.out.print("���� ������ ��ä ���� : ");
		for (String s:vegetable)
		{
			System.out.print(s + " ");
		}
		System.out.println();
	}
	void checkSc()// ������ �ҽ� ���� ���
	{
		System.out.print("������ �ҽ� ���� : ");
		for (String s:sauce)
		{
			System.out.print(s + " ");
		}
		System.out.println();
	}
	/*-- ���� �ϴ� ����������������
	void decrease()
	{
		IngredientManagement im = new IngredientManagement();

		if (breadkind!=null) // breadkind�� �� ���� �� (�� �����߰�, �� ���� �����ϸ�)
		{
			if (bread.get(breadkind)==0) // ������ (ex.��Ͽ�Ʈ)�� ����
			{
				System.out.println(breadkind + "�� ���� ǰ���Ǿ� ������ �� �����ϴ�.");
				bdCustom(); // �� ���� �ٽ� ������ �� �ֵ���. 
			}
		}
	}
	*/
}

	//void addCount() // ���� �߰� �޼ҵ�(); // �Ű����� �����غ���-------------------------------
	//{
		// ������ ���� ���� ���� �� ��!
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		/*
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
		
  //  }// end addCount()
	//void decrease() throws IOException // ���Ҹ޼ҵ� ----------------------------------------------
	//{
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
	//}//end decrease()
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
	
//}