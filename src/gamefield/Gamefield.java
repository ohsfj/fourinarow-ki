package gamefield;

public class Gamefield {
	private char[][] gamefield;
	private final int numRows = 6;
	private final int numColumns = 7;
	private boolean isEmpty = true;
	
	public static void main(final String[] args) {
		Gamefield gamefield = new Gamefield();
		gamefield.insertCoin(3, 'o');
		gamefield.insertCoin(3, 'o');
		gamefield.insertCoin(3, 'o');
		gamefield.insertCoin(3, 'o');
		gamefield.insertCoin(3, 'o');
	}
	
	public Gamefield(){
		gamefield = new char[numRows][numColumns];
		initGame();
	}
	
	public void initGame(){
		 for(int rowIndex = 0;rowIndex < numRows;rowIndex++) {
	         for(int columnIndex=0;columnIndex<numColumns;columnIndex++) {
	        	 gamefield[rowIndex][columnIndex]=' ';
	         }
	     }
	}
	
	public void insertCoin(int columnIndex, char player) {
		
		for (int rowIndex = numRows - 1; rowIndex>=0; rowIndex--)
		{
			if (gamefield[rowIndex][columnIndex] == ' ' )
			{
				gamefield[rowIndex][columnIndex] = player;
				if (isEmpty) { isEmpty = false;}
				break;
			}
		}
	}

	public boolean isEmpty(){
		return isEmpty;
	}
	public boolean isValidMove(int columnIndex){
		return !isColumnFull(columnIndex);
	}
	private boolean isColumnFull(int columnIndex){
		 return gamefield[0][columnIndex] != ' ';
	}
}
