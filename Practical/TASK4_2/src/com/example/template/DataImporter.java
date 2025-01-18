package com.example.template;

abstract class DataImporter {
    public final void importData(String filePath) {
        readData(filePath);
        parseData();
        validateData();
        saveData();
    }

    protected void readData(String filePath) {
        System.out.println("Reading data from file: " + filePath);
    }

    protected abstract void parseData();
    protected abstract void validateData();

    protected void saveData() {
        System.out.println("Saving data to the database.");
    }
}
