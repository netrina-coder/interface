package Interfaces.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class ReaderImpl implements DoubleArrayReader {
    @Override
    public double[] readOneDimensionalArray(Path file) {

        try (BufferedReader reader = Files.newBufferedReader(file))
        {
            int size=Integer.parseInt(reader.readLine()) ;

            String[]temp=reader.readLine().split(" +");
            double[] array = new double[size];
            for (int i = 0; i < array.length; i++) {
                array[i] = Double.parseDouble(temp[i]);
            }
            return array;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    @Override
    public double[] readOneDimensionalArray(String fileName) {
        return readOneDimensionalArray(Path.of(fileName));
    }

    @Override
    public double[][] readTwoDimensionalArray(Path file) {
            try (BufferedReader reader = Files.newBufferedReader(file)){
                String zero= "0";

                int row=(reader.read()) -zero.codePointAt(0);
                reader.read();
                int column=(reader.read()) -zero.codePointAt(0);
                reader.readLine();
                String[]temp= reader.readLine().split(" +");
            double[][] array = new double[row][column];
            int k=0;
            for (int i = 0; i < array.length; i++) {

                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = Double.parseDouble(temp[k++]);
                }
            }
            return array;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public double[][] readTwoDimensionalArray(String fileName) {
        return readTwoDimensionalArray(Path.of(fileName));
    }

    public double findSmallestValueAmongEvenIndexedElements(double[] array) {
        double smallestValue = Double.MAX_VALUE;
        for (int i = 0; i < array.length; i += 2) {
            if (array[i] < smallestValue) {
                smallestValue = array[i];
            }
        }
        return smallestValue;
    }
}




