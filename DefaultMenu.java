// ���� ���� ��

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator; 

public class DefaultMenu
{
	// �� ������ ���������� Ȯ�� �ʿ�
	static int dmCategory;       //defaultMenuCategory 
	static int dmOption;         //defaultMenuOption   

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
		SuperMenu sm = new SuperMenu();
		ArrayList<Bread> breadArrayList = new ArrayList<Bread>();  // ���� ��� ArrayList
		ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static ���� // �����常 ��� ArrayList
		ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 

		while (true)
		{
			System.out.print("������ ������ �ּ���(��, ������, ���̵� �޴�, ���� �ֹ� �ɼ�) : ");
			String strtmp = br.readLine();

			if (strtmp.equals("��"))
			{
				System.out.println("�� ����"); // �׽�Ʈ ���
				dmOption = 1;
				breadArrayList.add(new Bread());   // �߰� �ֹ� ����Ǵ��� Ȯ��
				break;
			}
			else if (strtmp.equals("������"))
			{
				System.out.println("������ ����"); // �׽�Ʈ ���
				dmOption = 2;
				Salad salad1 = new Salad(); // ������ ��ü ����
				saladArrayList.add(salad1);
				break;
			}
			else if (strtmp.equals("���̵� �޴�"))
			{
				dmOption = 3;
				//SideMenu sidemenu1 = new sidemenu();
				//sideMenuArrayList.add(sidemenu1);
			}
			else if (strtmp.equals("���� �ֹ� �ɼ�"))
			{
				dmOption = 4;

				//nowOrderOption(); // nowOrderOption() ȣ��
			}
			else
				System.out.println("�ٽ� Ȯ���� �ּ���.");
		}// end while
		
		
		ListIterator<Bread> li = breadArrayList.listIterator();
		//while (li.hasNext())
		//{
			System.out.print(Bread.breadkind);
			System.out.print(Bread.cheese);
			//System.out.print(Bread.vegetable);
			//System.out.print(Bread.sauce);
		//}
		System.out.println();
		
		
		//System.out.println(breadArrayList.get(0));
		
		//Bread bd = new Bread();

		for (int i=0; i<breadArrayList.size(); i++)
		{
			System.out.println(breadArrayList.get(i));
			//System.out.println(breadArrayList.get(1));
			//System.out.println(breadArrayList.get(i).breadkind);
			//System.out.println(bd.breadkind);
			//System.out.println(bd.cheese);
		}
	}
}