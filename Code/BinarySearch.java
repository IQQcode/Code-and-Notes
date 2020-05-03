
public class BinarySearch {
    public static void main(String[] args) {
           //数组
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		//要查找的元素
		int key = 7;
		//第一个元素的下标
		int left = 0;
		//最后一个元素的下标
		int right = (arr.length - 1);
		//获取指定元素的下标
		int index = getSearch(arr, key, left, right);
		if(index == -1){
			System.out.println("不含有该元素 "+ key);
		}else{
			System.out.println("含有该元素  "+ key + "，下标为："+index);
		}
	}
    public static int getSearch(int[] arr,int key,int left,int right) {
        int mid = left + (right - left) / 2;
        while(left <= right) {
            if(arr[mid] > key) {
                right = mid-1; 
            }else if(arr[mid] < key) {
                left = mid + 1;
            }else {
                return mid;
            }
        }
        return -1;
    }
}