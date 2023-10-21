package com.java8.javatechie.practicetest;

public class ChessPlayer {
	
	private int playerID;
	private String playerName;
	private int playerRank;
	private String playerCountry;
	
	public ChessPlayer(int playerID, String playerName, int playerRank, String playerCountry) {
		super();
		this.playerID = playerID;
		this.playerName = playerName;
		this.playerRank = playerRank;
		this.playerCountry = playerCountry;
	}
	
	public int getPlayerID() {
		return playerID;
	}

	public void setPlayerID(int playerID) {
		this.playerID = playerID;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getPlayerRank() {
		return playerRank;
	}

	public void setPlayerRank(int playerRank) {
		this.playerRank = playerRank;
	}

	public String getPlayerCountry() {
		return playerCountry;
	}

	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
	}

	@Override
	public String toString() {
		return "ChessPlayer [playerID=" + playerID + ", playerName=" + playerName + ", playerRank=" + playerRank
				+ ", playerCountry=" + playerCountry + "]";
	}    	

}
