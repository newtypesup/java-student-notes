package shs;

public class shs1215_3 {

	public static void main(String[] args) {
		String name = "이름";
		int k= 97;
		int e = 98;
		int m = 97;
		int sum;
		float avg;
	
	System.out.println("이   름 : "+name);	
	System.out.println("국어점수 : "+k);
	System.out.println("영어점수 : "+e);
	System.out.println("수학점수 : "+m);
			
	sum = k + e + m;
	System.out.println("총 합 계 : "+sum);
	avg = sum / 3.f;
	System.out.printf("평   균 : %.2f\n",avg);

	}

}//성적표 합계 평균