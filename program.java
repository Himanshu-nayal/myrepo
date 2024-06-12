public class StarPattern {
    public static void main(String[] args) {
      
        int height = 7;
        int width = 5;
        
        // Define the star patterns for each letter
        char[][] J = {
            {' ', ' ', '*', '*', '*'},
            {' ', ' ', ' ', ' ', '*'},
            {' ', ' ', ' ', ' ', '*'},
            {' ', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', '*'},
            {' ', '*', '*', '*', ' '}
        };
        
        char[][] A = {
            {' ', '*', '*', '*', ' '},
            {'*', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', '*'},
            {'*', '*', '*', '*', '*'},
            {'*', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', '*'}
        };
        
        char[][] V = {
            {'*', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', '*'},
            {'*', ' ', ' ', ' ', '*'},
            {' ', '*', ' ', '*', ' '},
            {' ', ' ', '*', ' ', ' '},
            {' ', ' ', '*', ' ', ' '}
        };
        
        // Print the patterns side by side
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(J[i][j]);
            }
            System.out.print("   "); // Space between letters
            for (int j = 0; j < width; j++) {
                System.out.print(A[i][j]);
            }
            System.out.print("   "); // Space between letters
            for (int j = 0; j < width; j++) {
                System.out.print(V[i][j]);
            }
            System.out.print("   "); // Space between letters
            for (int j = 0; j < width; j++) {
                System.out.print(A[i][j]);
            }
            System.out.println();
        }
    }
}
