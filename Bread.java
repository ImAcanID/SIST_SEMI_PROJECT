import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Bread extends SuperMenu
{
	String bCategory; // �� ����; ��.bCategory == "���׸���" �� ++;
    int bPrice;       // �� ����;
	int bLength;      // �� ����;
	
	/* 
	// ���
	String breadkind;     // �� ���� ���
	String cheese;        // ġ�� ���
	String vegetable[];   // ��ä�� ��� 
	String sauce[];         // �ҽ� ���
	*/

	Bread() throws IOException //-- ������
	{
		/*
		String breadkind;     // �� ���� ���
		String cheese;        // ġ�� ���
		String[] vegetable;   // ��ä�� ��� 
		String[] sauce;         // �ҽ� ��� 
		*/

		bcSelect();   // �� ����, ���� // ���׸��� 
		bdCustom();     // �� Ŀ����() // ȭ��Ʈ, ��Ͽ�Ʈ, �÷��귡�� (���)
		blSelect();     // ������()
		ccSelect();     // ġ�� Ŀ����() (���)
		vdCustom();     // ��ä Ŀ����() (���)
		scCustom();     // �ҽ� Ŀ����() (���)
		
		//addCount();     // ���� �޼ҵ�() (���)
		//decrease();     // ���� �޼ҵ�() (���)
		addMenu();      // �߰� �޴� �޼ҵ�() (���)
	}
	
	void bcSelect() // 1 -> ��
	{
		if (DefaultMenu.dmCategory == 1)
		{
			this.bCategory = "���׸���";
			this.bPrice = 4300;
		}
		else if (DefaultMenu.dmCategory == 2)
		{
			this.bCategory = "��Ż���� ��Ƽ";
			this.bPrice = 5400;
		}
		else if (DefaultMenu.dmCategory == 3)
		{
			this.bCategory = "�������Ŭ��";
			this.bPrice = 5900;
		}
	}
	
	void blSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�� ���� �������� 15�� 30�̾�? : ");
		bLength = Integer.parseInt(br.readLine());
	}
}