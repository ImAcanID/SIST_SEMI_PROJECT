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
	
	// 메뉴판
	String[] breArray = {"화이트","허니오트","플랫 브레드"};
	String[] veArray = {"토마토","양상추","오이","양파","올리브"};
	String[] sauArray = {"스윗 어니언","스윗 칠리","렌치 드레싱","소스제외"};
	String[] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
	String[] sideArray = {"콜라","커피","쿠키","스프","맥주"};


	// 야채,소스,치즈,빵,사이드메뉴 수량 담을 자료구조 생성
	Map<String, Integer> bread = new HashMap<String, Integer>();
	Map<String, Integer> vegetable = new HashMap<String, Integer>();
	Map<String, Integer> sauce = new HashMap<String, Integer>();
	Map<String, Integer> cheese = new HashMap<String, Integer>();
	Map<String, Integer> sidemenu = new HashMap<String, Integer>();
				
	
	//생성자
	IngredientManagement()
	{
		input2();
	}
	//각 자료구조에 메뉴 요소와 수량 담기.
	
	//빵종류
	void input2() //초기 재고 수량.
	{
		for(String s:breArray)
		{
			bread.put(s, 100);
		}
		//bread.put("화이트", 0);

		//야채종류
		for(String s:veArray)
		{
			vegetable.put(s, 100);
		}
		//vegetable.put("토마토", 0);

		//시연용. 토마토 재료 수량 0 → 관리자모드에서 수량 증가 보여주기.
		//vegetable.put("토마토",0);
		
		//소스종류
		for(String s:sauArray)
		{
			sauce.put(s, 100);
		}
		//sauce.put("스윗 어니언", 0);
		
		//치즈종류
		for(String s:chArray)
		{
			cheese.put(s, 100);
		}
		//cheese.put("아메리칸 치즈", 0);

		//사이드메뉴종류	
		for(String s:sideArray)
		{
			sidemenu.put(s, 100);
		}
	}
		

		//테스트
		//System.out.println(sauce.get("스윗 어니언") + "스윗 어니언 수량");
		//--==>>100스윗 어니언 수량

		// 재료 넣기 메소드 → 프로그램 main() 에서 관리자 모드에서 실행.
	/*
	void ingPut()
	{	
		Scanner sc = new Scanner(System.in);
		System.out.println("[빵, 치즈, 야채, 소스, 사이드]");
		System.out.print("어떤 항목의 재료를 관리하시겠습니까? : "); // 빵 야채 소스
		String kinds = sc.next();
		System.out.print(kinds + " 재료의 이름을 입력해 주세요 : "); // 화이트
		String ingre = sc.next(); 
		
		int tmp = 0; // 재료 수량 기록할 임시 변수
		switch (kinds) // 현재 재료 수량을 tmp에 담기
		{
			case "빵" : tmp = bread.get(ingre); break;
			case "야채" : tmp = vegetable.get(ingre); break;
			case "소스" : tmp = sauce.get(ingre); break;
			case "치즈" : tmp = cheese.get(ingre); break;
			case "사이드 메뉴" : tmp = sidemenu.get(ingre); break;
		}
		System.out.printf("%s의 현재 수량은 %d입니다.%n", ingre, tmp);
		System.out.print("증가시킬 수량을 입력해 주세요 : ");
		int su = sc.nextInt();
		
		tmp += su;
		
		switch (kinds) // 기존 수량 + 사용자가 입력한 수량을 put하기 (덮어쓰기)
		{
			case "빵" : bread.put(ingre,tmp); break;
			case "야채" : vegetable.put(ingre,tmp); break;
			case "소스" : sauce.put(ingre,tmp); break;
			case "치즈" : cheese.put(ingre,tmp); break;
			case "사이드 메뉴" : sidemenu.put(ingre,tmp); break;
		}

		switch (kinds) // 반영 후 현재 수량 출력 
		{
			case "빵" : tmp = bread.get(ingre); break;
			case "야채" : tmp = vegetable.get(ingre); break;
			case "소스" : tmp = sauce.get(ingre); break;
			case "치즈" : tmp = cheese.get(ingre); break;
			case "사이드 메뉴" : tmp = sidemenu.get(ingre); break;
		}
		System.out.printf("%s의 증가 후 수량은 %d입니다.%n", ingre, tmp);
	}
	*/
	void managementD() throws IOException// 품절시키기 메소드
	{	
		//Scanner sc = new Scanner(System.in);
		BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		//System.out.println("[빵, 야채, 치즈, 소스, 사이드]");
		//System.out.print("어떤 항목의 재료를 관리하시겠습니까? : "); // 빵 야채 소스
		//String kinds = sc.next();

		//메뉴판 출력해주자. 사용자가 편하게!
		System.out.println("============================================");
		System.out.print("카테고리     재료명");
		System.out.print("\n빵          : ");
		for (String s:breArray)
		{
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.print("야채        : ");
		for (String s:veArray)
		{
			System.out.print(s + " ");
		}
		System.out.println();

		System.out.print("소스        : ");
		for (int i = 0; i<sauArray.length-1;i++)//배열끝 소스제외는 제외!
		{
			System.out.print(sauArray[i] + " ");
		}
		System.out.println();
		System.out.print("치즈        : ");
		
		for (int i = 0;i<chArray.length-1;i++ )//배열끝 치즈제외는 제외!
		{
			System.out.print(chArray[i] + " ");
		}
		System.out.println();

		System.out.print("사이드 메뉴 : ");
		for (String s:sideArray)
		{
			System.out.print(s + " ");
		}
		System.out.println();
		System.out.println();
		
		
		System.out.print("품절 시킬 재료의 이름을 입력해 주세요 : "); // 화이트
		String ingre = br.readLine(); // 재료이름중 스윗 칠리 같은 띄어쓰기도 한 문자열로 처리하기 위해서 BufferedReader 사용!. 
		/*
		int tmp = 0; // 재료 수량 기록할 임시 변수
		switch (kinds) // 현재 재료 수량을 tmp에 담기
		{
			case "빵" : tmp = bread.get(ingre); break;
			case "야채" : tmp = vegetable.get(ingre); break;
			case "소스" : tmp = sauce.get(ingre); break;
			case "치즈" : tmp = cheese.get(ingre); break;
			case "사이드 메뉴" : tmp = sidemenu.get(ingre); break;
		}
		System.out.printf("%s의 현재 수량은 %d입니다.%n", ingre, tmp);
		//int su = sc.nextInt();
		
		tmp += su;
		String[] breArray = {"화이트","허니오트","플랫 브레드"};
	String[] veArray = {"토마토","양상추","오이","양파","올리브"};
	String[] sauArray = {"스윗 어니언","스윗 칠리","렌치 드레싱","소스제외"};
	String[] chArray = {"아메리칸 치즈","슈레드 치즈","치즈제외"};
	String[] sideArray = {"콜라","커피","쿠키","스프","맥주"};


	// 야채,소스,치즈,빵,사이드메뉴 수량 담을 자료구조 생성
	Map<String, Integer> bread = new HashMap<String, Integer>();
	Map<String, Integer> vegetable = new HashMap<String, Integer>();
	Map<String, Integer> sauce = new HashMap<String, Integer>();
	Map<String, Integer> cheese = new HashMap<String, Integer>();
	Map<String, Integer> sidemenu = new HashMap<String, Integer>();
				*/
		/*
		switch (kinds) // 기존 수량 + 사용자가 입력한 수량을 put하기 (덮어쓰기)
		{
			case "빵" : bread.put(ingre,0); break;
			case "야채" : vegetable.put(ingre,0); break;
			case "소스" : sauce.put(ingre,0); break;
			case "치즈" : cheese.put(ingre,0); break;
			case "사이드 메뉴" : sidemenu.put(ingre,0); break;
		}
		*/
		//System.out.println(ingre+"가 포함되나?빵에" +bread.containsKey(ingre));
		if (bread.containsKey(ingre)) //빵종류 해당 메뉴 품절
		{
			for (int i = 0;i<breArray.length;i++)
			{
				if (breArray[i].equals(ingre))
				{
					breArray[i] = "품절";
				}
			}
		}
		if (vegetable.containsKey(ingre))//야채해당메뉴품절
		{
			for (int i = 0;i<veArray.length;i++)
			{
				if (veArray[i].equals(ingre))
				{
					veArray[i] = "품절";
				}
			}
		}
		if (sauce.containsKey(ingre))//소스해당메뉴품절
		{
			for (int i = 0;i<sauArray.length;i++)
			{
				if (sauArray[i].equals(ingre))
				{
					sauArray[i] = "품절";
				}
			}
		}
		if (cheese.containsKey(ingre))//소스해당메뉴품절
		{
			for (int i = 0;i<chArray.length;i++)
			{
				if (chArray[i].equals(ingre))
				{
					chArray[i] = "품절";
				}
			}
		}
		if (sidemenu.containsKey(ingre))//사이드메뉴 해당메뉴 품절
		{
			for (int i = 0;i<sideArray.length;i++)
			{
				if (sideArray[i].equals(ingre))
				{
					sideArray[i] = "품절";
				}
			}
		}
		
		
		//메뉴판 출력
		/*
		for (String s : veArray)
		{
			System.out.print(s+ " ");
		}
		System.out.println();
		*/

		System.out.printf("%s가 품절 처리 되었습니다.", ingre);
		System.out.println("\n============================================");
		//System.out.println(bread.get("화이트"));
	}
/*
	void addCount() throws IOException//객체 수량 늘리기
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strTemp;
		int intTemp=0;
		
		//DefaultMenu dm = new DefaultMenu(); // 이러면 디폴트메뉴 생성자 때문에 안 됨

		System.out.print("\n현재 옵션과 같은 메뉴를 추가하시겠습니까? (Y/N) : ");
		strTemp = br.readLine();
		
		if(strTemp.equals("Y") || strTemp.equals("y"))
		{
			System.out.print("몇 개 추가하시겠습니까? : ");
			intTemp = Integer.parseInt(br.readLine());
		}
		/*
		if(Bread.bbbb==1) // 빵 객체 생성한 거면
		{ 
			//System.out.println("빵이니까 개수 늘릴게");
			//Bread.bCount += intTemp; 
			breadArrayList.get
			//System.out.println("intTemp: " + intTemp);
			//System.out.println("Bread.bCount: " + Bread.bCount);
		}
		if (Salad.cccc==2)
		{	
			//System.out.println("샐러드니까 개수 늘릴게");
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
	String decreaseBread(String strxxx, int count22) throws IOException//해당 커스텀의 변수, 객체의 카운트 변수 받아오기
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//① 수량 줄이기
		int wonSu;// 남아있는 재고 수량.
		int userSu; // 유저가 선택한 수량. (ex. 소스*객체의 Count)
		int afterSu=0;// 원래 수량 - 유저 수량
		int tempABCD=0;// 치즈배열인지 야채배열인지 빵종류 배열인지..
		String reStr = strxxx;//넘겨줄 문자열.
		
		for (int i=0; i<breArray.length; i++) // 빵 종류 화이트, 허니오트...
		{             
			if (strxxx.equals(breArray[i]))
			{
				//System.out.println("i는 여기까지 왔다" + i);
				//System.out.println("받아온 커스텀 메뉴 정보 : " + strxxx);
				//System.out.println("받아온 커스텀 메뉴가 배열 정보와 같다.");
				tempABCD = 1;
			}
			// break; // 얘 있으니까 반복문 나가버려서 i가 0이야 ㅋㅋㅋㅋ
		}
		for (int i=0; i<chArray.length-1; i++) // 치즈 종류, 슈레드 ,,, 
		{
			if (strxxx.equals(chArray[i]))
			{
				tempABCD = 2;
			}
		}
		//System.out.println("tempABCD 값 : " + tempABCD);

		switch (tempABCD) // 빵 종류 
		{
			//case 0 : System.out.println("안됨");
			case 1:for (int i=0; i<breArray.length; i++)
			{
				if (breArray[i].equals(strxxx))
				{
					wonSu = bread.get(strxxx);
					afterSu = wonSu-count22;//객체 수량
					bread.put(strxxx,afterSu); // 남은 재고 수량 변경.
					//System.out.println("풋됐나? "); // 테스트 출력
					if (afterSu < 0)
					{
						breArray[i] = "해당 메뉴 품절";
						System.out.print("해당 메뉴는 품절되었습니다. 다시 선택해 주세요.:");
						//bd.bdCustom();
						reStr = br.readLine();
					}
					break;// 가장 가까운 반복문을 나간다.
				}
		
			}; break;
			case 2:for (int i = 0;i<chArray.length-1 ;i++ )
			{
				if (chArray[i].equals(strxxx))
				{
					wonSu = this.cheese.get(strxxx);
					afterSu = wonSu-count22;//객체 수량
					cheese.put(strxxx,afterSu); // 남은 재고 수량 변경.
					if (afterSu < 0)
					{
						chArray[i] = "해당 메뉴 품절";
						System.out.print("해당 메뉴는 품절되었습니다. 다시 선택해 주세요.:");
						reStr = br.readLine();
					}
					break;// 가장 가까운 반복문을 나간다.
				}
		
			}; break;
			//default : System.out.println("난가?.");
		}
		//System.out.println("현재 남은 재고 수량 : " + bread.get(strxxx));
		return reStr;
	}
	*/


	// 오버로딩 구간.
/*	
	String [] decreaseBread(String [] strxxx,int count22) throws IOException//해당 커스텀의 변수, 객체의 카운트 변수 받아오기(야채, 소스)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//① 수량 줄이기
		String [] userArr;// 유저 요소 하나씩 담기
		

		int wonSu;// 남아있는 재고 수량.
		int userSu; // 유저가 선택한 수량. (ex. 소스*객체의 Count)
		int afterSu;// 원래 수량 - 유저 수량
		int tempABCD=0;// 치즈배열인지 야채배열인지 빵종류 배열인지..
		String vdTemp;// 야채 하나씩 담자 ... 얜 제거해야 돼서 ...
		String ssTemp; // 소스 하나씩 담자..
		String reStr = "없음꺄하하";//return 할 문자열.
		String userArr123;

		for (String s:strxxx)
		{
			userArr = s; // 토마토, 오이
			for (int i = 0;i<veArray.length ;i++ ) // 제거한 야채 ... 
			{
				userArr.equals(veArray);
				tempABCD = 3; //토마토
				break;
			}
			for (int i = 0;i< sauArray.length-1 ;i++ ) // 선택 소스..
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
					afterSu = wonSu-count;//객체 수량
					vegetable.put(userArrx,afterSu); // 남은 재고 수량 변경.
					if (afterSu == 0)
						veArray[i] = "해당 메뉴 품절";
					break;// 가장 가까운 반복문을 나간다.
				}
		
			}; break;*/ // 토마토, 오이, 올리브
			/*
			case 3:for (int i = 0;i<veArray.length ;i++ )
			{
				if (!userArr.equals(veArray[i]))
				{
					vdTemp = veArray[i]; // 제거한 야채 빼고 담아짐.
					wonSu = vegetable.get(vdTemp);
					afterSu = wonSu-count22;//객체 수량
					vegetable.put(vdTemp,afterSu); // 남은 재고 수량 변경.
					if (veArray[i].equals(strxxx))
					{
						wonSu = vegetable.get(strxxx);
						afterSu = wonSu-count22;//객체 수량
						vegetable.put(vdTemp,afterSu); // 남은 재고 수량 변경.
						if (afterSu < 0)
						{
							veArray[i] = "해당 메뉴 품절";
							System.out.print("해당 메뉴는 품절되었습니다. 다시 선택해 주세요.:");
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
					afterSu = wonSu-count22;//객체 수량
					sauce.put(userArr,afterSu); // 남은 재고 수량 변경.
					if (sauArray[i].equals(strxxx))
					{
						wonSu = sauce.get(strxxx);
						afterSu = wonSu-count22;//객체 수량
						sauce.put(userArr,afterSu); // 남은 재고 수량 변경.
						if (afterSu < 0)
						{
							sauArray[i] = "해당 메뉴 품절";
							System.out.print("해당 메뉴는 품절되었습니다. 다시 선택해 주세요.:");
							reStr = br.readLine();
							userArr123= reStr.split(",");
						}

					}
				};break;
			}
		}
		return userArr123;
	}

				



	String decreaseSalad(String strxxx,int count22) throws IOException//해당 커스텀의 변수, 객체의 카운트 변수 받아오기
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//① 수량 줄이기
		int wonSu;// 남아있는 재고 수량.
		int userSu; // 유저가 선택한 수량. (ex. 소스*객체의 Count)
		int afterSu;// 원래 수량 - 유저 수량
		//int tempABCD;// 치즈배열인지 야채배열인지 빵종류 배열인지..
		String reStr = strxxx;//넘겨줄 문자열.
		
		strxxx.equals(chArray);

		
		for (int i = 0;i<chArray.length-1 ;i++ )
		{
			if (chArray[i].equals(strxxx))
			{
				wonSu = this.cheese.get(strxxx);
				afterSu = wonSu-count22;//객체 수량
				cheese.put(strxxx,afterSu); // 남은 재고 수량 변경.
				if (afterSu == 0)
				{
					chArray[i] = "해당 메뉴 품절";
					System.out.print("해당 메뉴는 품절되었습니다. 다시 선택해 주세요.:");
					reStr = br.readLine();
				}
					
				break;// 가장 가까운 반복문을 나간다.
			}	
		}
		return reStr;
	}

	// 오버로딩 구간.
	String decreaseSalad(String [] strxxx,int count22) throws IOException//해당 커스텀의 변수, 객체의 카운트 변수 받아오기(야채, 소스)
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//① 수량 줄이기
		String userArr="없음"; // 유저 요소 하나씩 담기
		

		int wonSu;// 남아있는 재고 수량.
		int userSu; // 유저가 선택한 수량. (ex. 소스*객체의 Count)
		int afterSu;// 원래 수량 - 유저 수량
		int tempABCD=0;// 치즈배열인지 야채배열인지 빵종류 배열인지..
		String vdTemp;// 야채 하나씩 담자 ... 얜 제거해야 돼서 ...
		String ssTemp; // 소스 하나씩 담자..
		String reStr = "없음";//return 할 문자열.

		for (String s:strxxx)
		{
			userArr = s; 
			for (int i = 0;i<veArray.length ;i++ ) // 제거한 야채 ... 
			{
				userArr.equals(veArray);
				tempABCD = 3;
				break;
			}
			for (int i = 0;i< sauArray.length-1 ;i++ ) // 선택 소스..
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
					afterSu = wonSu-count;//객체 수량
					vegetable.put(userArrx,afterSu); // 남은 재고 수량 변경.
					if (afterSu == 0)
						veArray[i] = "해당 메뉴 품절";
					break;// 가장 가까운 반복문을 나간다.
				}
		
			}; break;*/
			/*
			case 3:for (int i = 0;i<veArray.length ;i++ )
			{
				if (!userArr.equals(veArray[i]))
				{
					vdTemp = veArray[i]; // 제거한 야채 빼고 담아짐.
					wonSu = vegetable.get(vdTemp);
					afterSu = wonSu-count22;//객체 수량
					vegetable.put(vdTemp,afterSu); // 남은 재고 수량 변경.
					if (veArray[i].equals(strxxx))
					{
						wonSu = vegetable.get(strxxx);
						afterSu = wonSu-count22;//객체 수량
						vegetable.put(vdTemp,afterSu); // 남은 재고 수량 변경.
						if (afterSu < 0)
						{
							veArray[i] = "해당 메뉴 품절";
							System.out.print("해당 메뉴는 품절되었습니다. 다시 선택해 주세요.:");
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
					afterSu = wonSu-count22;//객체 수량
					sauce.put(userArr,afterSu); // 남은 재고 수량 변경.
					if (sauArray[i].equals(strxxx))
					{
						wonSu = sauce.get(strxxx);
						afterSu = wonSu-count22;//객체 수량
						sauce.put(userArr,afterSu); // 남은 재고 수량 변경.
						if (afterSu < 0)
						{
							sauArray[i] = "해당 메뉴 품절";
							System.out.print("해당 메뉴는 품절되었습니다. 다시 선택해 주세요.:");
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
		//① 수량 줄이기
		String userArr; // 유저 요소 하나씩 담기
		

		int wonSu;// 남아있는 재고 수량.
		int userSu; // 유저가 선택한 수량. (ex. 소스*객체의 Count)
		int afterSu;// 원래 수량 - 유저 수량
		int tempABCD;// 치즈배열인지 야채배열인지 빵종류 배열인지..
		String reStr = strxxx;//넘겨줄 문자열.

		for (String s:strxxx)
		{
			userArr = s; 
			for (int i = 0;i<veArray.length ;i++ ) // 제거한 야채 ... 
			{
				userArr.equals(veArray);
				tempABCD = 3;
				break;
			}
			for (int i = 0;i< sauArray.length-1 ;i++ ) // 선택 소스..
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
						vdTemp = veArray[i]; // 제거한 야채 빼고 담아짐.
						wonSu = vegetable.get(vdTemp);
						afterSu = wonSu-count22;//객체 수량
						vegetable.put(vdTemp,afterSu); // 남은 재고 수량 변경.
						if (afterSu == 0)
							veArray[i] = "해당 메뉴 품절";
						break;// 가장 가까운 반복문을 나간다.

					}
				}break;
				
			}
			case 3:for (int i = 0;i<sauArray-1 ;i++ )
			{
				if (sauArray[i].equals(userArr))
				{
					wonSu = this.sauce.get(cheese);
					afterSu = wonSu-count22;//객체 수량
					sauce.put(userArr,afterSu); // 남은 재고 수량 변경.
					if (afterSu == 0)
						sauArray[i] = "해당 메뉴 품절";
					break;// 가장 가까운 반복문을 나간다.
				}
		
			}; break;
		}

	}
	*/
	/*

	String decreaseSideMenu(String smCategory,int count22) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String reStr = "없음";
		int wonSu;// 남아있는 재고 수량.
		int userSu; // 유저가 선택한 수량. (ex. 소스*객체의 Count)
		int afterSu;// 원래 수량 - 유저 수량
		for (int i = 0;i<sideArray.length;i++ )
		{
			smCategory.equals(sideArray[i]);
			wonSu = sidemenu.get(smCategory);
			afterSu = wonSu-count22;//객체 수량
			sidemenu.put(smCategory,afterSu); // 남은 재고 수량 변경.
			if (afterSu == 0)
			{
				sideArray[i] = "해당 메뉴 품절";
				System.out.print("해당 메뉴는 품절되었습니다. 다시 선택해 주세요.:");
				reStr = br.readLine();
			}
			break;// 가장 가까운 반복문을 나간다.
		}
		return reStr;
	}
	*/




			/*
			for (int i = 0;i<chArray-1 ;i++ ) //아메리칸 치즈, 슈레드 치즈
			{
				if (chArray[i].equals(cheese))
				{
					wonSu = this.cheese.get(cheese); // 매개변수로 받아온 String 값 Key로 사용.
					afterSu = wonSu - count//남은 재고 수량 - 객체의 수량
					cheese.put(cheese,afterSu); // 남은 재고 수량 변경.
					break;// 가장 가까운 반복문을 나간다.
				}
				//② 수량이 0이면 이 클래스에 있는 메뉴판배열에서 해당 인덱스 "00품절"로 바꾸기
				if (afterSu == 0)
				{
					chArray[i] = "해당 메뉴 품절";
				}
			}
			*/
	//	}

	/*
	Countadd()→ 재료클래스 .. 
	{
		몇개 증가할래? 증가안해, 2개증가해
		증가안해 → return;
		2개증가 → count샐러드 +=2;
		
		빵개수 +=3; 
		전체재료들이 소비한 재료들이
		_ _ _ _ 
		샐러드 (샐러드 - 에그마요 - 소스없음, 개수=1)
		샐러드 (샐러드 - 에그마요 - 소스없음, 개수 ++)
		//재료클래스 재료 뺄때 슈레드 * 개수; 

	ig.Countadd();

	}
	*/
	/*
	void decrease() //재고 수량 줄이기
	{
	}
	*/

		
	

}

