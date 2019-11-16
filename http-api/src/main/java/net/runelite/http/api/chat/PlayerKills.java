package net.runelite.http.api.chat;

import lombok.Data;

@Data
public class PlayerKills
{
	private int kills;
	private int deaths;
	private int killsBounty;
	private int deathsBounty;
	private int killsPvp;
	private int deathsPvp;
}
