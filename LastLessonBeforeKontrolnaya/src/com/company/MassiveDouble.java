package com.company;

public class MassiveDouble {

    public static void main (String[] args) {
        char [][] m = new char[4][5];
        char[][]m2 = {{1,2},{3,4},{5,7},{5,8}};
        System.out.println((int) m2[1][0]);
        for(int i=0; i<m2.length; i++){
            for (int j=0; j<m2[i].length;j++){
                System.out.println((int)m2[i][j]);
            }
        }
    }
}
