import java.util.Scanner;//--���߿� �����ϼ�.

import java.util.ArrayList;

class SideMenu 
{
//=================================================================
	/*
	//String str = "�ȳ��ϼ���";
	//������
	SideMenu()
	{
		this.str = "���¾� �����";
		System.out.println("���̵�޴� ������ ���� ... ! " );
	}
	*/

//=================================================================	
/*
	//smCategory; //-- ��������
	int smPrice;    //-- ��������

	//������
	SideMenu()
	{
		this.select();//-- ���� �̷� �޼ҵ尡 �ִٰ� �����ϸ�!
	}

	public void select()
	{
		System.out.println("���̵�޴� - ������ - select() ���� �Ϸ�.");
		smPrice = 5500;
	}
	
*/
	int smPrice = 0; // -- ���̵�޴� ����
	int xx; 
	//DafaultMenu.x; //-- ��ӹ޴� ����� �ƴϰ� �� ������ 
				   //   ���� �Ӽ����� ���Ŷ� �̷��� ���������� ����.

	//������
	SideMenu(int x) //--���׸��� BMT �̷���
	{
		this.xx = x; //-- �׷��� ���߿� �̰�ü.xx �ϸ� �̰�ü�� ���׸������� B
					//BMT ���� �˼�����
		smSelect();// -- ���̵�޴����������ϱ� �޼ҵ� ȣ��
		addMenu();// -- �߰��޴��޼ҵ� ȣ�� �� �ٽ� DefaultMenuȣ���ϵ���
	}

	public void smSelect()
	{
		System.out.println("���̵�޴����������ϱ� �޼ҵ� ȣ�� �Ϸ�");
		smPrice = 500;
	}

	public void addMenu() //--SuperMenu�� ���ǵǾ�����!
						  //--�ٵ� �׽�Ʈ�ϱ� ���ؼ� ���⼭ ����.
	{
		DefaultMenu2 dm = new DefaultMenu2();
		dm.dmSelect();

	}
}


class DefaultMenu2
{
	static int x; //-- ��������, ���׸���, BMT, ������ Ŭ��
	static ArrayList<SideMenu> alist = new ArrayList<SideMenu>();
	void dmSelect()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("DafaultMenu2 Ŭ������ dmSelect() ȣ��..");
		System.out.println("1,2,3�߿� �Է� :(���׸��� BMT �̷���)");
		x = sc.nextInt();
		if (x == 1)
		{
			System.out.println("���׸���");
		}
		else if (x == 2)
		{
			System.out.println("BMT");
		}
		else if (x == 3)
		{
			System.out.println("������ Ŭ��");
		}
		System.out.println("if�� �� �ȳ��� ��?");
		SideMenu sd = new SideMenu(x); //--�ϴ� ������ ���̵�޴� ����
		alist.add(sd);
		System.out.println(alist.get(0));
		
	}
}