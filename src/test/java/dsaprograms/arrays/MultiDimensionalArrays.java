package dsaprograms.arrays;

public class MultiDimensionalArrays {
	public static void main(String[] args) {
		int[][] array2d = {{1,4,7,11},{2,5,8,12},{3,6,9,16},{10,13,14,17}};
		int target = 187;
		
		boolean exists = isTargetExist(array2d,target);
		
		System.out.println(exists);
	}

	private static boolean isTargetExist(int[][] array2d, int target) {
		
		
		int rows = array2d.length;
		int cols = array2d[0].length;
		
		int row = 0;
		int col = cols - 1;
		
		// start at top right corner
		while(row < rows && col >= 0) {
			if(array2d[row][col] == target) {
				return true;
			}else if(array2d[row][col] > target) {
				col--;
			}else {
				row++;
			}
		}
		
		return false;
	}
}
