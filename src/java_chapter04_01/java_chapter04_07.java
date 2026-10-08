package java_chapter04_01;

public class java_chapter04_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*7. 1부터 100까지 홀수는 더하고 짝수는 빼기
1부터 100까지 숫자를 홀수는 더하고 짝수는 빼서 결과를 출력하세요. */
		int sum =0;
		for(int i=1;i<=100;i++) {
			if(i%2==1) {
				sum+=i;
			}else {
				sum-=i;
		}
		}
		System.out.println(sum); //for문 바깥에 적어야 함
	}

}
