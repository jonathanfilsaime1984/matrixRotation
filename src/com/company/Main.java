package com.company;

public class Main {

    public static void main(String[] args) {

        String temp = "";
        int x = 0;

	    String[] a1 = {"A","B","C","D"};
        String[] a2 = {"E","F","G","H"};
        String[] a3 = {"I","J","K","L"};
        String[] a4 = {"M","N","O","P"};

        print(a1);
        print(a2);
        print(a3);
        print(a4);

        String[] b1 = {".",".",".","."};
        String[] b2 = {".",".",".","."};
        String[] b3 = {".",".",".","."};
        String[] b4 = {".",".",".","."};

        for(int a = 0; a < a1.length; a++){
            for(int i = 0; i < b1.length ; i++){
                if(a == 0 ){ x = 3; temp = a1[i];}
                if(a == 1 ){ x = 2; temp = a2[i];}
                if(a == 2 ){ x = 1; temp = a3[i];}
                if(a == 3 ){ x = 0; temp = a4[i];}

                if(i == 0){ b1[x] = temp;}
                if(i == 1){ b2[x] = temp;}
                if(i == 2){ b3[x] = temp;}
                if(i == 3){ b4[x] = temp;}
            }
        }

        System.out.print("\n" + "inverted" + "\n" + "\n");

        print(b1);
        print(b2);
        print(b3);
        print(b4);

    }

    public static void print(String[] t){
        for(int x = 0; x < 4; x++ ){
            System.out.print(t[x] + ",");
        }
        System.out.print("\n");
    }
}
