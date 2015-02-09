import java.awt.BorderLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * Represents the graphical user interface (a window with
 * a game field and controls) for the "Game of Life".
 * 
 * @author Dietrich Travkin
 */
public class GameOfLifeWindow extends JFrame implements GameOfLifeUI
{
   private static final long serialVersionUID = -5481460182600564746L;
   
   private GameOfLifeWindowFieldPanel fieldDisplay;
	private GameOfLifeWindowControls controls;
	private GameOfLife gameInstance;
	
   /**
    * Creates a new "Game of Life" window with default
    * field width and height.
    */
   public GameOfLifeWindow()
   {
      super("The game of LIFE");                
      
      fieldDisplay = new GameOfLifeWindowFieldPanel(this);
      controls = new GameOfLifeWindowControls(this);
      
      getContentPane().setLayout(new BorderLayout());
      getContentPane().add(fieldDisplay, BorderLayout.CENTER);
      getContentPane().add(controls, BorderLayout.SOUTH);
      
      this.resetGame(DEFAULT_WIDTH, DEFAULT_HEIGHT);
      
      this.addWindowListener (new GameOfLifeWindowAdapter());
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
	
	private class GameOfLifeWindowAdapter extends WindowAdapter
	{		
		public void windowClosing(WindowEvent e)
		{
			if (e.getSource() instanceof GameOfLifeWindow)
			{
				((GameOfLifeWindow) e.getSource()).shutdown();
				System.exit(0);
			}			
		}
	}
}
