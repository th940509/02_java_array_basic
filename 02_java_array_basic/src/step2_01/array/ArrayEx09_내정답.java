package step2_01.array;
//2021/03/20 15:09 ~ 16:22

import java.util.Arrays;
import java.util.Scanner;

/*
 * 
 * # 영화관 좌석예매
 * 
 * 1. 사용자로부터 좌석번호(index)를 입력받아 예매하는 시스템이다.
 * 2. 예매가 완료되면 해당 좌석 값을 1로 변경한다.
 * 3. 이미 예매가 완료된 좌석은 재구매할 수 없다.
 * 4. 한 좌석당 예매 가격은 12000원이다.
 * 5. 프로그램 종료 후, 해당 영화관의 총 매출액을 출력한다.
 * 예)
 * [X] [X] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 1
 * [X] [O] [X] [X] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 
 * [X] [O] [X] [O] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 *
 * (1번 입력)
 * 
 * 좌석선택(1~7) : 3
 * 이미 예매가 완료 되었습니다.
 * 
 * [X] [O] [X] [O] [X] [X] [X]
 * 
 * 1. 좌석 예매
 * 2. 종료
 * 
 * (2번 입력)
 * ----------------------
 * 매출액 : 24000원
 * 
 */


public class ArrayEx09_내정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		char seat[] = {'X','X','X','X','X','X','X'};
		int money = 0;
		System.out.println("1. 좌석예매");
		System.out.println("2. 종료");
		
		
	
		
		
		for(int i = 0; i < seat.length; i ++) {
			System.out.println(Arrays.toString(seat));
			
			System.out.print("메뉴를 선택하세요: ");
			int menuChoice = scan.nextInt();
		
			if(menuChoice ==1) {
				System.out.println("좌석을 선택하세요(1-7): ");
				int seatChoice = scan.nextInt()-1;
					
					if(seatChoice < 0 || seatChoice > 6) {
						System.out.println("좌석을 다시 선택해 주세요");
						continue;
					}	
					
					if(seat[seatChoice] == 'X') {
						seat[seatChoice] = 'O';
						money += 12000;
					}
					
					else if(seat[seatChoice] == 'O') {
						System.out.println("이미 선택한 좌석입니다.");
					}
			}
			else if(menuChoice ==2) {
				System.out.println("매출액은: " + money + "원");
				break;
			} 
			
			else {
				System.out.println("1-2번 중에 선택해주세요");
			}
		
		}
		
		scan.close();
	}
	
}
