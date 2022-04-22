package com.xworkz.games.dto;

public class GamesDTO {

private int gameId;
private String gameName;
private int noOfPlayes;
private String type;

public GamesDTO(int id, String gameName, int noOfPlayers, String type) {
	super();
	this.gameId = gameId;
	this.gameName = gameName;
	this.noOfPlayes = noOfPlayes;
	this.type = type;
}
public int getgameId() {
	return gameId;
}
public void setId(int gameid) {
	this.gameId = gameId;
}
public String getgameName() {
	return gameName;
}
public void setGameName(String gameName) {
	this.gameName = gameName;
}
public int getNoOfPlayes() {
	return noOfPlayes;
}
public void setNoOfPlayers(int noOfPlayes) {
	this.noOfPlayes = noOfPlayes;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}




	
	
}
