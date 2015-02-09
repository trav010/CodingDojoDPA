/**
 * This class represents the field of a "Game of Life" game instance,
 * i.e. a 2-dimensional grid of cells, where one cell can be empty
 * or contain a living creature.
 */
public class GameOfLifeField
{    
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
      // hier Code einfügen
   }
   
   /**
    * Returns the width of the field (number of cells in a row).
    * 
    * @return the width of the field (number of cells in a row).
    */
   public int getWidth()
   {
	   // hier Code einfügen
   }
   
   /**
    * Returns the height of the field (number of cells in a column).
    * 
    * @return the height of the field (number of cells in a column).
    */
   public int getHeight()
   {
	   // hier Code einfügen
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
	   // hier Code einfügen
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
	   // hier Code einfügen
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
	   // hier Code einfügen
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
	   // hier Code einfügen
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
	   // hier Code einfügen
   }
}