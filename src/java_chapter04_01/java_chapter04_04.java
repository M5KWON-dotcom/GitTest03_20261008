package java_chapter04_01;

public class java_chapter04_04 {

	public static void main(String[] args) {
	
		//4. 1부터 100까지 짝수와 홀수 개수 세기*****
			//	1부터 100까지의 수 중 홀수 개수와 짝수 개수를 출력하세요
	int hol=0;
	int jak=0;
		for(int i=1;i<=100;i++) {
		if(i%2==0) {
			 hol++; //조회수 계산과 비슷함
		}else {
			 jak++;
		}      
		}
	System.out.println(hol);
	System.out.println(jak);
	}
	}
