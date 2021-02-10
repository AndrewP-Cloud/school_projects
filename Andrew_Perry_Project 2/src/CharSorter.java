import java.util.InputMismatchException;
import java.util.Scanner;

public class CharSorter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Character Sorter Program");
        System.out.println("Please input a string to be sorted");
        int userControl = 0;

        String userInput = scanner.nextLine();
        while (userControl != 4) {
            System.out.println();
            System.out.println("Please select the option you would like to see");
            System.out.println();

            System.out.println("1. Display character frequencies alphabetically");
            System.out.println("2. Display sorted frequencies");
            System.out.println("3. Show types of character frequencies");
            System.out.println("4. Exit");
            try {
            userControl = scanner.nextInt();

            } catch (InputMismatchException cce) {
                System.out.println("Error, bad input, please enter a number 1-4");
                break;
            }

            int length = userInput.length();
            char[] array = new char[length];

            for (int i = 0; i < length; i++) {
                array[i] = userInput.charAt(i);
            }

            if (userControl == 1) {
                alphabeticalSort(array);
            }
            if (userControl == 2) {
                frequencySort(array);                    //menu

            }
            if (userControl == 3) {
                charTypes(array);
            }
            if (userControl == 4) {
                System.out.println("Character Sorter Exited Successfully");
                System.exit(0);
            }
            if((userControl != 1) && (userControl != 2) && (userControl != 3)){
                System.out.println("Error, bad input, please enter a number 1-4");
            }
        }
    }

    public static void frequencySort(char[] alphaArray) {
        int arrayLength = alphaArray.length;
        char temp2;
        int array2dLendth = arrayLength;
        int frequency = 0;
        int ASCII = 32;
        int x = 0;


        char[][] array2 = new char[2][127];


        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (alphaArray[i] < alphaArray[j]) {
                    temp2 = alphaArray[i];                  //alphabetical presort
                    alphaArray[i] = alphaArray[j];
                    alphaArray[j] = temp2;
                }
            }
        }
        for (int j = 0; ASCII <= 127; ASCII++) {
            for (int k = 0; k < arrayLength; k++) {
                if ((int) alphaArray[k] == ASCII) {     //frequency finder
                    frequency++;
                }
            }
            if (x < array2dLendth) {
                if (frequency > 0) {
                    frequency = frequency + 48;
                    array2[0][x] = (char) ASCII;
                    array2[1][x] = (char) frequency;
                    frequency = 0; //frequency placer
                    x++;
                }
            }
        }
        for (int i = 0; i < 126; i++){
            for (int j = 0; j < 126 - i; j++){
                if(array2[1][j] > array2[1][j+1]){
                    char temp3 = array2[0][j];
                    char temp4 = array2[1][j];
                    array2[0][j] = array2[0][j+1];
                    array2[1][j] = array2[1][j+1];
                    array2[0][j+1] = temp3;
                    array2[1][j+1] = temp4;
                }
            }
        }





            for(int col = 126; col >=0; --col) {
            if(array2[1][col] > 0) {
                System.out.print(array2[0][col] + " ");
                System.out.print("freq: ");
                System.out.println(array2[1][col]);
            }
            }
        }







    public static void alphabeticalSort(char[] alphaArray) {

        char temp;
        int arrayLength = alphaArray.length;
        int frequency = 0;
        int ASCII = 32;


        for (int i = 0; i < arrayLength; i++) {
            for (int j = 0; j < arrayLength; j++) {
                if (alphaArray[i] < alphaArray[j]) {
                    temp = alphaArray[i];                       //sorts
                    alphaArray[i] = alphaArray[j];
                    alphaArray[j] = temp;
                }
            }
        }
        for (int j = 0; ASCII < 127; ASCII++) {
            for (int k = 0; k < arrayLength; k++) {
                if ((int) alphaArray[k] == ASCII) {              //collects frequency
                    frequency++;
                }
            }
            if (frequency > 0) {
                System.out.println((char) ASCII + " " + "freq:" + " " + frequency);
                frequency = 0;                                   //prints
            }
        }
    }

    public static void charTypes(char[] alphaArray) {
        int arrayLength = alphaArray.length;
        int whiteSpace = 0;
        int text = 0;
        int num =0;
        int symb = 0;

        for(int i = 0; i < arrayLength; i++){
            if(alphaArray[i] == 32){
                whiteSpace++;
            }
            if((alphaArray[i] > 32) && (alphaArray[i] <48)){
                symb++;
            }
            if((alphaArray[i] > 47) && (alphaArray[i] < 58)) {
                num++;
            }
            if((alphaArray[i] > 57) && (alphaArray[i] < 65)){
                symb++;
            }
            if((alphaArray[i] > 64) && (alphaArray[i] < 91)){
                text++;                                             //collects frequencies
            }
            if((alphaArray[i] > 90) && (alphaArray[i] <97)){
                symb++;
            }
            if((alphaArray[i] > 96) && (alphaArray[i] < 123)){
                text++;
            }
            if((alphaArray[i] > 122) && (alphaArray[i] < 128)){
                symb++;
            }
        }
        System.out.println("Textual Character count: " + text);
        System.out.println("Numerical Character count: " + num);            //prints
        System.out.println("WhiteSpace Character count: " + whiteSpace);
        System.out.println("Symbol Character count: " + symb);
    }
}