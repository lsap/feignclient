package org.met.connectedservices.domain;

import lombok.RequiredArgsConstructor;
import org.met.connectedservices.client.model.MetResponse;
import org.met.connectedservices.domain.infrastructure.FindMet;
import org.met.connectedservices.domain.model.Met;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class MetService {

    private final FindMet findMet;

    public List<MetResponse> getMet() {
        return findMet.getMet();
    }
}
