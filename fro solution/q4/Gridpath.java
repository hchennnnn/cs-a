public class Gridpath {
  private int[][] grid;
  public Gridpath(int[][] arr) {
    grid = arr;
  }
  public location getNextLoc(int row,int col) {
    if(row == grid.length-1) {
      location a = new location(row,col+1);
      return a;
    }
    if(col == grid[0].length-1) {
      location a = new location(row+1,col);
      return a;
    }
    if(grid[row][col+1] < grid[row+1][col]) {
      location a = new location(row,col+1);
      return a;
    }
    location a = new location(row+1,col);
    return a;
  }
  public int sumPath(int row,int col) {
    int sum = grid[row][col];
    location a = getNextLoc(row,col);
    int r = a.getRow();
    int c = a.getCol();
    while((r+1)*(c+1) != ((grid.length)*(grid[0].length))) {
      System.out.println(grid[r][c]);
      sum += grid[r][c];
      location s = getNextLoc(r,c);
      r = s.getRow();
      c = s.getCol();
    }
    return sum;
  }
}
