package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/****
 * Eure Aufgabe ist es, ein einfaches 2D-Spielbrett und eine Spielfigur zu
*entwickeln.
*Das Spielbrett ist ein Raster, auf dem du dich mit den Tasten W (oben), S (unten),
 *D (rechts) und A (links) bewegen kannst. Ihr werdet Tests schreiben,
 * umsicherzustellen, dass die Spielfigur sich korrekt auf dem Spielbrett bewegt.
 **********/
class MainTest {
    @Test

    void constructPlayingField_shouldReturnIntArrayOfSize8x8_whenSizeXis8AndSizeYIs8(){
        //GIVEN
        int sizeX=8;
        int sizeY=8;
        char[][] expected=
                {
                        {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.'}
                };
        //WHEN
        char[][] actual= Main.constructPlayingField(8,8);
        //THEN
        assertArrayEquals(expected,actual);
    }
    @Test
    void constructPlayingField_shouldReturnIntArrayOfSize10x10_whenSizeXis10AndSizeYIs10(){
        //GIVEN
        int sizeX=10;
        int sizeY=10;
        char[][] expected=
                {
                        {'.','.','.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.','.','.'},
                        {'.','.','.','.','.','.','.','.','.','.'},
                };
        //WHEN
        char[][] actual= Main.constructPlayingField(10,10);
        //THEN
        assertArrayEquals(expected,actual);
    }
@Test
    void constructPlayer_shouldReturnPosition1x1_whenPlayerXIs1AndPlayerYis1(){
        //GIVEN
        int playerX = 1;
        int playerY = 1;
        int[] expected = {1,1};

        //WHEN
        int[] actual = Main.playerPosition(playerX,playerY);
        //THEN
        assertArrayEquals(expected,actual);
    }
    @Test
    void positionPlayer_shouldReturn1x1_whenPlayerXIs1AndPlayerYIs2AndMoveIsW(){
        int playerX = 1;
        int playerY = 2;
        int[] expected
    }

}