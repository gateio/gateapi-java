package io.gate.apidemo;

import io.gate.gateapi.ApiException;
import org.apache.commons.cli.*;

import java.net.URISyntaxException;
import java.util.List;

public class Application {

    public static void main(String[] args) throws ApiException {
        Options options = new Options();

        Option apiKey = new Option("k", "key", true, "Gate APIv4 Key");
        apiKey.setArgs(1);
        apiKey.setType(String.class);
        apiKey.setRequired(true);

        Option apiSecret = new Option("s", "secret", true, "Gate APIv4 Secret");
        apiSecret.setArgs(1);
        apiSecret.setType(String.class);
        apiSecret.setRequired(true);

        Option baseUrl = new Option("u", "url", true, "API base URL used to test");
        baseUrl.setType(String.class);
        baseUrl.setRequired(false);

        options.addOption(apiKey);
        options.addOption(apiSecret);
        options.addOption(baseUrl);

        CommandLineParser parser = new DefaultParser();
        HelpFormatter formatter = new HelpFormatter();
        String usageSyntax = "<test-to-run> --key <api-key> --secret <api-secret>";

        CommandLine cmd = null;
        try {
            cmd = parser.parse(options, args);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
            formatter.printHelp(usageSyntax, options);
            System.exit(1);
        }

        String inputKey = cmd.getOptionValue("key");
        String inputSecret = cmd.getOptionValue("secret");
        String hostUsed = cmd.getOptionValue("url");

        List<String> testsToRun = cmd.getArgList();
        if (testsToRun.size() < 1) {
            System.err.println("missing <test-to-run>, available tests: spot, margin, futures");
            formatter.printHelp(usageSyntax, options);
            System.exit(1);
        }

        if (hostUsed == null || "".equals(hostUsed)) {
            hostUsed = "https://api.gateio.ws/api/v4";
        }
        if (!hostUsed.startsWith("http")) {
            hostUsed = "https://" + hostUsed;
        }
        hostUsed = hostUsed.replaceAll("/$", "");
        if (!hostUsed.endsWith("/api/v4")) {
            hostUsed += "/api/v4";
        }

        RunConfig config = null;
        try {
            config = new RunConfig(inputKey, inputSecret, hostUsed);
        } catch (URISyntaxException e) {
            System.err.println("invalid url format. full base url is required");
            formatter.printHelp(usageSyntax, options);
            System.exit(1);
        }
        for (String test : testsToRun) {
            System.out.println("run " + test + " API demo");
            switch (test) {
                case "spot":
                    new SpotTest(config).run();
                    break;
                case "margin":
                    new MarginTest(config).run();
                    break;
                case "futures":
                    new FutureTest(config).run();
                    break;
                default:
                    System.out.println("ignore unknown test " + test);
                    break;
            }
        }
    }

}
