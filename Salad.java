import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Salad extends SuperMenu 
{
	String sCategory;     // ����Ʈ �޴� ���
	int sPrice;           // �����尡�� ���;
	int sCount = 1;
	static int cccc = 2; ///cccc �� bbbb �� ���� payment.java���� Ȱ��.

	
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
		//ig.addCount();          //�����߰��޼ҵ�();
		//addMenu();           //�߰��޴��޼ҵ�();
	}

	void scSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //--���ڿ� ��� �뵵. 
		do //�� �� ���߿� Bread,SaladŬ�������� ���� ���簡.
		{
			System.out.println("\n���� ������ �޴� [���׸���, ��Ż���� ��Ƽ, ������� Ŭ��]");
			System.out.print("�޴��� �Է��� �ּ��� : ");
			sCategory = br.readLine();
		}
		while (!sCategory.equals("���׸���")&&!sCategory.equals("��Ż���� ��Ƽ")&&!sCategory.equals("������� Ŭ��"));

		if (sCategory.equals("���׸���"))
		{
			this.sCategory = "���׸���";
			this.sPrice = 6000;
		}
		else if (sCategory.equals("��Ż���� ��Ƽ"))
		{
			this.sCategory = "��Ż���� ��Ƽ";
			this.sPrice  = 7100;
		}
		else if (sCategory.equals("������� Ŭ��"))
		{
			this.sCategory = "������� Ŭ��";
			this.sPrice  = 7000;
		}
	}
}