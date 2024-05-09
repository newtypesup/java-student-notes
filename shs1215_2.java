package shs;

public class shs1215_2 {

	public static void main(String[] args) {
		int hour = 13;
		int minute = 45;
		int cnt = 40;
		
		System.out.println("출발시간 : " + hour +"시간" +minute+"분");
		System.out.println("정류장 개수 : "+ cnt +"개");
		
		int total;
		total = (hour*60) + minute + (cnt *4);
		System.out.println("도착시간 : "+(total/60)+"시간"+(total%60)+"분");
		
				
		int h = 13;
		int m = 45;
		int p = 160;
		
		System.out.println(h + "시간" + m + "분");
		
		int tm = (h*60) + m + p;
				
		System.out.println("총"+tm+"분");	
		System.out.println((tm/60)+ "시간" +((tm%60))+"분");

	}

}
//시간 계산