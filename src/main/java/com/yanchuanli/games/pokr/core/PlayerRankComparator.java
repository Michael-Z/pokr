package com.yanchuanli.games.pokr.core;

import com.yanchuanli.games.pokr.model.Player;

import java.util.Comparator;

/**
 * Copyright Candou.com
 * Author: Yanchuan Li
 * Email: mail@yanchuanli.com
 * Date: 12-6-13
 */
public class PlayerRankComparator implements Comparator<Player> {

    private HandEvaluator handEval;

    public PlayerRankComparator() {
        handEval = new HandEvaluator();
    }


    @Override
    public int compare(Player player1, Player player2) {

        if (player1.getBestHand() == null) {
            player1.setBestHand(handEval.getBest5CardHand(player1.getHand()));
        }

        if (player2.getBestHand() == null) {
            player2.setBestHand(handEval.getBest5CardHand(player2.getHand()));
        }

        if (player1.getHandRank() == Integer.MIN_VALUE) {
            player1.setHandRank(HandEvaluator.rankHand(player1.getHand()));
        }

        if (player2.getHandRank() == Integer.MIN_VALUE) {
            player2.setHandRank(HandEvaluator.rankHand(player2.getHand()));
        }
        return handEval.compareHands(player1.getHand(), player2.getHand());
    }
}