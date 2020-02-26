package 第七章;

public class n皇后 {

	/**
	 *  回溯：递归调用代表开启一个分支，如果希望这个分支返回后某些数据恢复到
	 *  分支开启前的状态以便重新开始，就要使用回溯技巧
	 *  全排列的交换法，数独，部分和，用到了回溯
	 *剪枝：深搜时，如果已经明确从当前状态如何转移都不会存在更优解
	 *就应该中断往下的继续搜索，这种方法称为剪枝
	 *数独里面有剪枝
	 *部分和里面有剪枝
	 * 
	 */
	
	/**
	 * 请设计一种算法，解决著名的n皇后问题。这里n皇后问题指在一个n*n的棋盘上
	 * 放置n个棋子，使得每行每列和每条对角线上都只有一个棋子，求其摆放的方法数
	 * 给定一个int n，请返回方法数，保证n小于15
	 * 
	 * 技巧：如何检查对角线上的元素
	 * 主对角线：x-y相同//行减列
	 * 副对角线：x+y相同
	 * 扫描rec数组：记录填的坐标，
	 * 
	 */
	static int n;
	static int cnt;
	static int[]rec;
	public static void main(String[] args) {
		n=4;
		rec=new int[4];
		dfs(0);
		System.out.println(cnt);

	}
	public static void dfs(int row) {
		if(row==n) {
			cnt++;
			return;
		}
		for(int col=0;col<n;col++) {
			boolean ok=true;
			for(int i=0;i<row;i++) {
				if(rec[i]==col||i+rec[i]==row+col||i-rec[i]==row-col) {
					ok=false;
					break;
				}
			}
			if(ok) {
				rec[row]=col;
				dfs(row+1);
				
			}
		}
		
	}
	

}
