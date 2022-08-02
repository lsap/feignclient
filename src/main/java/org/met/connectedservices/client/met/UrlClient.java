package org.met.connectedservices.client.met;

import org.met.connectedservices.client.model.MetResponse;

import java.util.List;

public interface UrlClient {

    List<MetResponse> getMet();
}
