import java.util.Scanner;
import java.util.*;

public class Test2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요 > ");
		String str = sc.next();
		
		int count = 0;
		
		for(String s : str.split("")) {
			if(s.equals("a")||s.equals("i")||s.equals("u")||s.equals("e")||s.equals("o")) count++;
		}
		
//		for(int i = 0; i<str.length(); i++) {
//			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'o' || str.charAt(i) == 'i' || str.charAt(i) == 'u') count++;
//		}
		
		System.out.println("입력된 모음의 개수는 " + count + "개 입니다." );
	}

}
