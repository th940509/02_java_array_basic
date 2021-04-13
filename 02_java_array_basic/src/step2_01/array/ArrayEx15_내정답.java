package step2_01.array;
//2021/04/13 14:07 ~ 14:25
import java.util.Random;
import java.util.Scanner;

/*
 * # 기억력 게임
 * 
 * 1. 같은 숫자의 위치를 2개 입력해 정답을 맞추는 게임이다.
 * 2. 정답을 맞추면 back에 해당 숫자를 저장해,
 *    back에 모든 수가 채워지면 게임은 종료된다.
 * 예)
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
 * 입력1 : 2
 * 입력2 : 4
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 0, 0, 0, 0, 0]
 * 
 * 입력1 : 5
 * 입력2 : 7
 * 
 * front = [5, 4, 1, 3, 1, 2, 4, 2, 3, 5]
 * back  = [0, 0, 1, 0, 1, 2, 0, 2, 0, 0]
 * 
 */

public class ArrayEx15_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();
		
		int[] front = {1, 1, 2, 2, 3, 3, 4, 4, 5, 5};
		int[] back = new int[10];
		int temp = 0;
		int tempRan = 0;
		int cnt  = 0;
		int getIndex1 = 0;
		int getIndex2 = 0;
		
		// 셔플 구현(Shuffle) : 배열의 요소들을 무작위로 섞음
		for(int i=0; i<1000; i++) {
			tempRan = ran. nextInt(9);
			temp = front[0];
			front[0] = front[tempRan];
			front[tempRan] = temp;
		}
			
		
		while(cnt<5) {
			for(int j=0; j<10; j++) {
				System.out.print(front[j] + " ");
			}
			System.out.println();
			for(int j=0; j<10; j++) {
				System.out.print(back[j] + " ");
			}
			System.out.println();
			System.out.print("인덱스1입력: ");
			getIndex1 = scan.nextInt();
			System.out.print("인덱스2입력: ");
			getIndex2 = scan.nextInt();
			
			if(front[getIndex1] == front[getIndex2]) {
				back[getIndex1] = front[getIndex1];
				back[getIndex2] = front[getIndex2];
				cnt ++;
			}
		}
		System.out.println("게임종료");
		
		
		}
		
		
	}
	

