/**
 * This class represents the field of a "Game of Life" game instance,
 * i.e. a 2-dimensional grid of cells, where one cell can be empty
 * or contain a living creature.
 * 
 * @author Dietrich Travkin
 */
public class GameOfLifeField
{ 
   private boolean[][] matrix;
   
   /**
    * Creates a new field with the given width and height,
    * i.e. a grid field with 'width' cells in each row and
    * 'height' cells in each column.
    * 
    * @param width number of cells in each row (number of columns)
    * @param height number of cells in each column (number of rows)
    */
   public GameOfLifeField(int width, int height)
   {
      this.matrix = new boolean[height][width];
   }
   
   /**
    * Returns the width of the field (number of cells in a row).
    * 
    * @return the width of the field (number of cells in a row).
    */
   public int getWidth()
   {
      return (this.matrix.length > 0 ? this.matrix[0].length : 0);
   }
   
   /**
    * Returns the height of the field (number of cells in a column).
    * 
    * @return the height of the field (number of cells in a column).
    */
   public int getHeight()
   {
      return this.matrix.length;
   }
   
   /**
    * Determines whether the given coordinates are within the
    * game field bounds.
    * 
    * @param x the x coordinate (column)
    * @param y the y coordinate (row)
    * @return <code>true</code> if the coordinates are within
    *         field bounds, <code>false</code> otherwise.
    */
   public boolean validCoordinates(int x, int y)
   {
      return (x >= 0 && x < getWidth() && y >= 0 && y < getHeight());
   }
   
   /**
    * Checks whether the given coordinates are whithin the
    * game field bounds and throws an
    * <code>IllegalArgumentException</code>, if they are not.
    * 
    * @param x the x coordinate (column)
    * @param y the y coordinate (row)
    */
   private void validateCoordinates(int x, int y)
   {
      if (!this.validCoordinates(x, y))
      {
         throw new IllegalArgumentException("Coordinates ("
               + x + ", " + y + ") are out of bounds.");
      }
   }
   
   /**
    * Returns true, if the cell with coordinate (x,y) is alive,
    * false otherwise (especially, if the field does not exist).
    * 
    * Lowest valid coordinate value is 0,
    * highest valid x value is width - 1,
    * highest valid y value is height - 1.
    * 
    * @param x the x coordinate of the cell (column)
    * @param y the y coordinate of the cell (row)
    * @return true, if the cell is alive, false otherwise.
    */
   public boolean isCellAlive(int x, int y)
   {
      this.validateCoordinates(x, y);
      
      return matrix[y][x];
   }
   
   /**
    * Sets the alive value of the cell with the given coordinate.
    * 
    * Lowest valid coordinate value is 0,
    * highest valid x value is width - 1,
    * highest valid y value is height - 1.
    * 
    * @param x the x coordinate of the cell (column)
    * @param y the y coordinate of the cell (row)
    * @param alive the alive value
    */
   public void setCellEntry(int x, int y, boolean alive)
   {
      this.validateCoordinates(x, y);
      
      matrix[y][x] = alive;
   }
   
   /**
    * Determines the number of alive neighbours of the cell
    * with coordinates (x, y).
    * 
    * Lowest valid coordinate value is 0,
    * highest valid x value is width - 1,
    * highest valid y value is height - 1.
    * 
    * @param x the x coordinate of the cell (column)
    * @param y the y coordinate of the cell (row)
    * @return number of alive neighbour cells
    */   
   public int getNumberOfAliveNeighbours(int x, int y)
   {
      this.validateCoordinates(x, y);
      
      // Run through all neighbours.
      // The cell given by x and y is in the center,
      // the surrounding cells have to be checked.
      //
      // |1|2|3|
      // |4| |5|
      // |6|7|8|
      
      int result = 0;
      
      for (int row = y - 1; row <= y + 1; row++)
      {
         for (int column = x - 1; column <= x + 1; column++)
         {
            if ( (row != y || column != x) // not (x,y) coordinates
                  && this.validCoordinates(column, row) // whithin field bounds
                  && matrix[row][column] ) // cell is alive
            {
               result++;
            }
         }
      }
      
      return result;
   }
}