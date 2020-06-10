
public class Kadai4 {

	public static void main(String[] args) {
		int[] array;
		int heikin ;
		int max =0;
		int min=-1;
		min = -1;
		int a  = new java.util.Scanner(System.in).nextInt();
		array = new int[a];
		for(int i = 0; i < array.length; i++){
			System.out.print(i + 1 + "回目の入力値:");
			array[i] = new java.util.Scanner(System.in).nextInt();
			if(min == -1){
				min =array[i];
			}else if(max < i){
				max = array[i];
			}else if(min > array[i]){
				min = array[i];
			}
		}
		int result = 0;
		for(int i = 0; i < array.length; i++){
			result += array[i];	
			
		}
		
		System.out.println("合計:" + result);
		heikin = result / 10;
		System.out.println("平均値:" + heikin);
		System.out.println("最大値"  + max);
		System.out.println("最小値"  + min);
		
		
			}

		}


