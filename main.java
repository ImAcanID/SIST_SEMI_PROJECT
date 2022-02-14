import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class main
{
	static final int TIME_DISCOUNT_MONEY = 1000;
	static final int AGE_DISCOUNT_MONEY = 500;
	static final int LONG_BREAD_MONEY= 4900;

	static Customer[] ct;		// �մ� ���� ����
	static boolean isTakeOut;	// ����ũ�ƿ� ����
	static Sales sales;
	
	static EventTime time;		// �ð� ����, �̺�Ʈ ��� ����, �̺�Ʈ ��� ���� ��� ����.
	static IngredientManagement iim;
	
	public static void main(String[] args) throws IOException
	{
		boolean checkManager;	// ���������� üũ�ϴ� �뵵
		
		time = new EventTime();	// �ð�, �̺�Ʈ ���� �ð� ��ü ����
		sales = new Sales();	// �Ǹų��� 
		iim = new IngredientManagement();	// ��� ����
				
		ct = new Customer[4];  // ��� ���� ������.
		ct[0] = new Customer("�迵��", 12234, 1500);  // �̸�, �������ȣ, �ܿ�����Ʈ
		ct[1] = new Customer("���̶�", 12352, 1000);
		ct[2] = new Customer("�ּ���", 15773, 500);
		ct[3] = new Customer("���μ�", 33214, 200);
			
		while(true)
		{

			checkManager = printFirst();	// ����ũ�ƿ����� �� ����
			
			if(checkManager)				// �����ڸ�忡 ���ٿ��� ��� �ٽ� �ʱ�ȭ
			{	
				ManagerMode();
				continue;
			}
			DefaultMenu dm = new DefaultMenu(); //���� ����
			
			Payment payment = new Payment(dm.breadArrayList, dm.saladArrayList, dm.sidemenuArrayList);
						
			//System.out.println("ù��° breadArrayList�� ��� : " + dm.breadArrayList.get(0));
			//System.out.println("�ι�° breadArrayList�� ��� : " + dm.breadArrayList.size()); // 3������ �����ؾ� ����غ��ڳ�.
			/*
			//dm �˻��
			System.out.println("���ݱ����� ������ ����� ���ڸ�...");
			for (int i = 0;i<dm.breadArrayList.size();i++)
			{
				System.out.println("======================================================");
				System.out.print("           �޴� :  " +dm.breadArrayList.get(i).bCategory);
				System.out.println();
				System.out.print("           ���� : " + dm.breadArrayList.get(i).bPrice);
				System.out.println();
				System.out.print("        �� ���� : " + dm.breadArrayList.get(i).bLength);
				System.out.println();
				System.out.print("        �� ���� : " + dm.breadArrayList.get(i).breadkind);
				System.out.println();
				System.out.print("      ���� ġ�� : " + dm.breadArrayList.get(i).cheese);
			}
			System.out.println();
			*/
			
		}
	}
	
	static void ManagerMode()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int input = 0;
		
		
		
		while (input!= 1 && input!= 2)
		{
			
			try
			{
				System.out.println("�� ���� ����");
				System.out.println("�� �Ǹ� ���� ���");
				System.out.print("�� �� �Է�(1~2): ");
				input = Integer.parseInt(br.readLine());
				System.out.println();
			}
			catch (NumberFormatException e)
			{
				continue;
			}
			catch (IOException e1)
			{
				continue;
			}
		}	
		
		if(input == 1)
			iim.ingPut();

		else
			sales.print();
		

	}

	static boolean printFirst()
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = -1;
		
		do
		{
			try
			{
				System.out.printf("���忡�� ��� �Ÿ�  \"0\"\n����ũ�ƿ� �ϽǰŸ� \"1\" �Է�: ");
				choice = Integer.parseInt(br.readLine());
				System.out.println();
			}
			catch (NumberFormatException e)
			{
				continue;
			}
			catch (IOException e1)
			{
				continue;
			}
		}
		while (choice != 1 && choice != 0 && choice != 1234);	
		

		if (choice == 1234)
		{
			return true;
		}
		
		if (choice == 1)
			isTakeOut = true;
		else
			isTakeOut = false;
		return false;
	}
}