import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Bread extends SuperMenu
{

	String bCategory; // �� ����; ��.bCategory == "���׸���" �� ++;
    int bPrice;       // �� ����;
	int bLength;      // �� ����;
	//String cheeseBread;
	
	/* 
	// ���
	String breadkind;     // �� ���� ���
	String cheese;        // ġ�� ���
	String vegetable[];   // ��ä�� ��� 
	String sauce[];         // �ҽ� ���
	*/


	//������.
	Bread(String strTemp) throws IOException //-- ������ �Ű������� ���׸��� ��ƿ�.
	{

		//���� ������ ���� Ȯ������.
		this.bCategory = strTemp;
		
		System.out.println("Bread�� ������ �Դϴ� : "+ bCategory);
		//String cheese;
		
		//String breadkind;     // �� ���� ���
		//String cheese;        // ġ�� ���
		///String[] vegetable;   // ��ä�� ��� 
		//String[] sauce;         // �ҽ� ��� 
		

		bcSelect();   // �� ����, ���� // ���׸��� 
		//bdCustom();     // �� Ŀ����() // ȭ��Ʈ, ��Ͽ�Ʈ, �÷��귡�� (���)
		//blSelect();     // ������()
		//ccSelect();     // ġ�� Ŀ����() (���)
		//vdCustom();     // ��ä Ŀ����() (���)
		//scCustom();     // �ҽ� Ŀ����() (���)
		
		//addCount();     // ���� �޼ҵ�() (���)
		//decrease();     // ���� �޼ҵ�() (���)
		//addMenu();      // �߰� �޴� �޼ҵ�() (���) �� �̰� ���� �־ ��ü ������ �� �� ���·� add �� �Ǵϱ�
						  //                              Bread() ������ �ȿ��ִ� �������� �������� ���Ѱɷ� ��������µ��ϴ�!
			
	}
	void bcSelect()
	{
		if (bCategory.equals("���׸���"))
		{
			this.bPrice = 4500;
			System.out.println("���� ����ǳ�. ���׸��� ���� 4500��");
		}
		else if (bCategory.equals("��Ż���� ��Ƽ"))
		{
			this.bPrice = 70000;
			System.out.println("���� ����ǳ�. ��Ż���� ��Ƽ ���� 70000��");
		}
		
			
		
	}
	
	/*
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
	*/
	
	
	/*
	void blSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�� ���� �������� 15�� 30�̾�? : ");
		bLength = Integer.parseInt(br.readLine());
	}
	*/
}