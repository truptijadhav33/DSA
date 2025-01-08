// public class ratMaze {
//     // static int count =0;
//     public static int mazeSolver(int[][] maze, int i, int j) {
//         // base case
//         if (i == maze.length-1 && j == maze[0].length-1) {
//             // count++;
//             return 1;
//         }
//         // recursion
//         if (maze.length==0 || !isSafe(maze, i, j)) {
//             return 0;
//         }
//         int w1 = mazeSolver(maze, i + 1, j);
//         int w2 = mazeSolver(maze, i, j + 1);
//         return w1 + w2;
//     }

//     public static boolean isSafe(int[][] maze, int i, int j) {
//         if (i >= 0 && i <= maze.length - 1 && j >= 0 && j <= maze[0].length - 1 && maze[i][j] == 1) {
//             return true;
//         }
//         return false;
//     }

//     public static void main(String[] args) {
//         int maze[][] = {
//                 { 1, 0, 0, 0 },
//                 { 1, 1, 0, 1 },
//                 { 0, 1, 0, 0 },
//                 { 1, 1, 1, 1 }
//         };
//         System.out.println("Total ways are: " + mazeSolver(maze, 0, 0));
//     }
// }




public class ratMaze {
    // static int count = 0;

    public static int mazeSolver(int[][] maze, int i, int j, int[][] solution) {
        // base case
        if (i == maze.length - 1 && j == maze[0].length - 1) {
            solution[i][j] = 1; // mark the destination in the solution array
            return 1;
        }

        // recursion with bounds check and safe check
        if (!isSafe(maze, i, j)) {
            return 0; // not a valid path
        }

        // mark the current cell in the solution array
        solution[i][j] = 1;

        // Move down (i + 1, j)
        if (mazeSolver(maze, i + 1, j, solution) == 1) {
            return 1; // path found
        }

        // Move right (i, j + 1)
        if (mazeSolver(maze, i, j + 1, solution) == 1) {
            return 1; // path found
        }

        // If neither move is possible, backtrack by unmarking the current cell
        solution[i][j] = 0;
        return 0; // no path found
    }

    public static boolean isSafe(int[][] maze, int i, int j) {
        return i >= 0 && i < maze.length && j >= 0 && j < maze[0].length && maze[i][j] == 1;
    }

    public static void printSolution(int[][] solution) {
        for (int i = 0; i < solution.length; i++) {
            for (int j = 0; j < solution[0].length; j++) {
                System.out.print(solution[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int maze[][] = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 1 }
        };

        // Create a solution array to store the path
        int[][] solution = new int[maze.length][maze[0].length];

        if (mazeSolver(maze, 0, 0, solution) == 1) {
            System.out.println("Solution Path: ");
            printSolution(solution);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
