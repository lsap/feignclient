package org.met.connectedservices.client.met;

import lombok.RequiredArgsConstructor;
import org.met.connectedservices.client.model.MetResponse;
import org.met.connectedservices.domain.infrastructure.FindMet;
import org.met.connectedservices.domain.model.Met;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class MetService implements FindMet {

    private final MetClient metClient;

    @Override
    public List<Met> getMet() {
        var urls = new ArrayList<Met>();
        var met = metClient.getMet().get(0);
        urls.add(met.getUrl());
        return urls;
    }
}
