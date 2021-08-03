package hw3;
import java.util.ArrayList;

import api.Cell;
import api.Direction;
import api.MoveRecord;
import api.State;
import api.StringUtil;

/**
 * Basic game state and operations for a the puzzle game "Pearls", which
 * is a simplified version of "Quell".
 * @author smkautz
 */
public class Pearls
{
  /**
   * Two-dimensional array of Cell objects representing the 
   * grid on which the game is played.
   */
  private Cell[][] grid;
  
  /**
   * Instance of PearlUtil to be used with this game.
   */
  private PearlUtil util;
  
  public Cell playerCell;
  
  public int playerCol;
  public int playerRow;
  
  // TODO - any other instance variables you need
  
  
  /**
   * Constructs a game from the given string description.  The conventions
   * for representing cell states as characters can be found in 
   * <code>StringUtil</code>.  
   * @param init
   *   string array describing initial cell states
   * @param givenUtil
   *   PearlUtil instance to use in the <code>move</code> method
   */
  public Pearls(String[] init, PearlUtil givenUtil)
  {
    grid = StringUtil.createFromStringArray(init);
    util = givenUtil;
    playerCell = getPlayerCell();
	portalReached = false;
    // TODO - any other initialization you need
  }
  
  private boolean portalReached;
  
  /**
   * Returns the number of columns in the grid.
   * @return
   *   width of the grid
   */
  public int getColumns()
  {
    return grid[0].length;
  }
  
  /**
   * Returns the number of rows in the grid.
   * @return
   *   height of the grid
   */
  public int getRows()
  {
    return grid.length;
  }
  
  /**
   * Returns the cell at the given row and column.
   * @param row
   *   row index for the cell
   * @param col
   *   column index for the cell
   * @return
   *   cell at given row and column
   */
  public Cell getCell(int row, int col)
  {
    return grid[row][col];
  }
  
  /**
   * Returns true if the game is over, false otherwise.  The game ends when all pearls
   * are removed from the grid or when the player lands on a cell with spikes.
   * @return
   *   true if the game is over, false otherwise
   */
  public boolean isOver()
  {
    // TODO
    return false;
  }
  
  /**
   * Performs a move along a state sequence in the given direction, updating the score, 
   * the move count, and all affected cells in the grid.  The method returns an 
   * array of MoveRecord objects representing the states in original state sequence before 
   * modification, with their <code>movedTo</code> and <code>disappeared</code>
   * status set to indicate the cell states' new locations after modification.  
   * @param dir
   *   direction of the move
   * @return
   *   array of MoveRecord objects describing modified cells
   */
  public MoveRecord[] move(Direction dir)
  {
    // TODO
    return null;
  }
  
  public State[] getStateSequence(Direction dir) {
	  ArrayList<State> States = new ArrayList<State>();
	  
	  int row = playerRow;
	  int col = playerCol;
	  State currentState = getCell(playerRow, playerCol).getState();
	  boolean portal = false;

	  while(!State.isBoundary(currentState, isOver())) {
		  currentState = getCell(row, col).getState();
		  States.add(currentState);
		  
		  if(currentState == State.PORTAL) portal = true; else portal = false;
		  
		  int tempRow = getNextRow(row, col, dir, portal, getCell(row, col));
		  int tempCol = getNextColumn(row, col, dir, portal, getCell(row, col));
		  row = tempRow;
		  col = tempCol;	  
		  
		  if(portal) portalReached = true;

	  }
	  
	  State[] statesSequence = new State[States.size()];
	  
	  for(int i = 0; i < States.size(); i++) {
		  statesSequence[i] = States.get(i);
	  }
	  
	  return statesSequence;
  }
  
  public void setStateSequence(State[] states, Direction dir, int playerIdx) {
	  int row = playerRow;
	  int col = playerCol;
	  State currentState = getCell(playerRow, playerCol).getState();
	  boolean portal = false;
	  
	  int idx = 0;

	  while(!State.isBoundary(currentState, isOver())) {
		  currentState = getCell(row, col).getState();

		  if(idx == playerIdx) {
			  getCell(row, col).setState(State.EMPTY);
			  getCell(row, col).setPlayerPresent(true);
		  }else if(idx == 0) {
			  getCell(row, col).setState(State.EMPTY);
			  getCell(row, col).setPlayerPresent(false);
		  }else{
			  getCell(row, col).setState(states[idx]);
		  }
			  
		  
		  if(currentState == State.PORTAL) portal = true; else portal = false;
		  
		  int tempRow = getNextRow(row, col, dir, portal, getCell(row, col));
		  int tempCol = getNextColumn(row, col, dir, portal, getCell(row, col));
		  row = tempRow;
		  col = tempCol;
		  
		  if(portal) portalReached = true;		  
		  idx ++;
		  
	  }
	  
  }
  
  public Cell getPlayerCell() {
  
	  int columns = getColumns();
	  int rows = getRows();
	  
	  Cell playerCell = null;
	  	  
	  for(int c = 0; c < columns; c++) {
	  	for(int r = 0; r < rows; r++) {
	  		boolean present = getCell(r, c).isPlayerPresent();
	  		
	  		if(present) {
	  			playerCell = getCell(r, c);
	  			playerCol = c;
	  			playerRow = r;
	  		}
	  	}
	  }
	  return playerCell;
  }
  
  public int getPlayerRow() {
	  return playerRow;
  }
  
  public int getPlayerCol() {
	  return playerCol;
  }

	public boolean won() {
		// TODO Auto-generated method stub
		return false;
	}
	  
	public int getNextColumn(int row, int col, Direction dir, boolean doPortalJump, Cell cell) {
		if(doPortalJump && !portalReached) {
			col = col + cell.getColumnOffset();
		}else {
			if (dir == Direction.LEFT) {
				col = (col + getColumns() - 1) % getColumns();
			}else if (dir == Direction.RIGHT) {
				col = (col + 1) % getColumns();
			}
		}
		
		return col;
	}
	  
	public int getNextRow(int row, int col, Direction dir, boolean doPortalJump, Cell cell) {
		if(doPortalJump && !portalReached) {
			row = row + cell.getRowOffset();			
		}else {
			if(dir == Direction.UP) {
				row = (row + getRows() - 1) % getRows();
			}else if (dir == Direction.DOWN) {
				row = (row + 1) % getRows();
			}
		}

		return row;
	}
}
