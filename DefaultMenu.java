// ���� ���� ��
class DefaultMenu
{
	int dmCategory;       //defaultMenuCategory 
	int dmOption;         //defaultMenuOption   

	dmSelect()
	{
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
	}
}