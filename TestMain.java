// ���� �׽�Ʈ�� ����
import java.io.IOException;

import java.util.List;
import java.util.ListIterator; 
import java.util.Iterator;


public class TestMain
{
	public static void main(String[] args) throws IOException
	{


		DefaultMenu dm = new DefaultMenu();
		dm.dmSelect();

		dm.addMenu();
		dm.dmprint();
	}
}


		// �߰��ֹ� �� ArrayList ��ü �ϳ��� ���캸��

		/*	
		System.out.println("breadArrayList�� ������ : " + dm.breadArrayList.size());
		for (int i= 0 ; i<dm.breadArrayList.size();i++)
		{
			System.out.println("ù��° breadArrayList�� ����Ʈ�޴�. : " + dm.breadArrayList.get(i).bCategory);
			//String strN = dm.breadArrayList.get(i).vegetable[0];
			//System.out.println("ù��° breadArrayList�� ����Ʈ�޴�. : " + strN); //��ä - ����� ���� �̰��� 0���� ���.
			
			//System.out.println("ù��° breadArrayList�� ����Ʈ�޴�. : " + dm.breadArrayList.get(i).cheese);
			System.out.println("ù��°����� ���� : " + dm.breadArrayList.get(i).bPrice);
			System.out.println("ù��°����� ġ�� : " + dm.breadArrayList.get(i).cheese);

		}
		*/
		//dm.addMenu();	
		/*
		System.out.println("breadArrayList�� ������ : " + dm.breadArrayList.size());
		for (int i= 0 ; i<dm.breadArrayList.size();i++)
		{
			System.out.println("�ι�° breadArrayList�� ����Ʈ�޴�. : " + dm.breadArrayList.get(i).bCategory);
			//System.out.println("ù��° breadArrayList�� ����Ʈ�޴�. : " + dm.breadArrayList.get(i).vegetable[2]); //��ä - ����� �Ȼ��� �̰��� 1���� ���.
			//System.out.println("ù��° breadArrayList�� ����Ʈ�޴�. : " + dm.breadArrayList.get(i).cheese);
			System.out.println("�ι�° ����� ���� : " + dm.breadArrayList.get(i).bPrice);
			System.out.println("ù��°����� ġ�� : " + dm.breadArrayList.get(i).cheese);
		}
		*/
		
		//dm.addMenu(); //--���������� �ɼ� �������..
		//System.out.println("ù��° breadArrayList�� ��� : " + dm.breadArrayList.get(0));
		//System.out.println("�ι�° breadArrayList�� ��� : " + dm.breadArrayList.size()); // 3������ �����ؾ� ����غ��ڳ�.
		/*
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

	