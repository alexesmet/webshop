package com.alexesmet.example.iba;

public class Cube {
    static char[][][] cube = {
            {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},},
            {{'g', 'h', 'i'}, {'d', 'e', 'f'}, {'g', 'h', 'i'},},
            {{'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}}
    };

    public static void main(String[] args) {
        System.out.println(findCopies(cube));
    }

    static boolean findCopies(char[][][] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j][0] == arr[i][j][1] && arr[i][j][2] == arr[i][j][1]) return true; //z value
                if (arr[i][0][j] == arr[i][1][j] && arr[i][2][j] == arr[i][1][j]) return true; //y value
                if (arr[0][i][j] == arr[1][i][j] && arr[2][i][j] == arr[1][i][j]) return true; //x value
            }
        }
        for (int k = 0; k < arr.length; k++) {
            if (arr[k][0][0] == arr[k][1][1] && arr[k][1][1] == arr[k][2][2]) return true;
            if (arr[0][k][0] == arr[1][k][1] && arr[1][k][1] == arr[2][k][2]) return true;
            if (arr[0][0][k] == arr[1][1][k] && arr[1][1][k] == arr[2][2][k]) return true;

            if (arr[k][0][2] == arr[k][1][1] && arr[k][1][1] == arr[k][0][2]) return true;
            if (arr[0][k][2] == arr[1][k][1] && arr[1][k][1] == arr[0][k][2]) return true;
            if (arr[0][2][k] == arr[1][1][k] && arr[1][1][k] == arr[2][0][k]) return true;
        }
        if (arr[0][0][0] == arr[1][1][1] && arr[1][1][1] == arr[2][2][2]) return true;
        if (arr[0][0][2] == arr[1][1][1] && arr[1][1][1] == arr[2][2][0]) return true;

        if (arr[2][2][0] == arr[1][1][1] && arr[1][1][1] == arr[0][0][2]) return true;
        if (arr[0][2][0] == arr[1][1][1] && arr[1][1][1] == arr[2][0][2]) return true;
        return false;
    }
}


