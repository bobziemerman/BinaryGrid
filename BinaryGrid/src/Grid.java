import java.util.Random;

public class Grid {
	int[][] grid;
	int n;
	
	public Grid(int n){
		grid = new int[n][n];
		this.n = n;
		
		//randomly create a grid of 1s and 0s
		Random r = new Random();
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				grid[i][j] = r.nextInt(2) < 1 ? 0:1;
			}
		}
	}
	
	//print the created grid to the console
	public void printGrid(){
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
	}
}
