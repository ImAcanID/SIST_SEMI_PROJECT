import java.io.IOException;

class Salad extends SuperMenu 
{
	String sCategory;     // ����Ʈ �޴� ���
	int sPrice;           // �����尡�� ���;

	
	/* ���
	String vegetable[];   // ��ä�� ��� 
	//String sauce;         // �ҽ� ��� 
	String cheeze;        // ġ�� ���
	*/

	//int count = 1;            // ���� ���
	
	
	Salad() throws IOException //-- ������.
	{
		scSelect();          //SaladCategory���������� select(����Ʈ n)
		ccSelect();          //ġ��μ����ϱ�();
		vdCustom();          //��ä Ŀ����();
		scCustom();          //�ҽ� Ŀ����();
		//addCount();          //�����߰��޼ҵ�();
		addMenu();           //�߰��޴��޼ҵ�();
	}

	void scSelect() 
	{
		if (DefaultMenu.dmCategory == 1)
		{
			this.sCategory = "���׸���";
			this.sPrice = 4300;
		}
		else if (DefaultMenu.dmCategory == 2)
		{
			this.sCategory = "��Ż���� ��Ƽ";
			this.sPrice  = 5400;
		}
		else if (DefaultMenu.dmCategory == 3)
		{
			this.sCategory = "�������Ŭ��";
			this.sPrice  = 5900;
		}
	}
}