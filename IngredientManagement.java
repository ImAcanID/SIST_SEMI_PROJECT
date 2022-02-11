import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class IngredientManagement
{
	public static void main(String[] args) //--�� �̺κ� �����ϰ� 
										   //ingPut()�޼ҵ�� ����������
										   //Ÿ�԰� static, �������������� �޸� ���� Ŭ������ ��!
	{

		// �޴���
		String[] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��귡��"};
		String[] veArray = {"�丶��","�����","����","����","�ø���"};
		String[] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
		String[] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
		String[] sideArray = {"�ݶ�","Ŀ��","��Ű","����","����"};


		// ��ä,�ҽ�,ġ��,��,���̵�޴� ���� ���� �ڷᱸ�� ����
		Map<String, Integer> bread = new HashMap<String, Integer>();
		Map<String, Integer> vegetable = new HashMap<String, Integer>();
		Map<String, Integer> sauce = new HashMap<String, Integer>();
		Map<String, Integer> cheese = new HashMap<String, Integer>();
		Map<String, Integer> sidemenu = new HashMap<String, Integer>();
					

		//�� �ڷᱸ���� �޴� ��ҿ� ���� ���.

		//������
		
		for(String s:breArray)
		{
			bread.put(s, 100);
		}

		//��ä����
		for(String s:veArray)
		{
			vegetable.put(s, 100);
		}

		//�ÿ���. �丶�� ��� ���� 0 �� �����ڸ�忡�� ���� ���� �����ֱ�.
		vegetable.put("�丶��",0);
		
		//�ҽ�����
		for(String s:sauArray)
		{
			sauce.put(s, 100);
		}

		
		//ġ������
		for(String s:chArray)
		{
			cheese.put(s, 100);
		}

		//���̵�޴�����	
		for(String s:sideArray)
		{
			sidemenu.put(s, 100);
		}
		

		//�׽�Ʈ
		//System.out.println(sauce.get("���� ��Ͼ�") + "���� ��Ͼ� ����");
		//--==>>100���� ��Ͼ� ����

		// ��� �ֱ� �޼ҵ�
		//void ingPut()
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
	}
}

