public class Location {
    public int row;
    public int column;
    public double maxValue;
    
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        double[][] array = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextDouble();
            }
        }
        
        Location location = Location.locateLargest(array);
        location.displayLocation();

        scanner.close();
    }
    

    public Location(int r, int c, double maxVal) {
        row = r;
        column = c;
        maxValue = maxVal;
    }
    public void displayLocation() {
        System.out.println("The location of the largest element is " + maxValue +
                " at (" + row + ", " + column + ").");
    }
   
    public static Location locateLargest(double[][] array) {
        int maxRow = 0;
        int maxCol = 0;
        double maxVal = array[0][0]; 

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxVal) {
                    maxVal = array[i][j];
                    maxRow = i;
                    maxCol = j;
                }
            }
        }
       
        return new Location(maxRow, maxCol, maxVal);
    }
    

    
   

   
    
}
