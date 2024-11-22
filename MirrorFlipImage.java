public class MirrorFlipImage{

    //prints out a 2-D array
    private static void displayImage(char[][] image){
        // make variables for x and y in the matrix
        int rows = image.length;
        int col = image[0].length;

        //use nested for-loop to print each value
        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < col; ++j){
                System.out.print(image[i][j] + "  ");
            }
            System.out.println();
        }
    }

    //perfrom a horizontal flip
    private static char[][] verticalMirror(char[][] image){
        int rows = image.length;
        int col = image[0].length;

        //creates a new 2-D array to store the new values
        //after the flipping and to return a char[][]
        char[][] flipImage = new char[rows][col];
        
        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < col; ++j){
                flipImage[i][j] = image[i][col - 1 - j];//reverses all the 1-D arrays in the matrix one by one
               
            }
        }
        return flipImage; 
    }

    //perform a vertical flip
    private static char[][] horizontalMirror(char[][] image){
        int rows = image.length;
        int col = image[0].length;
        char[][] flipImage = new char[rows][col];
        
        for(int i = 0; i < rows; ++i){
            for(int j = 0; j < col; ++j){
                flipImage[i][j] = image[rows - 1 - i][j];//reverses all the 1-D arrays in the matrix one by one
            }
        }
        return flipImage; 
    }

    public static void main (String[] args){
        //creating the matrix for the image
        char[][] image = {
            {'#', 'x', '#', '#', '#'},
            {'#', ' ', ' ', ' ', '#'},
            {'#', ' ', 'E', ' ', '#'},
            {'*', ' ', ' ', ' ', '|'},
            {'#', ' ', ' ', ' ', '#'},
            {'#', ' ', ' ', ' ', '#'},
            {'#', '#', '#', 'y', '#'},
        }; 
        //print the image
        System.out.println("---------------");
        System.out.println("Original image: ");
        displayImage(image);
        System.out.println("---------------");
        System.out.println("Vertical Mirror: ");
        displayImage(verticalMirror(image));
        System.out.println("---------------");
        System.out.println("Horizontal Mirror: ");
        displayImage(horizontalMirror(image));
    }

}