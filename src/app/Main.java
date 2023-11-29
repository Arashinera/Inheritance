package app;

public class Main {
    static DataProvider provider;
    static DataHandler handler;

    public static void main(String[] args) {
        provider = new DataProvider();
        handler = new DataHandler();
        getOutput(handler.handleCalculatedData(provider.getCalculatedData()));
        provider.closeScanner();
    }

    private static void getOutput(String output) {
        System.out.println(output);
    }
}
