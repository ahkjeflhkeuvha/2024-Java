import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i = 0; i<arr.length; i++) {
			System.out.print("숫자를 입력해주세요 > ");
			int num = sc.nextInt();
			arr[i] = num;
		}
		
		for(int i : arr) System.out.print(i);
	}

}
