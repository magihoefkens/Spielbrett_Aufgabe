package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.printf("Hello and welcome!");
        //Spielfeldgröße um Spielfeld generieren
        constructPlayingField(10,10);

        //Spielerposition

        //Bewegung


    }

    public static char[][] constructPlayingField(int i1, int i2) {
        /*char[][] playField = {
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };*/
        char[][] playField=new char[i1][i2];
        return playField;
    }
    public static char[][] constructPlayingField(int i1, int i2, int[] playerPosition) {
        /*char[][] playField = {
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}
        };*/
        char[][] playField=new char[i1][i2];
        return playField;
    }

    public static int[] playerPosition(int playerX, int playerY) {
        int[] playerPosition = {playerX,playerY};
        return playerPosition;
        }
    public static int[] postionPl
    }