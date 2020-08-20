package io.gate.apidemo;

import java.net.URI;
import java.net.URISyntaxException;

public class RunConfig {

    private String apiKey;
    private String apiSecret;
    private String hostUsed;

    private boolean useTest;

    public RunConfig() {
        this.useTest = false;
    }

    public RunConfig(String apiKey, String apiSecret, String hostUsed) throws URISyntaxException {
        this.apiKey = apiKey;
        this.apiSecret = apiSecret;
        this.setHostUsed(hostUsed);
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiSecret() {
        return apiSecret;
    }

    public void setApiSecret(String apiSecret) {
        this.apiSecret = apiSecret;
    }

    public String getHostUsed() {
        return hostUsed;
    }

    public void setHostUsed(String hostUsed) throws URISyntaxException {
        this.hostUsed = hostUsed;
        this.useTest = "fx-api-testnet.gateio.ws".equals(new URI(hostUsed).getHost());
    }

    public boolean isUseTest() {
        return useTest;
    }

}
