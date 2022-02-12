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
		//dm.dmSelect();

		//dm.addMenu();
		//dm.dmprint();

		//System.out.println(2022-98-1900);// → 만나이
	}
}


		// 추가주문 → ArrayList 객체 하나씩 살펴보기

		/*	
		System.out.println("breadArrayList의 사이즈 : " + dm.breadArrayList.size());
		for (int i= 0 ; i<dm.breadArrayList.size();i++)
		{
			System.out.println("첫번째 breadArrayList의 디폴트메뉴. : " + dm.breadArrayList.get(i).bCategory);
			//String strN = dm.breadArrayList.get(i).vegetable[0];
			//System.out.println("첫번째 breadArrayList의 디폴트메뉴. : " + strN); //야채 - 양상추 빼면 이값이 0으로 출력.
			
			//System.out.println("첫번째 breadArrayList의 디폴트메뉴. : " + dm.breadArrayList.get(i).cheese);
			System.out.println("첫번째요소의 가격 : " + dm.breadArrayList.get(i).bPrice);
			System.out.println("첫번째요소의 치즈 : " + dm.breadArrayList.get(i).cheese);

		}
		*/
		//dm.addMenu();	
		/*
		System.out.println("breadArrayList의 사이즈 : " + dm.breadArrayList.size());
		for (int i= 0 ; i<dm.breadArrayList.size();i++)
		{
			System.out.println("두번째 breadArrayList의 디폴트메뉴. : " + dm.breadArrayList.get(i).bCategory);
			//System.out.println("첫번째 breadArrayList의 디폴트메뉴. : " + dm.breadArrayList.get(i).vegetable[2]); //야채 - 양상추 안빼서 이값이 1으로 출력.
			//System.out.println("첫번째 breadArrayList의 디폴트메뉴. : " + dm.breadArrayList.get(i).cheese);
			System.out.println("두번째 요소의 가격 : " + dm.breadArrayList.get(i).bPrice);
			System.out.println("첫번째요소의 치즈 : " + dm.breadArrayList.get(i).cheese);
		}
		*/
		
		//dm.addMenu(); //--마지막껄로 옵션 덮어쓰여짐..
		//System.out.println("첫번째 breadArrayList의 요소 : " + dm.breadArrayList.get(0));
		//System.out.println("두번째 breadArrayList의 요소 : " + dm.breadArrayList.size()); // 3개까진 선택해야 출력해보겠네.
		/*
		System.out.println("지금까지의 정보를 출력해 보자면...");
		for (int i = 0;i<dm.breadArrayList.size();i++)
		{
			System.out.println("======================================================");
			System.out.print("           메뉴 :  " +dm.breadArrayList.get(i).bCategory);
			System.out.println();
			System.out.print("           가격 : " + dm.breadArrayList.get(i).bPrice);
			System.out.println();
			System.out.print("        빵 길이 : " + dm.breadArrayList.get(i).bLength);
			System.out.println();
			System.out.print("        빵 종류 : " + dm.breadArrayList.get(i).breadkind);
			System.out.println();
			System.out.print("      선택 치즈 : " + dm.breadArrayList.get(i).cheese);
		}
		System.out.println();
		*/

		/*
※테스트용 빵객체 생성 → 1번
종류를 선택해 주세요(빵, 샐러드, 사이드 메뉴, 현재 주문 옵션 입력) :1
메뉴를 선택해 주세요(에그마요, 이탈리안 비엠티, 서브웨이클럽) : 에그마요
선택 가능한 빵 종류[화이트, 허니오트, 플랫브레드]
빵 종류를 선택해 주세요. : 허니오트
허니오트 선택
선택 가능한 빵의 길이 [15cm, 30cm]
 ※ 30cm는 5000원 추가입니다.
빵의 길이를 선택해 주세요(15, 30) : 30
치즈 추가 하시겠습니까? Y or N : Y
선택 가능한 치즈 종류[아메리칸 치즈,슈레드 치즈]
치즈 종류를 선택해 주세요. : 슈레드 치즈
선택 가능한 야채 종류 [토마토, 양상추, 오이, 양파, 올리브, ]

빼고 싶은 야채 종류를 선택해주세요.(다중 선택 가능,콤마『,』구분) : 오이, 토마토
소스 추가 하시겠습니까? Y or N : N
추가 주문 할거니? (Y/N) 일단 1입력 아니면2 : Y
※테스트용 빵객체 생성 → 1번
종류를 선택해 주세요(빵, 샐러드, 사이드 메뉴, 현재 주문 옵션 입력) :1
메뉴를 선택해 주세요(에그마요, 이탈리안 비엠티, 서브웨이클럽) : 이탈리안 비엠티
선택 가능한 빵 종류[화이트, 허니오트, 플랫브레드]
빵 종류를 선택해 주세요. : 화이트
선택 가능한 빵의 길이 [15cm, 30cm]
 ※ 30cm는 5000원 추가입니다.
빵의 길이를 선택해 주세요(15, 30) : 15
치즈 추가 하시겠습니까? Y or N : N
선택 가능한 야채 종류 [토마토, 양상추, 오이, 양파, 올리브, ]

빼고 싶은 야채 종류를 선택해주세요.(다중 선택 가능,콤마『,』구분) : 올리브
소스 추가 하시겠습니까? Y or N : Y
선택 가능한 소스 종류 [스윗 어니언 스윗 칠리 렌치 드레싱 ]
소스 종류를 선택해주세요.(다중 선택 가능,콤마『,』구분) : 렌치 드레싱
추가 주문 할거니? (Y/N) 일단 1입력 아니면2 : N
지금까지의 정보를 출력해 보자면...
           메뉴 :  에그마요
           가격 : 9500
        빵 길이 : 30
        빵 종류 : 허니오트
      선택 치즈 : 슈레드 치즈
   제거 선택 야채 : 오이,제외토마토제외

      선택 소스 : 오이 토마토
           메뉴 :  이탈리안 비엠티
           가격 : 70000
        빵 길이 : 15
        빵 종류 : 화이트
      선택 치즈 : 치즈 선택 안함.
   제거 선택 야채 : 올리브제외

      선택 소스 : 올리브
계속하려면 아무 키나 누르십시오 . . .
		*/


// 해야 할일 
//1. 소스 선택은 "소스 제외" 옵션이 있고 다중선택이 가능하다.
//2. 야채를 안뺀다고 하는 사람에 대해 처리하기
//3. 추가개수메소드 → 이건 고려해보자 일단,,
//4. 감소메소드 → 이거도 고려해보자 .. 일단..
//5.나머지 샐러드 사이드 메뉴 해결하기. → 사이드메뉴 거의 다 해결..
//6. 현재 옵션확인하는 ()
//7. 재료클래스에 있는 변수를 어떻게 가져오지? 배열에 static 어떻게 붙히지?
	