package database;

public final class DatabaseStructure {
	
	public static final String PATH = "jdbc:hsqldb:datenbank/fourinarow";
	public static final String USER = "sa";
	public static final String PASSWORD = "";
		
	public static final String CREATE_TABLE_SPIEL = "CREATE TABLE IF NOT EXISTS spiel ( id INTEGER IDENTITY, spielero VARCHAR(256),spielerx VARCHAR(256), sieger VARCHAR(256), datum VARCHAR(256), PRIMARY_KEY(id))";
	public static final String CREATE_TABLE_SATZ = "CREATE TABLE IF NOT EXISTS satz ( spiel_id INTEGER, satz_nr INTEGER, punktespielero INTEGER, punktespielerx INTEGER, startspieler VARCHAR(256), PRIMARY KEY(spiel_id, satz_nr))";
	public static final String CREATE_TABLE_ZUG = "CREATE TABLE IF NOT EXISTS zug ( spiel_id INTEGER, satz_nr INTEGER, zug_nr INTEGER, spalte INTEGER, spieler VARCHAR(256), PRIMARY KEY(spiel_id, satz_nr, zug_nr))";
	
}