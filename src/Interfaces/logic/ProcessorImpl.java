package Interfaces.logic;

public class ProcessorImpl implements ArrayProcessor {
    @Override
    public double calculate(double[] array) {

        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }

        return min;
    }

    @Override
    public double calculate(double[][] array) {

        int zeroCount = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    zeroCount++;
                }
            }
        }

        return zeroCount;

        //return 0;
    }

    @Override
    public void printArray(double[] array) {
        for (double element : array) {
            System.out.print(element + " ");
        }
System.out.println();
    }

    @Override
    public void printArray(double[][] array) {
        for (double[] row : array) {
            for (double element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }
}

  /*  double smallestNumber= Integer.MAX_VALUE;
        for (double number : array){
                if (number %2 ==0 && number<smallestNumber){
        smallestNumber=number;
        }
        }
        System.out.println(smallestNumber);
        return smallestNumber;*/