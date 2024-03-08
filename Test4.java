import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str = new String[10];

		String maxStr = "";
		
		for(int i = 0; i<str.length; i++) {
			System.out.print("문자열을 입력해주세요 > ");
			str[i] = sc.next();
			
			if(str[i].length() > maxStr.length()) {
				maxStr = str[i];
			}
		}
		
		System.out.println("가장 긴 문자열은 " + maxStr + "입니다.");
	}

}
