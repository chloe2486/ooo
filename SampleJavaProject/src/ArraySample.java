
public class ArraySample {

	public static void main(String[] args) {
		calc2(2,8);
	}


	public static void calc2(int n, int n2){
		int result = 1;
		for(int i = 0; i < n2; i++){
			result*=n;
		}
		System.out.println(result);
	}
}
