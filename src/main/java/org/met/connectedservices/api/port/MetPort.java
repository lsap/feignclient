package org.met.connectedservices.api.port;

import lombok.RequiredArgsConstructor;
import org.met.connectedservices.client.model.MetResponse;
import org.met.connectedservices.domain.UrlService;
import org.met.connectedservices.domain.model.Met;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component
public class MetPort {

    private final UrlService service;

    public List<MetResponse> getUrl() {
        List<Met> urls = service.getMet();
        return urls.stream()
                .map(this::convert)
                .collect(Collectors.toList());
    }

    private MetResponse convert(Met met) {
        var t = new MetResponse();
        t.setUrl(met.getUrl());
        return t;
    }

}
