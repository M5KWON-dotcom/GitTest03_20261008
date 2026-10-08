package java_chapter04_01;

public class java_chapter04_06 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//6. 1부터 100까지 합 구하다가 합이 100 이상이면 멈추기
		//1부터 100까지 더하다가 합이 100 이상이 되면 멈추고, 마지막으로 더한 수와 합을 출력하세요.
	    int sum =0;
	    int i;
		for(i=1;i<=100;i++) {
			sum+=i;
		if(sum>100) {
			break;
		}
		}
		System.out.println(sum);
		System.out.println(i);
	}
}