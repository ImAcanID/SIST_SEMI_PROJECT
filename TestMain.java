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
		//dm.dmSelect();

		//dm.addMenu();
		//dm.dmprint();

		//System.out.println(2022-98-1900);// �� ������
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

		/*
���׽�Ʈ�� ����ü ���� �� 1��
������ ������ �ּ���(��, ������, ���̵� �޴�, ���� �ֹ� �ɼ� �Է�) :1
�޴��� ������ �ּ���(���׸���, ��Ż���� ��Ƽ, �������Ŭ��) : ���׸���
���� ������ �� ����[ȭ��Ʈ, ��Ͽ�Ʈ, �÷��극��]
�� ������ ������ �ּ���. : ��Ͽ�Ʈ
��Ͽ�Ʈ ����
���� ������ ���� ���� [15cm, 30cm]
 �� 30cm�� 5000�� �߰��Դϴ�.
���� ���̸� ������ �ּ���(15, 30) : 30
ġ�� �߰� �Ͻðڽ��ϱ�? Y or N : Y
���� ������ ġ�� ����[�Ƹ޸�ĭ ġ��,������ ġ��]
ġ�� ������ ������ �ּ���. : ������ ġ��
���� ������ ��ä ���� [�丶��, �����, ����, ����, �ø���, ]

���� ���� ��ä ������ �������ּ���.(���� ���� ����,�޸���,������) : ����, �丶��
�ҽ� �߰� �Ͻðڽ��ϱ�? Y or N : N
�߰� �ֹ� �ҰŴ�? (Y/N) �ϴ� 1�Է� �ƴϸ�2 : Y
���׽�Ʈ�� ����ü ���� �� 1��
������ ������ �ּ���(��, ������, ���̵� �޴�, ���� �ֹ� �ɼ� �Է�) :1
�޴��� ������ �ּ���(���׸���, ��Ż���� ��Ƽ, �������Ŭ��) : ��Ż���� ��Ƽ
���� ������ �� ����[ȭ��Ʈ, ��Ͽ�Ʈ, �÷��극��]
�� ������ ������ �ּ���. : ȭ��Ʈ
���� ������ ���� ���� [15cm, 30cm]
 �� 30cm�� 5000�� �߰��Դϴ�.
���� ���̸� ������ �ּ���(15, 30) : 15
ġ�� �߰� �Ͻðڽ��ϱ�? Y or N : N
���� ������ ��ä ���� [�丶��, �����, ����, ����, �ø���, ]

���� ���� ��ä ������ �������ּ���.(���� ���� ����,�޸���,������) : �ø���
�ҽ� �߰� �Ͻðڽ��ϱ�? Y or N : Y
���� ������ �ҽ� ���� [���� ��Ͼ� ���� ĥ�� ��ġ �巹�� ]
�ҽ� ������ �������ּ���.(���� ���� ����,�޸���,������) : ��ġ �巹��
�߰� �ֹ� �ҰŴ�? (Y/N) �ϴ� 1�Է� �ƴϸ�2 : N
���ݱ����� ������ ����� ���ڸ�...
           �޴� :  ���׸���
           ���� : 9500
        �� ���� : 30
        �� ���� : ��Ͽ�Ʈ
      ���� ġ�� : ������ ġ��
   ���� ���� ��ä : ����,�����丶������

      ���� �ҽ� : ���� �丶��
           �޴� :  ��Ż���� ��Ƽ
           ���� : 70000
        �� ���� : 15
        �� ���� : ȭ��Ʈ
      ���� ġ�� : ġ�� ���� ����.
   ���� ���� ��ä : �ø�������

      ���� �ҽ� : �ø���
����Ϸ��� �ƹ� Ű�� �����ʽÿ� . . .
		*/


// �ؾ� ���� 
//1. �ҽ� ������ "�ҽ� ����" �ɼ��� �ְ� ���߼����� �����ϴ�.
//2. ��ä�� �Ȼ��ٰ� �ϴ� ����� ���� ó���ϱ�
//3. �߰������޼ҵ� �� �̰� ����غ��� �ϴ�,,
//4. ���Ҹ޼ҵ� �� �̰ŵ� ����غ��� .. �ϴ�..
//5.������ ������ ���̵� �޴� �ذ��ϱ�. �� ���̵�޴� ���� �� �ذ�..
//6. ���� �ɼ�Ȯ���ϴ� ()
//7. ���Ŭ������ �ִ� ������ ��� ��������? �迭�� static ��� ������?
	