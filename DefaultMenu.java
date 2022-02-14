import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator; 


public class DefaultMenu
{
//=====================================================================================================================
	String strTemp;  //-- ���ڿ� Ÿ���� �� �׸�.(���׸���,BMT...)
	String strTemp2; //-- ��, ������, ���̵�޴�, �����ֹ�Ȯ���ϱ�..
	int nTemp;       //-- intŸ���� �� �׸�

	int inTemp; //-- �߰��޴� �׸�
	
	static ArrayList<Bread> breadArrayList = new ArrayList<Bread>(); // ����ü�� �ϳ��� ���� ArrayList
	static ArrayList<Salad> saladArrayList = new ArrayList<Salad>();
	static ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 

	// ������.
	DefaultMenu() throws IOException
	{
		dmSelect();
		addMenu();
		dmPrint();
	}

	void dmSelect() throws IOException
	{
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //-- ���ڿ� ��� �뵵. 
		Scanner sc = new Scanner(System.in);

		//System.out.println("��) ����ü ���� �� 1��");
		//System.out.println("��) ���̵�޴���ü ���� �� 3��");
		//System.out.println("�ȳ��ϼ���. SUBWAY�Դϴ�.\n"); // �߰� �ֹ��� ���� �� ������ �� �Ǵµ� �� ���ο��� ��?
		System.out.print("���Ͻô� ������ ��ȣ�� ������ �ּ���.\n�继 ������� ����̵� �޴� ������ �ֹ� �ɼ� : ");
		//strTemp2 = br.readLine();
		nTemp = sc.nextInt();

		if (nTemp == 1)
		{
			breadArrayList.add(new Bread()); // ����ü�� �ϳ� �����ؼ� �ڷᱸ���� ��´�.
			/*
			if (!breadArrayList.isEmpty())
			{
				addCount();

				for (int i = 0;i<breadArrayList.size() ;i++ )
				{
					breadArrayList.get(i).bCount += inTemp;
					System.out.println("���Ⱑ ���ư�?��");
				}
			}
			*/
		}

		else if (nTemp == 2)
		{
			saladArrayList.add(new Salad());
			/*
			if (!saladArrayList.isEmpty())
			{
				addCount();
				for (int i = 0;i<saladArrayList.size() ;i++ )
				{
					saladArrayList.get(i).sCount += inTemp;
					System.out.println("���Ⱑ ���ư�?������");
				}
			}
			*/
		}
		else if (nTemp == 3)
		{
			sidemenuArrayList.add(new SideMenu());
			/*
			if (!sidemenuArrayList.isEmpty())
			{
				addCount();
				for (int i = 0;i<sidemenuArrayList.size() ;i++ )
				{
					sidemenuArrayList.get(i).smCount += inTemp;
				}
			}
			*/
			
		}
		else if (nTemp == 4)
		{
			dmPrint();
		}

		/*
		do //�� �� ���߿� Bread,SaladŬ�������� ���� ���簡.
		{
			System.out.print("�޴��� ������ �ּ���(���׸���, ��Ż���� ��Ƽ, �������Ŭ��) : ");
			strTemp = br.readLine();

		}
		while (!strTemp.equals("���׸���")&&!strTemp.equals("��Ż���� ��Ƽ")&&!strTemp.equals("�������Ŭ��"));
		*/


		
	}

