package Lesson3;

import java.util.Arrays;

public class HomeWork3App {
    public static void main(String[] args) {

        // Задание №1
        int[] firstArr = new int[10];
        firstArr[0] = 1;
        firstArr[1] = 1;
        firstArr[2] = 0;
        firstArr[3] = 0;
        firstArr[4] = 1;
        firstArr[5] = 0;
        firstArr[6] = 1;
        firstArr[7] = 1;
        firstArr[8] = 0;
        firstArr[9] = 0;
        for (int i = 0; i < firstArr.length; i++) {
            if (firstArr[i] == 0) {
                firstArr[i] = 1;
            } else {
                firstArr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(firstArr));

        // Задание №2
        int[] Arr2 = new int[100];
        for (int i = 0; i < Arr2.length; i++) {
            Arr2[i] = i + 1;
        }
        System.out.println(Arrays.toString(Arr2));

        // Задание №3
        int[] Arr3 = new int[12];
        Arr3[0] = 1;
        Arr3[1] = 5;
        Arr3[2] = 3;
        Arr3[3] = 2;
        Arr3[4] = 11;
        Arr3[5] = 4;
        Arr3[6] = 5;
        Arr3[7] = 2;
        Arr3[8] = 4;
        Arr3[9] = 8;
        Arr3[10] = 9;
        Arr3[11] = 1;
        for (int i = 0; i < Arr3.length; i++) {
            int answer = Arr3[i];
            if (Arr3[i] < 6) {
                Arr3[i] = answer * 2;
            }
        }
        System.out.println(Arrays.toString(Arr3));

        // Задание №4
        int[][] squareArray = new int [9][9];

            for (int i=0; i<squareArray.length; i++){
            for (int j=0; j<squareArray.length; j++){
                squareArray[i][j]=0;
                if(squareArray[i]==squareArray[j]){
                    squareArray[i][j]=1;
                } else {
                    squareArray[i][j] = 0;
                }

                    if(i+j==squareArray.length-1){
                        squareArray[i][j]=1;

                    }

            System.out.print(squareArray[i][j]+ " ");
            }
            System.out.println();
        }

            //Задание №5
        zadanie5(10,54);


            //Задание №6
         int[] Arr6 = {4, 2, 32, 6 ,7, 8};
         int min = Arr6[0];
         int max = Arr6[0];

        for(int i=0; i!=Arr6.length; i++){
            if(Arr6[i]>max){
              max = Arr6[i] ;
            }if(Arr6[i]<min) {
                min = Arr6[i];
            }

        }
        System.out.println("min =" + min);
        System.out.println("max =" + max);


    }
    public static int[] zadanie5 (int len, int initialValue){
        int[] result=new int[len];
        for( int i=0; i<len; i++){
            result[i]=initialValue;
        }

        System.out.println(Arrays.toString(result)); return result;
    }

}
