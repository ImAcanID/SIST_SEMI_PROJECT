import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class IngredientManagementTest
{
	public static void main(String [] args)
	{
	
		// �޴���
		String[] breArray = {"ȭ��Ʈ","��Ͽ�Ʈ","�÷��귡��"};
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
		//IngredientManagement()
		//{
			//input2();
		//}
		//�� �ڷᱸ���� �޴� ��ҿ� ���� ���.
		
		//������
		//void input2() //�ʱ� ��� ����.
		//{
			for(String s:breArray)
			{
				bread.put(s, 100);
			}

			//��ä����
			for(String s:veArray)
			{
				vegetable.put(s, 100);
			}

			//�ÿ���. �丶�� ��� ���� 0 �� �����ڸ�忡�� ���� ���� �����ֱ�.
			vegetable.put("�丶��",0);
			
			//�ҽ�����
			for(String s:sauArray)
			{
				sauce.put(s, 100);
			}
			
			//ġ������
			for(String s:chArray)
			{
				cheese.put(s, 100);
			}

			//���̵�޴�����	
			for(String s:sideArray)
			{
				sidemenu.put(s, 100);
			}
		//}
			

			//�׽�Ʈ
			//System.out.println(sauce.get("���� ��Ͼ�") + "���� ��Ͼ� ����");
			//--==>>100���� ��Ͼ� ����

			// ��� �ֱ� �޼ҵ� �� ���α׷� main() ���� ������ ��忡�� ����.
		//void ingPut()
		//{
			
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
			//System.out.println(bread.get("ȭ��Ʈ")); �� value �� ����. 
			System.out.printf("%s�� ���� �� ������ %d�Դϴ�.%n", ingre, tmp);
		//}
		//void addCount() //��ü ���� �ø���
		//{
		//	System.out.print("�̰Ŷ� �Ȱ��� Ŀ������ �� ������ ������ �ø��Ŵ�? (Y/N)
		//}

		//void decreaseBread() //��� ���� ���̱� - ����ü��
		//{
			//������� Ŀ���ҵ� ��� �ҷ�����
			//���϶�,
		//for (int i = 0;i<breArray.length ;i++ )
		//{
		//	if (breArray[i].equals(breadkind))
		//	{
		//System.out.println(bread.get(bread["ȭ��Ʈ"]));
		int su22 = bread.get("ȭ��Ʈ"); // Ŀ�����Ѱ� ���� "" �� �ֱ�.
		int qusehdsu = su22 - 3;
		System.out.println("3���� ���� " +qusehdsu);
		bread.put("ȭ��Ʈ",qusehdsu);
	
		System.out.println("3�� �� ȭ��Ʈ ���� : " +bread.get("ȭ��Ʈ"));





		void decreaseBread(String cheese, count)//�ش� Ŀ������ ����, ��ü�� ī��Ʈ ���� �޾ƿ���
		{
			//�� ���� ���̱�
			int wonSu;// �����ִ� ��� ����.
			int userSu; // ������ ������ ����. (ex. �ҽ�*��ü�� Count)
			int afterSu;// ���� ���� - ���� ����
			
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
		}
//===================================================================================================����!


		void decreaseBread(String strxxx, count)//�ش� Ŀ������ ����, ��ü�� ī��Ʈ ���� �޾ƿ���
		{
			//�� ���� ���̱�
			int wonSu;// �����ִ� ��� ����.
			int userSu; // ������ ������ ����. (ex. �ҽ�*��ü�� Count)
			int afterSu;// ���� ���� - ���� ����
			int tempABCD;// ġ��迭���� ��ä�迭���� ������ �迭����..
			
			for (int i = 0;i<breArray ;i++ ) // �� ���� ȭ��Ʈ, ��Ͽ�Ʈ...
			{
				strxxx.equals(breArray);
				tempABCD = 1;
			}
			for (int i = 0;i<chArray-1 ;i++ ) // ġ�� ����, ������ ,,, 
			{
				strxxx.equals(chArray);
				tempABCD = 2;
			}

			switch (tempABCD) // ȭ��Ʈ, ������ ġ��
			{
				case 1:for (int i = 0;i<breArray ;i++ )
				{
					if breArray[i].equals(strxxx))
					{
						wonSu = bread.get(cheese);
						afterSu = wonSu-count;//��ü ����
						bread.put(strxxx,afterSu); // ���� ��� ���� ����.
						if (afterSu == 0)
							breArray[i] = "�ش� �޴� ǰ��";
						break;// ���� ����� �ݺ����� ������.
					}
			
				}; break;
				case 2:for (int i = 0;i<chArray-1 ;i++ )
				{
					if (chArray[i].equals(strxxx))
					{
						wonSu = this.cheese.get(cheese);
						afterSu = wonSu-count;//��ü ����
						cheese.put(cheese,afterSu); // ���� ��� ���� ����.
						if (afterSu == 0)
							chArray[i] = "�ش� �޴� ǰ��";
						break;// ���� ����� �ݺ����� ������.
					}
			
				}; break;	
			}
		}
		// �����ε� ����.
		void decreaseBread(String [] strxxx, count)//�ش� Ŀ������ ����, ��ü�� ī��Ʈ ���� �޾ƿ���(��ä, �ҽ�)
		{
			//�� ���� ���̱�
			String userArr; // ���� ��� �ϳ��� ���
			

			int wonSu;// �����ִ� ��� ����.
			int userSu; // ������ ������ ����. (ex. �ҽ�*��ü�� Count)
			int afterSu;// ���� ���� - ���� ����
			int tempABCD;// ġ��迭���� ��ä�迭���� ������ �迭����..
			String vdTemp;// ��ä �ϳ��� ���� ... �� �����ؾ� �ż� ...

			for (String s:strxxx)
			{
				userArr = s; 
				for (int i = 0;i<veArray ;i++ ) // ������ ��ä ... 
				{
					userArr.equals(veArray);
					tempABCD = 3;
					break;
				}
				for (int i = 0;i< sauArray-1 ;i++ ) // ���� �ҽ�..
				{
					userArr.equals(sauArray);
					tempABCD = 4;
					break;
				}
				break;
			}
			switch (tempABCD) // ȭ��Ʈ, ������ ġ��
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
				case 3: for (String s:veArray)
				{
					for (int i = 0;i<veArray.length ;i++ )
					{
						if (!s.equals(veArray[i])
						{
							vdTemp = veArray[i]; // ������ ��ä ���� �����.
							wonSu = vegetable.get(vdTemp);
							afterSu = wonSu-count;//��ü ����
							vegetable.put(vdTemp,afterSu); // ���� ��� ���� ����.
							if (afterSu == 0)
								veArray[i] = "�ش� �޴� ǰ��";
							break;// ���� ����� �ݺ����� ������.

						}
					}break;
					
				}
				case 4:for (int i = 0;i<sauArray-1 ;i++ )
				{
					if (sauArray[i].equals(userArr))
					{
						wonSu = this.sauce.get(cheese);
						afterSu = wonSu-count;//��ü ����
						sauce.put(userArr,afterSu); // ���� ��� ���� ����.
						if (afterSu == 0)
							sauArray[i] = "�ش� �޴� ǰ��";
						break;// ���� ����� �ݺ����� ������.
					}
			
				}; break;		

		}






		void decreaseSalad(String strxxx, count)//�ش� Ŀ������ ����, ��ü�� ī��Ʈ ���� �޾ƿ���
		{
			//�� ���� ���̱�
			int wonSu;// �����ִ� ��� ����.
			int userSu; // ������ ������ ����. (ex. �ҽ�*��ü�� Count)
			int afterSu;// ���� ���� - ���� ����
			//int tempABCD;// ġ��迭���� ��ä�迭���� ������ �迭����..
			
			strxxx.equals(chArray);
			tempABCD = 2;

			
			for (int i = 0;i<chArray-1 ;i++ )
			{
				if (chArray[i].equals(strxxx))
				{
					wonSu = this.cheese.get(cheese);
					afterSu = wonSu-count;//��ü ����
					cheese.put(cheese,afterSu); // ���� ��� ���� ����.
					if (afterSu == 0)
						chArray[i] = "�ش� �޴� ǰ��";
					break;// ���� ����� �ݺ����� ������.
				}	
			}
		}
		// �����ε� ����.
		void decreaseSalad(String [] strxxx, count)//�ش� Ŀ������ ����, ��ü�� ī��Ʈ ���� �޾ƿ���(��ä, �ҽ�)
		{
			//�� ���� ���̱�
			String userArr; // ���� ��� �ϳ��� ���
			

			int wonSu;// �����ִ� ��� ����.
			int userSu; // ������ ������ ����. (ex. �ҽ�*��ü�� Count)
			int afterSu;// ���� ���� - ���� ����
			int tempABCD;// ġ��迭���� ��ä�迭���� ������ �迭����..

			for (String s:strxxx)
			{
				userArr = s; 
				for (int i = 0;i<veArray ;i++ ) // ������ ��ä ... 
				{
					userArr.equals(veArray);
					tempABCD = 3;
					break;
				}
				for (int i = 0;i< sauArray-1 ;i++ ) // ���� �ҽ�..
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
						if (!s.equals(veArray[i])
						{
							vdTemp = veArray[i]; // ������ ��ä ���� �����.
							wonSu = vegetable.get(vdTemp);
							afterSu = wonSu-count;//��ü ����
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
						afterSu = wonSu-count;//��ü ����
						sauce.put(userArr,afterSu); // ���� ��� ���� ����.
						if (afterSu == 0)
							sauArray[i] = "�ش� �޴� ǰ��";
						break;// ���� ����� �ݺ����� ������.
					}
			
				}; break;
			}

		}
		

		void decreaseSideMenu(String smCategory)
		{
			for (int i = 0;i<sideArray;i++ )
			{
				smCategory.equals(sideArray[i]);
				wonSu = sidemenu.get(cheese);
				afterSu = wonSu-count;//��ü ����
				sidemenu.put(smCategory,afterSu); // ���� ��� ���� ����.
				if (afterSu == 0)
					sideArray[i] = "�ش� �޴� ǰ��";
				break;// ���� ����� �ݺ����� ������.
			}
		}


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
		}

		breadkind ġ���
		//	}
		//}
	}
}
		//void decreaseSalad() //��� ���� ���̱� - �����尴ü��
		//{
		//}
		//void decreaseSideMenu() //��� ���� ���̱� - ���̵�޴���ü��

		
	