	public void addMenu() throws IOException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String userInput1;
		do
		{
			System.out.print("\n�߰� �ֹ� �Ͻðڽ��ϱ�?(Y/N) : " );
			userInput1= br.readLine();
			if (userInput1.equals("Y") ||userInput1.equals("y"))
			{
				System.out.println();
				this.dmSelect();
			}
				
		}
		while (userInput1.equals("Y") ||userInput1.equals("y"));
		return;
		
	}

	public void dmPrint()  //��������ϱ� , ���⼭ �����ϴ� ���� : ��ü ��� ArrayList�� �̰����� ����Ǿ��� ����!
	{
		System.out.println("\n[���� �ֹ� ���� ���]");

		//ListIterator<String> li = breadArrayList.listIterator();
		//for (int i = 0;i<breadArrayList.size();i++)
		/*
		while (li.hasNext())
		{
			for (int i = 0;i<breadArrayList.size();i++ )
			{
				Bread br1 = (Bread)li.next();// --bread��ü �Ѱ� ������.
				System.out.print("           �޴� :  " +br1.bCategory);
				System.out.println();
			}
		}
	}
}
*/
		if (!breadArrayList.isEmpty())
		{
			for (int i = 0;i<breadArrayList.size();i++)
			{
				/*
				System.out.print("           �޴� : " + breadArrayList.get(i).bCategory);
				System.out.println();
				System.out.print("           ���� : " + breadArrayList.get(i).bPrice);
				System.out.println();
				System.out.print("        �� ���� : " + breadArrayList.get(i).bLength);
				System.out.println();
				System.out.print("        �� ���� : " + breadArrayList.get(i).breadkind);
				System.out.println();
				System.out.print("      ���� ġ�� : " + breadArrayList.get(i).cheese);
				System.out.println();
				*/
				System.out.println("����            : ��");
				System.out.print("�޴�            : " + breadArrayList.get(i).bCategory);
				System.out.println();
				System.out.print("�� ����         : " + breadArrayList.get(i).bLength);
				System.out.println();
				System.out.print("�� ����         : " + breadArrayList.get(i).breadkind);
				System.out.println();
				System.out.print("���� ġ��       : " + breadArrayList.get(i).cheese);
				System.out.println();
				


				//���ż����� ��ä �ҷ�����
				String strTempx; // �׸� �ϳ� �ּ���.
				System.out.print("���� ���� ��ä  : ");
				for (String s :breadArrayList.get(i).vegetable)
				{
					strTempx = s;
					System.out.print(s + " ");
				}
				System.out.println();
			
				//System.out.println();

				//������ �ҽ� �ҷ�����
				
				String strTempy; // �׸� �ϳ� �ּ���.
				System.out.print("���� �ҽ�       : ");
				for (String s :breadArrayList.get(i).sauce)
				{
					strTempy = s;
					System.out.print(s + " ");
				}
				System.out.println();
				System.out.print("����            : " + breadArrayList.get(i).bPrice);
				System.out.println();
				System.out.print("�� ����         : " + breadArrayList.get(i).bCount);
				System.out.println();
				System.out.print("�� ����         : " + breadArrayList.get(i).bCount*breadArrayList.get(i).bPrice);
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
		//System.out.println();

		if (!saladArrayList.isEmpty())
		{
			for (int i = 0;i<saladArrayList.size();i++)
			{
				System.out.println("����            : ������");
				System.out.print("�޴�            : " + saladArrayList.get(i).sCategory);
				System.out.println();
				System.out.print("���� ġ��       : " + saladArrayList.get(i).cheese);
				System.out.println();


				//���ż����� ��ä �ҷ�����
				String strTempx; // �׸� �ϳ� �ּ���.
				System.out.print("���� ���� ��ä  : ");
				for (String s :saladArrayList.get(i).vegetable)
				{
					strTempx = s;
					System.out.print(s + " ");
				}
				System.out.println();
			
				//System.out.println();

				//������ �ҽ� �ҷ�����
				
				String strTempy; // �׸� �ϳ� �ּ���.
				System.out.print("���� �ҽ�       : ");
				for (String s :saladArrayList.get(i).sauce)
				{
					strTempy = s;
					System.out.print(s + " ");
				}
				System.out.println();
				System.out.print("����            : " + saladArrayList.get(i).sPrice);
				System.out.println();
				System.out.print("�� ����         : " + saladArrayList.get(i).sCount);
				System.out.println();
				System.out.print("�� ����         : " + saladArrayList.get(i).sCount*saladArrayList.get(i).sPrice);
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
		//System.out.println();

		if (!sidemenuArrayList.isEmpty()) //-- ���̵�޴��� �ϳ��� ������ �ƴٸ�...
		{
			for (int i = 0;i<sidemenuArrayList.size();i++)
			{
				System.out.println("����            : ���̵� �޴�");
				System.out.print("�޴�            : " + sidemenuArrayList.get(i).smCategory);
				System.out.println();
				System.out.print("���� ����       : " + sidemenuArrayList.get(i).smPrice);
				System.out.println();
				System.out.print("����            : " + sidemenuArrayList.get(i).smCount);
				System.out.println();
				System.out.print("�� ����         : " + sidemenuArrayList.get(i).totsmPrice);
				System.out.println();
			}
			System.out.println();
			System.out.println();
		}
		//System.out.println();	
	}

/*
	void addCount() throws IOException//��ü ���� �ø���
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strTemp;
		int intTemp=0;
		
		//DefaultMenu dm = new DefaultMenu(); // �̷��� ����Ʈ�޴� ������ ������ �� ��

		System.out.print("\n���� �ɼǰ� ���� �޴��� �߰��Ͻðڽ��ϱ�? (Y/N) : ");
		strTemp = br.readLine();
		
		if(strTemp.equals("Y") || strTemp.equals("y"))
		{
			System.out.print("�� �� �߰��Ͻðڽ��ϱ�? : ");
			intTemp = Integer.parseInt(br.readLine());
		}
	}
		/*
		if (!breadArrayList.isEnpty())
		{
			for (int i = 0;i<breadArrayList.size() ;i++ )
			{
				breadArrayList.get(i).bCount += inTemp;
			}
		}
		if (!saladArrayList.isEnpty())
		{
			for (int i = 0;i<saladArrayList.size() ;i++ )
			{
				saladArrayList.get(i).bCount += inTemp;
			}
		}
		if (!sidemenuArrayList.isEnpty())
		{
			for (int i = 0;i<sidemenuArrayList.size() ;i++ )
			{
				sidemenuArrayList.get(i).bCount += inTemp;
			}
		}
		*/
}
	
	//System.out.println();
	
//}
	

	/*
	void addMenu()
	{
	}
	*/
//=====================================================================================================================
	// �� ������ ���������� Ȯ�� �ʿ�
/*
	static int dmCategory;       //defaultMenuCategory //����� ������ ���ϱ� ���� ���������..
	static int dmOption;         //defaultMenuOption 
	static String strtmp;
	ArrayList<Bread> breadArrayList = new ArrayList<Bread>();  // ���� ��� ArrayList
	ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static ���� // �����常 ��� ArrayList
	ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 

	void dmSelect() throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		// ����Ʈ �޴� ����
		while (true)
		{
			System.out.print("�޴��� ������ �ּ���(���׸���, ��Ż���� ��Ƽ, �������Ŭ��) : ");
			//String strtmp = br.readLine();
			strtmp = br.readLine();

			if (strtmp.equals("���׸���"))
			{
				System.out.println("���׸��� ����"); // �׽�Ʈ ���
				dmCategory = 1;
				System.out.println("���� dmCategoty�� ? : " + dmCategory);
				break;
			}
			else if (strtmp.equals("��Ż���� ��Ƽ"))
			{
				System.out.println("��Ż���� ��Ƽ ����"); // �׽�Ʈ ���
				dmCategory = 2;
				System.out.println("���� dmCategoty�� ? : " + dmCategory);
				break;
			}
			else if (strtmp.equals("�������Ŭ��"))
			{
				System.out.println("�������Ŭ�� ����"); // �׽�Ʈ ���
				dmCategory = 3;
				System.out.println("���� dmCategoty�� ? : " + dmCategory);
				break;
			}
			else
				System.out.println("�޴� �̸��� �ٽ� Ȯ���� �ּ���");
		}
		
		// ��, ������, ���̵� ����
		char chtmp;
		boolean isnum = true;
		SuperMenu sm = new SuperMenu();
		
		//ArrayList<Bread> breadArrayList = new ArrayList<Bread>();  // ���� ��� ArrayList
		//ArrayList<Salad> saladArrayList = new ArrayList<Salad>(); // static ���� // �����常 ��� ArrayList
		//ArrayList<SideMenu> sidemenuArrayList = new ArrayList<SideMenu>(); 
		

		while (true)
		{
			System.out.print("������ ������ �ּ���(��, ������, ���̵� �޴�, ���� �ֹ� �ɼ� �Է�) : ");
			//public String strtmp = br.readLine();
			strtmp = br.readLine();

			

			if (strtmp.equals("��"))
			{
				System.out.println("�� ����"); // �׽�Ʈ ���
				dmOption = 1;
				breadArrayList.add(new Bread());   // �߰� �ֹ� ����Ǵ��� Ȯ��
				System.out.println("���ϳ� �ϼ��ϰ� �ٽ� ���ƿԾ�� ~ " ); //-- ������ �ȵƳ�? �� ������ �ȶ�!
				break;
			}
			else if (strtmp.equals("������"))
			{
				System.out.println("������ ����"); // �׽�Ʈ ���
				dmOption = 2;
				Salad salad1 = new Salad(); // ������ ��ü ����
				saladArrayList.add(salad1);
				break;
			}
			else if (strtmp.equals("���̵� �޴�"))
			{
				dmOption = 3;
				//SideMenu sidemenu1 = new sidemenu();
				//sideMenuArrayList.add(sidemenu1);
			}
			else if (strtmp.equals("���� �ֹ� �ɼ�"))
			{
				dmOption = 4;

				//nowOrderOption(); // nowOrderOption() ȣ��
			}
			else
				System.out.println("�ٽ� Ȯ���� �ּ���.");
		}// end while
		
		
		//ListIterator<Bread> li = breadArrayList.listIterator();
		//while (li.hasNext())
		//{
			//System.out.print(Bread.breadkind);
			//System.out.print(Bread.cheese);
			//System.out.print(Bread.vegetable);
			//System.out.print(Bread.sauce);
		//}
		//System.out.println();
		
		
		//System.out.println(breadArrayList.get(0));
		
		//Bread bd = new Bread();

		for (int i=0; i<breadArrayList.size(); i++)
		{
			System.out.println("ArrayList ���� : " + breadArrayList.size());
			System.out.println(breadArrayList.get(i).breadkind);
			//System.out.println(breadArrayList.get(i).cheese);

			//System.out.println("breadArrayList�� ������ : " + breadArrayList.size());
			//System.out.println("ù��° breadArrayList�� ��� : " + breadArrayList.get(0));
			//System.out.println("�ι�° breadArrayList�� ��� : " + breadArrayList.get(breadArrayList.size()));

			//System.out.println(breadArrayList.get(1));
			//System.out.println(breadArrayList.get(i).breadkind);
			//System.out.println(bd.breadkind);
			//System.out.println(bd.cheese);

			//addMenu();
		}
	}

	public void addMenu() throws IOException
	{	
		Scanner sc = new Scanner(System.in);
		int n = 0;
		System.out.print("�߰� �ֹ� �ҰŴ�? (Y/N) �ϴ� 1�Է� �ƴϸ�2 : " );
		n = sc.nextInt();
		if (n == 1)
		{
			this.dmSelect();
		}
		else
		System.out.println("���� ���� â���� �Ѿ���� ! ");
*/
		
	//}
