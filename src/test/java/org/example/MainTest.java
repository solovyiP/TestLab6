package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void maintrue() {
        int size = 256;
        int colors[][] = new int[size][size];
        for (int i = 0; i < 8; i++) {
            for( int j = 0; j < 8; j++) {

                assertEquals(256,size);
            }
        }}
   @Test
    void mainfalse() {
        int size = 259;
        int colors[][] = new int[size][size];
        for (int i = 0; i < 8; i++) {
            for( int j = 0; j < 8; j++) {

                assertEquals(100,size);
            }

        }
    }
}