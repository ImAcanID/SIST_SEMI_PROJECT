import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// ���� ���� �κ� Food3
public class Food3
{
	public static void main(String[] args) throws IOException
	{
		// ��DefaultMenu Ŭ������
		int dmCategory;       //defaultMenuCategory 
		int dmOption;         //defaultMenuOption   

		//dmSelect()
		//{
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			
			// ����Ʈ �޴� ����
			
			while (true)
			{
			System.out.print("�޴��� ������ �ּ���(���׸���, bmt, �������Ŭ��) : ");
			String strtmp = br1.readLine();

			if (strtmp.equals("���׸���"))
			{
				System.out.println("���׸��� ����");
				Bread bread1 = new Bread(); // �� ��ü ����
				break;
			}
			else if (strtmp.equals("bmt"))
			{
				System.out.println("bmt ����");
				System.out.println("bmt");
				Bread bread1 = new Bread(); // �� ��ü ����
				break;
			}
			else
				System.out.println("�޴� �̸��� �ٽ� Ȯ���� �ּ���");
			}

			// ��, ������, ���̵� ����
			char chtmp;
			boolean isnum = true;

			while (true)
			{
				System.out.print("������ ������ �ּ���(��, ������, ���̵� �޴�, ���� �ֹ� �ɼ�) : ");
				String strtmp = br.readLine();

				if (strtmp.equals("��"))
				{
					System.out.println("�� ����");
					ArrayList<Bread> breadArrayList = new ArrayList<Bread>();  // ���� ��� ArrayList
					breadArrayList.add(bread1);   // �߰� �ֹ� ����Ǵ��� Ȯ��
					break;
				}
				else if (strtmp.equals("������"))
				{
					System.out.println("������ ����");
					Salad salad1 = new Salad(); // ������ ��ü ����
					ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static ���� // �����常 ��� ArrayList
					saladArrayList.add(salad1);
					break;
				}
				else if (strtmp.equals("���̵� �޴�"))
				{
					SideMenu sidemenu1 = new sidemenu();

					ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 
					sideMenuArrayList.add(sidemenu1);
				}
				else if (strtmp.equals("���� �ֹ� �ɼ�"))
				{
					nowOrderOption(); // nowOrderOption() ȣ��
				}
				else
					System.out.println("�ٽ� Ȯ���� �ּ���.");
			}


		//�޴��� static final�� ����.
		String[] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��귡��"};
		String[] veArray = {"�丶��","�����","����","����","�ø���"};
		String[] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
		String[] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
		String[] sideArray = {"�ݶ�","Ŀ��","��Ű","����","����"};
		
		// ��SuperMenu Ŭ������
		//����ڰ� �Է��� Ŀ���� ����.
		int[] vbArray = {1, 1, 1, 1, 1}; // ��ä 
		int[] scArray = {0, 0, 0, 0, 0}; // �ҽ�
		int[] bdArray = {0, 0, 0}; // ��
		int[] cCategory = {0, 0, 1}; // ġ�� ī�װ�
		int count = 1;
		int cusKey;
		String strTemp;
		
		ccSelect()//ġ��μ����ϱ�();
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
			
			// bdCustom() // �� Ŀ���� �޼ҵ�
			// String[] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��극��"};
			while (true)
			{
				System.out.println("�� ����: ȭ��Ʈ, ��Ͽ�Ʈ, �÷��극��");
				System.out.print("�� ����� : ");
				strtmp = br.readLine();

				if (strtmp.equals(breArray[0]))
				{
					System.out.println("ȭ��Ʈ ����");
					break;
				}
				else if (strtmp.equals(breArray[1]))
				{
					System.out.println("��Ͽ�Ʈ ����");
					break;
				}
				else if (strtmp.equals(breArray[2]))
				{
					System.out.println("�÷��귡�� ����");
					break;
				}
				else
					System.out.println("�� �̸��� �ٽ� Ȯ����");
			}
		
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