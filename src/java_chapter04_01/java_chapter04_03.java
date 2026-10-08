package java_chapter04_01;

public class java_chapter04_03 {
	public static void main(String[] args) {
		
		//3. 1부터 100까지 홀수 합 출력
		//1부터 100까지의 수 중 홀수의 합을 출력하세요.
	 int sum =0;
		for(int i=1;i<=100;i++) {
		if(i%2==1) {
			sum+=i;
			}
		}
		System.out.println(sum);
	}
}
