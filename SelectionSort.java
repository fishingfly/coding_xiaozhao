package selectionSort;

public class SelectionSort {
	public static void startSort(int[] data) {
		int len = data.length;
		for (int i = 0; i < len; i++) {
			int k = i;
			for (int j = i + 1; j < len; j++) {//从i开始找出最小的元素与i下标元素做替换
				if (data[j] < data[k]) {
					k = j;
				}
			}
			//开始做替换
			if (k > 0 && k < len) {
				int temp = data[i];
				data[i] = data[k];
				data[k] = temp;
			}
			print(data);
		}
	}
	
	public static void print(int[] data) {
		int len = data.length;
		for (int i = 0; i < len; i++) {
			System.out.print(data[i]+",");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] data = {1,5,23,54,2,0,-1,35,9};
		startSort(data);
	}

}
