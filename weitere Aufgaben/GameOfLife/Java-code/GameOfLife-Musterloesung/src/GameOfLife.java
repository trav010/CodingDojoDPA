/**
 * This class represents instances of "Game of Life" simulations/games.
 * 
 * @author Dietrich Travkin
 */
public class GameOfLife
{
   private GameOfLifeField gameField;
   private int numberOfIterations = 0;
   
   /**
    * Creates a new game instance with the given field width and height.
    * 
    * @param width the width of the game field
    * @param height the height of the game field
    */
   public GameOfLife(int width, int height)
   {
      this.gameField = new GameOfLifeField(width, height);
   }
   
   /**
    * Returns the number of simulation iterations already run or
    * the number of the current generation.
    * 
    * @return the number of game iterations (population growth steps).
    */
   public int getNumberOfIterations()
   {
      return numberOfIterations;
   }
   
   /**
    * Returns the game field of the current simulation step
    * (current population).
    * 
    * @return the game field of the current simulation step
    */
   public GameOfLifeField getCurrentGameField()
   {
      if (this.gameField == null)
      {
         throw new IllegalStateException("Current game field is null!");
      }
      return this.gameField;
   }
   
   /**
    * Run one simulation step, i.e. determine the population
    * of the next generation and change the game field
    * accordingly.
    */
   public void simulateOneStep()
   {
      this.gameField = this.calculateNextField(this.gameField);
      this.numberOfIterations++;
   }
   
   /**
    * Given a current population (in a given GameOfLifeField object)
    * this method determines the next generation's population and
    * returns it in a new GameOfLifeField object.
    * 
    * @param field the current population
    * @return the next generation's population
    */
   private GameOfLifeField calculateNextField (GameOfLifeField field)
   {     
      GameOfLifeField nextField = new GameOfLifeField(
            field.getWidth(), field.getHeight());
      
      for (int x = 0; x < field.getWidth(); x++)
      {
         for (int y = 0; y < field.getHeight(); y++)
         {
            // initialize cell of new field with cell entry of old field
            nextField.setCellEntry(x, y, field.isCellAlive(x, y));
            
            // determine the new cell value for the new field
            int numberOfNeighbors = field.getNumberOfAliveNeighbours(x, y);
            if (numberOfNeighbors < 2 || numberOfNeighbors > 3)
            {
               // loneliness or crowding, cell entry dies (if existent)
               nextField.setCellEntry(x, y, false);
            }
            else if (!field.isCellAlive(x, y)) // if cell is empty
            {
               if (numberOfNeighbors == 3)
               {
                  // new cell member is born
                  nextField.setCellEntry(x, y, true);
               }
            }
         }
      }
      
      return nextField;
   }
   
   /**
    * Create a graphical user interface for a "Game of Life" instance.
    * 
    * @param args console arguments (no arguments expected)
    */
   public static void main(String[] args)
   {
      GameOfLifeWindow window = new GameOfLifeWindow();
      window.setSize(640, 480);
      window.setVisible(true);
   }
}