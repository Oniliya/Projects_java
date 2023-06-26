// Задание

// Задачи со звездочкой:
// 3) На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга

package Sem_5;

import java.util.Arrays;
 
public class hw3_sem5 {
    public static void main(String[] args){
        int N = 8;
        char[][] board = new char[N][N];
 
        for (int i = 0; i < N; i++) {
            Arrays.fill(board[i], '–');
        }
        nQueen(board, 0);
    }
    
    // проверка двух ферзей рядом
    private static boolean isSafe(char[][] board, int r, int c){
        // столбец
        for (int i = 0; i < r; i++){
            if (board[i][c] == 'Q') {return false;}
        }
        // диагональ правая
        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--){
            if (board[i][j] == 'Q') {return false;}
        }
        // диагоняль левая
        for (int i = r, j = c; i >= 0 && j < board.length; i--, j++){
            if (board[i][j] == 'Q') {return false;}
        }
        return true;
    }
    // вывод результата
    private static void printSolution(char[][] board){
        for (char[] chars: board) {
            System.out.println(Arrays.toString(chars).replaceAll(",", ""));
        }
        System.out.println();
    }
 
    private static void nQueen(char[][] board, int r){
        if (r == board.length){
            printSolution(board);
            return;
        }
 
        for (int i = 0; i < board.length; i++){
            if (isSafe(board, r, i)){
                board[r][i] = 'Q';
                nQueen(board, r + 1);
                board[r][i] = '–';
            }
        }
    }
 

}