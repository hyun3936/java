package Chap_2장기본자료구조;

class PhyscData2 implements Comparable<PhyscData2>{
	
	String name;
	int height;
	double vision;
	
	public PhyscData2(String name, int height, double vision) { // 추상메서드?
		this.name = name;
		this.height = height;
		this.vision = vision;
	}
	
	@Override 
	//이름순
	public int compareTo(PhyscData2 p) {
		if(name.compareTo(p.name)==0)
			if(height-p.height==0)
				return (int) (vision-p.vision);
			else return height-p.height;
		
		else return name.compareTo(p.name);
	}
	//자리 정하기
	public int compareTo2(PhyscData2 p) {
		if(height-p.height==0)
			if((int)(vision-p.vision)==0)
				return name.compareTo(p.name);
			else return (int) (vision-p.vision);
		else return height-p.height;
	}
	

}
public class 객체배열정렬 {

	public static void main(String[] args) {
		PhyscData2[] data = {
				new PhyscData2("홍길동", 162, 0.3),
				new PhyscData2("홍동", 164, 1.3),
				new PhyscData2("홍길", 152, 0.7),
				new PhyscData2("김홍길동", 172, 0.3),
				new PhyscData2("이길동", 182, 0.6),
				new PhyscData2("박길동", 167, 0.2),
				new PhyscData2("최길동", 169, 0.5),
		};
		showData(data);
		System.out.println("\n"+"-".repeat(10)+"By Object Name"+"-".repeat(15));
		sortData(data);
		showData(data);
		System.out.println("\n"+"-".repeat(10)+"By Object Height"+"-".repeat(15));
		sortData2(data);
		showData(data);
		
		//객체 비교가 없을시//////////////////
//		System.out.println("\n"+"-".repeat(10)+"By Name"+"-".repeat(15));
//		sortDataName(data);
//		showData(data);
//		System.out.println("\n"+"-".repeat(10)+"By Height"+"-".repeat(15));
//		sortDataHeight(data);
//		showData(data);
	}
	

	static void showData(PhyscData2[] data) {
		for(PhyscData2 pd:data)
		System.out.println(
					  pd.name
				+ "\t(Height:"
					+ pd.height
				+ ",Vision:"
					+ pd.vision
				+ ")");
	}
	
	private static void swap(PhyscData2[] data, int i, int j) {
		PhyscData2 temp;
		temp=data[i];
		data[i]=data[j];
		data[j]=temp;
	}
	

	private static void sortData(PhyscData2[] data) {
		for(int i=0;i<data.length;i++)
			for(int j=i;j<data.length;j++)
				if(data[i].compareTo(data[j])>0) 
					swap(data,i,j);
	}
	
	private static void sortData2(PhyscData2[] data) {
		for(int i=0;i<data.length;i++)
			for(int j=i;j<data.length;j++)
				if(data[i].compareTo2(data[j])>0) 
					swap(data,i,j);
	}
	//객체 비교가 없을시//////////////////
//	private static void sortDataHeight(PhyscData2[] data) {
//		for(int i=0;i<data.length;i++)
//			for(int j=i;j<data.length;j++)
//				if(data[i].height>data[j].height) {
//				
//					swap(data,i,j);
//				}
//		
//	
//	}
//	
//	
//	private static void sortDataName(PhyscData2[] data) {
//		for(int i=0;i<data.length;i++)
//			for(int j=i;j<data.length;j++)
//				if(data[i].name.compareTo(data[j].name)>0)
//					swap(data,i,j);	
//		
//	}
	


}