/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.fegati.cvpreprocessor;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author the_fegati
 */
public class Main {
    public static void main(String[] args) throws IOException {
        CSVPreprocessor preprocessor = new CSVPreprocessor();
        File file = preprocessor.execute("/home/the_fegati/Downloads/FelixData/Batch1/labs-part.csv");
    }
}
