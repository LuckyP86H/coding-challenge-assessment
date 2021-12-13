package com.league.codingchallenge;

import com.league.codingchallenge.service.MatrixTransformations;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, CsvException {
	// write your code here
        System.out.println("Test Printout");
        System.out.println("==========================================");

        System.out.println("1. Echo (given) ");
        System.out.println("------------------------------------------");
        MatrixTransformations matrixTransformations= new MatrixTransformations();

        System.out.println("2. Invert");
        System.out.println("------------------------------------------");
        System.out.println(matrixTransformations.EchoTransformer("src/main/resources/matrix.csv"));

        System.out.println("3. Flatten");
        System.out.println("------------------------------------------");
        System.out.println(matrixTransformations.TransposeTransformer("src/main/resources/matrix.csv"));

        System.out.println("4. Sum");
        System.out.println("------------------------------------------");
        System.out.println(matrixTransformations.FlattenTransformer("src/main/resources/matrix.csv"));

        System.out.println("5. Multiply");
        System.out.println("------------------------------------------");
        System.out.println(matrixTransformations.SumTransformer("src/main/resources/matrix.csv"));
        System.out.println(matrixTransformations.MultiplyTransformer("src/main/resources/matrix.csv"));

        System.out.println("------------------------------------------");
        System.out.println("This is the end of test. Have a good day!");
    }
}
