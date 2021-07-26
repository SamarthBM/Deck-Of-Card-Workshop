/****************************************************************
 * Purpose :
 * @author Samarth BM

***************************************************************/

package com.deckofcardworkshop;

public class Cards {
	private String suit;
	private String rank;

	public Cards(String suit, String rank) {
		this.suit = suit;
		this.rank = rank;
	}

	@Override
	public String toString() {
		return "Card [suit=" + suit + ", rank=" + rank + "]";
	}

	public String getSuit() {
		return suit;
	}

	public void setSuit(String suit) {
		this.suit = suit;
	}

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}

}
