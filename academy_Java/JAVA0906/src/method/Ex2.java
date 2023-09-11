package method;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 *  < 메서드 정의 기본 문법 >
		 *  [접근제한자] 리턴타입 메서드명([매개변수선언..]) {
		 *  	// 메서드가 호출 시 수행할 코드들..
		 *  	[return[리턴값];]
		 * }
		 * 
		 * < 메서드 형태 4가지 >
		 * 1. 파라미터도 없고, 리턴값도 없는 메서드
		 * 2. 파라미터는 없고, 리턴값만 있는 메서드
		 * 3. 파라미터만 있고, 리턴값은 없는 메서드
		 * 4. 파라미터도 있고, 리턴값도 있는 메서드
		 * 
		 */
		
		// 3. 파라미터만 있고, 리턴값은 없는 메서드 호출
		System.out.println("동생아! 돈을 줄테니 과자를 사먹어");
		
		// 메서트 호출 시 전달할 데이터는 메서드명 뒤의 소괄호 내 기술
//		sister_3(10000); // 메서드 파라미터에 리터럴값을 직접 전달하거나
		// 변수를 사용하여 값을 저장한 뒤 파라미터에 전달 가능
		int myMoney = 10000;
		sister_3(myMoney);
		
		System.out.println("---------------------------------------");
		
		// 4. 파라미터도 있고, 리턴값도 있는 메서드 호출(2번 + 3번 유형)
		System.out.println("동생아! 1만원을 줄테니 내 과자도 사줘!");
//		System.out.println("동생이 사다준 것 : " + sister_4());
		String snack = sister_4(10000);
		System.out.println("동생이 사다준 것 : " + snack);
		
	} // main() 메서드 끝
	
	// -------------------------------------------
	// 3. 파라미터만 있고, 리턴값은 없는 메서드 정의
	// => 파라미터가 있으므로 메서드 선언부 소괄호() 안에
	//    외부로부터 호출 시 전달받는 데이터를 저장할 변수(매개변수) 선언
	// => 리턴값은 없으므로 리턴타입 부분을 void 로 설정
	public static void sister_3(int money) {
		// 파라미터로 선언된 int형 변수 money에 메서드 호출 시 전달된 값 저장됨
		// => sister_3(10000) 호출 시 int money = 10000 과 동일한 코드로 취급됨
		System.out.println("동생 : 오빠가 준 돈 = "+ money + "원");
		// 현제 메서드 내에서 money 변수를 자유롭게 사용 가능
		// 단, 메서드를 벗어나면 존재하지 않는 변수로 취급됨
		
		money -= 1000;
		System.out.println("동생 : 과자 사먹고 " + money + "원이 남았다.");
	}
	
	
//	public static void sister_3(int money) {
//		System.out.println("동생 : 오빠가 준 돈 = "+ money + "원");
//		money -= 1000;
//		
//		// if문을 사용하여 잔돈이 남았을 때 잔돈을 출력하지 않고 메서드 종료
//		if(money > 0) {
//			// 현재 수행중인 메서드를 종료하고 빠져나가기 위해서는
//			// 특정 조건일 때 return 문이 실행되도록 해야한다!
//			return;
//		}
//		
//		System.out.println("동생 : 과자 사먹고 " + money + "원이 남았다.");
//	}
	// -------------------------------------------
	// 4. 파라미터도 있고, 리턴값도 있는 메서드 정의(2번 + 3번 유형)
	public static String sister_4(int money) {
		System.out.println("동생 : 오빠가 준 돈 = " + money + "원");
		money -= 2000;
		System.out.println("동생 : 과자 사고 " + money + "원이 남았다!");
		
		// 문자열 "과자" 를 리턴
		return "포카칩"; // 주의! return 문 뒤의 값은 하나만기술!
	}

} // Ex2 클래스 끝
