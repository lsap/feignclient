package org.met.connectedservices.client.met;

import org.met.connectedservices.client.model.MetResponse;

import java.util.List;

public interface MetClient {

    List<MetResponse> getMet();

}
