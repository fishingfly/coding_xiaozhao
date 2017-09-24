/*

        基本思路：
        先递归的把数组划分为两个子数组，一直递归到数组中只有一个元素
		，然后再调用函数把两个子数组排好序，
		因为该函数在递归划分数组时会被压入栈，所以这个函数真正的作用是对两个有
		序的子数组进行排序；
		时间复杂度:
        归并的时间复杂度分析：主要是考虑两个函数的时间花销，一、数组划分函数
		mergeSort()；二、有序数组归并函数_mergeSort()；_mergeSort()函数的时间
		复杂度为O(n)，因为代码中有2个长度为n的循环（非嵌套），所以时间复杂度则为O(n)；
        简单的分析下元素长度为n的归并排序所消耗的时间 T[n]：调用mergeSort()函数划分两
		部分，那每一小部分排序好所花时间则为  T[n/2]，而最后把这两部分有序的数组合并
		成一个有序的数组_mergeSort()函数所花的时间为  O(n)；
		
		空间复杂度:
        归并的空间复杂度就是那个临时的数组和递归时压入栈的数据占用的空间：n + logn；
		所以空间复杂度为: O(n)

*/


package mergeSort;

public class MergeSort {
	public static int count;
	public static int[] startSort(int[] data, int start, int end) {
		if (start < end) {
			int mid = (end - start)/2 + start;
			startSort(data, start, mid);
			startSort(data,mid+1,end);
			startMerge(data, start, mid, end);
		}
		return data;
	}
	
	public static void startMerge(int[] data, int start, int mid, int end) {
		int startNew = start;
		int[] temp = new int[end - start + 1];
		int index = 0;
		int behind = mid + 1;
		while (start <= mid && behind <= end) {
			if (data[start] > data[behind]) {
				temp[index++] = data[behind++];
			} else {
				temp[index++] = data[start++];
			}
		}
		//左边没有遍历完
		for (int i = start; i <= mid; i++){
			temp[index++] = data[i];
		}
		//右边没有遍历完
		for (int i = behind; i <= end; i++){
			temp[index++] = data[i];
		}
		//把排列好的数组放回到原数组
		for (int i = 0; i < temp.length; i++) {
			data[startNew++] = temp[i];
		}
	}
	
	public static void main(String[] args) {
		int data[] = {1,2,3,0,5,7,9,-2};
		int[] newdata = startSort(data,0,data.length-1);
		for (int i = 0; i < newdata.length; i++) {
			System.out.print(newdata[i]+",");
		}
	}

}
