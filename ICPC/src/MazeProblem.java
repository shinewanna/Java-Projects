
public class MazeProblem {

	public static void main(String[] args) {
		int N = 4, x0 = 0, y0 = 0, xf = 3, yf = 3;

		//create maze elements
		int[][] maze = {
				{1,1,1,1},
				{1,0,0,1},
				{1,1,0,1},
				{1,1,1,1},};
		Maze m = new Maze(maze,x0, y0, xf, yf, N);
		
		//lets start move
		m.Move(x0, y0);
		if(m.b == false) {
			System.out.println("No Solution");
		}		
	}

}

class Maze {
	public int maze[][];
	int x0, y0, xf, yf;
	int N, count;
	String s;
	boolean b;

	public Maze(int[][] maze, int x0, int y0, int xf, int yf, int N) {

		this.maze = maze;
		this.x0 = x0;
		this.y0 = y0;
		this.xf = xf;
		this.yf = yf;
		this.N = N;
		s = "";
		count = 1;
		b = false;
	}

	boolean isSafe(int x, int y) {
		if (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1)
			return true;
		return false;
	}

	void Move(int x, int y) {
		String backup_s;
		s = s + "(" + x + "," + y + "),";

		backup_s = s;
		// if arrive destination, print path
		if (x == xf && y == yf) {
			System.out.println("Path["+count+"] : "+s);
			b = true;
			count++;
		}

		// recursive
		if (isSafe(x, y + 1)) {
			s = backup_s;
			Move(x, y + 1);
		}

		if (isSafe(x + 1, y)) {
			s = backup_s;
			Move(x + 1, y);
		}
	}
}