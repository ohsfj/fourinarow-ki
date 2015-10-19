package database;

public final class DatabaseStructure {
	
	public static final String PATH = "jdbc:hsqldb:datenbank/fourinarow";
	public static final String USER = "sa";
	public static final String PASSWORD = "";
	
	public static final String CREATE_TABLE_SPIELE = "CREATE TABLE IF NOT EXISTS spiele ( "
													+ "id INTEGER GENERATED BY DEFAULT AS IDENTITY PRIMARY KEY, "
													+ "ourplayer VARCHAR(256), "
													+ "opponentplayer VARCHAR(256), "
													+ "ourpoints INTEGER, "
													+ "opponentpoints INTEGER, "
													+ "sieger VARCHAR(256), "
													+ "datum VARCHAR(256))";
	
	public static final String CREATE_TABLE_SAETZE = "CREATE TABLE IF NOT EXISTS saetze ( "
													+ "spiel_id INTEGER, "
													+ "satz_nr INTEGER, "
													+ "sieger VARCHAR(256), "
													+ "startspieler VARCHAR(256), "
													+ "PRIMARY KEY(spiel_id, satz_nr))";
	
	public static final String CREATE_TABLE_ZUEGE = "CREATE TABLE IF NOT EXISTS zuege ( "
													+ "spiel_id INTEGER, "
													+ "satz_nr INTEGER, "
													+ "zug_nr INTEGER, "
													+ "spalte INTEGER, "
													+ "spieler VARCHAR(256), "
													+ "PRIMARY KEY(spiel_id, satz_nr, zug_nr))";
	
}