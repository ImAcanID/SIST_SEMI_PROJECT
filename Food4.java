
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Food4
{

	public static void main(String[] args) throws IOException
	{
		//�޴��� static final�� ����.
		String [] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��귡��"};
		String [] veArray = {"�丶��","�����","����","����","�ø���"};
		String [] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
		String [] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
		String [] sideArray = {"�ݶ�","Ŀ��","��Ű","����","����"};

		//����ڰ� �Է��� Ŀ���� ����.
		int [] vbArray = {1, 1, 1, 1, 1};
		int [] scArray = {0, 0, 0, 0, 0}; 
		int cCategory; 
		int count = 1;
		int cusKey;
		String strTemp;
		/*
		vdArray [] = {1,1,1};        //vegetableArray��äĿ���� []  //-- ��ä�� ���Ŵϱ� 1�� �̸� �ʱ�ȭ
		scArray [] ={0, 0, 0, 0};    //souceArray �ҽ�Ŀ����    // --�ҽ��߰��ϸ� 1�� �ʱ�ȭ
		cCategory;                   //cheeseCategory 1 2 3 int 
		count = 1;                   //����
		*/
		/*
		???addMenu(???)
		{
			Yes �� 
				DefaultMenu  dm = new DefaultMenu () // �ν��Ͻ� ���� Ŭ���������� ���߿� �ʿ��ϸ� ���.
				dm.dmMenuselect();
			No  �� new ���� Ŭ����(); // �̷��� �ű�°� �³� �ʹ� ! 
		}
		*/
		//void vdCustom(???)//��ä Ŀ����();
		//{
			/*
			cusKey = 1;
			//���� ���� ����
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			for (String s: veArray ) //�� ���Ŭ���� ����
			{
				System.out.print(s + " "); // �丶�� ����� ���� ���� �ø��� ���.
			}
			System.out.println();
			System.out.print("�����ϰ� ���� ��ä ������ (�޸�����):"); 

			strTemp = br.readLine();
			String [] strArr = strTemp.split(","); // �丶��, �����, ����
			for (int n : vbArray)
			{
				System.out.println("�丶�� ����� ���� ���� �ø���");
				System.out.printf("%5d\n",n);
			}
			

			for (int i = 0;i <strArr.length ;i++ )//i  0			1
			{
				for (int j =0;j<veArray.length ;j++ )//0			0 1 2 3
				{
					if (strArr[i] == veArray[j])
					{
						vbArray[j] =0; // 0�� �߰�����.
					}
				}
			}
			
			
			//��äĿ���� �迭 ��� �׽�Ʈ
			for (int n : vbArray)
			{
				System.out.println("�丶�� ����� ���� ���� �ø���");
				System.out.printf("%5d\n",n);
			}

			
			// strTemp = �丶��;

			vdArray = 
			Ŀ���ҿɼ�Ȯ��()
			pritn(��ä)
		}
		*/

		//void scCustom() //�ҽ� Ŀ����();
		//int [] scArray = {0, 0, 0, 0, 0}; 
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (String s: sauArray ) //�� ���Ŭ���� ����
		{
			System.out.print(s + " "); // ���� ��Ͼ�,���� ĥ��,��ġ �巹��,�ҽ�����
		}
		System.out.println();
		
		System.out.print("�߰��ϰ� ���� �ҽ� ������ (�޸�����):"); 
		strTemp = br.readLine();
		
		String [] strArr = strTemp.split(","); // ���� ��Ͼ�,���� ĥ��
		
		for (int i = 0; i<strArr.length; i++ )  
		{
			for (int j =0; j<sauArray.length ; j++)
			{
				if (strArr[i].equals(sauArray[j]))
				{
					scArray[j] = 1; // �߰�
				}
			}
		}
		
		//�ҽ�Ŀ���� �迭 ��� �׽�Ʈ
		for (int n : scArray)
		{
			System.out.printf("%5d\n",n);
		}

		
		/*
		ccSelect()//ġ��μ����ϱ�();
		{ 
			n = 2

				Ŀ���ҿɼ�Ȯ��()
				decrease()
		}
		----------------------------------
		������ġ - ���׸��� - 15cm
		�丶�� o
		����� o
		����   x
		ġ��   ������
		*/
			

	
		//addCount();//�����߰��޼ҵ�();
		//int count = 1;
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("���� � �߰��Ͻǰǰ���? : ");
		int num = Integer.parseInt(br.readLine());
		count += num;
		System.out.println(count);	
		
		decrease();

		*/

		//addCount();//�����߰��޼ҵ�(); // �Ű����� �����غ���
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (������ != 0)
		{	
			System.out.printf("\n���� :%d�� �ֽ��ϴ�\n", count); 
			System.out.print("���� � �߰���ų�ǰ���? : ");
			int num = Integer.parseInt(br.readLine());
			if (num < ������)
			{
				count += num;
				System.out.println("Ŀ���� �� ���� :" + count);
			}
		}
		else // �ٵ� �̰͵� ���� ��ü ������ ������ ������� ��... 
		{
			System.out.println("��ᰡ ǰ���Ǿ� �߰��� �� �����ϴ�.");
		}
		
		
		//decrease() //���Ҹ޼ҵ�
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (count > 0)
		{	
			System.out.printf("\n���� :%d�� �ֽ��ϴ�\n", count); 
			System.out.print("���� � ���ҽ�ų�ǰ���? : ");
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
		*/

	

		

	

		/*
		System.out.println(count);	
		��� ���� - Ŀ���Һ��� <0 // ��ᰡ ����
			�� ���źҰ�. ���ǰ��.
				�Ź� Ŀ������ �� ������ ���Ҹ޼ҵ�() ȣ��
		}

		checkCustom(int n)
		{

			int [] customArray= { ����Ʈ�޴�,������,��ä[0], ��ä[1], ��ä[2], �ҽ�[0], ~~~ };
			for (int ;i <cusKey ;i++ )
			{	
				��ä [2] ���� ��� ~ �̷���.
				print(Ŀ���ҿ�[i]);
				Ŀ���ҿɼ� ���� ��� �迭 ? 
			}
		}

*/

		/*

		// ��ä,�ҽ�,ġ��,��,���̵�޴� ���� ���� �ڷᱸ�� ����
		Map<String, Integer> bread = new HashMap<String, Integer>();
		Map<String, Integer> vegetable = new HashMap<String, Integer>();
		Map<String, Integer> sauce = new HashMap<String, Integer>();
		Map<String, Integer> cheese = new HashMap<String, Integer>();
		Map<String, Integer> sidemenu = new HashMap<String, Integer>();
		
		


		//�� �ڷᱸ���� �޴� ��ҿ� ���� ���.

		//������
		for (String s :  breArray)
		{
			bread.put(s, 100);
		}

		//��ä����
		for (String s :veArray)
		{
			vegetable.put(s, 100);
		}

		//�ÿ���. �丶�� ��� ���� 0 �� �����ڸ�忡�� ���� ���� �����ֱ�.
		vegetable.put("�丶��",0);
		
		//�ҽ�����
		for (String s : sauArray)
		{
			sauce.put(s, 100);
		}

		
		//ġ������
		for (String s : chArray)
		{
			cheese.put(s, 100);
		}

		//���̵�޴�����	
		for (String s : sideArray)
		{
			sidemenu.put(s, 100);
		}
	
		//�׽�Ʈ
		//System.out.println(sauce.get("���� ��Ͼ�") + "���� ��Ͼ� ����");
		//--==>>100���� ��Ͼ� ����

		//ingPut() // ��� �ֱ� �޼ҵ�
		//{
			Scanner sc = new Scanner(System.in);
			System.out.print("� ������ ���� ���� �ҷ�? : "); // �� ��ä �ҽ�
			String kinds = sc.next();
			
			System.out.print(kinds + " ���� �Է����� : "); // ȭ��Ʈ
			String ingre = sc.next(); 
			
			int tmp = 0; // ��� ���� ����� �ӽ� ����
			switch (kinds) // ���� ��� ������ tmp�� ���
			{
				case "��" : tmp = bread.get(ingre); break;
				case "��ä" : tmp = vegetable.get(ingre); break;
				case "�ҽ�" : tmp = sauce.get(ingre); break;
				case "ġ��" : tmp = cheese.get(ingre); break;
				case "���̵� �޴�" : tmp = sidemenu.get(ingre); break;
			}
			System.out.printf("%s�� ���� ������ %d�̾�.%n", ingre, tmp);
			System.out.print("�󸶳� �ø���? : ");
			int su = sc.nextInt();
			
			tmp += su;
			
			switch (kinds) // ���� ���� + ����ڰ� �Է��� ������ put�ϱ� (�����)
			{
				case "��" : bread.put(ingre,tmp); break;
				case "��ä" : vegetable.put(ingre,tmp); break;
				case "�ҽ�" : sauce.put(ingre,tmp); break;
				case "ġ��" : cheese.put(ingre,tmp); break;
				case "���̵� �޴�" : sidemenu.put(ingre,tmp); break;
			}

			switch (kinds) // �ݿ� �� ���� ���� ��� 
			{
				case "��" : tmp = bread.get(ingre); break;
				case "��ä" : tmp = vegetable.get(ingre); break;
				case "�ҽ�" : tmp = sauce.get(ingre); break;
				case "ġ��" : tmp = cheese.get(ingre); break;
				case "���̵� �޴�" : tmp = sidemenu.get(ingre); break;
			}
			System.out.printf("%s�� ���� �� ������ %d�̾�.%n", ingre, tmp);	
		//}
		*/

	}
}