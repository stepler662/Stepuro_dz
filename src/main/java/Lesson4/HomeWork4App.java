package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class HomeWork4App {
    /**
     *  Игровая карта
     */
    public static char[][] map;
    /**
     * Размер поля
     */
    public static final int SIZE = 3;
    /**
     * Сколько точек надо для победы
     */
    public static final int DOTS_TO_WIN = 3;

    public static final char DOT_EMPTY = '*';

    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';

    public static final Scanner SCANNER = new Scanner(System.in);

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
initMap();
printMap();
while (true){
    humanTurn();
    printMap();
    if(getGameResult() == 1 || getGameResultDiagonals() == 1){
        System.out.println("Выйграл человек");
        break;
    }
    if(isMapFull()){
        System.out.println("Ничья");
        break;
    }
    aiTurn();
    printMap();
    if(getGameResult() == 2 || getGameResultDiagonals() == 2) {
        System.out.println("Компьютер выйграл");
        break;
    }
    if(isMapFull()) {
        System.out.println("Ничья");
        break;
    }
}
   }

    public static boolean isMapFull() {
        for( int i=0;i<SIZE; i++){
            for(int j=0; j<SIZE; j++){
                if(map[i][j] == DOT_EMPTY){
                    return false;
                }
            }
        }
        return true;
    }

    /**
     * Инициализирует и заполняет карту пустыми ячейками
     */
public static void initMap(){
    map = new char[SIZE][SIZE];
    for(int i=0; i<SIZE;i++){
        for(int j=0;j<SIZE;j++){
            map[i][j] = DOT_EMPTY;
        }
    }
}

    /**
     * Печатает поле на экран
     */
    public static void printMap() {
        //верхние координаты
        for(int i=0; i<=SIZE;i++){
            System.out.print(i+" ");
        }
        System.out.println();
    for(int i=0; i<SIZE;i++){
        //левые координаты
        System.out.print(i+1 + " ");
        for(int j=0;j<SIZE;j++){
            System.out.print(map[i][j] + " " );
        }
        System.out.println();
    }
}

    /**
     * Ход человека
     */
    public static void humanTurn(){
 int x;
 int y;
 do {
     System.out.println("Введите координаты в формате X Y");
     x = SCANNER.nextInt() - 1;
     y = SCANNER.nextInt() - 1;
 } while (!isCellValid(x,y));
 map[x][y] = DOT_X;
    }

    /**
     * Валидна ли ячейка
     */
    public static boolean isCellValid(int x, int y){
        //проверили, что попали в массив
        if (x < 0 || x>=SIZE || y < 0 || y >= SIZE){
            return false;
        }
        //проверим, что ячейка подходит
        if(map[x][y] == DOT_EMPTY) {
            return true;
        } else {
            return false;
        }
    }

    public static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(SIZE);
            y = RANDOM.nextInt(SIZE);
        } while (!isCellValid(x,y));
        System.out.printf("Робот ходит в точку %d %d", x+1, y+1);
        System.out.println();
       map[x][y] =DOT_O;
    }

    //Проверяем выигрыш
    public static byte getGameResult() {
        byte result = 0;
        for (int i = 0; i < SIZE; i++) {
            if (result != 0) {
                break;
            }
            int dotx = 0, doto = 0;
            for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_X) dotx++; //Подсчёт количества иксов по горизонтали
                    else if (map[j][i] == DOT_X) dotx++; //Подсчёт количества иксов по горизонтали
                    if (map[i][j] == DOT_O) doto++; //Подсчёт количества нулей по вертикали
                    else if (map[j][i] == DOT_O) doto++; //Подсчёт количества нулей по вертикали

                if (result != 0) {
                    break;
                } else if (dotx == SIZE) {
                    //если количество иксов = size (размеру доски)
                    result = 1; // Игрок победил

                } else if (doto == SIZE) {
                    result = 2; // Победил компьютер
                }
            }
        }
        return result;
    }

    public static byte getGameResultDiagonals() {
        byte result = 0;
        int dotx1 = 0, doto1 = 0, dotx2 = 0, doto2 = 0;
        for (int i = 0; i < SIZE; i++) {
            if (result != 0) {
                break;
            }
            if (map[i][i] == DOT_X) {
                dotx1++;
            } else if (map[i][i] == DOT_O) {
                doto1++;
            }
            if (map[i][SIZE - i - 1] == DOT_X) {
                dotx2++;
            }
            else if (map[i][SIZE - i - 1] == DOT_O) {
                doto2++;
            }
            if (result != 0) {
                break;
            } else if (dotx1 == SIZE || dotx2 == SIZE) {
                //если количество иксов = size (размеру доски)
                result = 1; // Игрок победил

            } else if (doto1 == SIZE || doto2 == SIZE) {
                result = 2; // Победил компьютер


            }
        }

        return result;
    }
}
