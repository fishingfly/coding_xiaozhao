package selectionSort;
/*
时间复杂度
        选择排序的时间复杂度不像前面几种排序方法那样，前面几种排序方法的时间复杂度不是一眼就能看出来的，而是要通过推导计算才能得到的。一般会涉及到递归和完全二叉树，所以推导也不是那么容易。但是选择排序就不一样了，你可以很直观的看出选择排序的时间复杂度：就是两个循环消耗的时间；
       比较时间：T = （n-1)）+ （n -2）+（n - 3）.... + 1;  ===>>  T =  [n*(n-1) ] / 2；
      交换时间：最好的情况全部元素已经有序，则 交换次数为0；最差的情况，全部元素逆序，就要交换 n-1 次；
       所以最优的时间复杂度  和最差的时间复杂度   和平均时间复杂度  都为 ：O(n^2)



*/

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
