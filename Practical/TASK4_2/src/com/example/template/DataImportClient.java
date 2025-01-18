package com.example.template;

public class DataImportClient {
    public static void main(String[] args) {
        DataImporter csvImporter = new CSVImporter();
        csvImporter.importData("data.csv");

        System.out.println();

        DataImporter xmlImporter = new XMLImporter();
        xmlImporter.importData("data.xml");

        System.out.println();

        DataImporter jsonImporter = new JSONImporter();
        jsonImporter.importData("data.json");
    }
}
