import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Food5
{
	static int count = 1;
	
	public static void main(String[] args) throws IOException
	{
		//void addCount() throws IOException// ���� �߰� �޼ҵ�(); // �Ű����� �����غ���-------------------------------
		//{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("������ �߰��Ͻǰǰ���?(1�Է�), �����Ͻǰǰ���(2�Է�) : ");
			int num = Integer.parseInt(br.readLine());
			if (num == 1)
			{
				System.out.print("��ŭ �߰���ų�ǰ���?? : ");
				int n = Integer.parseInt(br.readLine());
				count += n;
				System.out.println("�� ���� : " + count);
			}
			else if (num == 2)
			{
				decrease();
			}
			
		//}// end addCount()
	
	}
	static void decrease() throws IOException // ���Ҹ޼ҵ� ----------------------------------------------
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (count > 0)
		{	
			System.out.printf("\n���� :%d�� �ֽ��ϴ�\n", count); 
			System.out.print("��ŭ ���ҽ�ų�ǰ���? : ");
			int num = Integer.parseInt(br.readLine());

			if (count-num >= 0)
			{   
				count -= num;
				System.out.println("���簳�� :" + count);
			}
			else
			{
				System.out.println("���Ҽ����� �ʰ��Ͽ����ϴ�.");
			}
		}
		else 
		{
			System.out.println("������ ������ �����ϴ�.");
		}
	}//end decrease()
}

