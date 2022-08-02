package org.met.connectedservices.client.met;

import lombok.RequiredArgsConstructor;
import org.met.connectedservices.client.model.MetResponse;
import org.met.connectedservices.domain.infrastructure.FindMet;
import org.met.connectedservices.domain.model.Met;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class UrlService implements FindMet {

    private final UrlClient urlClient;

    @Override
    public List<MetResponse> getMet() {
        return urlClient.getMet();
    }
}
