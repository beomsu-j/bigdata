package 변수및자료형;

// 도구를 꺼내올 때는 반드시 어디에서 꺼낼 지 import 구문을 작성
// ---> 직접 작성하기보다는, 에러에 마우스를 올려서 해결
import java.util.Scanner;

public class Ex01입출력 {

	public static void main(String[] args) {
        // 주석 : 코드에 영향을 끼치지 않는 일종의 메모 역할을 한다
		// 단축키
		// 1) 글자 크기 : ctrl + , ctrl _
		// 2) 한 줄 삭제 : ctrl d
		// 3) 저장 : ctrl s
		// 4) 실행 단축키 ctrl F11
		// 5) 자동 Import 단축기 : ctrl shift o
		// 6) 한줄복사 ctrl art 화살표
		
		// 1. 출력문
		// ---> () 안쪽에 출력하고 싶은 구문 작성
		System.out.println("Hello world!!!");
		// 출력문 생성 단축키 syso -> ctrl spacebar
		System.out.println("조범수");
		
		// 2. 입력문
		// 2-1) 입력받는 도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 개행(줄바꿈)을 없애고 싶다면 println에서 ln 지우기!
	    System.out.print("글자를 입력하세요 >> ");
		// 2-2) 입력받기
		sc.next();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
