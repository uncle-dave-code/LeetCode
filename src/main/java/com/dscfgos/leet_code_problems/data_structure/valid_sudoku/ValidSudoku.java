package com.dscfgos.leet_code_problems.data_structure.valid_sudoku;

import java.util.*;

/**
 * (36) - Valid Sudoku
 * <p>
 * Determine if a 9 x 9 Sudoku board is valid.
 * Only the filled cells need to be validated according to the following rules:
 * <p>
 * Each row must contain the digits 1-9 without repetition.
 * Each column must contain the digits 1-9 without repetition.
 * Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
 * Note:
 * <p>
 * A Sudoku board (partially filled) could be valid but is not necessarily solvable.
 * Only the filled cells need to be validated according to the mentioned rules.
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        if (board != null && board.length == 9) {
            //Column,Values
            Map<Integer, Set<Character>> columns = new HashMap<>();
            Map<Integer, Set<Character>> boxes = new HashMap<>();

            for (int row = 0; row < board.length; row++) {
                if (board != null && board.length == 9) {
                    Set<Character> rows = new HashSet<>();
                    for (int column = 0; column < board[row].length; column++) {
                        if (board[row][column] != '.') {

                            int boxId = row / 3 * 3 + column / 3;
                            Set<Character> boxesValues = boxes.getOrDefault(boxId, new HashSet<>());
                            if (boxesValues.contains(board[row][column])) {
                                return false;
                            } else {
                                boxesValues.add(board[row][column]);
                                boxes.put(boxId, boxesValues);
                            }

                            Set<Character> columnValues = columns.getOrDefault(column, new HashSet<>());
                            if (columnValues.contains(board[row][column])) {
                                return false;
                            } else {
                                columnValues.add(board[row][column]);
                                columns.put(column, columnValues);
                            }

                            if (rows.contains(board[row][column])) {
                                return false;
                            } else {
                                rows.add(board[row][column]);
                            }
                        }
                    }
                } else {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }


}
