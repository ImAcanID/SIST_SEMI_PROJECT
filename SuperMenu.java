
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//������ġ, ������, ���̵�޴� class���� ����ϴ� ���� Ŭ����.
class SuperMenu
{
	//����ڰ� �Է��� Ŀ���� ����.
	int [] vbArray = {1, 1, 1, 1, 1};	
	int [] scArray = {0, 0, 0, 0, 0}; 
	int cCategory; 
	int count = 1;
	int cusKey;
	String strTemp;


	//-- ��ä Ŀ���� �ϱ�
	void vdCustom() throws IOException
	{
		cusKey = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (String s: veArray ) //�� ���Ŭ���� ����
		{
			System.out.print(s + " "); 
		}
		System.out.println();
		System.out.print("�����ϰ� ���� ��ä ������ (�޸�����):"); 
		strTemp = br.readLine();
		String [] strArr = strTemp.split(","); // �丶��, �����, ����

		for (int i = 0;i <strArr.length ;i++ )	
			{
				for (int j =0;j<veArray.length ;j++ )//�丶�� ����� ���� ���� �ø���
				{
					if (strArr[i].equals(veArray[j]))
					{
						vbArray[j] =0; // 0�� �߰�����.
					}
				}
			}
	}


	
}