

class EunhyeTEST
{
	public static void main(String[] args)
	{
		/*
		ArrayList<SideMenu> alist = new ArrayList<SideMenu>();
		int n = 0; //-- 1�̸� SideMenu������ ����.
		while (n<3)
		{	
			n++;
			SideMenu sd = new SideMenu();
			alist.add(sd); //�� �����ϰ� �߰��ϱ⸦ �ݺ��ϸ� ������ ��Ұ� �ι�° ��ҷ� �ٲ?
			System.out.println("�ݺ��� �ȿ� ArrayList Ȯ�� : " +alist);
		}
		System.out.println("�ݺ��� �ۿ��� ArrayList Ȯ�� : " +alist);
		*/
		
		/*
		SideMenu sd = new SideMenu();
		//--==>>���̵�޴� ������ ���� ... !
		ArrayList<SideMenu> alist = new ArrayList<SideMenu>();
		alist.add(sd);
		System.out.println("ArrayList ���� ������ ��� : " + alist.get(0).smPrice);
		*/
		/*
		���̵�޴� - ������ - select() ���� �Ϸ�.
		ArrayList ���� ������ ��� : 5500
		����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/
		//-->> ��ü�ȿ� ���� (���̵�޴� ���� ~ ���� ~ ���� ��� �̷��� �������� ���� �˾Ҿ�.)
		//	   ������ ��ü�� ��� ��������ٴ� ��!


		DefaultMenu2 dm = new DefaultMenu2();
		dm.dmSelect();

	}
}