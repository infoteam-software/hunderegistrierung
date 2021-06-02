import shared.DatabasePreparer;
import shared.FileOpener;
import hunderegistrierung.legacy.register.DogRegister;

import java.io.File;
import java.util.Locale;

public class Main {
    public final static String[] REPORT_PATH = new String[]{"src", "main", "resources", "report.json"};
    public final static String[] INPUT_PATH = new String[]{"src", "main", "resources", "input.csv"};

    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        org.apache.log4j.BasicConfigurator.configure();

        prepareDatabase();
        runRegister();
    }

    public static void runRegister() {
        File inputFile = FileOpener.getFile(INPUT_PATH);
        File reportFile = FileOpener.getFile(REPORT_PATH);
        DogRegister dogRegister = new DogRegister(inputFile, reportFile);
        dogRegister.register();
    }

    public static void prepareDatabase() {
        DatabasePreparer.setUpDatabase();
    }


}
