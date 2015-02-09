import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

/**
 * This class represents all controls (buttons,
 * combo boxes, etc.) of a "Game of Life" window.
 * 
 * @author Dietrich Travkin
 */
public class GameOfLifeWindowControls extends JToolBar implements ActionListener
{
   private static final long serialVersionUID = -5817360682323032120L;

   private static final int DEFAULT_PERIOD = 1000;
	
	private Timer timer;
	
	private GameOfLifeUI parentUIElement;
	
	private JButton startButton;
	private JButton stopButton;
	private JButton nextButton;
	
	private JLabel numberOfIterationsLabel;
	
	private JButton clearButton;
	
	private JButton setSize;
	private JTextField widthField;
	private JTextField heightField;
	
	private JTextField updatePeriodField;
		
   /**
    * Creates the controls for a "Game of Life" window.
    * 
    * @param parentUIElement the parent UI element that
    *        this controls belong to (e.g. a window)
    */
   public GameOfLifeWindowControls(GameOfLifeUI parentUIElement)
   {
      this.parentUIElement = parentUIElement;
      timer = new Timer();
      
      initGUI();
   }
	
	private void initGUI()
	{
		// buttons
		startButton = new JButton("Start");
		startButton.addActionListener(this);
		add(startButton);
		
		stopButton = new JButton("Stop");
		stopButton.addActionListener(this);
		stopButton.setEnabled(false);
		add(stopButton);
		
		nextButton = new JButton("Next");
		nextButton.addActionListener(this);
		add(nextButton);
		
		addSeparator();
		
		add(new JLabel("Iterations: "));
		numberOfIterationsLabel = new JLabel("0");
		add(numberOfIterationsLabel);
		
		addSeparator();
		
		clearButton = new JButton("Clear");
		clearButton.addActionListener(this);
		add(clearButton);
		
		addSeparator();
		addSeparator();
		
		// update period
		add(new JLabel("Update period "));
		updatePeriodField = new JTextField(String.valueOf(DEFAULT_PERIOD), 5);
		add(updatePeriodField);
		add(new JLabel(" milisec."));
		
		addSeparator();
		addSeparator();
		
		// size
		setSize = new JButton("Set size");
		setSize.addActionListener(this);
		add(setSize);
		
		add(new JLabel(" cols "));
		widthField = new JTextField(String.valueOf(GameOfLifeWindow.DEFAULT_WIDTH), 3);
		add(widthField);
		
		add(new JLabel(" rows "));
		heightField = new JTextField(String.valueOf(GameOfLifeWindow.DEFAULT_HEIGHT), 3);
		add(heightField);
	}
	
   private void doOneStep()
   {
      this.parentUIElement.getGameInstance().simulateOneStep();
      this.parentUIElement.repaintFieldPanel();
      this.updateIterationsLabel();
   }
   
   /**
    * Refreshed the number of iterations in the label.
    */
   void updateIterationsLabel()
   {
      int numberOfIterations = this.parentUIElement.getGameInstance().getNumberOfIterations();
      this.numberOfIterationsLabel.setText("" + numberOfIterations);
   }
		
	/**
	 * Stops all running operations, e.g. update tasks.
	 */
	public void shutdown()
	{
		if (timer != null)
		{
			timer.cancel();
		}
	}
	
	/**
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == setSize)
		{
			int width = GameOfLifeWindow.DEFAULT_WIDTH;
			try
			{
				width = Integer.valueOf(widthField.getText()).intValue();
			}
			catch(NumberFormatException ne) {}
			
			int height = GameOfLifeWindow.DEFAULT_HEIGHT;
			try
			{
				height = Integer.valueOf(heightField.getText()).intValue();
			}
			catch(NumberFormatException ne) {}
			
			this.parentUIElement.resetGame(width, height);
		}
		else if (e.getSource() == nextButton)
		{
		   this.doOneStep();
		}
		else if (e.getSource() == clearButton)
		{
		   this.parentUIElement.resetGame();
		}
		else if (e.getSource() == startButton)
		{
			int period = DEFAULT_PERIOD;
			try
			{
				period = Integer.valueOf(updatePeriodField.getText()).intValue();
			}
			catch (NumberFormatException ne) {}
			
			setPeriodicUpdateMode(true);
			
			timer = new Timer();
			timer.schedule(new GameOfLifeFieldUpdaterTask(), 0, period);
		}
		else if (e.getSource() == stopButton)
		{
			timer.cancel();
			setPeriodicUpdateMode(false);
		}
	}
	
	private void setPeriodicUpdateMode(boolean active)
	{
		startButton.setEnabled(!active);
		nextButton.setEnabled(!active);
		stopButton.setEnabled(active);
		clearButton.setEnabled(!active);
		
		updatePeriodField.setEnabled(!active);
		
		setSize.setEnabled(!active);
		widthField.setEnabled(!active);
		heightField.setEnabled(!active);
		
		this.parentUIElement.setGameFieldIsUserConfigurable(!active);
	}
	
	private class GameOfLifeFieldUpdaterTask extends TimerTask
	{
		public void run()
		{
		   try {
		      doOneStep();
		   }
			catch (Exception e) {
			   cancel();
			}
		}
	}
}
