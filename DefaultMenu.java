// ���� ���� ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

class DefaultMenu
{
	int dmCategory;       //defaultMenuCategory 
	int dmOption;         //defaultMenuOption   

	void dmSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

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
			else if (strtmp.equals("bmt"))
			{
				System.out.println("bmt ����");
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
	}
}