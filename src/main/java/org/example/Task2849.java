package org.example;

import java.util.LinkedList;
import java.util.Queue;
/*
You are given four integers sx, sy, fx, fy, and a non-negative integer t.
In an infinite 2D grid, you start at the cell (sx, sy). Each second, you must move to any of its adjacent cells.
Return true if you can reach cell (fx, fy) after exactly t seconds, or false otherwise.
A cell's adjacent cells are the 8 cells around it that share at least one corner with it. You can visit the same cell several times.
 */
public class Task2849 {
    public static void main(String[] args) {
        int sx = 3, sy = 1, fx = 7, fy = 3, t = 3;
        System.out.println(solution(sx, sy, fx, fy, t));

    }

    private static boolean solution(int sx, int sy, int fx, int fy, int t) {
        Queue<int[]> queue = new LinkedList<>();
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

        queue.offer(new int[]{sx, sy, 0});

        while (!queue.isEmpty()) {
            int[] currentPosition = queue.poll();
            int x = currentPosition[0];
            int y = currentPosition[1];
            int currentTime = currentPosition[2];

            if (x == fx && y == fy && t == currentTime) {
                return true;
            }
            if (currentTime > t) {
                continue;
            }

            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];

                queue.offer(new int[]{nx, ny, currentTime + 1});
            }
        }
        return false;
    }
}
