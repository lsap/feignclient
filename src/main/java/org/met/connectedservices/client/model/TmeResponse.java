package org.met.connectedservices.client.model;

import lombok.Data;

import java.util.Map;

@Data
public class TmeResponse {

    private boolean verificationRequired;
    private String clientRedirectionUrl;
    private Map<String, String> urls ;
    private Map<String, String> plugins;
    private boolean isVOT2Enabled;

}
