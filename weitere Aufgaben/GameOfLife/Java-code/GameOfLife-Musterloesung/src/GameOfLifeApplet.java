import java.applet.Applet;
import java.awt.BorderLayout;

/**
 * @author Dietrich Travkin
 */
public class GameOfLifeApplet extends Applet implements GameOfLifeUI
{
   private static final long serialVersionUID = 2514005979168130385L;
   
   private GameOfLifeWindowFieldPanel fieldDisplay;
   private GameOfLifeWindowControls controls;
   private GameOfLife gameInstance;
   
   /**
    * Initialises the applet.
    * 
    * @see java.applet.Applet#init()
    */
   public void init()
   {
      fieldDisplay = new GameOfLifeWindowFieldPanel(this);
      controls = new GameOfLifeWindowControls(this);
      
      this.setLayout(new BorderLayout());
      this.add(fieldDisplay, BorderLayout.CENTER);
      this.add(controls, BorderLayout.SOUTH);
      
      this.resetGame(DEFAULT_WIDTH, DEFAULT_HEIGHT);

      this.setVisible(true);
   }
   
   /**
    * @see java.applet.Applet#destroy()
    */
   public void destroy()
   {
      this.shutdown();
   }
   
   /**
    * Returns this window's game instance.
    * 
    * @return this window's game instance
    */
   public GameOfLife getGameInstance()
   {
      return this.gameInstance;
   }
   
   /**
    * Resets the game and creates a new game instance
    * with the given game field size.
    * 
    * @param width the width (number of columns) of the new game field
    * @param height the height (number of rows) of the new game field
    */
   public void resetGame(int width, int height)
   {
      this.gameInstance = new GameOfLife(width, height);
      this.fieldDisplay.repaint();
      this.controls.updateIterationsLabel();
   }
   
   /**
    * Resets the game and creates a new game instance
    * with the same game field size as it was before.
    */
   public void resetGame()
   {
      int width = this.gameInstance.getCurrentGameField().getWidth();
      int height = this.gameInstance.getCurrentGameField().getHeight();
      this.resetGame(width, height);
   }
   
   /**
    * Set the attribute determining, whether the user can change the
    * state of a cell in the game field (e.g. change a living cell to
    * be empty/dead).
    * 
    * @param userConfigurable <code>true</code>, if the user is
    *        allowed to change cells' state
    */
   public void setGameFieldIsUserConfigurable(boolean userConfigurable)
   {
      this.fieldDisplay.setFieldIsUserConfigurable(userConfigurable);
   }
   
   /**
    * Stops all running processes of this window.
    */
   public void shutdown()
   {
      controls.shutdown();
   }
   
   /**
    * Repaints the field panel. This method can be used after state
    * changes to redraw the cells.
    */
   public void repaintFieldPanel()
   {
      this.fieldDisplay.repaint();
   }
}
