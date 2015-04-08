package hacker_rank_FE_rohit;

//class Base {
//	public static void main(String p[]){
//		System.out.println("Hello");
//	}
//	
//}

public class Test{
	public static void add(int a){
		loop : for(int i =1;i<3;i++){
				for(int j=1;j<3;j++){
					if(a==5){
						break loop;
					}
					System.out.println(i*j);
				}
		}
	}
	public static void main(String p[]){
		add(5);
	}
}
