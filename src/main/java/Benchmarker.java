import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import hunderegistrierung.legacy.register.DogRegister;
import shared.DatabasePreparer;

import java.util.Locale;

public class Benchmarker {

    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.ENGLISH);
        org.apache.log4j.BasicConfigurator.configure();
        DatabasePreparer.setUpDatabase();

        Options opt = new OptionsBuilder()
                .include(DogRegister.class.getSimpleName())
                .build();

        new Runner(opt).run();
    }
}
