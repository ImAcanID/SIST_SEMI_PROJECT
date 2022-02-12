// 문정 테스트용 메인
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


		// 추가주문 → ArrayList 객체 하나씩 살펴보기

			
		System.out.println("breadArrayList의 사이즈 : " + dm.breadArrayList.size());
		for (int i= 0 ; i<dm.breadArrayList.size();i++)
		{
			System.out.println("첫번째 breadArrayList의 디폴트메뉴. : " + dm.breadArrayList.get(i).bCategory);
			//String strN = dm.breadArrayList.get(i).vegetable[0];
			//System.out.println("첫번째 breadArrayList의 디폴트메뉴. : " + strN); //야채 - 양상추 빼면 이값이 0으로 출력.
			
			System.out.println("첫번째 breadArrayList의 디폴트메뉴. : " + dm.breadArrayList.get(i).cheese);

		}
		dm.addMenu();	

		System.out.println("breadArrayList의 사이즈 : " + dm.breadArrayList.size());
		for (int i= 0 ; i<dm.breadArrayList.size();i++)
		{
			System.out.println("두번째 breadArrayList의 디폴트메뉴. : " + dm.breadArrayList.get(i).bCategory);
			//System.out.println("첫번째 breadArrayList의 디폴트메뉴. : " + dm.breadArrayList.get(i).vegetable[2]); //야채 - 양상추 안빼서 이값이 1으로 출력.
			System.out.println("첫번째 breadArrayList의 디폴트메뉴. : " + dm.breadArrayList.get(i).cheese);

		}
		
		//dm.addMenu(); //--마지막껄로 옵션 덮어쓰여짐..
		//System.out.println("첫번째 breadArrayList의 요소 : " + dm.breadArrayList.get(0));
		//System.out.println("두번째 breadArrayList의 요소 : " + dm.breadArrayList.size()); // 3개까진 선택해야 출력해보겠네.
		
																	
	}
}