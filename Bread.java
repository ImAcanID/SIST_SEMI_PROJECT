import java.io.IOException;

class Bread extends SuperMenu
{
	String bCategory; // �� ����; ��.bCategory == "���׸���" �� ++;
    int bPrice;       // �� ����;
	int bLength;      // �� ����;

	Bread() throws IOException //-- ������
	{
		//bcSelect();   // �� ����, ���� // ���׸��� 
		bdCustom();     // �� Ŀ����() // ȭ��Ʈ, ��Ͽ�Ʈ, �÷��귡��
		ccSelect();     // ġ�� Ŀ����()
		vdCustom();     // ��ä Ŀ����()
		scCustom();     // �ҽ� Ŀ����()
	
		//addCount();     // ���� �޼ҵ�()
		decrease();     // ���� �޼ҵ�()
		addMenu();

		//blSelect();     // ������()
	}
	/*
	bcSelect()(int DefaultMenu.dmOption) // 1 -> ��
	{
		if (DefaultMenu.dmCategory == 1)
		{
			bCategory = "���׸���";
			bprice = 4300;
		}
		else if (DefaultMenu.dmCategory == 2)
		{
			bCategory = "��Ż���� ��Ƽ";
			bprice = 5400;
		}
		else if (DefaultMenu.dmCategory == 3)
		{
			bCategory = "�������Ŭ��";
			bprice = 5900;
		}
	}
	*/
	
	/*
	blSelect()
	{
		bLength 15? 30? 
		this.bLength = ����� �Է°�;
	}
	*/
}