public class Manager
{
	void ingPut() // ��� �ֱ� �޼ҵ�
	{
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