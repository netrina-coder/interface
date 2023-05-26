import Interfaces.io.DoubleArrayReader;
        import Interfaces.io.ReaderImpl;
        import Interfaces.logic.ArrayProcessor;
        import Interfaces.logic.ProcessorImpl;

        import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        DoubleArrayReader reader = new ReaderImpl();


        Path oneDimensionalFilePath = Path.of("lab61.txt");
        double[] oneDimensionalArray = reader.readOneDimensionalArray(oneDimensionalFilePath);


        Path twoDimensionalFilePath = Path.of("lab62.txt");
        double[][] twoDimensionalArray = reader.readTwoDimensionalArray(twoDimensionalFilePath);

        ArrayProcessor processor = new ProcessorImpl();


        double result1 = processor.calculate(oneDimensionalArray);
        System.out.println("Result for one-dimensional array: " + result1);


        double result2 = processor.calculate(twoDimensionalArray);
        System.out.println("Result for two-dimensional array: " + result2);


        System.out.println("One-dimensional array:");
        processor.printArray(oneDimensionalArray);


        System.out.println("Two-dimensional array:");
        processor.printArray(twoDimensionalArray);


        double result3 = processor.calculate(oneDimensionalArray);
         System.out.println("The smallest value among even-numbered array elements:\n" + result3);

         double result4 = processor.calculate(twoDimensionalArray);
                 System.out.println("Number of zero elements in the array:\n"+result4);

    }
}






