// ���� ���� ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

class DefaultMenu
{
	// �� ������ ���������� Ȯ�� �ʿ�
	int dmCategory;       //defaultMenuCategory 
	int dmOption;         //defaultMenuOption   

	void dmSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		// ����Ʈ �޴� ����
		while (true)
		{
			System.out.print("�޴��� ������ �ּ���(���׸���, ��Ż���� ��Ƽ, �������Ŭ��) : ");
			String strtmp = br.readLine();

			if (strtmp.equals("���׸���"))
			{
				System.out.println("���׸��� ����"); // �׽�Ʈ ���
				dmCategory = 1;
				break;
			}
			else if (strtmp.equals("��Ż���� ��Ƽ"))
			{
				System.out.println("��Ż���� ��Ƽ ����"); // �׽�Ʈ ���
				dmCategory = 2;
				break;
			}
			else if (strtmp.equals("�������Ŭ��"))
			{
				System.out.println("�������Ŭ�� ����"); // �׽�Ʈ ���
				dmCategory = 3;
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
				System.out.println("�� ����"); // �׽�Ʈ ���
				dmOption = 1;
				ArrayList<Bread> breadArrayList = new ArrayList<Bread>();  // ���� ��� ArrayList
				breadArrayList.add(bread1);   // �߰� �ֹ� ����Ǵ��� Ȯ��
				break;
			}
			else if (strtmp.equals("������"))
			{
				System.out.println("������ ����"); // �׽�Ʈ ���
				dmOption = 2;
				Salad salad1 = new Salad(); // ������ ��ü ����
				ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static ���� // �����常 ��� ArrayList
				saladArrayList.add(salad1);
				break;
			}
			else if (strtmp.equals("���̵� �޴�"))
			{
				dmOption = 3;

				SideMenu sidemenu1 = new sidemenu();

				ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 
				sideMenuArrayList.add(sidemenu1);
			}
			else if (strtmp.equals("���� �ֹ� �ɼ�"))
			{
				dmOption = 4;

				nowOrderOption(); // nowOrderOption() ȣ��
			}
			else
				System.out.println("�ٽ� Ȯ���� �ּ���.");
		}
	}
}