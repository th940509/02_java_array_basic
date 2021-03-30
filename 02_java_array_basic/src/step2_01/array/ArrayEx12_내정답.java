package step2_01.array;
//2021/03/30 20:00 ~ 20:13

import java.util.Arrays;
//2021/03/30 17:27 ~ 
import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

public class ArrayEx12_내정답 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		int getIndex1 , getIndex2;
		int getValue1 , getValue2;
		int temp = 0;
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		
		System.out.print("인덱스 1 입력: ");
		getIndex1 = scan.nextInt();
		System.out.print("인덱스 2 입력: ");
		getIndex2 = scan.nextInt();
		
		temp = arr[getIndex1];
		arr[getIndex1] = arr[getIndex2];
		arr[getIndex2] = temp;
		
		System.out.println("arr[5] = " + Arrays.toString(arr));
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}
		
		System.out.print("값 1 입력: ");
		getValue1 = scan.nextInt();
		System.out.print("값 2 입력: ");
		getValue2 = scan.nextInt();
		
		for(int i=0; i<5; i++) {
			 if(arr[i] == getValue1) { 
				 arr[i] = getValue2;
			 }
			 else if(arr[i] == getValue2) {
				 arr[i] = getValue1;
			 }
		}
		
		System.out.println("arr[5] = " + Arrays.toString(arr));
		
		
		
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		System.out.print("학번 1 입력: ");
		int hakbun1 = scan.nextInt();
		System.out.print("학번 2 입력: ");
		int hakbun2 = scan.nextInt();
		temp = 0;
		int idx1 = 0;
		int idx2 = 0;
		
		
		for(int i=0; i<5; i++) {
			if(hakbuns[i] == hakbun1) {
				idx1 = i;
			}
			if(hakbuns[i] == hakbun2) {
				idx2 = i;
			}
		}
		
		temp = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = temp;
		
		System.out.println("int[hakbuns] = " + Arrays.toString(hakbuns));
		System.out.println("int[scores] = " + Arrays.toString(scores));
	
		
		
		
		scan.close();
	}
	
}
