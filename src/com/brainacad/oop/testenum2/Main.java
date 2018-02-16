package com.brainacad.oop.testenum2;

public class Main {
    public static void main(String[] args) {
        Card[] cards = new Card[52];
        for (int i = 0; i < Suit.values().length; i++) {
            for (int j = 0; j < Rank.values().length; j++) {
                cards[i * Rank.values().length + j] = new Card(Suit.values()[i], Rank.values()[j]);
            }
        }

        for(Card card : cards) {
            System.out.println(card);
        }
    }
}
