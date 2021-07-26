/****************************************************************
 * Purpose : To perform Deck of card game.
 * @author Samarth BM

***************************************************************/

package com.deckofcardworkshop;

import java.util.ArrayList;

public class DeckOfCard {
	// ArrayList to store unique cards.
	ArrayList<Cards> cards = new ArrayList<Cards>(52);

	// Array which holds suits of card.
	private static String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };

	// Array which holds rank of card.
	private static String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };

	/**
	 * Purpose: Method to setup the deck with unique cards.
	 *  Here nested 'for' loop is used to generate 52 unique cards.
	 */
	private void setupDeck() {
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				this.cards.add(new Cards(suit[i], rank[j]));
			}
		}
	}

	public static void main(String[] args) {
		// Object reference for DeckOfCard class.
		DeckOfCard deckOfCards = new DeckOfCard();

		deckOfCards.setupDeck();

	}

}
