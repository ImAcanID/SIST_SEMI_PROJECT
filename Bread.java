import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Bread extends SuperMenu
{

	String bCategory; // �� ����; ��.bCategory == "���׸���" �� ++;
    int bPrice;       // �� ����;
	int bLength;      // �� ����;
	//String cheeseBread;
	
	/* ����ؿ�.
	// ��� Ŭ�������� �޾ƿ� ����.
	String[] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��극��"};
	String[] veArray = {"�丶��","�����","����","����","�ø���"};
	String[] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
	String[] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
	String[] sideArray = {"�ݶ�","Ŀ��","��Ű","����","����"};

	// �������� �����ϱ� ���� �迭�� ����.
	int[] bdArray = {0, 0, 0}; // ��
	int[] cCategory = {0, 0, 1}; // ġ�� ī�װ�
	int[] vbArray = {1, 1, 1, 1, 1}; // ��ä 
	int[] scArray = {0, 0, 0, 0, 0}; // �ҽ�

	
	int count = 1;
	int cusKey; //-- ���߿� ����ɼ�����Ǵ°� Ȯ���� �� ���.
	String strTemp; 
	
	String breadkind;     // �� ���� ���
	String cheese;        // ġ�� ���
	String[] vegetable;   // ��ä�� ��� 
	String[] sauce;         // �ҽ� ��� 
	*/


	//������.
	Bread(String strTemp) throws IOException //-- ������ �Ű������� ���׸��� ��ƿ�.
	{

		//���� ������ ���� Ȯ������.
		this.bCategory = strTemp;
		
		//System.out.println("Bread�� ������ �Դϴ� : "+ bCategory);
		//String cheese;
		
		//String breadkind;     // �� ���� ���
		//String cheese;        // ġ�� ���
		///String[] vegetable;   // ��ä�� ��� 
		//String[] sauce;         // �ҽ� ��� 
		

		bcSelect();   // �� ����, ���� // ���׸��� 
		bdCustom();     // �� Ŀ����() // ȭ��Ʈ, ��Ͽ�Ʈ, �÷��귡�� (���)
		blSelect();     // ������()
		ccSelect();     // ġ�� Ŀ����() (���)
		vdCustom();     // ��ä Ŀ����() (���)
		scCustom();     // �ҽ� Ŀ����() (���)
		
		//addCount();     // ���� �޼ҵ�() (���)
		//decrease();     // ���� �޼ҵ�() (���)
		//addMenu();      // �߰� �޴� �޼ҵ�() (���) �� �̰� ���� �־ ��ü ������ �� �� ���·� add �� �Ǵϱ�
						  //                              Bread() ������ �ȿ��ִ� �������� �������� ���Ѱɷ� ��������µ��ϴ�!
			
	}
	void bcSelect()
	{
		if (bCategory.equals("���׸���"))
		{
			this.bPrice = 4500; //���׸��� ���� ���� ����(������� ���⿡ + 1700��)
			//System.out.println("���� ����ǳ�. ���׸��� ���� 4500��");
		}
		else if (bCategory.equals("��Ż���� ��Ƽ"))
		{
			this.bPrice = 70000;
			//System.out.println("���� ����ǳ�. ��Ż���� ��Ƽ ���� 70000��");
		}
		else if (bCategory.equals("�������Ŭ��"))
		{
			this.bPrice = 33333;
		}
		
	} //end bcSelect()
	
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
	
	
	void blSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("���� ������ ���� ���� [15cm, 30cm]");
		System.out.print("���� ���̸� ������ �ּ���(15, 30) : ");
		bLength = Integer.parseInt(br.readLine());
	}
	
}