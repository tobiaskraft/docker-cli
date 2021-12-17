package de.exensio;

import io.micronaut.configuration.picocli.PicocliRunner;
import io.micronaut.context.ApplicationContext;

import io.micronaut.context.annotation.Value;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;

@Command(name = "dockercli", description = "some description", mixinStandardHelpOptions = true)
public class DockercliCommand implements Runnable {

    private static final Logger log = LoggerFactory.getLogger(DockercliCommand.class);

    @Value("${myconfig.value}")
    private String value;

    @Option(names = {"-v", "--verbose"}, description = "...")
    boolean verbose;

    public static void main(String[] args) throws Exception {
        PicocliRunner.run(DockercliCommand.class, args);
    }

    public void run() {
        log.info("--- start cli test batch ---");

        // put business logic here
        if (verbose) {
            log.info("This is verbose mode");
        }
        log.info("value: " + value);

        log.info("--- end cli test batch ---");
    }
}
