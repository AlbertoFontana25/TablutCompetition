package it.unibo.ai.didattica.competition.tablut.domain;

import java.util.UUID;

/**
 * Represent a wrapper for the game state that store all the informations of a
 * match for tablut board web application
 * 
 * @author a.fontana
 *
 */
public class StateWrapper {

	/**
	 * UUID for the match
	 */
	private UUID uuid;

	/**
	 * State of the match
	 */
	private State state;

	/**
	 * White player name
	 */
	private String whitePlayerName;

	/**
	 * Black player name
	 */
	private String blackPlayerName;

	/**
	 * Last action
	 */
	private Action lastAction;

	/**
	 * Result of the match
	 */
	private Result result;

	public StateWrapper() {
		this.uuid = UUID.randomUUID();
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public String getWhitePlayerName() {
		return whitePlayerName;
	}

	public void setWhitePlayerName(String whitePlayerName) {
		this.whitePlayerName = whitePlayerName;
	}

	public String getBlackPlayerName() {
		return blackPlayerName;
	}

	public void setBlackPlayerName(String blackPlayerName) {
		this.blackPlayerName = blackPlayerName;
	}

	public Action getLastAction() {
		return lastAction;
	}

	public void setLastAction(Action lastAction) {
		this.lastAction = lastAction;
	}

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}

	/**
	 * Represent the result of a match
	 * 
	 * @author a.fontana
	 *
	 */
	public enum Result {
		START,
		PLAYING,
		BLACKWIN, 
		WHITEWIN, 
		BLACKERROR, 
		WHITEERROR, 
		BLACKTIMEOUT, 
		WHITETIMEOUT, 
		DRAW, 
		ERROR;
	}
}
