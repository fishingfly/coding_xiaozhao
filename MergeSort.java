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
