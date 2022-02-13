import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Food5
{
	static int count = 1;
	
	public static void main(String[] args) throws IOException
	{
		//void addCount() throws IOException// 개수 추가 메소드(); // 매개변수 생각해보기-------------------------------
		//{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.print("개수를 추가하실건가요?(1입력), 감소하실건가요(2입력) : ");
			int num = Integer.parseInt(br.readLine());
			if (num == 1)
			{
				System.out.print("얼만큼 추가시킬건가요?? : ");
				int n = Integer.parseInt(br.readLine());
				count += n;
				System.out.println("총 개수 : " + count);
			}
			else if (num == 2)
			{
				decrease();
			}
			
		//}// end addCount()
	
	}
	static void decrease() throws IOException // 감소메소드 ----------------------------------------------
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		if (count > 0)
		{	
			System.out.printf("\n현재 :%d개 있습니다\n", count); 
			System.out.print("얼만큼 감소시킬건가요? : ");
			int num = Integer.parseInt(br.readLine());

			if (count-num >= 0)
			{   
				count -= num;
				System.out.println("현재개수 :" + count);
			}
			else
			{
				System.out.println("감소수량을 초과하였습니다.");
			}
		}
		else 
		{
			System.out.println("감소할 수량이 없습니다.");
		}
	}//end decrease()
}

