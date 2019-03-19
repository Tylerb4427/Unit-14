package Grid;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
public class Grid {

    private String[][] grid;

    //load vals into the rows x cols grid randomly
    public Grid(int rows, int cols, String[] vals) {
        grid = new String[rows][cols];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                grid[i][j] = "";
            }
        }
        for (String i : vals) {
            getPos(i);
        }
    }

    private void getPos(String val) {
        int x = (int) (Math.random() * (grid.length));
        int y = (int) (Math.random() * (grid[0].length));
        if (grid[x][y].equals("")) {
            grid[x][y] = val;
        } else {
            getPos(val);
        }
    }

    //find out which of the vals occurs the most

    public String findMax() {
        String ans = "";
        int count = 0;
        for (String[] grid1 : grid) {
            for (String grid2 : grid1) {
                if (countVals(grid2) > count) {
                    ans = grid2;
                }
                count = countVals(grid2);
            }
        }
        return ans;
    }

    //returns a count of how many times val occurs in the matrix
    public int countVals(String val) {
        int ans = 0;
        for (String[] grid1 : grid) {
            for (String grid2 : grid1) {
                if (grid2.equals(val)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    //display the grid
    public String toString() {
        String output = "";
        for (String[] grid1 : grid) {
            for (String grid2 : grid1) {
                output += grid2 + " ";
            }
            output += "\n";
        }
        return output;
    }
}
