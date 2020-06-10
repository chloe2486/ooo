
public class Kadai3 {

	public static void main(String[] args) {
		int[] array;
		int heikin ;
		
		array = new int[10];
		for(int i = 0; i < array.length; i++){
			System.out.println(i + 1 + "回目の入力値");
			array[i] = new java.util.Scanner(System.in).nextInt();
		
		}
		int result = 0;
		for(int i = 0; i < array.length; i++){
			result += array[i];	
			
		}
		System.out.println("合計:" + result);
		heikin = result / 10;
		System.out.println("平均値:" + heikin);
		
	}
}
