// Задание
// Задачи со звездочкой:
// 4) Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз

package Sem_5;

import java.util.Arrays;

public class hw4_sem5 {
    
    public static final int N = 5;
    // все восемь возможных движений коня.
    public static final int[] row = { 2, 1, -1, -2, -2, -1, 1, 2, 2 };
    public static final int[] col = { 1, 2, 2, 1, -1, -2, -2, -1, 1 };
 
    public static void main(String[] args)
    {
        // доска и порядок посещения
        int[][] board = new int[N][N];
        int pos = 1;
 
        knigtGo(board, 0, 0, pos);
    }

    // проверка пределов доски
    private static boolean isBoard(int x, int y)
    {
        if (x < 0 || y < 0 || x >= N || y >= N) {
            return false;
        }
        return true;
    }
 
    // вывод доски на экран
    private static void printBoard(int[][] board)
    {
        for (var r: board) {
            System.out.println(Arrays.toString(r));
        }
        System.out.println();
    }
 
    // обход конем
    public static void knigtGo(int[][] board, int x, int y, int pos)
    {
        board[x][y] = pos;
        if (pos >= N*N) {
            printBoard(board);
            board[x][y] = 0;
            return;
        }
 
        for (int k = 0; k < 8; k++) {
            int newX = x + row[k];
            int newY = y + col[k];
             if (isBoard(newX, newY) && board[newX][newY] == 0) {
                knigtGo(board, newX, newY, pos + 1);
            }
        }
 
        board[x][y] = 0;
    }
 

}
