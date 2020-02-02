package algorithm;

public class TreeAndArray {

	public static void main(String[] args) {
		int[]arr= {78,56,34,43,4,1,15,2,23};
		preOrder(arr, 0);

	}
	//前序遍历
	static void preOrder(int[]arr,int index) {
		if(index>=arr.length)return;
		
		System.out.println(arr[index]);//输出根节点
		preOrder(arr, index*2+1);//输出左子树
		preOrder(arr, index*2+2);//输出右子树
	}
	//中序遍历
	static void inOrder(int[]arr,int index) {
		if(index>=arr.length)return;
		
		preOrder(arr, index*2+1);//输出左子树
		System.out.println(arr[index]);//输出根节点
		preOrder(arr, index*2+2);//输出右子树
	}
	

}
