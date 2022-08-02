package org.met.connectedservices.domain.infrastructure;

import org.met.connectedservices.client.model.MetResponse;
import org.met.connectedservices.domain.model.Met;

import java.util.List;

public interface FindMet {

    List<MetResponse> getMet();

}
