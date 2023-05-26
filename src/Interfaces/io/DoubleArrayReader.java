package Interfaces.io;
import java.io.BufferedReader;
import java.nio.file.Path;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import java.util.ArrayList;
import java.util.List;


public interface DoubleArrayReader {
    double[] readOneDimensionalArray(Path file);
    double[] readOneDimensionalArray(String fileName);
    double[][] readTwoDimensionalArray(Path file);
    double[][] readTwoDimensionalArray(String fileName);
}



