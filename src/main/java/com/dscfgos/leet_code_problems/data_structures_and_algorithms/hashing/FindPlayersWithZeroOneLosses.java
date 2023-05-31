package com.dscfgos.leet_code_problems.data_structures_and_algorithms.hashing;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * (2225) - Find Players With Zero or One Losses
 * <p>
 * You are given an integer array matches where matches[i] = [winneri, loseri]
 * indicates that the player winneri defeated player loseri in a match.
 * Return a list answer of size 2 where:
 * <p>
 * answer[0] is a list of all players that have not lost any matches.
 * answer[1] is a list of all players that have lost exactly one match.
 * The values in the two lists should be returned in increasing order.
 */
public class FindPlayersWithZeroOneLosses {

    public static void main(String[] args) {
        FindPlayersWithZeroOneLosses findPlayersWithZeroOneLosses = new FindPlayersWithZeroOneLosses();
        int[][] matches = {{1, 3}, {2, 3}, {3, 6}, {5, 6}, {5, 7}, {4, 5}, {4, 8}, {4, 9}, {10, 4}, {10, 9}};
        List<List<Integer>> winners = findPlayersWithZeroOneLosses.findWinners(matches);
        System.out.println(winners);
    }

    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> players = new java.util.HashMap<>();
        List<Integer> winners = new ArrayList<>();
        List<Integer> loser = new ArrayList<>();

        for (int[] match : matches) {
            players.putIfAbsent(match[0], 0);
            players.put(match[1], players.getOrDefault(match[1], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : players.entrySet()) {
            List<Integer> reference = (entry.getValue() == 0) ? winners : (entry.getValue() == 1) ? loser : null;
            if (reference != null) {
                reference.add(entry.getKey());
            }
        }
        winners.sort(Integer::compareTo);
        loser.sort(Integer::compareTo);

        return List.of(winners, loser);
    }
}
