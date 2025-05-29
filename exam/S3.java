/* 
 *  첫줄에 숫자의 총개수 N이 입력됩니다. 2줄에 N개의 숫자가 랜덤하게 입력됩니다. 
 *  오름차순 정렬해서 화면에 표시하는 코드를 작성하세요 
 *  입력: 5 5 2 3 4 1
 *  출력 1 2 3 4 5
*/

package exam;

import java.util.Arrays;
import java.util.Scanner;

public class S3 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int n =scanner.nextInt();
	int[] arr = new int[n];
	
	for (int i = 0; i < n; i++) {
		arr[i] = scanner.nextInt();
	}
	Arrays.sort(arr);
	
}
}