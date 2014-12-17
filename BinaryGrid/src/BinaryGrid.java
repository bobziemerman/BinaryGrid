
public class BinaryGrid {

	public static void main(String[] args) {
		//get new grid
		Grid grid = new Grid(20);
		
		//print grid
		grid.printGrid();
		
		//find largest rectangle
		System.out.println(largestRectangle(grid));
	}
	
	public static int largestRectangle(Grid g){
		int[][] heights = new int[g.n][g.n];
		int maxRect = 0;
		int minHeight = 0;
		int col = 0;
		
		for(int i=0; i<g.n; i++){
			for(int j=0; j<g.n; j++){
				//if we're on the top row:
				if(i==0){
					//store val
					heights[i][j] = g.grid[i][j];
				} else{
					//store val
					heights[i][j] = g.grid[i][j]==0 ? 0: g.grid[i][j] + heights[i-1][j];
				}
				
				//find largest square
				col = j;
				minHeight = heights[i][j];
				while(col>=0 && heights[i][col]!=0){
					//set new minHeight if needbe
					if(heights[i][col]<minHeight){
						minHeight = heights[i][col];
					}
					
					if(minHeight*(j-col+1)>maxRect){
						maxRect = minHeight*(j-col+1);
					}
					
					//decrement col
					col--;
				}
			}
		}
		
		//debug output
		/*
		System.out.println();
		for(int i=0; i<g.n; i++){
			for(int j=0; j<g.n; j++){
				System.out.print(heights[i][j]);
			}
			System.out.println();
		}
		*/
		
		System.out.println();
		return maxRect;
	}

}
