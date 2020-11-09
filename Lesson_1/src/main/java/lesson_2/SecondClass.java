package lesson_2;

public class SecondClass {
    public static void main(String[] args) {
        isChangingOneToZero();
        isData();
        isMultiplication();
        isDiagonal();
    }

    // \n перенос строки, для удобного чтения
    public static void isChangingOneToZero() {
        System.out.println("Task №1");
        int[] arr = { 1, 1, 0, 1, 0, 0, 1, 1, 0, 0, 1};
        //Сначала покажем изначальный массив
        System.out.println("True Massive: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            //Изменим массив в соответствии с задачей
            if (arr[i] == 0)
                arr[i] = 1;
             else
                arr[i] = 0;
        }
        //Покажем новый массив
        System.out.println("\nChanging Massive: ");
        for (int i: arr) {
            System.out.print(i + " ");
        }
        }

    public static void isData() {
        System.out.println("\n\nTask №2");
        int [] arr = new int[8];
        for (int i = 0, j = 0; i < arr.length; i++, j += 3) {
            arr[i] = j;
            System.out.print(arr[i] + " ");
        }
        }

    public static void isMultiplication() {
        System.out.println("\n\nTask №3");
        int [] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        //Сначала покажем изначальный массив
        System.out.println("True Massive: ");
        for (int i: arr) {
            System.out.print(i + " ");
        }
        //Далее изменим массив и покажем новые значения
        System.out.println("\nChanging Massive: ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr [i] *=2;
            System.out.print(arr[i] + " ");
        }
    }

    public static void isDiagonal() {
        System.out.println("\n\nTask №4");
        int [][] arr = new int [4][4];
        //Сделаем условия для рисования единичек для значений i и j
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if ((i == j) || (i == 3 - j)) {
                    arr[i][j] = 1;
                }
            }
        }

        //Теперь покажем новый массив для новых i и j
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <4; j++) {
                //Покажи мне массив для новых значений
                System.out.print(arr[i][j] + " ");
            }
            //Сделай мне удобную запись (В виде таблички)
            System.out.println();
        }
    }
    }
