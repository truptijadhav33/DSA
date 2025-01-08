public class towerOfHonai {
    
    // Recursive method to solve the Tower of Hanoi problem
    public static void toh(int n, int a, int c, int b) {
        // Base case: If no disks are left to move, return
        if (n == 0) {
            return;
        }

        // Recursive call to move (n-1) disks from source (a) to auxiliary (b) using destination (c)
        toh(n - 1, a, b, c);

        // Print the move of the nth disk from the source (a) to the destination (c)
        System.out.println("moving " + n + "th disk from " + a + " to " + c);

        // Recursive call to move (n-1) disks from auxiliary (b) to destination (c) using source (a)
        toh(n - 1, b, c, a);
    }

    // Main method to test the Tower of Hanoi solution
    public static void main(String[] args) {
        // Solve the Tower of Hanoi problem for 3 disks
        // Pegs are represented by integers: 10 (source), 30 (destination), 20 (auxiliary)
        toh(3, 10, 30, 20);
    }
}
