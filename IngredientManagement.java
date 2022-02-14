import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class IngredientManagement
{
	//public static void main(String [] args)
	//{
	
	// �޴���
	String[] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷� �극��"};
	String[] veArray = {"�丶��","�����","����","����","�ø���"};
	String[] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
	String[] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
	String[] sideArray = {"�ݶ�","Ŀ��","��Ű","����","����"};


	// ��ä,�ҽ�,ġ��,��,���̵�޴� ���� ���� �ڷᱸ�� ����
	Map<String, Integer> bread = new HashMap<String, Integer>();
	Map<String, Integer> vegetable = new HashMap<String, Integer>();
	Map<String, Integer> sauce = new HashMap<String, Integer>();
	Map<String, Integer> cheese = new HashMap<String, Integer>();
	Map<String, Integer> sidemenu = new HashMap<String, Integer>();
				
	
	//������
	IngredientManagement()
	{
		input2();
	}
	//�� �ڷᱸ���� �޴� ��ҿ� ���� ���.
	
	//������
	void input2() //�ʱ� ��� ����.
	{
		for(String s:breArray)
		{
			bread.put(s, 100);
		}
		//bread.put("ȭ��Ʈ", 0);

		//��ä����
		for(String s:veArray)
		{
			vegetable.put(s, 100);
		}
		//vegetable.put("�丶��", 0);

		//�ÿ���. �丶�� ��� ���� 0 �� �����ڸ�忡�� ���� ���� �����ֱ�.
		//vegetable.put("�丶��",0);
		
		//�ҽ�����
		for(String s:sauArray)
		{
			sauce.put(s, 100);
		}
		//sauce.put("���� ��Ͼ�", 0);
		
		//ġ������
		for(String s:chArray)
		{
			cheese.put(s, 100);
		}
		//cheese.put("�Ƹ޸�ĭ ġ��", 0);

		//���̵�޴�����	
		for(String s:sideArray)
		{
			sidemenu.put(s, 100);
		}
	}
		

		//�׽�Ʈ
		//System.out.println(sauce.get("���� ��Ͼ�") + "���� ��Ͼ� ����");
		//--==>>100���� ��Ͼ� ����

		// ��� �ֱ� �޼ҵ� �� ���α׷� main() ���� ������ ��忡�� ����.
	/*
	void ingPut()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("[��, ġ��, ��ä, �ҽ�, ���̵�]");
		System.out.print("� �׸��� ��Ḧ �����Ͻðڽ��ϱ�? : "); // �� ��ä �ҽ�
		String kinds = sc.next();
		System.out.print(kinds + " ����� �̸��� �Է��� �ּ��� : "); // ȭ��Ʈ
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
		System.out.printf("%s�� ���� ������ %d�Դϴ�.%n", ingre, tmp);
		System.out.print("������ų ������ �Է��� �ּ��� : ");
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
		System.out.printf("%s�� ���� �� ������ %d�Դϴ�.%n", ingre, tmp);
	}
	*/
	void managementD() throws IOException// ǰ����Ű�� �޼ҵ�
	{	
		//Scanner sc = new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		//System.out.println("[��, ��ä, ġ��, �ҽ�, ���̵�]");
		//System.out.print("� �׸��� ��Ḧ �����Ͻðڽ��ϱ�? : "); // �� ��ä �ҽ�
		//String kinds = sc.next();

		//�޴��� ���������. ����ڰ� ���ϰ�!
		System.out.println("============================================");
		System.out.print("ī�װ�     ����");
		System.out.print("\n��          : ");
		for (String s:breArray)
		{
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.print("��ä        : ");
		for (String s:veArray)
		{
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.print("�ҽ�        : ");
		for (int i = 0; i<sauArray.length-1;i++)//�迭�� �ҽ����ܴ� ����!
		{
			System.out.print(sauArray[i] + " ");
		}
		System.out.println();
		System.out.print("ġ��        : ");
		
		for (int i = 0;i<chArray.length-1;i++ )//�迭�� ġ�����ܴ� ����!
		{
			System.out.print(chArray[i] + " ");
		}
		System.out.println();

		System.out.print("���̵� �޴� : ");
		for (String s:sideArray)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.print("ǰ�� ��ų ����� �̸��� �Է��� �ּ��� : "); // ȭ��Ʈ
		String ingre = br.readLine(); // ����̸��� ���� ĥ�� ���� ���⵵ �� ���ڿ��� ó���ϱ� ���ؼ� BufferedReader ���!. 
		/*
		int tmp = 0; // ��� ���� ����� �ӽ� ����
		switch (kinds) // ���� ��� ������ tmp�� ���
		{
			case "��" : tmp = bread.get(ingre); break;
			case "��ä" : tmp = vegetable.get(ingre); break;
			case "�ҽ�" : tmp = sauce.get(ingre); break;
			case "ġ��" : tmp = cheese.get(ingre); break;
			case "���̵� �޴�" : tmp = sidemenu.get(ingre); break;
		}
		System.out.printf("%s�� ���� ������ %d�Դϴ�.%n", ingre, tmp);
		//int su = sc.nextInt();
		
		tmp += su;
		String[] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷� �극��"};
	String[] veArray = {"�丶��","�����","����","����","�ø���"};
	String[] sauArray = {"���� ��Ͼ�","���� ĥ��","��ġ �巹��","�ҽ�����"};
	String[] chArray = {"�Ƹ޸�ĭ ġ��","������ ġ��","ġ������"};
	String[] sideArray = {"�ݶ�","Ŀ��","��Ű","����","����"};


	// ��ä,�ҽ�,ġ��,��,���̵�޴� ���� ���� �ڷᱸ�� ����
	Map<String, Integer> bread = new HashMap<String, Integer>();
	Map<String, Integer> vegetable = new HashMap<String, Integer>();
	Map<String, Integer> sauce = new HashMap<String, Integer>();
	Map<String, Integer> cheese = new HashMap<String, Integer>();
	Map<String, Integer> sidemenu = new HashMap<String, Integer>();
				*/
		/*
		switch (kinds) // ���� ���� + ����ڰ� �Է��� ������ put�ϱ� (�����)
		{
			case "��" : bread.put(ingre,0); break;
			case "��ä" : vegetable.put(ingre,0); break;
			case "�ҽ�" : sauce.put(ingre,0); break;
			case "ġ��" : cheese.put(ingre,0); break;
			case "���̵� �޴�" : sidemenu.put(ingre,0); break;
		}
		*/
		//System.out.println(ingre+"�� ���Եǳ�?����" +bread.containsKey(ingre));
		if (bread.containsKey(ingre)) //������ �ش� �޴� ǰ��
		{
			for (int i = 0;i<breArray.length;i++)
			{
				if (breArray[i].equals(ingre))
				{
					breArray[i] = "ǰ��";
				}
			}
		}
		if (vegetable.containsKey(ingre))//��ä�ش�޴�ǰ��
		{
			for (int i = 0;i<veArray.length;i++)
			{
				if (veArray[i].equals(ingre))
				{
					veArray[i] = "ǰ��";
				}
			}
		}
		if (sauce.containsKey(ingre))//�ҽ��ش�޴�ǰ��
		{
			for (int i = 0;i<sauArray.length;i++)
			{
				if (sauArray[i].equals(ingre))
				{
					sauArray[i] = "ǰ��";
				}
			}
		}
		if (cheese.containsKey(ingre))//�ҽ��ش�޴�ǰ��
		{
			for (int i = 0;i<chArray.length;i++)
			{
				if (chArray[i].equals(ingre))
				{
					chArray[i] = "ǰ��";
				}
			}
		}
		if (sidemenu.containsKey(ingre))//���̵�޴� �ش�޴� ǰ��
		{
			for (int i = 0;i<sideArray.length;i++)
			{
				if (sideArray[i].equals(ingre))
				{
					sideArray[i] = "ǰ��";
				}
			}
		}
		
		
		//�޴��� ���
		/*
		for (String s : veArray)
		{
			System.out.print(s+ " ");
		}
		System.out.println();
		*/

		System.out.printf("%s�� ǰ�� ó�� �Ǿ����ϴ�.", ingre);
		System.out.println("\n============================================");
		//System.out.println(bread.get("ȭ��Ʈ"));
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
		/*
		if(Bread.bbbb==1) // �� ��ü ������ �Ÿ�
		{ 
			//System.out.println("���̴ϱ� ���� �ø���");
			//Bread.bCount += intTemp; 
			breadArrayList.get
			//System.out.println("intTemp: " + intTemp);
			//System.out.println("Bread.bCount: " + Bread.bCount);
		}
		if (Salad.cccc==2)
		{	
			//System.out.println("������ϱ� ���� �ø���");
			Salad.sCount += intTemp;
		}
		*/
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

		
	}
	*/
	/*
	String decreaseBread(String strxxx, int count22) throws IOException//�ش� Ŀ������ ����, ��ü�� ī��Ʈ ���� �޾ƿ���
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�� ���� ���̱�
		int wonSu;// �����ִ� ��� ����.
		int userSu; // ������ ������ ����. (ex. �ҽ�*��ü�� Count)
		int afterSu=0;// ���� ���� - ���� ����
		int tempABCD=0;// ġ��迭���� ��ä�迭���� ������ �迭����..
		String reStr = strxxx;//�Ѱ��� ���ڿ�.
		
		for (int i=0; i<breArray.length; i++) // �� ���� ȭ��Ʈ, ��Ͽ�Ʈ...
		{             
			if (strxxx.equals(breArray[i]))
			{
				//System.out.println("i�� ������� �Դ�" + i);
				//System.out.println("�޾ƿ� Ŀ���� �޴� ���� : " + strxxx);
				//System.out.println("�޾ƿ� Ŀ���� �޴��� �迭 ������ ����.");
				tempABCD = 1;
			}
			// break; // �� �����ϱ� �ݺ��� ���������� i�� 0�̾� ��������
		}
		for (int i=0; i<chArray.length-1; i++) // ġ�� ����, ������ ,,, 
		{
			if (strxxx.equals(chArray[i]))
			{
				tempABCD = 2;
			}
		}
		//System.out.println("tempABCD �� : " + tempABCD);

		switch (tempABCD) // �� ���� 
		{
			//case 0 : System.out.println("�ȵ�");
			case 1:for (int i=0; i<breArray.length; i++)
			{
				if (breArray[i].equals(strxxx))
				{
					wonSu = bread.get(strxxx);
					afterSu = wonSu-count22;//��ü ����
					bread.put(strxxx,afterSu); // ���� ��� ���� ����.
					//System.out.println("ǲ�Ƴ�? "); // �׽�Ʈ ���
					if (afterSu < 0)
					{
						breArray[i] = "�ش� �޴� ǰ��";
						System.out.print("�ش� �޴��� ǰ���Ǿ����ϴ�. �ٽ� ������ �ּ���.:");
						//bd.bdCustom();
						reStr = br.readLine();
					}
					break;// ���� ����� �ݺ����� ������.
				}
		
			}; break;
			case 2:for (int i = 0;i<chArray.length-1 ;i++ )
			{
				if (chArray[i].equals(strxxx))
				{
					wonSu = this.cheese.get(strxxx);
					afterSu = wonSu-count22;//��ü ����
					cheese.put(strxxx,afterSu); // ���� ��� ���� ����.
					if (afterSu < 0)
					{
						chArray[i] = "�ش� �޴� ǰ��";
						System.out.print("�ش� �޴��� ǰ���Ǿ����ϴ�. �ٽ� ������ �ּ���.:");
						reStr = br.readLine();
					}
					break;// ���� ����� �ݺ����� ������.
				}
		
			}; break;
			//default : System.out.println("����?.");
		}
		//System.out.println("���� ���� ��� ���� : " + bread.get(strxxx));
		return reStr;
	}
	*/


	// �����ε� ����.
/*	
	String [] decreaseBread(String [] strxxx,int count22) throws IOException//�ش� Ŀ������ ����, ��ü�� ī��Ʈ ���� �޾ƿ���(��ä, �ҽ�)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�� ���� ���̱�
		String [] userArr;// ���� ��� �ϳ��� ���
		

		int wonSu;// �����ִ� ��� ����.
		int userSu; // ������ ������ ����. (ex. �ҽ�*��ü�� Count)
		int afterSu;// ���� ���� - ���� ����
		int tempABCD=0;// ġ��迭���� ��ä�迭���� ������ �迭����..
		String vdTemp;// ��ä �ϳ��� ���� ... �� �����ؾ� �ż� ...
		String ssTemp; // �ҽ� �ϳ��� ����..
		String reStr = "����������";//return �� ���ڿ�.
		String userArr123;

		for (String s:strxxx)
		{
			userArr = s; // �丶��, ����
			for (int i = 0;i<veArray.length ;i++ ) // ������ ��ä ... 
			{
				userArr.equals(veArray);
				tempABCD = 3; //�丶��
				break;
			}
			for (int i = 0;i< sauArray.length-1 ;i++ ) // ���� �ҽ�..
			{
				userArr.equals(sauArray);
				tempABCD = 4;
				break;
			}
			break;
		}


		switch (tempABCD)
		{
			/*case 3:for (int i = 0;i<veArray ;i++ )
			{
				if veArray[i].equals(userArr))
				{
					wonSu = vegetable.get(cheese);
					afterSu = wonSu-count;//��ü ����
					vegetable.put(userArrx,afterSu); // ���� ��� ���� ����.
					if (afterSu == 0)
						veArray[i] = "�ش� �޴� ǰ��";
					break;// ���� ����� �ݺ����� ������.
				}
		
			}; break;*/ // �丶��, ����, �ø���
			/*
			case 3:for (int i = 0;i<veArray.length ;i++ )
			{
				if (!userArr.equals(veArray[i]))
				{
					vdTemp = veArray[i]; // ������ ��ä ���� �����.
					wonSu = vegetable.get(vdTemp);
					afterSu = wonSu-count22;//��ü ����
					vegetable.put(vdTemp,afterSu); // ���� ��� ���� ����.
					if (veArray[i].equals(strxxx))
					{
						wonSu = vegetable.get(strxxx);
						afterSu = wonSu-count22;//��ü ����
						vegetable.put(vdTemp,afterSu); // ���� ��� ���� ����.
						if (afterSu < 0)
						{
							veArray[i] = "�ش� �޴� ǰ��";
							System.out.print("�ش� �޴��� ǰ���Ǿ����ϴ�. �ٽ� ������ �ּ���.:");
							reStr = br.readLine();
							//userArr123= reStr.split(",");

						}

					}
				};break;
			}
				
			case 4:for (int i = 0;i<sauArray.length ;i++ )
			{
				if (userArr.equals(sauArray[i]))
				{
					wonSu = sauce.get(userArr);
					afterSu = wonSu-count22;//��ü ����
					sauce.put(userArr,afterSu); // ���� ��� ���� ����.
					if (sauArray[i].equals(strxxx))
					{
						wonSu = sauce.get(strxxx);
						afterSu = wonSu-count22;//��ü ����
						sauce.put(userArr,afterSu); // ���� ��� ���� ����.
						if (afterSu < 0)
						{
							sauArray[i] = "�ش� �޴� ǰ��";
							System.out.print("�ش� �޴��� ǰ���Ǿ����ϴ�. �ٽ� ������ �ּ���.:");
							reStr = br.readLine();
							userArr123= reStr.split(",");
						}

					}
				};break;
			}
		}
		return userArr123;
	}

				



	String decreaseSalad(String strxxx,int count22) throws IOException//�ش� Ŀ������ ����, ��ü�� ī��Ʈ ���� �޾ƿ���
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�� ���� ���̱�
		int wonSu;// �����ִ� ��� ����.
		int userSu; // ������ ������ ����. (ex. �ҽ�*��ü�� Count)
		int afterSu;// ���� ���� - ���� ����
		//int tempABCD;// ġ��迭���� ��ä�迭���� ������ �迭����..
		String reStr = strxxx;//�Ѱ��� ���ڿ�.
		
		strxxx.equals(chArray);

		
		for (int i = 0;i<chArray.length-1 ;i++ )
		{
			if (chArray[i].equals(strxxx))
			{
				wonSu = this.cheese.get(strxxx);
				afterSu = wonSu-count22;//��ü ����
				cheese.put(strxxx,afterSu); // ���� ��� ���� ����.
				if (afterSu == 0)
				{
					chArray[i] = "�ش� �޴� ǰ��";
					System.out.print("�ش� �޴��� ǰ���Ǿ����ϴ�. �ٽ� ������ �ּ���.:");
					reStr = br.readLine();
				}
					
				break;// ���� ����� �ݺ����� ������.
			}	
		}
		return reStr;
	}

	// �����ε� ����.
	String decreaseSalad(String [] strxxx,int count22) throws IOException//�ش� Ŀ������ ����, ��ü�� ī��Ʈ ���� �޾ƿ���(��ä, �ҽ�)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//�� ���� ���̱�
		String userArr="����"; // ���� ��� �ϳ��� ���
		

		int wonSu;// �����ִ� ��� ����.
		int userSu; // ������ ������ ����. (ex. �ҽ�*��ü�� Count)
		int afterSu;// ���� ���� - ���� ����
		int tempABCD=0;// ġ��迭���� ��ä�迭���� ������ �迭����..
		String vdTemp;// ��ä �ϳ��� ���� ... �� �����ؾ� �ż� ...
		String ssTemp; // �ҽ� �ϳ��� ����..
		String reStr = "����";//return �� ���ڿ�.

		for (String s:strxxx)
		{
			userArr = s; 
			for (int i = 0;i<veArray.length ;i++ ) // ������ ��ä ... 
			{
				userArr.equals(veArray);
				tempABCD = 3;
				break;
			}
			for (int i = 0;i< sauArray.length-1 ;i++ ) // ���� �ҽ�..
			{
				userArr.equals(sauArray);
				tempABCD = 4;
				break;
			}
			break;
		}


		switch (tempABCD)
		{
			/*case 3:for (int i = 0;i<veArray ;i++ )
			{
				if veArray[i].equals(userArr))
				{
					wonSu = vegetable.get(cheese);
					afterSu = wonSu-count;//��ü ����
					vegetable.put(userArrx,afterSu); // ���� ��� ���� ����.
					if (afterSu == 0)
						veArray[i] = "�ش� �޴� ǰ��";
					break;// ���� ����� �ݺ����� ������.
				}
		
			}; break;*/
			/*
			case 3:for (int i = 0;i<veArray.length ;i++ )
			{
				if (!userArr.equals(veArray[i]))
				{
					vdTemp = veArray[i]; // ������ ��ä ���� �����.
					wonSu = vegetable.get(vdTemp);
					afterSu = wonSu-count22;//��ü ����
					vegetable.put(vdTemp,afterSu); // ���� ��� ���� ����.
					if (veArray[i].equals(strxxx))
					{
						wonSu = vegetable.get(strxxx);
						afterSu = wonSu-count22;//��ü ����
						vegetable.put(vdTemp,afterSu); // ���� ��� ���� ����.
						if (afterSu < 0)
						{
							veArray[i] = "�ش� �޴� ǰ��";
							System.out.print("�ش� �޴��� ǰ���Ǿ����ϴ�. �ٽ� ������ �ּ���.:");
							reStr = br.readLine();
						}

					}
				};break;
			}
				
			case 4:for (int i = 0;i<sauArray.length ;i++ )
			{
				if (userArr.equals(sauArray[i]))
				{
					wonSu = sauce.get(userArr);
					afterSu = wonSu-count22;//��ü ����
					sauce.put(userArr,afterSu); // ���� ��� ���� ����.
					if (sauArray[i].equals(strxxx))
					{
						wonSu = sauce.get(strxxx);
						afterSu = wonSu-count22;//��ü ����
						sauce.put(userArr,afterSu); // ���� ��� ���� ����.
						if (afterSu < 0)
						{
							sauArray[i] = "�ش� �޴� ǰ��";
							System.out.print("�ش� �޴��� ǰ���Ǿ����ϴ�. �ٽ� ������ �ּ���.:");
							reStr = br.readLine();
						}

					}
				};break;
			}
		}
		return reStr;
	}
		/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//�� ���� ���̱�
		String userArr; // ���� ��� �ϳ��� ���
		

		int wonSu;// �����ִ� ��� ����.
		int userSu; // ������ ������ ����. (ex. �ҽ�*��ü�� Count)
		int afterSu;// ���� ���� - ���� ����
		int tempABCD;// ġ��迭���� ��ä�迭���� ������ �迭����..
		String reStr = strxxx;//�Ѱ��� ���ڿ�.

		for (String s:strxxx)
		{
			userArr = s; 
			for (int i = 0;i<veArray.length ;i++ ) // ������ ��ä ... 
			{
				userArr.equals(veArray);
				tempABCD = 3;
				break;
			}
			for (int i = 0;i< sauArray.length-1 ;i++ ) // ���� �ҽ�..
			{
				userArr.equals(sauArray);
				tempABCD = 4;
				break;
			}
			break;
		}
		switch (tempABCD) 
		{
			case 3: for (String s:veArray)
			{
				for (int i = 0;i<veArray.length ;i++ )
				{
					if (!s.equals(veArray[i]))
					{
						vdTemp = veArray[i]; // ������ ��ä ���� �����.
						wonSu = vegetable.get(vdTemp);
						afterSu = wonSu-count22;//��ü ����
						vegetable.put(vdTemp,afterSu); // ���� ��� ���� ����.
						if (afterSu == 0)
							veArray[i] = "�ش� �޴� ǰ��";
						break;// ���� ����� �ݺ����� ������.

					}
				}break;
				
			}
			case 3:for (int i = 0;i<sauArray-1 ;i++ )
			{
				if (sauArray[i].equals(userArr))
				{
					wonSu = this.sauce.get(cheese);
					afterSu = wonSu-count22;//��ü ����
					sauce.put(userArr,afterSu); // ���� ��� ���� ����.
					if (afterSu == 0)
						sauArray[i] = "�ش� �޴� ǰ��";
					break;// ���� ����� �ݺ����� ������.
				}
		
			}; break;
		}

	}
	*/
	/*

	String decreaseSideMenu(String smCategory,int count22) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String reStr = "����";
		int wonSu;// �����ִ� ��� ����.
		int userSu; // ������ ������ ����. (ex. �ҽ�*��ü�� Count)
		int afterSu;// ���� ���� - ���� ����
		for (int i = 0;i<sideArray.length;i++ )
		{
			smCategory.equals(sideArray[i]);
			wonSu = sidemenu.get(smCategory);
			afterSu = wonSu-count22;//��ü ����
			sidemenu.put(smCategory,afterSu); // ���� ��� ���� ����.
			if (afterSu == 0)
			{
				sideArray[i] = "�ش� �޴� ǰ��";
				System.out.print("�ش� �޴��� ǰ���Ǿ����ϴ�. �ٽ� ������ �ּ���.:");
				reStr = br.readLine();
			}
			break;// ���� ����� �ݺ����� ������.
		}
		return reStr;
	}
	*/




			/*
			for (int i = 0;i<chArray-1 ;i++ ) //�Ƹ޸�ĭ ġ��, ������ ġ��
			{
				if (chArray[i].equals(cheese))
				{
					wonSu = this.cheese.get(cheese); // �Ű������� �޾ƿ� String �� Key�� ���.
					afterSu = wonSu - count//���� ��� ���� - ��ü�� ����
					cheese.put(cheese,afterSu); // ���� ��� ���� ����.
					break;// ���� ����� �ݺ����� ������.
				}
				//�� ������ 0�̸� �� Ŭ������ �ִ� �޴��ǹ迭���� �ش� �ε��� "00ǰ��"�� �ٲٱ�
				if (afterSu == 0)
				{
					chArray[i] = "�ش� �޴� ǰ��";
				}
			}
			*/
	//	}

	/*
	Countadd()�� ���Ŭ���� .. 
	{
		� �����ҷ�? ��������, 2��������
		�������� �� return;
		2������ �� count������ +=2;
		
		������ +=3; 
		��ü������ �Һ��� ������
		_ _ _ _ 
		������ (������ - ���׸��� - �ҽ�����, ����=1)
		������ (������ - ���׸��� - �ҽ�����, ���� ++)
		//���Ŭ���� ��� ���� ������ * ����; 

	ig.Countadd();

	}
	*/
	/*
	void decrease() //��� ���� ���̱�
	{
	}
	*/

		
	

}

