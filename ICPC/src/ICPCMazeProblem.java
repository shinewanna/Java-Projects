
public class ICPCMazeProblem {

	public static void main(String[] args) {
		int N = 5, x0 = 0, y0 = 0, xf = 4, yf = 4;

		// create maze elements
		int[][] maze = { 
				{ 1, 1, 3, 2, 1 }, 
				{ 3, 2, 2, 1, 2 }, 
				{ 1, 3, 3, 1, 3 },
				{ 1, 2, 3, 1, 2 },
				{ 1, 1, 1, 3, 1 } };
		IcpcMaze m = new IcpcMaze(maze, x0, y0, xf, yf, N);

		// lets start move
		m.Move(x0, y0);
		if (m.b == false) {
			System.out.println("No Solution");
		}

	}

}

class IcpcMaze {
	int maze[][];
	int x0, y0, xf, yf;
	int N, count;
	String s;
	int sum;
	boolean b;

	public IcpcMaze(int[][] maze, int x0, int y0, int xf, int yf, int N) {

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
		if (x >= 0 && x < N && y >= 0 && y < N)
			return true;
		return false;
	}

	void Move(int x, int y) {
		String backup_s;
		int backup_sum;
		s = s + "(" + x + "," + y + "),";
		sum = sum + maze[x][y];
		
		backup_s = s;
		backup_sum = sum;
		// if arrive destination, print path
		if (x == xf && y == yf) {
			System.out.println("Path["+count+"] : "+s + "sum : " + sum);
			b = true;
			count++;
		}

		// recursive
		if (isSafe(x, y + 1) && (maze[x][y] == 1 || maze[x][y] == 3)) {
			sum = backup_sum;
			s = backup_s;
			Move(x, y + 1);
		}

		if (isSafe(x + 1, y) && (maze[x][y] == 2 || maze[x][y] == 3)) {
			sum = backup_sum;
			s = backup_s;
			Move(x + 1, y);
		}

	}

}