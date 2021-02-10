//Group 5
//Natalie MacDougall, Ana Sanchez Del Junco, Sullivan Alexander, Andrew Perry

public class Methods {
    //Method1: get three integer values and return (not print) their sum (no arrays)
    public static int sum(int a, int b, int c){
        int sum = a + b + c;
        return(sum);
    }

    //Method2: get a list of three integer values and return their sum (use an array)
    public static int arraySum(int values[]) {
        int arraySum = values[0] + values[1] + values [2];
        return (arraySum);
    }
    //Method3: get a list of integer values and return the list size (use an array)
    public static int arraySize(int values[]){
        int arraySize = values.length;
        return(arraySize);
    }

    //Method4: get a list of integer values and return their sum (use an array and a loop)
    public static int arrayLoopSum(int values[]){
        int arraySum = 0;
        for(int i = 0; i < values.length; i++) {
            arraySum = arraySum + values[i];
        }
        return(arraySum);
    }

    //Method5: get a list of integer values and return their average, using method3 and method4 (hint: average of a list = sum/size)
    public static int average(int arrayLoopSum, int arraySize){
        int average = arrayLoopSum/arraySize;
        return(average);
    }

    //Method6: get a list of integer values and return their minimum.
    public static int min(int values[]) {
        int min = values[0];
        for(int i = 0; i < values.length; i++){
            if(values[i] < min){
                min = values[i];
            }
        }
        return (min);
    }

public static void main(String args[]){
        int values[] = {1,2,3,4,100};
        int result = sum(values[0], values[1], values[2]);
        int result2 = arraySum(values);
        int result3 = arraySize(values);
        int result4 = arrayLoopSum(values);
        int result5 = average(arrayLoopSum(values),arraySize(values));
        int result6 = min(values);

        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
