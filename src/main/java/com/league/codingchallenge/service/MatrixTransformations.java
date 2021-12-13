package com.league.codingchallenge.service;


import com.league.codingchallenge.reader.MatrixReader;
import com.opencsv.exceptions.CsvException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.lang.Long.parseLong;

public class MatrixTransformations {

    public static MatrixReader matrixReader;


    /**
     * @param file as for input file
     * @return the matrix as string format
     */
    public static String EchoTransformer(String file) throws IOException, CsvException {
        return matrixReader.ReadCSV(file).toString();
    }

    /**
     * @param file
     * @return the transpose of matrix (a_ij =>a_ji) as string format
     * @throws IOException
     * @throws CsvException
     */
    public static String TransposeTransformer(String file) throws IOException, CsvException{
        List<List<String>> originalArray = matrixReader.ReadCSV(file);

        final int firstListSize = originalArray.get(0).size();

        List<List<String>> transposedList = new ArrayList<List<String>>();

        for (int i = 0; i < firstListSize; i++) {
            List<String> tempList = new ArrayList<>();

            for (List<String> row : originalArray) {
                tempList.add(row.get(i));//take sublist element at ith position each time and add it to temp list
            }

            //each transposed list is added to transposedList
            transposedList.add(tempList);
        }

        return transposedList.toString();

    }

    /**
     * @param file
     * @return the 1D vector-formed representation of the matrix as string format
     * @throws IOException
     * @throws CsvException
     */
    public static String FlattenTransformer(String file) throws IOException, CsvException{
        List<List<String>> originalList = matrixReader.ReadCSV(file);

        List<String> flatList =
                originalList.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList());


        return flatList.toString();
    }


    /**
     * @param file
     * @return an integer which is the result of adding all the numbers appears in the input file
     * @throws IOException
     * @throws CsvException
     */
    public static int SumTransformer(String file) throws IOException, CsvException{
        List<List<String>> originalList = matrixReader.ReadCSV(file);

        // calculate sum by first flatten the matrix to vector, followed with adding all elements
        int sumResult =
                originalList.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList())
                        .stream()
                        .mapToInt(Integer::parseInt).sum();

        return sumResult;
    }

    /**
     * @param file
     * @return an integer which is the result of multiplying all the numbers appears in the input file
     * @throws IOException
     * @throws CsvException
     */
    public static Long MultiplyTransformer(String file) throws IOException, CsvException{
        List<List<String>> originalList = matrixReader.ReadCSV(file);

        // calculate sum by first flatten the matrix to vector, followed with multiplying all elements
        Long multiplyResult =
                originalList.stream()
                        .flatMap(List::stream)
                        .collect(Collectors.toList())
                        .stream()
                        .mapToLong(x->parseLong(x))
                        .reduce(1, Math::multiplyExact);

        return multiplyResult;

    }



}
