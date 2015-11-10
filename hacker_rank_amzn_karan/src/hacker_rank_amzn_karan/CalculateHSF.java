package hacker_rank_amzn_karan;

public class CalculateHSF {
	
	private static String GetLeastRatio(int a ,int b ){
		int min=a>b?b:a;
		int hcf = 0;
		for(int i=min; i >= 1; i--)
        {
            if(a%i == 0 && b%i == 0)
            {
                hcf = i;
                break;
            }
        } 
		Math.cbrt(61);
		return (a/hcf)+"/"+(b/hcf);
	} 
	
	public static String[] ReduceFraction(String []fractions){
		String input[]=null;
		String result[] = new String[fractions.length];
		for(int i=0;i<fractions.length;i++){
			input= fractions[i].split("/");
			result[i]=GetLeastRatio(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
		}
		return result;
	}
	
	public static void main(String p[]){
		String input[] = {"825/1161","1092/1041","315/840"};
		String[] result=ReduceFraction(input);
		for(int i=0;i<result.length;i++){
			System.out.println(result[i]);
		}
	}
}
