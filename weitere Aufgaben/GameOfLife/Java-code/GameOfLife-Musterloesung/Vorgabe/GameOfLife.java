/**
 * This class represents instances of "Game of Life" simulations/games.
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
	   // hier Code einfügen
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
	   // hier Code einfügen
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