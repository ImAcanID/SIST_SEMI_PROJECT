import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Food3
{
	public static void main(String[] args) throws IOException
	{
		// ��DefaultMenu Ŭ������
		int dmCategory;       //defaultMenuCategory 
		int dmOption;         //defaultMenuOption   

		//dmSelect()
		//{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			// ����Ʈ �޴� ����
			
			while (true)
			{
				System.out.print("�޴��� ������ �ּ���(���׸���, bmt, �������Ŭ��) : ");
				String strtmp = br.readLine();

				if (strtmp.equals("���׸���"))
				{
					System.out.println("���׸��� ����");
					Bread bread1 = new Bread(); // �� ��ü ����
					break;
				}
				else if (strtmp.equals(chArray[1]))
				{
					System.out.println("bmt ����");
					System.out.println("bmt");
					Bread bread1 = new Bread(); // �� ��ü ����
					break;
				}
				else
					System.out.println("�޴� �̸��� �ٽ� Ȯ���� �ּ���");
			}
			


			/*
			do 
			( 
				System.out.print("���� 1 ������� 2 : ");
				dmOption = System.in.read();
			}
			while(dmCategory != ����) // dmCategory != ����
			
			
			ArrayList<Bread> breadArrayList = new ArrayList<Bread>();  // ���� ��� ArrayList
			breadArrayList.add(bread1);   // �߰� �ֹ� ����Ǵ��� Ȯ�Ρ�

			else if dmOption == 2

			Salad salad1 = new Salad(); // ������ ��ü ����

			ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static ���� // �����常 ��� ArrayList
			saladArrayList.add(salad1);

			else if dmOption == 3 //-- ���̵�޴�
			{
				SideMenu sidemenu1 = new sidemenu();

				ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 
				sideMenuArrayList.add(sidemenu1);
			}
			else if dmOption == 4;
			{
				nowOrderOption();
			}
			*/


		//�޴��� static final�� ����.
		String[] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��귡��"};
		String[] veArray = {"�丶��","�����","����","����","�ø���"};
		String[] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
		String[] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
		String[] sideArray = {"�ݶ�","Ŀ��","��Ű","����","����"};
		
		// ��SuperMenu Ŭ������
		//����ڰ� �Է��� Ŀ���� ����.
		int[] vbArray = {1, 1, 1, 1, 1};
		int[] scArray = {0, 0, 0, 0, 0}; 
		int[] cCategory = {0, 0, 1}; // ġ�� ī�װ�
		int count = 1;
		int cusKey;
		String strTemp;
		/*
		vdArray [] = {1,1,1};        //vegetableArray��äĿ���� []  //-- ��ä�� ���Ŵϱ� 1�� �̸� �ʱ�ȭ
		scArray [] ={0, 0, 0, 0};    //souceArray �ҽ�Ŀ����    // --�ҽ��߰��ϸ� 1�� �ʱ�ȭ
		cCategory;                   //cheeseCategory 1 2 3 int 
		count = 1;                   //����
		*/
		/*
		???addMenu(???)
		{
			Yes �� 
				DefaultMenu  dm = new DefaultMenu () // �ν��Ͻ� ���� Ŭ���������� ���߿� �ʿ��ϸ� ���.
				dm.dmMenuselect();
			No  �� new ���� Ŭ����(); // �̷��� �ű�°� �³� �ʹ� ! 
		}
		*/
		//void vdCustom(???)//��ä Ŀ����();
		/*
		{
		cusKey = 1;
		//���� ���� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (String s: veArray ) //�� ���Ŭ���� ����
		{
			System.out.print(s + " "); // �丶�� ����� ���� ���� �ø��� ���.
		}
		System.out.println();
		System.out.print("�����ϰ� ���� ��ä ������ (�޸�����):"); 

		strTemp = br.readLine();
		String [] strArr = strTemp.split(","); // �丶��, �����, ����
		for (int n : vbArray)
		{
			System.out.println("�丶�� ����� ���� ���� �ø���");
			System.out.printf("%5d\n",n);
		}

		for (int i = 0;i <strArr.length ;i++ )//i  0			1
		{
			for (int j =0;j<veArray.length ;j++ )//0			0 1 2 3
			{
				if (strArr[i] == veArray[j])
				{
					vbArray[j] =0; // 0�� �߰�����.
					break;
				}
			}
		}
		*/
		
		//��äĿ���� �迭 ��� �׽�Ʈ
		/*
		for (int n : vbArray)
		{
			System.out.println("�丶�� ����� ���� ���� �ø���");
			System.out.printf("%5d\n",n);
		}
		*/

		
		// strTemp = �丶��;
		
			//vdArray = 
			//Ŀ���ҿɼ�Ȯ��()
			//pritn(��ä)
		//}
		/*
		scCustom()//�ҽ� Ŀ����();
		{
				Ŀ���ҿɼ�Ȯ��(n)
				print(��ä,�ҽ�)
				decrease()
		}
		*/
		//ccSelect()//ġ��μ����ϱ�();
		//{
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
						System.out.println("�Ƹ޸�ĭ ġ�� ����");

						cCategory[0] = 1;
						cCategory[2] = 0;
					
						break;
					}
					else if (strtmp.equals(chArray[1]))
					{
						System.out.println("������ ġ�� ����");

					    cCategory[1] = 1;
						cCategory[2] = 0;

						break;
					}
					else
						System.out.println("ġ�� �̸��� �ٽ� Ȯ����");
				}
			}
			// ġ�� �迭 �� �׽�Ʈ
			/*
			for (int i=0; i<cCategory.length; i++)
			{
				System.out.print(cCategory[i]);
			}
			System.out.println();
			*/

		
			




			//Ŀ���ҿɼ�Ȯ��()
			//decrease()
		//}
		/*
		----------------------------------
		������ġ - ���׸��� - 15cm
		�丶�� o
		����� o
		����   x
		ġ��   ������
		*/
			

		/*
		addCount();//�����߰��޼ҵ�();
		{
				���� � �߰��ҷ�? : 3��
				n = 3;
				count += n;
				��ä 
				�ҽ�
				ġ��
				
				Ŀ���ҿɼ�Ȯ��(
				~~~~~ , ���׸��仧 4��)
				decrease()
		}

		decrease() //���Ҹ޼ҵ�
		{
			��� ���� - Ŀ���Һ��� <0 // ��ᰡ ����
			�� ���źҰ�. ���ǰ��.
				�Ź� Ŀ������ �� ������ ���Ҹ޼ҵ�() ȣ��
		}

		checkCustom(int n)
		{

			int [] customArray= { ����Ʈ�޴�,������,��ä[0], ��ä[1], ��ä[2], �ҽ�[0], ~~~ };
			for (int ;i <cusKey ;i++ )
			{	
				��ä [2] ���� ��� ~ �̷���.
				print(Ŀ���ҿ�[i]);
				Ŀ���ҿɼ� ���� ��� �迭 ? 
			}
		}
		*/
		
		//=========================================================================================
		// ��ä,�ҽ�,ġ��,��,���̵�޴� ���� ���� �ڷᱸ�� ����
		Map<String, Integer> bread = new HashMap<String, Integer>();
		Map<String, Integer> vegetable = new HashMap<String, Integer>();
		Map<String, Integer> sauce = new HashMap<String, Integer>();
		Map<String, Integer> cheese = new HashMap<String, Integer>();
		Map<String, Integer> sidemenu = new HashMap<String, Integer>();
		
		//�� �ڷᱸ���� �޴� ��ҿ� ���� ���.

		//������
		for (String s :  breArray)
		{
			bread.put(s, 100);
		}

		//��ä����
		for (String s :veArray)
		{
			vegetable.put(s, 100);
		}

		//�ÿ���. �丶�� ��� ���� 0 �� �����ڸ�忡�� ���� ���� �����ֱ�.
		vegetable.put("�丶��",0);
		
		//�ҽ�����
		for (String s : sauArray)
		{
			sauce.put(s, 100);
		}

		
		//ġ������
		for (String s : chArray)
		{
			cheese.put(s, 100);
		}

		//���̵�޴�����	
		for (String s : sideArray)
		{
			sidemenu.put(s, 100);
		}
	
		//�׽�Ʈ
		//System.out.println(sauce.get("���� ��Ͼ�") + "���� ��Ͼ� ����");
		//--==>>100���� ��Ͼ� ����

		//ingPut() // ��� �ֱ� �޼ҵ�
		//{
			Scanner sc = new Scanner(System.in);
			System.out.print("� ������ ���� ���� �ҷ�? : "); // �� ��ä �ҽ�
			String kinds = sc.next();
			
			System.out.print(kinds + " ���� �Է����� : "); // ȭ��Ʈ
			String ingre = sc.next(); 
			
			int tmp = 0; // ��� ���� ����� �ӽ� ����
			switch (kinds) // ���� ��� ������ tmp�� ���
			{
				case "��" : tmp = bread.get(ingre); break;
				case "��ä" : tmp = vegetable.get(ingre); break;
				case "�ҽ�" : tmp = sauce.get(ingre); break;
				case "ġ��" : tmp = cheese.get(ingre); break;
				case "���̵� �޴�" : tmp = sidemenu.get(ingre); break;
			}
			System.out.printf("%s�� ���� ������ %d�̾�.%n", ingre, tmp);
			System.out.print("�󸶳� �ø���? : ");
			int su = sc.nextInt();
			
			tmp += su;
			
			switch (kinds) // ���� ���� + ����ڰ� �Է��� ������ put�ϱ� (�����)
			{
				case "��" : bread.put(ingre,tmp); break;
				case "��ä" : vegetable.put(ingre,tmp); break;
				case "�ҽ�" : sauce.put(ingre,tmp); break;
				case "ġ��" : cheese.put(ingre,tmp); break;
				case "���̵� �޴�" : sidemenu.put(ingre,tmp); break;
			}

			switch (kinds) // �ݿ� �� ���� ���� ��� 
			{
				case "��" : tmp = bread.get(ingre); break;
				case "��ä" : tmp = vegetable.get(ingre); break;
				case "�ҽ�" : tmp = sauce.get(ingre); break;
				case "ġ��" : tmp = cheese.get(ingre); break;
				case "���̵� �޴�" : tmp = sidemenu.get(ingre); break;
			}
			System.out.printf("%s�� ���� �� ������ %d�̾�.%n", ingre, tmp);	
		//}

	}
}