package Unit3.SprinterProblem;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * I have decided to use TreeMap for this problem.
 * Since it sortes the data automatically, I don't need to worry about sorting.
 * 
 * @author Eric Beaulne
 * @version 1.0
 */

public class Main {

    public static void main(String[] args) {

        File dir = new File("Unit3\\SprinterProblem\\Files");
        File[] files = dir.listFiles();
        
        // Print the files in the directory
        for (File file : files) {
            String filename = file.getName();
            String filepath = file.getPath();
            if (file.getName().endsWith(".in")) {
                // Get the file with the answer.
                String answerPath = filepath.substring(0, filepath.lastIndexOf('.')) + ".out";
                long startTime = System.currentTimeMillis();
                // Use the data in the .in file to solve the problem.
                double solvedAnswer = Solver(filepath);
                long endTime = System.currentTimeMillis();
                // Read the answer from the .out file.
                double answer = inputStream(answerPath).nextDouble();
                // Compare the two answers.
                System.out.println("Test case: " + filename.substring(0, filename.lastIndexOf('.')) + " | Calucated Answer: " + solvedAnswer + " | Correct Answer: " + answer + " | Same: " + (answer == solvedAnswer) + " |  Time: " + (endTime-startTime)+"ms");
            }
        }
    }

    public static double Solver(String inputFile) {
        TreeMap<Integer, Integer> data = new TreeMap<Integer, Integer>(); // TreeMap to store the data.
        Scanner in = inputStream(inputFile); // Get File
        int n = in.nextInt(); // Take in the data
        while (n-- > 0) {
            data.put(in.nextInt(), in.nextInt());
        }
        double max = 0.0;
        Integer[] keys = data.keySet().toArray(new Integer[0]);
        for (int i = 1; i < data.size(); i++) {// Iterate through the data and find the max value
            double distance = (double) Math.abs(data.get(keys[i]) - data.get(keys[i - 1])) / (double) (keys[i] - keys[i - 1]); // Equation for the distance | d = abs(y2-y1)/(x2-x1)
            if (distance > max) {
                max = distance;
            }
        }
        return max; // Return Maximum distance between two points.
    }

    public static Scanner inputStream(String fileLoc) {
        Scanner input = null;
        try {
            input = new Scanner(new File(fileLoc));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return input;
    }
}