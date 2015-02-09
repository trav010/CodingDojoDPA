/**
 * This interface defines all methods that are common for
 * the "Game of Life" JFrame and Applet implementation.
 * 
 * @author Dietrich Travkin
 */
public interface GameOfLifeUI
{
   /**
    * Initial height of the game field (number of rows).
    */
   public static final int DEFAULT_HEIGHT = 20;
   
   /**
    * Initial width of the game field (number of columns).
    */
   public static final int DEFAULT_WIDTH = 25;
   
   /**
    * Returns this window's or applet's game instance.
    * 
    * @return this window's  or applet'sgame instance
    */
   public GameOfLife getGameInstance();
   
   /**
    * Resets the game and creates a new game instance
    * with the given game field size.
    * 
    * @param width the width (number of columns) of the new game field
    * @param height the height (number of rows) of the new game field
    */
   public void resetGame(int width, int height);
   
   /**
    * Resets the game and creates a new game instance
    * with the same game field size as it was before.
    */
   public void resetGame();
   
   /**
    * Set the attribute determining, whether the user can change the
    * state of a cell in the game field (e.g. change a living cell to
    * be empty/dead).
    * 
    * @param userConfigurable <code>true</code>, if the user is
    *        allowed to change cells' state
    */
   public void setGameFieldIsUserConfigurable(boolean userConfigurable);
   
   /**
    * Stops all running processes of this window.
    */
   public void shutdown();
   
   /**
    * Repaints the field panel. This method can be used after state
    * changes to redraw the cells.
    */
   public void repaintFieldPanel();
}
