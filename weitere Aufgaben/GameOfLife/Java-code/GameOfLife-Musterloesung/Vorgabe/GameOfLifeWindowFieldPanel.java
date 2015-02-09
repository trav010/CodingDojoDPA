import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

/**
 * This class represents the field panel of a "Game of Life" window.
 * The field is visualised as a grid of cells, which can be filled blue
 * or left white.
 * 
 * @author Dietrich Travkin
 */
public class GameOfLifeWindowFieldPanel extends JPanel implements MouseListener
{	
   private static final long serialVersionUID = 5715791795084871780L;
	
	private boolean fieldIsUserConfigurable;
	
	private GameOfLifeUI parentUIElement;
	
	private int xOffset = 0;
	private int yOffset = 0;
	private int cellWidth = 0;
	private int cellHeight = 0;
	
	/**
	 * Creates the game field for a "Game of Life" window.
	 * 
	 * @param parentUIElement the parent UI element that this
	 *        field panel belongs to (e.g. a window)
	 */
	public GameOfLifeWindowFieldPanel(GameOfLifeUI parentUIElement)
   {
	   this.parentUIElement = parentUIElement;

      setFieldIsUserConfigurable(true);
      setBackground(Color.LIGHT_GRAY);
      
      addMouseListener(this);
   }
		
	/**
	 * Returns whether the user can change the
    * state of a cell in the game field (e.g.
    * change a living cell to be empty/dead).
	 * 
	 * @return <code>true</code>, if the user is
    *        allowed to change cells' state
	 */
	public boolean isFieldUserConfigurable()
	{
		return fieldIsUserConfigurable;
	}

	/**
	 * Set the attribute determining, whether the user can change the
    * state of a cell in the game field (e.g. change a living cell to
    * be empty/dead).
	 * 
	 * @param userConfigurable <code>true</code>, if the user is
    *        allowed to change cells' state
	 */
	public void setFieldIsUserConfigurable(boolean userConfigurable)
	{
		this.fieldIsUserConfigurable = userConfigurable;
	}
	
   /**
    * @see javax.swing.JComponent#paint(java.awt.Graphics)
    */
   public void paint(Graphics g)
   {
      g.setColor(getBackground());
      g.fillRect(0, 0, getWidth(), getHeight());
      
      GameOfLifeField currentField = this.parentUIElement.getGameInstance().getCurrentGameField();
      
      // -1 for each column except the last one to leave space for the grid
      cellWidth = (getWidth() - (currentField.getWidth() - 1)) / currentField.getWidth();
      xOffset = (getWidth() - (currentField.getWidth() * (cellWidth + 1))) / 2;
      
      // -1 for each row except the last one to leave space for the grid
      cellHeight = (getHeight() - (currentField.getHeight() - 1)) / currentField.getHeight();
      yOffset = (getHeight() - (currentField.getHeight() * (cellHeight + 1))) / 2;

      // draw cells
      for (int y = 0; y < currentField.getHeight(); y++)
      {
         for (int x = 0; x < currentField.getWidth(); x++)
         {
            if (currentField.isCellAlive(x, y))
            {
               g.setColor(Color.BLUE);
            }
            else
            {
               g.setColor(Color.WHITE);
            }
            
            int yCoord = yOffset + (y * (cellHeight + 1));
            int xCoord = xOffset + (x * (cellWidth + 1));
            g.fillRect(xCoord, yCoord, cellWidth, cellHeight);
         }
      }
   }

   /**
    * @see java.awt.event.MouseListener#mouseClicked(java.awt.event.MouseEvent)
    */
   public void mouseClicked(MouseEvent e)
   {     
   }

   /**
    * @see java.awt.event.MouseListener#mouseEntered(java.awt.event.MouseEvent)
    */
   public void mouseEntered(MouseEvent e)
   {
   }

   /**
    * @see java.awt.event.MouseListener#mouseExited(java.awt.event.MouseEvent)
    */
   public void mouseExited(MouseEvent e)
   {
   }

   /**
    * @see java.awt.event.MouseListener#mousePressed(java.awt.event.MouseEvent)
    */
   public void mousePressed(MouseEvent e)
   {
   }

   /**
    * @see java.awt.event.MouseListener#mouseReleased(java.awt.event.MouseEvent)
    */
   public void mouseReleased(MouseEvent e)
   {
      if (isFieldUserConfigurable())
      {
         int y = getRow(e.getY());
         int x = getCol(e.getX());
         
         GameOfLifeField currentField = this.parentUIElement.getGameInstance().getCurrentGameField();
         
         if (currentField.validCoordinates(x, y))
         {
            currentField.setCellEntry(x, y, !currentField.isCellAlive(x, y));
            
            this.repaint();
         }
      }
   }
   
   private int getRow(int yCoord)
   {     
      return (yCoord - yOffset) / (cellHeight + 1);
   }
   
   private int getCol(int xCoord)
   {     
      return (xCoord - xOffset) / (cellWidth + 1);
   }
}
