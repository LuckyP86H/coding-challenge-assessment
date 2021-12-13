package com.league.codingchallenge.reader;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;


import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixReader {
    /**
     * @param fileName as for the input file
     * @return all elements from the input file in the form of matrix
     * @throws IOException
     * @throws CsvException
     */
    public static List<List<String>> ReadCSV(String fileName) throws IOException, CsvException {
        List<List<String>> records = new ArrayList<List<String>>();
        try (CSVReader csvReader = new CSVReader(new FileReader(fileName));) {
            String[] values = null;
            while ((values = csvReader.readNext()) != null) {
                records.add(Arrays.asList(values));
            }
        } catch (Exception e) {
            System.out.println("The input is not a valid CSV file.");
        } finally {
            return records;
        }

    }
}
