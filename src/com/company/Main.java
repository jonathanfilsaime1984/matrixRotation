package com.company;

public class Main {

    public static void main(String[] args) {

        String temp = "";
        int x = 0;

        String[][] a = new String[4][4];
        String[][] b = new String[4][4];

        a[0][0] = "A";
        a[0][1] = "B";
        a[0][2] = "C";
        a[0][3] = "D";
        a[1][0] = "E";
        a[1][1] = "F";
        a[1][2] = "G";
        a[1][3] = "H";
        a[2][0] = "I";
        a[2][1] = "J";
        a[2][2] = "K";
        a[2][3] = "L";
        a[3][0] = "M";
        a[3][1] = "N";
        a[3][2] = "O";
        a[3][3] = "P";

        print(a);

        b[0][0] = "";
        b[0][1] = "";
        b[0][2] = "";
        b[0][3] = "";
        b[1][0] = "";
        b[1][1] = "";
        b[1][2] = "";
        b[1][3] = "";
        b[2][0] = "";
        b[2][1] = "";
        b[2][2] = "";
        b[2][3] = "";
        b[3][0] = "";
        b[3][1] = "";
        b[3][2] = "";
        b[3][3] = "";


        for(int c = 0; c < 4; c++){
            for(int i = 0; i < 4 ; i++){
                if(c == 0 ){ x = 3; }
                if(c == 1 ){ x = 2; }
                if(c == 2 ){ x = 1; }
                if(c == 3 ){ x = 0; }

                temp = a[c][i];
                b[i][x] = temp;
            }
        }

        System.out.print("\n" + "inverted" + "\n" + "\n");

        print(b);

    }

    public static void print(String[][] t){
        for(int x = 0; x < 4; x++ ) {
            for (int y = 0; y < 4; y++) {
                System.out.print(t[x][y] + ",");
                }
            System.out.print("\n");
        }
    }
}
