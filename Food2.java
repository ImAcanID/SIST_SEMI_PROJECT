
		//��� ���� Ŭ����
//class IngManagement 
//{		
	/*
		// ��ä,�ҽ�,ġ��,��,���̵�޴� ���� ���� �ڷᱸ�� ����
		Map<String, int> bread = new HashMap<String, int>();
		Map<String, int> vegetable = new HashMap<String, int>();
		Map<String, int> sauce = new HashMap<String, int>();
		Map<String, int> cheese = new HashMap<String, int>();
		Map<String, int> sidemenu = new HashMap<String, int>();
		
		String [] breArray= {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��귡��"};
		String [] vaArray = {"�丶��","�����","����","����","�ø���"};
		String [] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
		String [] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
		String [] sidArray = {"�ݶ�","Ŀ��","��Ű","����","����"};

		for (String s : breArray)
		{
			bread.put(s, 0);
		}


		for (String s : vaAray)
		{
			vegetable.put(s, 100);
		}

		vegetable.put("�丶��",0);

		for (String s : sauArray)
		{
			sauce.put(s, 0);
		}

		
		for (String s : chArray)
		{
			cheese.put(s, 0);
		}

			
		for (String s : sidArray)
		{
			sidemenu.put(s, 0);
		}
	
		void 
		System.out.println(vegetable.get("�丶��") + "�丶�� ����");
		
		*/
		/*
		ingPut() 
		{
			do
			{
				Scanner sc = new Scanner(System.in);
				System.out.print("��������� ���� ���� ���� �÷�?");
				que = sc.next();
			}
			while ();
			~~ n 
				~~n1
				put(n,n1);
			
		}
		*/
//}
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Food2
{

	public static void main(String[] args)
	{
		// ��ä,�ҽ�,ġ��,��,���̵�޴� ���� ���� �ڷᱸ�� ����
		Map<String, Integer> bread = new HashMap<String, Integer>();
		Map<String, Integer> vegetable = new HashMap<String, Integer>();
		Map<String, Integer> sauce = new HashMap<String, Integer>();
		Map<String, Integer> cheese = new HashMap<String, Integer>();
		Map<String, Integer> sidemenu = new HashMap<String, Integer>();
		
		//�޴���
		String [] breArray= {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��귡��"};
		String [] veArray = {"�丶��","�����","����","����","�ø���"};
		String [] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
		String [] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
		String [] sidArray = {"�ݶ�","Ŀ��","��Ű","����","����"};


		//�� �ڷᱸ���� �޴� ��ҿ� ���� ���.

		//������
		for (String s : breArray)
		{
			bread.put(s, 100);
		}

		//��ä����
		for (String s : veArray)
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
		for (String s : sidArray)
		{
			sidemenu.put(s, 100);
		}
	
		//�׽�Ʈ
		//System.out.println(sauce.get("���� ��Ͼ�") + "���� ��Ͼ� ����");
		//--==>>100���� ��Ͼ� ����

		//ingPut() 
		//{
			Scanner sc = new Scanner(System.in);
			String ingre = "";
			System.out.print("� ������ ���� ���� �ҷ�? : "); // �� ��ä �ҽ�
			String kinds = " ";
			kinds = sc.next();
			
			System.out.print(kinds + " ���� �Է����� : "); // ȭ��Ʈ
			ingre = sc.next(); 
			
			/*
			switch (kinds)
			{
				case "��" : System.out.println(ingre + "�� ������ " + bread.get(ingre) + "�̾�."); break;
				case "��ä" : System.out.println(ingre + "�� ������ " + vegetable.get(ingre) + "�̾�."); break;
				case "�ҽ�" : System.out.println(ingre + "�� ������ " + sauce.get(ingre) + "�̾�."); break;
				case "ġ��" : System.out.println(ingre + "�� ������ " + cheese.get(ingre) + "�̾�."); break;
				case "���̵� �޴�" : System.out.println(ingre + "�� ������ " + sidemenu.get(ingre) + "�̾�."); break;
			}
			*/
			int tmp = 0;
			switch (kinds)
			{
				case "��" : tmp = bread.get(ingre); break;
				case "��ä" : tmp = vegetable.get(ingre); break;
				case "�ҽ�" : tmp = sauce.get(ingre); break;
				case "ġ��" : tmp = cheese.get(ingre); break;
				case "���̵� �޴�" : tmp = sidemenu.get(ingre); break;
			}
			System.out.printf("%s�� ������ %d�̾�.%n", ingre, tmp);
			System.out.print("�󸶳� �ø���?: ");
			int su = sc.nextInt();
			
			tmp += su;
			/*
			if (kinds == "��")
			{
				bread.put(ingre,tmp);
			}
			else if (kinds == "��ä")
			{
				vegetable.put(ingre,tmp);
				System.out.println("���");
			}
			else if (kinds == "�ҽ�")
			{
				sauce.put(ingre,tmp);
			}
			else if (kinds == "ġ��")
			{
				cheese.put(ingre,tmp);
			}
			else if (kinds == "���̵� �޴�")
			{
				sidemenu.put(ingre,tmp);
			}
			*/

			switch (kinds)
			{
				case "��" : bread.put(ingre,tmp); break;
				case "��ä" : vegetable.put(ingre,tmp); break;
				case "�ҽ�" : sauce.put(ingre,tmp); break;
				case "ġ��" : cheese.put(ingre,tmp); break;
				case "���̵� �޴�" : sidemenu.put(ingre,tmp); break;
			}
			System.out.println(ingre + "�� ������ " + vegetable.get(ingre) + "�̾�.");

			
			


		//}

	}
}