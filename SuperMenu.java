
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

//샌드위치, 샐러드, 사이드메뉴 class에서 상속하는 슈퍼 클래스.
class SuperMenu
{
	//사용자가 입력한 커스텀 수량.
	int [] vbArray = {1, 1, 1, 1, 1};	
	int [] scArray = {0, 0, 0, 0, 0}; 
	int cCategory; 
	int count = 1;
	int cusKey;
	String strTemp;


	//-- 야채 커스텀 하기
	void vdCustom() throws IOException
	{
		cusKey = 1;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for (String s: veArray ) //→ 재료클래스 변수
		{
			System.out.print(s + " "); 
		}
		System.out.println();
		System.out.print("제거하고 싶은 야채 말해줘 (콤마구분):"); 
		strTemp = br.readLine();
		String [] strArr = strTemp.split(","); // 토마토, 양상추, 양파

		for (int i = 0;i <strArr.length ;i++ )	
			{
				for (int j =0;j<veArray.length ;j++ )//토마토 양상추 오이 양파 올리브
				{
					if (strArr[i].equals(veArray[j]))
					{
						vbArray[j] =0; // 0면 추가안해.
					}
				}
			}
	}


	
}